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
	private String description;
	private String title;
	private String comment;
	private Boolean isComplete;
	
	@ManyToOne(cascade = CascadeType.ALL)
	protected House house;
	
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
//	public Chore(String title) {
//		this.title = title;
//		this.dueDate = null;
//		this.description = null;
//		this.comment = null;
//		this.isComplete = false;
//	}
//	
//	public Chore(String title, String description, Date dueDate) {
//		this.title = title;
//		this.isComplete = false;
//		this.dueDate = dueDate;
//		this.description = description;
//		this.comment = null;
//	}
	
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
	public String getComments() {
		return comment;
	}
	public void addComment(String comment) {
		this.comment = comment;
	}
}
