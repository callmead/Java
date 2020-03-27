import java.io.*;
import java.net.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Draw extends Task1 implements ActionListener
{

	private JButton exitButton;
	private JButton sizeButton;



	int radius=10;
	int x=getWidth();
	int y=getHeight();
	int x1;
	int y1;
	boolean paint=true;

	Color col=new Color(23,13,231);
	Color col1=new Color(40,120,60);


	public Draw()
	{
        Container c=getContentPane();
		c.setLayout(new BorderLayout());


		sizeButton=new JButton("");
		sizeButton.setIcon(new ImageIcon("Increase.jpg"));
		sizeButton.setBackground(new Color(134,150,190));


		exitButton=new JButton("");
		exitButton.setIcon(new ImageIcon("Exit.jpg"));
		exitButton.setBackground(new Color(134,150,190));

		JPanel paintPanel=new JPanel();
		JPanel southPanel=new JPanel();

		paintPanel.setBackground(new Color(150,60,20));
		southPanel.setBackground(new Color(150,50,100));



		southPanel.add(sizeButton);
		southPanel.add(exitButton);


		Graphics g=paintPanel.getGraphics();


		c.add(paintPanel,BorderLayout.CENTER);
		c.add(southPanel,BorderLayout.SOUTH);


		sizeButton.addActionListener(this);
		exitButton.addActionListener(this);

		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension position=toolkit.getScreenSize();
		setBounds(((int)position.getWidth()/2)-150,(int)(position.getHeight()/2)-150,300,300);

		setVisible(true);
		drawFillCircle(radius,col);
	}
	public void actionPerformed(ActionEvent ae)
	{
		 if(ae.getSource()==sizeButton)
		 {

			 if(paint==true)
			 {

				radius=radius+5;
				drawFillCircle(radius,col);

			 }
			 if(paint==false)
	    	 {

			     radius=radius-5;
				 drawFillCircle(radius,col);

			 }
		     if(radius==100)
		     {

				sizeButton.setIcon(new ImageIcon("Decrease.jpg"));

				try
				{

					File audiofile1=new File("Utopia Default.wav");
					URL url1=new URL("file:\\"+audiofile1.getAbsolutePath());
					AudioClip ac1=Applet.newAudioClip(url1);
					ac1.play();

				}
				catch(MalformedURLException murle)
				{
					JOptionPane.showMessageDialog(null,""+murle);
				}

			}
			if(radius==10)
			{
				sizeButton.setIcon(new ImageIcon("Increase.jpg"));
				try
				{
					File audiofile2=new File("Musica Maximize.wav");
					URL url2=new URL("file:\\"+audiofile2.getAbsolutePath());
					AudioClip ac2=Applet.newAudioClip(url2);
					ac2.play();
				}
				catch(MalformedURLException murle)
				{
					JOptionPane.showMessageDialog(null,""+murle);
				}
			}
			if(radius==10)
			{
				do
				{
					paint=true;
				}while(radius==100);

			}
			if(radius==100)
			{
				do
				{
					 paint=false;
				}while(radius==10);
			}


		}
		else if(ae.getSource()==exitButton)
		{
			System.exit(0);
		}

	}
	public static void main(String args[])
	{
		Draw d=new Draw();

	}
}