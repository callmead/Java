import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class frmCal extends JFrame
{//Class

	//Global Declerations...
	JLabel lblUP = new JLabel();
	JLabel lblQty = new JLabel();
	JLabel lblTP = new JLabel();
	JLabel lblTotal = new JLabel();

	JTextField txtUPrice = new JTextField();
	JTextField txtQty = new JTextField();

	JButton btnCalc = new JButton();

	JPanel pnlMain = new JPanel();
	//----------------------

	frmCal()
	{//Cons
		this.setTitle("Purchase");
		this.setBounds(100,100,300,220);

		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnlMain);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Pannel Properties...
		pnlMain.setLayout(null);
		pnlMain.setBounds(5,5,280,130);
		pnlMain.setBorder(BorderFactory.createLineBorder(Color.black));
		//pnlMain.setBackground(Color.white);
		//--------------------

		//Adding Components to the Pannel...
		pnlMain.add(lblUP);
		pnlMain.add(lblQty);
		pnlMain.add(lblTP);
		pnlMain.add(lblTotal);

		pnlMain.add(txtUPrice);
		pnlMain.add(txtQty);

		//pnlMain.add(btnCalc);
		//----------------------------------

		//Label Properties...
		lblUP.setText(" Unit Price");
		lblUP.setFont(new Font("Verdana", 0, 12));
		lblUP.setBounds(30,30,100,20);

		lblQty.setText(" Quantity");
		lblQty.setFont(new Font("Verdana", 0, 12));
		lblQty.setBounds(30,60,100,20);

		lblTP.setText(" Total Price");
		lblTP.setFont(new Font("Verdana", 0, 12));
		lblTP.setBounds(30,90,100,20);

		lblTotal.setBounds(140,90,100,20);
		lblTotal.setOpaque(true);
		lblTotal.setFont(new Font("Verdana", 0, 12));
		lblTotal.setBackground(Color.black);
		lblTotal.setForeground(Color.white);
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		//-------------------

		//TextField Properties...
		txtUPrice.setBounds(140,30,100,20);
		txtUPrice.setFont(new Font("Verdana", 0, 12));
		txtUPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUPrice.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent ke)
			{
				Calculate();
			}
		});

		txtQty.setBounds(140,60,100,20);
		txtQty.setFont(new Font("Verdana", 0, 12));
		txtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		txtQty.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent ke)
			{
				Calculate();
			}
		});
		//-----------------------

		//Button Properties...
		this.getContentPane().add(btnCalc);
		btnCalc.setText("Calculate");
		btnCalc.setBounds(145,150,100,20);
		btnCalc.setMnemonic('C');
		btnCalc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Calculate();
			}
		});
		//--------------------
	}//End Cons

	public static void main(String args[])
	{//Main
		frmCal cons = new frmCal();
		cons.setVisible(true);
	}//End Main

	private void Calculate()
	{//Calculate.... TRY CATCH TO BE USED TO

		double price = 0;
		int Qty=0;
		DecimalFormat df = new DecimalFormat();
		//df.applyPattern("0000.000"); //can be used for generating ID's
		//df.applyPattern("####.000"); //If required then shows
		df.applyPattern("####.###"); //If required then shows

		try
		{
			price = Double.parseDouble(txtUPrice.getText());
			Qty = Integer.parseInt(txtQty.getText());

		}catch(Exception ex){}

		double total = price * Qty;
		//lblTotal.setText(String.valueOf(total));
		lblTotal.setText(df.format(total));

	}//End Calculate

}//End Class