import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class ViewChorePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewChorePanel(String choreName, String memberName, String dueIn, String completed) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 75, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblChoreName = new JLabel("Chore Name:");
		GridBagConstraints gbc_lblChoreName = new GridBagConstraints();
		gbc_lblChoreName.anchor = GridBagConstraints.WEST;
		gbc_lblChoreName.insets = new Insets(0, 0, 5, 5);
		gbc_lblChoreName.gridx = 1;
		gbc_lblChoreName.gridy = 1;
		add(lblChoreName, gbc_lblChoreName);
		
		JLabel lblNameOfChore = new JLabel(choreName);
		GridBagConstraints gbc_lblNameOfChore = new GridBagConstraints();
		gbc_lblNameOfChore.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNameOfChore.insets = new Insets(0, 0, 5, 0);
		gbc_lblNameOfChore.gridx = 3;
		gbc_lblNameOfChore.gridy = 1;
		add(lblNameOfChore, gbc_lblNameOfChore);
		
		JLabel lblResponsibleMember = new JLabel("Responsible Member:");
		GridBagConstraints gbc_lblResponsibleMember = new GridBagConstraints();
		gbc_lblResponsibleMember.insets = new Insets(0, 0, 5, 5);
		gbc_lblResponsibleMember.gridx = 1;
		gbc_lblResponsibleMember.gridy = 2;
		add(lblResponsibleMember, gbc_lblResponsibleMember);
		
		JLabel lblMember = new JLabel(memberName);
		GridBagConstraints gbc_lblMember = new GridBagConstraints();
		gbc_lblMember.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMember.insets = new Insets(0, 0, 5, 0);
		gbc_lblMember.gridx = 3;
		gbc_lblMember.gridy = 2;
		add(lblMember, gbc_lblMember);
		
		JLabel lblDueIn = new JLabel("Due In:");
		GridBagConstraints gbc_lblDueIn = new GridBagConstraints();
		gbc_lblDueIn.anchor = GridBagConstraints.WEST;
		gbc_lblDueIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblDueIn.gridx = 1;
		gbc_lblDueIn.gridy = 3;
		add(lblDueIn, gbc_lblDueIn);
		
		JLabel lblNumberOfDays = new JLabel(dueIn);
		GridBagConstraints gbc_lblNumberOfDays = new GridBagConstraints();
		gbc_lblNumberOfDays.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNumberOfDays.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumberOfDays.gridx = 3;
		gbc_lblNumberOfDays.gridy = 3;
		add(lblNumberOfDays, gbc_lblNumberOfDays);
		
		JLabel lblCompleted = new JLabel("Completed:");
		GridBagConstraints gbc_lblCompleted = new GridBagConstraints();
		gbc_lblCompleted.anchor = GridBagConstraints.WEST;
		gbc_lblCompleted.insets = new Insets(0, 0, 0, 5);
		gbc_lblCompleted.gridx = 1;
		gbc_lblCompleted.gridy = 4;
		add(lblCompleted, gbc_lblCompleted);
		
		JLabel lblBoolean = new JLabel(completed);
		GridBagConstraints gbc_lblBoolean = new GridBagConstraints();
		gbc_lblBoolean.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBoolean.gridx = 3;
		gbc_lblBoolean.gridy = 4;
		add(lblBoolean, gbc_lblBoolean);

	}

}
