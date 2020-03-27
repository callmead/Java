package usertools.diit;

import javax.swing.*;

public class myTools{

	public static void theEnd()
	{
		int r=JOptionPane.showConfirmDialog(null,"Are you sure want to exit? ");
		if(r==JOptionPane.YES_OPTION)
		System.exit(0);


	}

	/* public static void main(String[] args)
	{

			// for non static calling method    new myTools().theEnd();
    }*/

}