package def;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Chore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int choreID;
	
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	protected String description;
	private String title;
	private int difficulty;
	private Boolean isComplete;
	
	@ManyToOne(cascade = CascadeType.ALL)
	protected House house;
	
	@ManyToOne(cascade = CascadeType.ALL)
	protected User user;
	
	protected String userString;
	
	public String getType() {
		return "Chore";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	/*
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	*/
//	public Chore(String title) {
//		this.title = title;
//		this.dueDate = null;
//		this.description = null;
//		this.isComplete = false;
//	}
//	
//	public Chore(String title, String description, Date dueDate) {
//		this.title = title;
//		this.isComplete = false;
//		this.dueDate = dueDate;
//		this.description = description;
//	}
	
	public String getUserString() {
		return userString;
	}

	public void setUserString(String userString) {
		this.userString = userString;
	}
	
	public Chore() {
		
	}
	
	public Chore(String title, String description, Date dueDate, String user, int difficulty) {
		//name, desc, timeRemaining, user, difficulty
		this.title = title;
		this.isComplete = false;
		this.userString = user;
		this.dueDate = dueDate;
		this.description = description;
		this.difficulty = difficulty;
	}
	
	
	public int getChoreID() {
		return choreID;
	}

	public void setChoreID(int choreID) {
		this.choreID = choreID;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int diff) {
		this.difficulty = diff;
	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
