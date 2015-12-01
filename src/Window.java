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
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//main frame of the window, all panels are embedded on it
		frmChoreganizr = new JFrame();
		frmChoreganizr.setTitle("Choreganizr");
		frmChoreganizr.getContentPane().setBackground(new Color(0, 191, 255));
		frmChoreganizr.setBounds(100, 100, 450, 300);
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
		
		//main tabs at top (each tab is compased of a panel)
		JPanel panelAdd = new CreateChorePanel();
		tabbedPane.addTab("Add Chores", null, panelAdd, null);
		
		JPanel panelManage = new JPanel();
		tabbedPane.addTab("Manage Chores", null, panelManage, null);
		
		//this panel is composed of another tabbed plane for the chores
		JTabbedPane paneView = new JTabbedPane(JTabbedPane.BOTTOM);
		paneView.setBackground(new Color(119, 136, 153));
		tabbedPane.addTab("View Chores", null, paneView, null);
		//these are the chore tabs
		JPanel garbagePanel = new ViewChorePanel("Garbage", "Pat", "5", "False");
		paneView.addTab("Garbage", null, garbagePanel, null);
		
		JPanel dishesPanel = new ViewChorePanel("Dishes", "Tyler", "3", "False");
		paneView.addTab("Dishes", null, dishesPanel, null);
		
		JPanel vaccumPanel = new ViewChorePanel("Vaccum", "Ryan", "4", "True");
		vaccumPanel.setBackground(new Color(0, 255, 127));
		paneView.addTab("Vaccum", null, vaccumPanel, null);
	}
}
