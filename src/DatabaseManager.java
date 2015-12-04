import java.util.ArrayList;

import def.Chore;
import def.House;
import def.User;

public class DatabaseManager {
	
	private static DatabaseManager databaseManager = null;
	
	private DatabaseManager() {}
	
	public static synchronized DatabaseManager getInstance() {
		if (databaseManager == null) {
			databaseManager = new DatabaseManager();
		}
		return databaseManager;
	}
	
	public Boolean addUser(String userID, String email, String password) {
		return true;
	}
	
	public User getUser(int userID) {
		return new User(null, null, null);
	}
	
	public int validateLogin(String username, String password) {
		//verify using a hash
		return 0;
	}
	
	public Boolean addHouse(House house) {
		return true;
	}
	
	public House getHouse(int houseID) {
		return new House();
	}
	
	public Boolean deleteHouse(int houseID) {
		return true;
	}
	
	public Boolean addChore(Chore chore) {
		return true;
	}
	
	public Boolean deleteChore(Chore chore) {
		return true;
	}
	
	public ArrayList<Chore> getChores() {
		return null;
	}

}
