import javax.swing.*;
import java.awt.*;

public class frmSupp extends JFrame
{//Class

	//Global Declerations...
	JLabel lblID = new JLabel();
	JLabel lblCN = new JLabel();
	JLabel lblAddress = new JLabel();
	JLabel lblPhone = new JLabel();
	JLabel lblEmail = new JLabel();
	JLabel lblDOJ = new JLabel();

	JTextField txtID = new JTextField();
	JTextField txtCN = new JTextField();
	JTextField txtAddress = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtDOJ = new JTextField();

	JPanel pnl = new JPanel();
	//----------------------

	public frmSupp()
	{//Cons

		//Frame Properties...
		this.setTitle("Supplier Information");
		this.setBounds(50,50,380,340);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.pink);
		//--------------------

		//Adding Pannel to Container...
		this.getContentPane().add(pnl);

		//Adding Components to Pannel...
		pnl.add(lblID);
		pnl.add(lblCN);
		pnl.add(txtID);
		pnl.add(txtCN);
		pnl.add(lblAddress);
		pnl.add(txtAddress);
		pnl.add(lblPhone);
		pnl.add(txtPhone);
		pnl.add(lblEmail);
		pnl.add(txtEmail);
		pnl.add(lblDOJ);
		pnl.add(txtDOJ);

		//Properties of Pannel...
		pnl.setBounds(05,05,365,300);
		pnl.setLayout(null);
		pnl.setBackground(Color.white);

		//Properties of Labels...
		lblID.setText(" ID Number");
		lblID.setOpaque(false);
		lblID.setFont(new Font("Verdana", 1, 12));
		lblID.setBounds(30,40,120,25);

		lblCN.setText(" Comapny Name");
		lblCN.setOpaque(false);
		lblCN.setFont(new Font("Verdana", 1, 12));
		lblCN.setBounds(30,70,120,25);

		lblAddress.setText(" Address");
		lblAddress.setOpaque(false);
		lblAddress.setFont(new Font("Verdana", 1, 12));
		lblAddress.setBounds(30,100,120,25);

		lblPhone.setText(" Phone");
		lblPhone.setOpaque(false);
		lblPhone.setFont(new Font("Verdana", 1, 12));
		lblPhone.setBounds(30,130,120,25);

		lblEmail.setText(" Email");
		lblEmail.setOpaque(false);
		lblEmail.setFont(new Font("Verdana", 1, 12));
		lblEmail.setBounds(30,160,120,25);

		lblDOJ.setText(" Date of Joining");
		lblDOJ.setOpaque(false);
		lblDOJ.setFont(new Font("Verdana", 1, 12));
		lblDOJ.setBounds(30,190,120,25);

		//Properties of TextFields...
		txtID.setBounds(170,40,160,25);
		txtID.setFont(new Font("Verdana", 0, 12));
		txtID.setText("S0502");

		txtCN.setBounds(170,70,160,25);
		txtCN.setFont(new Font("Verdana", 0, 12));
		txtCN.setText("BEXIMCO Group");

		txtAddress.setBounds(170,100,160,25);
		txtAddress.setFont(new Font("Verdana", 0, 12));
		txtAddress.setText("15 Banani, Dhaka BD");

		txtPhone.setBounds(170,130,160,25);
		txtPhone.setFont(new Font("Verdana", 0, 12));
		txtPhone.setText("8825388");

		txtEmail.setBounds(170,160,160,25);
		txtEmail.setFont(new Font("Verdana", 0, 12));
		txtEmail.setText("admin@beximco.org");

		txtDOJ.setBounds(170,190,160,25);
		txtDOJ.setFont(new Font("Verdana", 0, 12));
		txtDOJ.setText("23/05/95");

	}//End Cons

	public static void main (String args[])
	{//Main

		frmSupp ml = new frmSupp();
		ml.setVisible(true);

	}//End Main
}//End Class