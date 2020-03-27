import javax.swing.*;
import java.awt.*;

public class frmMainMenu extends JFrame
{//Class
	public frmMainMenu()
	{//Cons

		this.setTitle("STOCK CONTROL MANAGEMENT SYSTEM");
		this.setLocation(0,0);

		//Getting Screen Dimension...
		//int sw = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		//int sh = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		//---------------------------
		//this.setSize(sw,sh);
		this.setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());//one line instead of 3
		//---------------------------

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}//End Cons

	public static void main(String args[])
	{//Main

		frmMainMenu fmm = new frmMainMenu();
		fmm.setVisible(true);

	}//End Main
}//End Class