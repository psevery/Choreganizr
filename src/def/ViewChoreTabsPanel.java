package def;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;

//holds all chores for gui 
//singleton because we only want and need one instance of this tabbed pane. 
public class ViewChoreTabsPanel extends JTabbedPane {
	//private JTabbedPane paneView;
	private static final ViewChoreTabsPanel INSTANCE = new ViewChoreTabsPanel();

	
	private ViewChoreTabsPanel(){
		this.setBackground(new Color(255, 250, 250));
		this.setTabPlacement(BOTTOM);
		
	}
	
	public synchronized static ViewChoreTabsPanel getInstance() {
	    return INSTANCE;
	}
	
	public synchronized void displayDefaults(){
		JPanel garbagePanel = new ViewChorePanel("Garbage","Take trash out", "kitchen" , "5", "Pat", "1", "False");
		this.addTab("Garbage", null, garbagePanel, null);
		
		JPanel dishesPanel = new ViewChorePanel("Dishes", "", "kitchen", "3", "Tyler","1", "False");
		this.addTab("Dishes", null, dishesPanel, null);
		
		JPanel vaccumPanel = new ViewChorePanel("Vaccum","Use machine", "general", "4", "Ryan", "1", "True");
		vaccumPanel.setBackground(new Color(0, 255, 0));
		this.addTab("Vaccum", null, vaccumPanel, null);
	}
	
	public synchronized void addNewChorePanel(String name, String desc, String type,  String member, String time ,String difficulty){
		 JPanel panel = new ViewChorePanel(name, desc, type, member, time, difficulty, "False");
		 this.addTab(name, null, panel, null);
		 this.repaint();
	}
	
	public void redrawChores(){
		
	}
		
	//Should do a for loop getting each chore from house and call addNewChorePanel(). 
}
