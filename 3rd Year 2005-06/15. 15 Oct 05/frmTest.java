//Combo Box Example...15/10/2005
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmTest extends JFrame
{//Class

	//Global Declerations...
	JLabel lblText = new JLabel();

	JComboBox cmbYear = new JComboBox();
	JComboBox cmbMonth = new JComboBox();
	JComboBox cmbDay = new JComboBox();

	JPanel pnlMain = new JPanel();
	JPanel pnlDate = new JPanel();
	//----------------------

	frmTest()
	{//Cons
		this.setTitle("Example of Combo Box");
		this.setBounds(100,100,300,220);

		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnlMain);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Pannel Properties...
		pnlMain.setLayout(null);
		pnlMain.setBounds(5,5,280,175);
		pnlMain.setBorder(BorderFactory.createLineBorder(Color.black));
		//pnlMain.setBackground(Color.white);
		//--------------------

		//Adding Components to the Pannel...
		pnlMain.add(lblText);
		pnlMain.add(pnlDate);

		//pnlMain.add(btnCalc);
		//----------------------------------

		//Label Properties...
		lblText.setText("Please Select Date :");
		lblText.setBounds(10,15,140,20);

		//Panel Properties
		pnlDate.setLayout(null);
		pnlDate.setBounds(10,40,190,30);
		pnlDate.setBorder(BorderFactory.createLineBorder(Color.white));
		pnlDate.add(cmbYear);
		pnlDate.add(cmbMonth);
		pnlDate.add(cmbDay);

		//Properties of Combos
		cmbYear.setBounds(5,5,60,20);
			addYears();
			//cmbYear.setSelectedIndex(105); //Year 2005 have the index value 105 OR
			cmbYear.setSelectedItem("2005");
			cmbYear.setMaximumRowCount(10);
		cmbMonth.setBounds(65,5,60,20);
			cmbMonth.addItem("JAN");
			cmbMonth.addItem("FEB");
			cmbMonth.addItem("MAR");
			cmbMonth.addItem("APR");
			cmbMonth.addItem("MAY");
			cmbMonth.addItem("JUN");
			cmbMonth.addItem("JUL");
			cmbMonth.addItem("AUG");
			cmbMonth.addItem("SEP");
			cmbMonth.addItem("OCT");
			cmbMonth.addItem("NOV");
			cmbMonth.addItem("DEC");
			cmbMonth.setMaximumRowCount(10);
		cmbDay.setBounds(125,5,60,20);
			addDays();
			cmbDay.setMaximumRowCount(10);

	}//End Cons

	public static void main(String args[])
	{//Main
		frmTest cons = new frmTest();
		cons.setVisible(true);
	}//End Main

	private void addYears()
	{//addYears
		for (int i=1900;i<=2020;i++)
		{
			cmbYear.addItem(String.valueOf(i)); // OR
			//cmbYear.addItem(new Integer(i));
		}
	}//addYears
	private void addDays()
	{//addDays
		for (int i=1;i<=31;i++)
		{
			cmbDay.addItem(String.valueOf(i)); // OR
			//cmbYear.addItem(new Integer(i));
		}
	}//addDays

}//End Class