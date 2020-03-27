import javax.swing.*; // GRID Layout
import java.awt.*;
import java.awt.event.*;
public class test3
{
	public static void main (String args[])
{
	testFrame form1 = new testFrame();
}

}
	class testFrame
{

JFrame frm1=new JFrame("Test Form");

JComboBox combo1 = new JComboBox();
JCheckBox chk1 = new JCheckBox("Permission");
file://JRadioButton rb1 = new JRadioButton("Test");


JTextField txt1=new JTextField(12);//JTextFiled(12) width of the field
JTextField txt2=new JTextField(12);//JTextFiled(12) width of the field
JTextField txt3=new JTextField(12);//JTextFiled(12) width of the field

JLabel lbl1=new JLabel("Number1 :");
JLabel lbl2=new JLabel("Number2 :");
JLabel lbl3=new JLabel("Result :");

JButton btn1=new JButton("Ok");
JButton btn2=new JButton("Clear");

String combodata;
boolean check = false;

Container c;
GridLayout layout=new GridLayout(5,2); file://4,a are 4 rows and 2 columns
testFrame()
{
	frm1.setResizable(false);//to Disable Maximize Button
	frm1.setSize(320,250);// Its Just outputting the Layout as one after another Just resize and then you will see
	frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE);

	// To Add Items in ComboBox
	combo1.addItem("Add");
	combo1.addItem("Subtract");
	combo1.addItem("Multiply");
	combo1.addItem("Divide");



	c=frm1.getContentPane();
	c.setLayout(layout); file://layout is an object
	// we cant use this in Grid Layout layout.setAlignment(FlowLayout.LEFT); file://Setting Objects Layouts to Left

	c.add(lbl1);
	c.add(txt1);
	c.add(lbl2);
	c.add(txt2);
	c.add(lbl3);
	c.add(txt3);

	c.add(chk1);

	c.add(combo1);

	c.add(btn1);
	c.add(btn2);
	btn1.addActionListener(new DoIt());
	btn2.addActionListener(new DoIt());
	chk1.addItemListener(new Items());
	combo1.addItemListener(new Items());
	frm1.show();
}

//Class for the Action Listner


class DoIt implements ActionListener
{
	public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==btn1)
{
	if (check == true)
{

int n1=Integer.parseInt(txt1.getText());
int n2=Integer.parseInt(txt2.getText());
combodata=(String) combo1.getSelectedItem(); file://To get the Selected thing from combo
if (combodata.equals("Add"))
{
txt3.setText(""+(n1+n2));
}
if (combodata.equals("Subtract"))
{
txt3.setText(""+(n1-n2));
}
if (combodata.equals("Multiply"))
{
txt3.setText(""+(n1*n2));
}
if (combodata.equals("Divide"))
{
txt3.setText(""+(n1/n2));
}
}
else
{
JOptionPane.showMessageDialog(null,"You Dont Have Permission");
}

}


if (e.getSource()==btn2)
{
txt1.setText("");
txt2.setText("");
txt3.setText("");
}

}
}

class Items implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
if (e.getSource()==chk1)
{
System.out.println("Check box has been clicked");
check = true; file://For the Permissions to Work
}


if (e.getSource()==combo1)
{
System.out.println("Combo box has been clicked");
}

}
}

}