package def;

import java.util.List;

import def.House;
import def.User;
import def.Chore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class DBManager {
	
	private static DBManager databaseManager = null;
		
	private DBManager() {}
		
	public static synchronized DBManager getManager() {
		if (databaseManager == null) {
			databaseManager = new DBManager();
		}
		return databaseManager;
	}
		
	public Long insertHouse(House house){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		assert house.getUsers().isEmpty() != true; 
		
		Long genID = (Long) session.save(house);
		
		session.close();
		sessionFactory.close();	
		return genID;
	}
	
	@SuppressWarnings("unchecked")
	public House getHouse(int ID){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<House> result = session.createCriteria(House.class).add(Restrictions.eq("houseID", ID)).list();
		
		session.close();
		sessionFactory.close();	
		
		if(result.isEmpty()) return null;
			
		return result.get(0);
	}
	
	public void updateHouse(House house){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		assert house.getUsers().isEmpty() != true; 
		
		session.update(house);
		
		session.close();
		sessionFactory.close();	
	}
	
	public void deleteHouse(House house){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for (User u: house.getUsers().toArray(new User[0])){
			u.setHouse(null);
			(u.getChores()).clear();
		}
		
		for (Chore u: house.getChores().toArray(new Chore[0])){
			u.setUser(null);
		}
		
		(house.getUsers()).clear();
		
		session.delete(house);
		session.close();
		sessionFactory.close();	
	}
	
	public Long insertUser(User user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		assert user.getUserName() != null;
		
		Long genID = (Long) session.save(user);
		
		session.close();
		sessionFactory.close();	
		return genID;
	}
	
	@SuppressWarnings("unchecked")
	public User getUser(String name){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<User> result = session.createCriteria(User.class).add(Restrictions.eq("userName", name)).list();
		
		session.close();
		sessionFactory.close();	
		if(result.isEmpty()) return null;
			
		return result.get(0);
	}
	
	public User getUser(int ID){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		User result = session.get(User.class, ID);
		
		session.close();
		sessionFactory.close();	
			
		return result;
	}
	
	public void updateUser(User user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		assert user.getHouse() != null;
		assert user.getUserName() != null;
		
		session.update(user);
		
		session.close();
		sessionFactory.close();	
	}
	
	public Long insertChore(Chore chore){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		assert chore.getHouse() != null;
		assert chore.getUser() != null;
		
		Long genID = (Long) session.save(chore);
		
		session.close();
		sessionFactory.close();	
		return genID;
		
	}
	public void deleteChore(Chore chore){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		((chore.getHouse()).getChores()).remove(chore);
		((chore.getUser()).getChores()).remove(chore);
		session.delete(chore);
		
		session.close();
		sessionFactory.close();
	}
	
	public Boolean validateLogin(String username, String password){
		Boolean valid = (this.getUser(username)).getPassword() == password;
		return valid;
	}
}
