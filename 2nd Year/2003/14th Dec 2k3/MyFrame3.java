import javax.swing.*; //14th December 2003 Example of JLabel on JPanel on JFrame
import java.awt.*;
import java.awt.event.*;//for Action Listener

public class MyFrame3 extends JFrame
{
	JPanel Pnl1=new JPanel();//Works Like Frame in VB
	JLabel lbl1=new JLabel();
	JLabel lbl2=new JLabel();
	JButton btnShow=new JButton();
	JButton btnHide=new JButton();

	public MyFrame3()
	{
		this.setTitle("Example of Label");
		this.setBounds(300,150,400,400);
		this.getContentPane().setLayout(null);//Default Border Layout
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);//JFrame Color



		//---------Adding JPanel on JFrame------------
		this.getContentPane().add(Pnl1);



		//---------Properties of JPanel------------
		Pnl1.setLayout(null);//If not used then by default it takes Flow Layout
		Pnl1.setBounds(25,25,345,325);
		Pnl1.setBackground(Color.blue);
		Pnl1.add(lbl1);//Because this label is on the Pannel thats why Pnl1.add(lbl1)
		Pnl1.add(lbl2);//Because this label is on the Pannel thats why Pnl1.add(lbl1)
		Pnl1.add(btnShow);//Adding Btn on Pannel
		Pnl1.add(btnHide);//Adding Btn on Pannel



		//*********************Properties of JLabel1*********************
		lbl1.setBounds(10,10,180,50);//By default Label is Transparent and this will not work the size of label will be as much as the text is. Use Pnl1.setLayout(null) for changing the Layout
		lbl1.setText("Image Viewer");//Label Text
		lbl1.setForeground(Color.black);//Text Color
		lbl1.setBackground(Color.white);//It will not work untill setOpaque(true) so
		lbl1.setOpaque(true);//Must use to set background of the label
		lbl1.setFont(new Font("Tahoma",1,16));//Font
		//lbl1.setBorder(BorderFactory.createLineBorder(Color.red));//Label Border by default border width is 1 pixel to define more width see next line
		lbl1.setBorder(BorderFactory.createLineBorder(Color.red,2));


		//----------Text Horizontal Alignments-----------------
		//lbl1.setHorizontalAlignment(SwingConstants.LEFT); //By default its left no need to write
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		//lbl1.setHorizontalAlignment(SwingConstants.RIGHT);

		//----------Text Vertical Alignments-----------------
		//lbl1.setVerticalAlignment(SwingConstants.TOP);
		//lbl1.setVerticalAlignment(SwingConstants.CENTER);//By Default its Center no need to write
		lbl1.setVerticalAlignment(SwingConstants.BOTTOM);
		//***************************************************************



		//*********************Properties of JLabel2*********************
		lbl2.setBounds(10,70,326,220);//By default Label is Transparent and this will not work the size of label will be as much as the text is. Use Pnl1.setLayout(null) for changing the Layout
		lbl2.setOpaque(true);
		//***************************************************************



		//*********************Properties of JButton BtnShow*********************
		btnShow.setBounds(200,10,120,25);
		btnShow.setText("Show Image");
		btnShow.setMnemonic('S');
		//To Show Image on Label add Action Listener
		btnShow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x1)
			{
				lbl2.setIcon(new ImageIcon("logo.GIF"));//Adding Image on the Label
			}
		});
		//***************************************************************



		//*********************Properties of JButton BtnHide*********************
		btnHide.setBounds(200,40,120,25);
		btnHide.setText("Hide Image");
		btnHide.setMnemonic('H');

		btnHide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x2)
			{
				lbl2.setIcon(new ImageIcon(""));//Removing Image on the Label
			}
		});
		//***************************************************************


	}

	public static void main(String a[])
	{
		MyFrame3 obj = new MyFrame3();
		obj.setVisible(true);
	}
}