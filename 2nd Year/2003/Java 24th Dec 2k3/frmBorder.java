//Java Class 24th December 2003 Example of Borders
import java.awt.*;
import javax.swing.*;

//For Bevel Border
import javax.swing.*;
import javax.swing.border.*;

public class frmBorder extends JFrame
{//class
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	JPanel p8=new JPanel();
	JPanel p9=new JPanel();

	public frmBorder()
	{
		this.setTitle("Example of Border");
		this.setBounds(100,100,600,465);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().add(p1);
		this.getContentPane().add(p2);
		this.getContentPane().add(p3);
		this.getContentPane().add(p4);
		this.getContentPane().add(p5);
		this.getContentPane().add(p6);
		this.getContentPane().add(p7);
		this.getContentPane().add(p8);
		this.getContentPane().add(p9);

		//----------Properties of Panels------------
		p1.setBounds(20,20,170,120);//Line Border
		//p1.setBorder(BorderFactory.createLineBorder(Color.white));

		//Creating Compound Border see below (Mixed Borders, Mix as many as u want just giving comma)
		//Syntax p1.createCompoundBorder(outer,inner);
		//p1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),BorderFactory.createRaisedBevelBorder()));
		//p1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder())); //Mixing 2
		//p1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()))); //Mixing 3 times

		p2.setBounds(210,20,170,120);//Line Border, Border's width Wider default width is 1 Border width is only for Line Border
		p2.setBorder(BorderFactory.createLineBorder(Color.blue,5));//Every side is same in size in this border to defince each side see MatteBorder

		p3.setBounds(400,20,170,120);//Bevel Border for P3
		//p3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)); //Or Next Line
		p3.setBorder(BorderFactory.createLoweredBevelBorder());

		p4.setBounds(20,160,170,120);//Bevel Border for P4
		//p4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));//Or
		p4.setBorder(BorderFactory.createRaisedBevelBorder());

		p5.setBounds(210,160,170,120);//Etched Border default is Lowered
		p5.setBorder(BorderFactory.createEtchedBorder()); //OR
		//p6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)); //Default
		//p6.setBorder(BorderFactory.createEtchedBorder(1)); //Default

		p6.setBounds(400,160,170,120);//Etched Border Raised
		p6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED)); //Or
		//p6.setBorder(BorderFactory.createEtchedBorder(0));

		p7.setBounds(20,300,170,120);//MatteBorder used to define each side's width
		//createMatteBorder(top,left,bottom,right,color));
		p7.setBorder(BorderFactory.createMatteBorder(2,4,6,8,Color.red));


		p8.setBounds(210,300,170,120);//MatteBorder in border use picture
		p8.setBorder(BorderFactory.createMatteBorder(10,8,10,8,new ImageIcon("customers.GIF")));

		p9.setBounds(400,300,170,120);//Title Border
		//p9.setBorder(BorderFactory.createTitledBorder("Titled Border9"));//No Border Specification
		//Border Specifications
		//p9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(0),"Titled Border9")); //Raised Etched and with a title
		p9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1),"Titled Border9")); //Raised Etched and with a title

	}

	public static void main(String a[])
	{//main
		frmBorder b = new frmBorder();
		b.setVisible(true);
	}//end main

}//end class