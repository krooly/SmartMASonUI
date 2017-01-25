package window;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import window.primitiveUI.RobotManagement;

public class Window extends JFrame { //JFrame get window functionals
	
	private static final long serialVersionUID = -7150710923108249953L;

		public Window(){
			
		    super("krooly App"); //title window
		    
		    setBounds(100, 100, 500, 200);
		    
		    RobotManagement robotManagement = new RobotManagement();
		    add(robotManagement.ManagementPanel(), BorderLayout.SOUTH);
		    robotManagement.Listener();
		    		    
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sDSO close App if close window
		  }

		
}
