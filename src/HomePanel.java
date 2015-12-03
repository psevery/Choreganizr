import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;


public class HomePanel extends JPanel {
	private JTextField textField;

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
		gbc_lblWelcomeToChoreganizr.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcomeToChoreganizr.gridx = 0;
		gbc_lblWelcomeToChoreganizr.gridy = 1;
		add(lblWelcomeToChoreganizr, gbc_lblWelcomeToChoreganizr);
		
		JLabel lblWhoAreYou = new JLabel("Who are you?:");
		GridBagConstraints gbc_lblWhoAreYou = new GridBagConstraints();
		gbc_lblWhoAreYou.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhoAreYou.gridx = 5;
		gbc_lblWhoAreYou.gridy = 3;
		add(lblWhoAreYou, gbc_lblWhoAreYou);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 11;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 6;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 11;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 7;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 9;
		add(btnSubmit, gbc_btnSubmit);

	}

}
