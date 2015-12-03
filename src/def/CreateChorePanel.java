package def;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CreateChorePanel extends JPanel {
	private JTextField nameTextField;

	/**
	 * Create the panel.
	 */
	public CreateChorePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 162, 9, 0, 208, 9, 0};
		gridBagLayout.rowHeights = new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEnterChoreName = new JLabel("Enter Chore Name:");
		GridBagConstraints gbc_lblEnterChoreName = new GridBagConstraints();
		gbc_lblEnterChoreName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterChoreName.gridx = 1;
		gbc_lblEnterChoreName.gridy = 2;
		add(lblEnterChoreName, gbc_lblEnterChoreName);
		
		nameTextField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 2;
		add(nameTextField, gbc_textField);
		nameTextField.setColumns(10);
		
		JLabel lblChooseDaysRemaining = new JLabel("Choose Days Remaining:");
		GridBagConstraints gbc_lblChooseDaysRemaining = new GridBagConstraints();
		gbc_lblChooseDaysRemaining.gridheight = 2;
		gbc_lblChooseDaysRemaining.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseDaysRemaining.gridx = 1;
		gbc_lblChooseDaysRemaining.gridy = 3;
		add(lblChooseDaysRemaining, gbc_lblChooseDaysRemaining);
		
		JSlider timeSlider = new JSlider();
		timeSlider.setSnapToTicks(true);
		timeSlider.setPaintTicks(true);
		timeSlider.setPaintLabels(true);
		timeSlider.setMaximum(7);
		timeSlider.setMajorTickSpacing(1);
		timeSlider.setValue(5);
		GridBagConstraints tSlider = new GridBagConstraints();
		tSlider.gridheight = 2;
		tSlider.insets = new Insets(0, 0, 5, 5);
		tSlider.gridx = 4;
		tSlider.gridy = 3;
		add(timeSlider, tSlider);
		
		JLabel lblSelectMember = new JLabel("Select Member:");
		GridBagConstraints gbc_lblSelectMember = new GridBagConstraints();
		gbc_lblSelectMember.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectMember.gridx = 1;
		gbc_lblSelectMember.gridy = 5;
		add(lblSelectMember, gbc_lblSelectMember);
		
		JComboBox userComboBox = new JComboBox();
		userComboBox.setModel(new DefaultComboBoxModel(new String[] {"Pat", "Anna ", "Ryan", "Tyler"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 5;
		add(userComboBox, gbc_comboBox);
		
		JLabel lblDeclareDifficulty = new JLabel("Declare Difficulty:");
		GridBagConstraints gbc_lblDeclareDifficulty = new GridBagConstraints();
		gbc_lblDeclareDifficulty.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeclareDifficulty.gridx = 1;
		gbc_lblDeclareDifficulty.gridy = 6;
		add(lblDeclareDifficulty, gbc_lblDeclareDifficulty);
		
		JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(5);
		slider.setMajorTickSpacing(1);
		GridBagConstraints difficultySlider = new GridBagConstraints();
		difficultySlider.insets = new Insets(0, 0, 5, 5);
		difficultySlider.gridx = 4;
		difficultySlider.gridy = 6;
		add(slider, difficultySlider);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					Integer difficulty = slider.getValue();
					String name = nameTextField.getText();
					String user = userComboBox.getSelectedItem().toString();
					Integer timeRemaining = timeSlider.getValue();
					//House.createCustomChore()	
					TabbedViewChorePanel.getInstance().addNewChorePanel(name, user, difficulty.toString());
				}
				catch(Exception ex ){
					//not all values filled out so do something
				}
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridwidth = 10;
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 9;
		add(btnSubmit, gbc_btnSubmit);

	}

}
