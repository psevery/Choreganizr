package def;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int userID;
	
	@Column
	protected String userName;
	
	@Column
	protected String userEmail;
	
	@Column
	protected String password;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user")
	private Set<Chore> Chores = new HashSet<Chore>(0);
	
	@ManyToOne(cascade = CascadeType.ALL)
	protected House house;
	
	public Set<Chore> getChores() {
		return Chores;
	}

	public void setChores(Set<Chore> chores) {
		Chores = chores;
	}
	
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void completeChore(Chore chore) {
		chore.setIsComplete(true);
	}
	
	public void commentOnChore(Chore chore, String comment) {
		chore.addComment(comment);
	}
}
