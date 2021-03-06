package def;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class CreateChorePanel extends JPanel {
	private JTextField nameTextField;
	private JTextField descriptionField;
	private GridBagConstraints gbc_descriptionField;

	/**
	 * Create the panel.
	 */
	public CreateChorePanel(final Window window) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 162, 9, 0, 208, 9, 0};
		gridBagLayout.rowHeights = new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSelectPremade = new JLabel("Select Premade:");
		lblSelectPremade.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		GridBagConstraints gbc_lblSelectPremade = new GridBagConstraints();
		gbc_lblSelectPremade.gridwidth = 10;
		gbc_lblSelectPremade.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectPremade.gridx = 0;
		gbc_lblSelectPremade.gridy = 1;
		add(lblSelectPremade, gbc_lblSelectPremade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "Mow Yard", "Mop Floor", "Dust", "Clean Bathroom", "Wipe Windows"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 10;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		JLabel lblOrCreateYour = new JLabel("Or Create Your Own!");
		lblOrCreateYour.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_lblOrCreateYour = new GridBagConstraints();
		gbc_lblOrCreateYour.gridwidth = 10;
		gbc_lblOrCreateYour.insets = new Insets(0, 0, 5, 0);
		gbc_lblOrCreateYour.gridx = 0;
		gbc_lblOrCreateYour.gridy = 3;
		add(lblOrCreateYour, gbc_lblOrCreateYour);
		
		
		
		JLabel lblEnterChoreName = new JLabel("Enter Chore Name:");
		GridBagConstraints gbc_lblEnterChoreName = new GridBagConstraints();
		gbc_lblEnterChoreName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterChoreName.gridx = 1;
		gbc_lblEnterChoreName.gridy = 6;
		add(lblEnterChoreName, gbc_lblEnterChoreName);
		
		nameTextField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 6;
		add(nameTextField, gbc_textField);
		nameTextField.setColumns(10);
		
		JLabel lblEnterDescription = new JLabel("Enter Description");
		GridBagConstraints gbc_lblEnterDescription = new GridBagConstraints();
		gbc_lblEnterDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterDescription.gridx = 1;
		gbc_lblEnterDescription.gridy = 7;
		add(lblEnterDescription, gbc_lblEnterDescription);
		
		descriptionField = new JTextField();
		GridBagConstraints dfield;
		gbc_descriptionField = new GridBagConstraints();
		gbc_descriptionField.insets = new Insets(0, 0, 5, 5);
		gbc_descriptionField.fill = GridBagConstraints.HORIZONTAL;
		gbc_descriptionField.gridx = 4;
		gbc_descriptionField.gridy = 7;
		add(descriptionField, gbc_descriptionField);
		descriptionField.setColumns(10);
		
		JLabel lblChooseType = new JLabel("Choose Type");
		GridBagConstraints gbc_lblChooseType = new GridBagConstraints();
		gbc_lblChooseType.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseType.gridx = 1;
		gbc_lblChooseType.gridy = 8;
		add(lblChooseType, gbc_lblChooseType);
		
		final JComboBox typeDropdown = new JComboBox();
		typeDropdown.setModel(new DefaultComboBoxModel(new String[] {"Kitchen", "Yard", "Bathroom", "General"}));
		GridBagConstraints gbc_typeDropdown = new GridBagConstraints();
		gbc_typeDropdown.insets = new Insets(0, 0, 5, 5);
		gbc_typeDropdown.gridx = 4;
		gbc_typeDropdown.gridy = 8;
		add(typeDropdown, gbc_typeDropdown);
		
		JLabel lblChooseDaysRemaining = new JLabel("Choose Days Remaining:");
		GridBagConstraints gbc_lblChooseDaysRemaining = new GridBagConstraints();
		gbc_lblChooseDaysRemaining.gridheight = 3;
		gbc_lblChooseDaysRemaining.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseDaysRemaining.gridx = 1;
		gbc_lblChooseDaysRemaining.gridy = 9;
		add(lblChooseDaysRemaining, gbc_lblChooseDaysRemaining);
		
		final JSlider timeSlider = new JSlider();
		timeSlider.setSnapToTicks(true);
		timeSlider.setPaintTicks(true);
		timeSlider.setPaintLabels(true);
		timeSlider.setMaximum(7);
		timeSlider.setMajorTickSpacing(1);
		timeSlider.setValue(5);
		GridBagConstraints tSlider = new GridBagConstraints();
		tSlider.gridheight = 3;
		tSlider.insets = new Insets(0, 0, 5, 5);
		tSlider.gridx = 4;
		tSlider.gridy = 9;
		add(timeSlider, tSlider);
		
		JLabel lblSelectMember = new JLabel("Select Member:");
		GridBagConstraints gbc_lblSelectMember = new GridBagConstraints();
		gbc_lblSelectMember.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectMember.gridx = 1;
		gbc_lblSelectMember.gridy = 12;
		add(lblSelectMember, gbc_lblSelectMember);
		
		final JComboBox userComboBox = new JComboBox();
		userComboBox.setModel(new DefaultComboBoxModel(new String[] {"Pat", "Anna ", "Ryan", "Tyler"}));
		GridBagConstraints userDropdown = new GridBagConstraints();
		userDropdown.insets = new Insets(0, 0, 5, 5);
		userDropdown.gridx = 4;
		userDropdown.gridy = 12;
		add(userComboBox, userDropdown);
		
		JLabel lblDeclareDifficulty = new JLabel("Declare Difficulty:");
		GridBagConstraints gbc_lblDeclareDifficulty = new GridBagConstraints();
		gbc_lblDeclareDifficulty.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeclareDifficulty.gridx = 1;
		gbc_lblDeclareDifficulty.gridy = 13;
		add(lblDeclareDifficulty, gbc_lblDeclareDifficulty);
		
		final JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(5);
		slider.setMajorTickSpacing(1);
		slider.setValue(3);
		GridBagConstraints difficultySlider = new GridBagConstraints();
		difficultySlider.insets = new Insets(0, 0, 5, 5);
		difficultySlider.gridx = 4;
		difficultySlider.gridy = 13;
		add(slider, difficultySlider);
		
		final JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					int difficulty = slider.getValue();
					String name = nameTextField.getText();
					String user = userComboBox.getSelectedItem().toString();
					String desc = descriptionField.getText();
					String type = typeDropdown.getSelectedItem().toString();
					int timeRemaining = timeSlider.getValue();
					
					window.getHouse().createCustomChore(name, desc, type, timeRemaining, user, difficulty);
					
					//The callback to add chore to gui should be in the controller not here
					
					nameTextField.setText("");
					descriptionField.setText("");
				}
				catch(Exception ex ){
					//not all values filled out so do something
					btnSubmit.setBackground(new Color(255,0,0));
				}
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridwidth = 10;
		gbc_btnSubmit.gridx = 0;
		gbc_btnSubmit.gridy = 17;
		add(btnSubmit, gbc_btnSubmit);

	}

}
