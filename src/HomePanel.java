import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HomePanel extends JPanel {
	private JTextField passwordText;
	private JTextField groupTextField;

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{30, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblWelcomeToChoreganizr = new JLabel("Welcome to Choreganizr!");
		lblWelcomeToChoreganizr.setFont(new Font("LiHei Pro", Font.PLAIN, 18));
		GridBagConstraints gbc_lblWelcomeToChoreganizr = new GridBagConstraints();
		gbc_lblWelcomeToChoreganizr.gridwidth = 11;
		gbc_lblWelcomeToChoreganizr.insets = new Insets(0, 0, 5, 0);
		gbc_lblWelcomeToChoreganizr.gridx = 0;
		gbc_lblWelcomeToChoreganizr.gridy = 1;
		add(lblWelcomeToChoreganizr, gbc_lblWelcomeToChoreganizr);
		
		JLabel lblEnterGroupName = new JLabel("Enter Group Name:");
		GridBagConstraints gbc_lblEnterGroupName = new GridBagConstraints();
		gbc_lblEnterGroupName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterGroupName.gridx = 5;
		gbc_lblEnterGroupName.gridy = 3;
		add(lblEnterGroupName, gbc_lblEnterGroupName);
		
		groupTextField = new JTextField();
		groupTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String groupName = groupTextField.getText();
				//TODO: databasemanager gets members of group with that name, sends them back here and gui populates dropdown with names
			}
		});
		
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 4;
		add(groupTextField, gbc_textField_1);
		groupTextField.setColumns(10);
		
		JLabel lblWhoAreYou = new JLabel("Who are you?:");
		GridBagConstraints gbc_lblWhoAreYou = new GridBagConstraints();
		gbc_lblWhoAreYou.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhoAreYou.gridx = 5;
		gbc_lblWhoAreYou.gridy = 5;
		add(lblWhoAreYou, gbc_lblWhoAreYou);
		
		JComboBox membersDropdown = new JComboBox();
		GridBagConstraints gbc_membersDropdown = new GridBagConstraints();
		gbc_membersDropdown.insets = new Insets(0, 0, 5, 5);
		gbc_membersDropdown.gridx = 5;
		gbc_membersDropdown.gridy = 6;
		add(membersDropdown, gbc_membersDropdown);
		
		JLabel lblNewLabel = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 7;
		add(lblNewLabel, gbc_lblNewLabel);
		
		passwordText = new JTextField();
		GridBagConstraints gbc_passwordText = new GridBagConstraints();
		gbc_passwordText.insets = new Insets(0, 0, 5, 5);
		gbc_passwordText.gridx = 5;
		gbc_passwordText.gridy = 8;
		add(passwordText, gbc_passwordText);
		passwordText.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 9;
		add(btnSubmit, gbc_btnSubmit);

	}

}
