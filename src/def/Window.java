package def;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.Font;

import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

//import net.miginfocom.swing.MigLayout;

import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;



public class Window {

	private JFrame frmChoreganizr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmChoreganizr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	private House house;
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//main frame of the window, all panels are embedded on it
		frmChoreganizr = new JFrame();
		frmChoreganizr.setTitle("Choreganizr");
		frmChoreganizr.getContentPane().setBackground(new Color(0, 191, 255));
		frmChoreganizr.setBounds(100, 100, 500, 350);
		frmChoreganizr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frmChoreganizr.getContentPane().setLayout(gridBagLayout);
		//tabbed pane allows panels to be tabs
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		frmChoreganizr.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
// these panels are opened by the main tabs at top (each tab is composed of a panel)
		//welcome and login panel
		JPanel panelHome = new HomePanel(this);
		tabbedPane.addTab("Home", null, panelHome, null);
		//the view chores tab panel this panel is composed of ViewChorePanel tabs.
		JTabbedPane panelView = ViewChoreTabsPanel.getInstance();
		tabbedPane.addTab("View Chores", null, panelView, null);
		//to create a custom chore
		JPanel panelAdd = new CreateChorePanel(this);
		tabbedPane.addTab("Add Chores", null, panelAdd, null);
		//to manage chores (mark completed)
		JTabbedPane panelManage = ManageChoreTabsPanel.getInstance();
		tabbedPane.addTab("Manage Chores", null, panelManage, null);
		

	}

	public void redraw(){
		frmChoreganizr.revalidate(); 
		frmChoreganizr.repaint(); 
	}
	public JFrame getChorganizr(){
		return frmChoreganizr;
	}
	
}
