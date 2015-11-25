import java.util.ArrayList;
import java.util.Date;

public class Chore {
	
	private int choreID;
	private String title;
	private Boolean isComplete;
	private Date dueDate;
	private String description;
	private ArrayList<String> comments;
	private static int nextChoreID = 0;
	
	public Chore(String title) {
		this.choreID = nextChoreID;
		nextChoreID++;
		this.title = title;
		this.isComplete = false;
		this.dueDate = null;
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
	public ArrayList<String> getComments() {
		return comments;
	}
	public void addComment(String comment) {
		this.comments.add(comment);
	}
	public int getChoreID() {
		return choreID;
	}

}
