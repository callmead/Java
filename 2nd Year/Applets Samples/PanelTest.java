import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanelTest extends JFrame implements ActionListener,ItemListener
{
	JLabel lb1= new JLabel("Look & Feel");
	String comboData[]={"java","Operating System", "Motif"};
	JComboBox cb=new JComboBox(comboData);
	JRadioButton rb1=new JRadioButton("Default");
	JRadioButton rb2=new JRadioButton("Hand");
	JRadioButton rb3=new JRadioButton("Wait");
	JCheckBox ch1=new JCheckBox("sa",false);
	JCheckBox ch2=new JCheckBox("jal",false);
	JButton btn=new JButton("Exit");
	JButton btn1=new JButton("Name");
	JButton btn2=new JButton("Age");
	JButton btn3=new JButton("Sex");

public PanelTest()
{
	JPanel northPanel=new JPanel();
	JPanel centerPanel=new JPanel();
	JPanel southPanel=new JPanel();
	JPanel westPanel=new JPanel();
	JPanel eastPanel=new JPanel();

	northPanel.add(lb1);
	northPanel.add(cb);

	centerPanel.add(rb1);
	centerPanel.add(rb2);
	centerPanel.add(rb3);

	southPanel.add(btn);

	westPanel.add(ch1);
	westPanel.add(ch2);

	eastPanel.add(btn1);
	eastPanel.add(btn2);
	eastPanel.add(btn3);

	Container c=getContentPane();
	c.add(northPanel,BorderLayout.NORTH);
	c.add(centerPanel,BorderLayout.CENTER);
	c.add(southPanel,BorderLayout.SOUTH);
	c.add(westPanel,BorderLayout.WEST);
	c.add(eastPanel,BorderLayout.EAST);

	ButtonGroup cursorGroup=new ButtonGroup();
	cursorGroup.add(rb1);
	cursorGroup.add(rb2);
	cursorGroup.add(rb3);

	rb1.addActionListener(this);
	rb2.addActionListener(this);
	rb3.addActionListener(this);
	btn.addActionListener(this);
	cb.addItemListener(this);

	northPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
	centerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),"Cursor Type"));
	southPanel.setBorder(BorderFactory.createLoweredBevelBorder());
	westPanel.setBorder(BorderFactory.createRaisedBevelBorder());
	eastPanel.setBorder(BorderFactory.createRaisedBevelBorder());
	//northPanel.setBorder(Border.create)
	//centerPanel.setBorder();

	setBounds(200,200,450,300);
	setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==rb1)
	{
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	else if(ae.getSource()==rb2)
	{
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	else if(ae.getSource()==rb3)
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
	}

	if(ae.getSource()==btn)
	{
		System.exit(0);
	}
}

public void itemStateChanged(ItemEvent ie)
{
	Object selection=cb.getSelectedItem();
	try
	{
		if(selection.equals("java"))
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		}
			else if(selection.equals("Operating System"))
			{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				SwingUtilities.updateComponentTreeUI(this);
			}
			else if(selection.equals("Motif"))
			{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				SwingUtilities.updateComponentTreeUI(this);

			}
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
}

public static void main(String arg[])
{
	PanelTest pt=new PanelTest();
}
}