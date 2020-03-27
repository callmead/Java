import javax.swing.*; // Frame 1
import java.awt.*;
import java.awt.event.*;
class testFrame
{
	JFrame frm1=new JFrame("Frame 1");

	JTextField txtBox1 = new JTextField(12);
	String str1 = new String();

	JLabel lbltxtBox1 = new JLabel("Enter Text :");

	JButton btnClickMe=new JButton("Click Me");

	Container c;
	GridLayout layout=new GridLayout(3,2);


	testFrame()
	{
		frm1.setResizable(false);//to Disable Maximize Button
		frm1.setSize(300,150);// Its Just outputting the Layout as one after another Just resize and then you will see
		frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE);

		c=frm1.getContentPane();
		c.setLayout(layout); //layout is an object

		c.add(lbltxtBox1);
		c.add(txtBox1);
		c.add(btnClickMe);

		btnClickMe.addActionListener(new DoIt());
		frm1.show();
	}


	//Class for the Action Listner
	class DoIt implements ActionListener
	{
	  	public void actionPerformed(ActionEvent e)
	  	{
	  		if (e.getSource()==btnClickMe)
	    	{
				str1 = txtBox1.getText();
				JOptionPane.showMessageDialog(null,"Your Text is \" "+str1+" \"");
				testFrame2 tf = new testFrame2(str1);
	    	}


	   	}
	}
	public static void main(String a[])
	{
		testFrame f=new testFrame();
	}//main
}// class
