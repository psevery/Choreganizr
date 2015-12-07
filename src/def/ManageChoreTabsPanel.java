package def;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.GridBagLayout;

//holds all chores for gui 
//singleton because we only want and need one instance of this tabbed pane. 
public class ManageChoreTabsPanel extends JTabbedPane {
	//private JTabbedPane paneView;
	private static final ManageChoreTabsPanel INSTANCE = new ManageChoreTabsPanel();

	
	private ManageChoreTabsPanel(){
		this.setBackground(new Color(255, 250, 250));
		this.setTabPlacement(BOTTOM);
		JPanel garbagePanel = new ManageChorePanel("Garbage","Take trash out", "kitchen" , "5", "Pat", "1", "False");
		this.addTab("Garbage", null, garbagePanel, null);
	}
	
	public synchronized static ManageChoreTabsPanel getInstance() {
	    return INSTANCE;
	}
	public synchronized void displayDefaults(){
		
		JPanel garbagePanel = new ManageChorePanel("Garbage","Take trash out", "kitchen" , "5", "Pat", "1", "False");
		this.addTab("Garbage", null, garbagePanel, null);
		
		JPanel dishesPanel = new ManageChorePanel("Dishes", "Wash, dry, and put away!", "kitchen", "3", "Tyler","1", "False");
		this.addTab("Dishes", null, dishesPanel, null);
		
		JPanel vaccumPanel = new ManageChorePanel("Vaccum","Use machine", "general", "4", "Ryan", "1", "True");
		vaccumPanel.setBackground(new Color(0, 255, 0));
		this.addTab("Vaccum", null, vaccumPanel, null);
	}
	
	public synchronized void addNewManageChorePanel(String name, String desc, String type,  String member, String time ,String difficulty){
		 JPanel panel = new ManageChorePanel(name, desc, type, member, time, difficulty, "False");
		 this.addTab(name, null, panel, null);
		 this.repaint();
	}
		
}