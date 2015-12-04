package def;

import java.util.List;
import java.util.Set;

import def.House;
import def.User;
import def.Chore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class DBManager {
	
	public static void main(String[] args){
		House house = new House();
		House house2 = new House();
		
		User user1 = new User();
		user1.setHouse(house);
		user1.setUserEmail("EMAIL1");
		user1.setUserName("NAME1");
		
		User user2 = new User();
		user2.setHouse(house);
		user2.setUserEmail("EMAIL2");
		user2.setUserName("NAME2");
		
		Chore chore = new Chore();
		chore.setHouse(house);
		chore.setTitle("TITLE1");
		chore.setUser(user1);
		Chore chore2 = new Chore();
		chore2.setTitle("TITLE2");
		chore2.setHouse(house);
		chore2.setUser(user1);
		
		(user1.getChores()).add(chore);
		(user1.getChores()).add(chore2);
		(house.getChores()).add(chore);
		(house.getChores()).add(chore2);
		(house.getUsers()).add(user1);
		(house.getUsers()).add(user2);
		(house2.getUsers()).add(user2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		session.save(chore);
//		session.save(chore2);
//		session.save(user1);
//		session.save(user2);
		session.save(house);

		
//		System.out.println(house.getHouseID());
		
		session.getTransaction().commit();
		
		House result = (House) session.get(House.class, house.getHouseID());
		
		Chore[] blah = (result.getChores()).toArray(new Chore[0]);
		for (Chore c: blah){
			System.out.println("House");
			System.out.println(c.getTitle());
		}
		
		User result2 = (User) session.get(User.class, user1.getUserID());
		
		Chore[] bleh = (result2.getChores()).toArray(new Chore[0]);
		for (Chore b: bleh){
			System.out.println("User");
			System.out.println(b.getTitle());
		}
		
		session.beginTransaction();
//		for (User u: house.getUsers().toArray(new User[0])){
//			u.setHouse(null);
//			(u.getChores()).clear();
//		}
//		
//		for (Chore u: house.getChores().toArray(new Chore[0])){
//			u.setUser(null);
////			session.update(u);
//		}
//		(house.getUsers()).clear();
//		
//		session.delete(house);
		
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();	
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
