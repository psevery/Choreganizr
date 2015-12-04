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
		Chore chore2 = new Chore();
		chore2.setTitle("TITLE2");
		chore2.setHouse(house);
		
		(house.getChores()).add(chore);
		(house.getChores()).add(chore2);
		(house.getUsers()).add(user1);
		(house.getUsers()).add(user2);
		(house2.getUsers()).add(user2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
//		session.save(chore);
		session.save(user1);
		session.save(user2);
		session.save(house);
		session.save(house2);
		
//		System.out.println(house.getHouseID());
		
		session.getTransaction().commit();
		
		House result = (House) session.get(House.class, house.getHouseID());
		
		
		Chore[] blah = (result.getChores()).toArray(new Chore[0]);
		for (Chore c: blah){
			System.out.println(c.getTitle());
		}
		
		session.close();
		sessionFactory.close();	
	}
	
	public Long insertHouse(House house){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Long genID = (Long) session.save(house);
		
		session.close();
		sessionFactory.close();	
		return genID;
	}
	
	public void updateHouse(House house){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(house);
		
		session.close();
		sessionFactory.close();	
	}
	
	public Long insertUser(User user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Long genID = (Long) session.save(user);
		
		session.close();
		sessionFactory.close();	
		return genID;
	}
	
	public void updateUser(User user){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(user);
		
		session.close();
		sessionFactory.close();	
	}
	
	@SuppressWarnings("unchecked")
	public User findUserByName(String name){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<User> result = session.createCriteria(User.class).add(Restrictions.eq("userName", name)).list();
		
		session.close();
		sessionFactory.close();	
		if(result.isEmpty()) return null;
			
		return result.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public House findHouseByID(int ID){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<House> result = session.createCriteria(House.class).add(Restrictions.eq("houseID", ID)).list();
		
		session.close();
		sessionFactory.close();	
		
		if(result.isEmpty()) return null;
			
		return result.get(0);
	}
	


}
