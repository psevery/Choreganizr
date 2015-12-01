import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

public class House {
	
//	private int houseID;
	private ArrayList<User> members;
	private ArrayList<Chore> chores;
	private User head;
	
	public void addHousemate(User user) {
		this.members.add(user);
	}
	
	public Boolean removeHousemate(String username) {
		Boolean found = false;
	
		ListIterator<User> iter = members.listIterator();
		while(iter.hasNext()){
		    if(iter.next().getUserName().equals(username)){
		        iter.remove();
		        found = true;
		    }
		}
		return found;
	}
	
	public User getHead() {
		return head;
	}
	
	public ArrayList<Chore> getChores() {
		return chores;
	}
	
	public Chore createCustomChore(String title, String description, Date dueDate) {
		return new Chore(title, description, dueDate);
	}
	
//	public Chore createPremadeChore(String title) {
//		need to make our list of premade chores
//	}
}
