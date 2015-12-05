package def;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class House extends Observable {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int houseID;
	
	private int head;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="house")
	private Set<Chore> chores = new HashSet<Chore>(0);

	@OneToMany(cascade=CascadeType.ALL, mappedBy="house")
	private Set<User> users = new HashSet<User>(0);
	
	public House(User head) {
		setHead(head);
	}
	
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public int getHouseID() {
		return houseID;
	}

	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}
	
	public void addHousemate(User user) {
		this.users.add(user);
		setChanged();
		notifyObservers(user);
	}
	
	public User getHead() {
		User[] temp = this.users.toArray(new User[0]);
		for(User user:temp) {
			if(user.getUserID() == this.head) return user;
		}
		return null;
	}
	
	public void setHead(User user) {
		this.addHousemate(user);
		this.head = user.getUserID();
	}
	
	public Set<Chore> getChores() {
		return chores;
	}
	
	public void addChore(Chore chore) {
		chores.add(chore);
		setChanged();
		notifyObservers(chore);
	}
	
	public void removeChore(Chore chore) {
		chores.remove(chore);
		setChanged();
		notifyObservers(chore);
	}

	public void setChores(Set<Chore> chores) {
		this.chores = chores;
	}
}
