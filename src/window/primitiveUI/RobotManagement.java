package window.primitiveUI;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class RobotManagement {
	
	private int robots = 0;
	
	//Elements for managing
	private JLabel countLabel = new JLabel("Robots: " + robots);
	private JButton addRobot  = new JButton("Add");
	private JButton removeRobot = new JButton("Remove");
	private JPanel buttonsPanel = new JPanel();	
	
	public JPanel ManagementPanel() {
		
		buttonsPanel.add(countLabel, BorderLayout.NORTH);
		buttonsPanel.add(addRobot);
		buttonsPanel.add(removeRobot);
		
		return buttonsPanel;		
	}
	
	public void Listener() {
		
		addRobot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				robots++;
				if (robots < 5) {
					updateRobotCounter();
				} else {
					updateRobotCounter(" (It's big Label)");
				}
				
			}
		});
		
		removeRobot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (robots > 0) {
					robots--;
					updateRobotCounter();
				}
			}
		});
		
	}
	
	private void updateRobotCounter() {
		countLabel.setText("Robots: " + robots);
	}
	
	private void updateRobotCounter(String exc) {
		countLabel.setText("Robots: " + robots + exc);
	}
	  
}
