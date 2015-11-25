
public class User {
	
	protected int userID;
	protected String userName;
	protected String userEmail;
	protected House house;
	protected static int nextUserID = 0;
	
	public User(String userName, String userEmail, House house) {
		this.userID = nextUserID;
		nextUserID++;
		this.userName = userName;
		this.userEmail = userEmail;
		this.house = house;
	}
	
	public int getUserID() {
		return userID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	public House getHouse() {
		return house;
	}
	
	public void completeChore(Chore chore) {
		chore.setIsComplete(true);
	}
	
	public void commentOnChore(Chore chore, String comment) {
		chore.addComment(comment);
	}
}
