package def;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.util.List;
import javax.swing.JTextField;


public class ViewChorePanel extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public ViewChorePanel(String choreName, String description, String type, String dueIn, String memberName, String difficulty, String completed) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 4, 6, 1, 0, 1, 3, 7, 2, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblChoreName = new JLabel("Chore Name:");
		GridBagConstraints gbc_lblChoreName = new GridBagConstraints();
		gbc_lblChoreName.insets = new Insets(0, 0, 5, 5);
		gbc_lblChoreName.gridx = 2;
		gbc_lblChoreName.gridy = 0;
		add(lblChoreName, gbc_lblChoreName);
		
		JLabel lblNameOfChore = new JLabel(choreName);
		GridBagConstraints gbc_lblNameOfChore = new GridBagConstraints();
		gbc_lblNameOfChore.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNameOfChore.insets = new Insets(0, 0, 5, 0);
		gbc_lblNameOfChore.gridx = 11;
		gbc_lblNameOfChore.gridy = 0;
		add(lblNameOfChore, gbc_lblNameOfChore);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 2;
		gbc_lblDescription.gridy = 1;
		add(lblDescription, gbc_lblDescription);
		
		JLabel lblDesc = new JLabel(description);
		GridBagConstraints gbc_lblDesc = new GridBagConstraints();
		gbc_lblDesc.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDesc.insets = new Insets(0, 0, 5, 0);
		gbc_lblDesc.gridx = 11;
		gbc_lblDesc.gridy = 1;
		add(lblDesc, gbc_lblDesc);
		
		JLabel lblType = new JLabel("Type:");
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 2;
		gbc_lblType.gridy = 2;
		add(lblType, gbc_lblType);
		
		JLabel lblTyp = new JLabel(type);
		GridBagConstraints gbc_lblTyp = new GridBagConstraints();
		gbc_lblTyp.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTyp.insets = new Insets(0, 0, 5, 0);
		gbc_lblTyp.gridx = 11;
		gbc_lblTyp.gridy = 2;
		add(lblTyp, gbc_lblTyp);
		
		JLabel lblDueIn = new JLabel("Due In:");
		GridBagConstraints gbc_lblDueIn = new GridBagConstraints();
		gbc_lblDueIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblDueIn.gridx = 2;
		gbc_lblDueIn.gridy = 3;
		add(lblDueIn, gbc_lblDueIn);
		
		JLabel lblNumberOfDays = new JLabel(dueIn + " days");
		GridBagConstraints gbc_lblNumberOfDays = new GridBagConstraints();
		gbc_lblNumberOfDays.fill = GridBagConstraints.BOTH;
		gbc_lblNumberOfDays.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumberOfDays.gridx = 11;
		gbc_lblNumberOfDays.gridy = 3;
		add(lblNumberOfDays, gbc_lblNumberOfDays);
		
		JLabel lblResponsibleMember = new JLabel("Responsible Member:");
		GridBagConstraints gbc_lblResponsibleMember = new GridBagConstraints();
		gbc_lblResponsibleMember.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsibleMember.gridx = 2;
		gbc_lblResponsibleMember.gridy = 4;
		add(lblResponsibleMember, gbc_lblResponsibleMember);
		
		JLabel lblMember = new JLabel(memberName);
		GridBagConstraints gbc_lblMember = new GridBagConstraints();
		gbc_lblMember.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMember.insets = new Insets(0, 0, 5, 0);
		gbc_lblMember.gridx = 11;
		gbc_lblMember.gridy = 4;
		add(lblMember, gbc_lblMember);
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		GridBagConstraints gbc_lblDifficulty = new GridBagConstraints();
		gbc_lblDifficulty.insets = new Insets(0, 0, 5, 5);
		gbc_lblDifficulty.gridx = 2;
		gbc_lblDifficulty.gridy = 5;
		add(lblDifficulty, gbc_lblDifficulty);
		
		JLabel lblHardness = new JLabel(difficulty);
		GridBagConstraints gbc_lblHardness = new GridBagConstraints();
		gbc_lblHardness.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblHardness.insets = new Insets(0, 0, 5, 0);
		gbc_lblHardness.gridx = 11;
		gbc_lblHardness.gridy = 5;
		add(lblHardness, gbc_lblHardness);
		
		JLabel lblCompleted = new JLabel("Completed:");
		GridBagConstraints gbc_lblCompleted = new GridBagConstraints();
		gbc_lblCompleted.insets = new Insets(0, 0, 0, 5);
		gbc_lblCompleted.gridx = 2;
		gbc_lblCompleted.gridy = 6;
		add(lblCompleted, gbc_lblCompleted);
		
		JLabel lblBoolean = new JLabel(completed);
		GridBagConstraints gbc_lblBoolean = new GridBagConstraints();
		gbc_lblBoolean.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBoolean.gridx = 11;
		gbc_lblBoolean.gridy = 6;
		add(lblBoolean, gbc_lblBoolean);

	}
	

	
}
