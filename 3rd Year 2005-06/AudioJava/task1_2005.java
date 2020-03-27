import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;//Import for borderfactory

import java.util.*;
import java.applet.*;//Import for playSound
import java.net.*;//Import for playSound

import java.sql.*;//Import for executing SQL
import java.text.*;//Import for DBUtil

public class task1 extends JFrame
{
	//------Global Declarations--------

	JPanel pnlMain     =new JPanel();
	JPanel pnlTxt      =new JPanel();
	JPanel pnlInfo     =new JPanel();
	JPanel pnlList     =new JPanel();
	JPanel pnlBtn      =new JPanel();

	JLabel lblMain     =new JLabel();
	JLabel lblTxt      =new JLabel();
	JLabel lblList     =new JLabel();
	JLabel lblImage    =new JLabel();
	JLabel lblInfo     =new JLabel();

	JTextField txtWord =new JTextField();
	JTextArea taList =new JTextArea();
	JScrollPane pane = new JScrollPane(taList);


	JButton btnResponse=new JButton();
	JButton btnNext    =new JButton();
	JButton btnExit    =new JButton();

	int a;
	Vector vctData = new Vector();

	//--------------- Database Objects ------------
	DBUtil db = new DBUtil();
  	ResultSet rsSupp;

	public task1()
	{
		try
		{
			frm();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//End of --------------------------

	private void frm() throws Exception  //Start of constractor
	{

		//-----------------Properties of Frame------------------------
		this.setTitle("Imran Ahsan 20'th Batch Roll-14 [Task_1]");
		this.setSize(570,545);
		this.setResizable(false);
		this.setLocation(200,100);
		this.getContentPane().add(pnlMain,BorderLayout.CENTER);
		this.show();

		//-----------------Properties of Panel------------------------
		pnlMain.setLayout(null);
		pnlMain.setBackground(new Color(120,23,140));

		pnlTxt.setLayout(null);
		pnlTxt.setBackground(new Color(155,155,155));
		pnlTxt.setBorder(BorderFactory.createEtchedBorder());
		pnlTxt.setBounds(new Rectangle(25,100, 290, 35));

		pnlInfo.setLayout(null);
		pnlInfo.setBackground(new Color(155,155,155));
		pnlInfo.setBorder(BorderFactory.createEtchedBorder());
		pnlInfo.setBounds(new Rectangle(25,345,290,80));

		pnlList.setLayout(null);
		pnlList.setBackground(new Color(155,155,155));
		pnlList.setBorder(BorderFactory.createEtchedBorder());
		pnlList.setBounds(new Rectangle(330,100,210,325));

		pnlBtn.setLayout(null);
		pnlBtn.setBorder(BorderFactory.createEtchedBorder());
		pnlBtn.setBounds(new Rectangle(170, 460, 236, 34));

		//----------------Adding Components to ContentPane-------------
		pnlMain.add(lblMain,null);
		pnlMain.add(lblList,null);
		pnlMain.add(lblImage,null);

		pnlMain.add(pnlTxt,null);
		pnlMain.add(pnlInfo,null);
		pnlMain.add(pnlList,null);
		pnlMain.add(pnlBtn,null);

		pnlList.add(pane,null);

		pnlTxt.add(lblTxt,null);
		pnlTxt.add(txtWord,null);
		pnlTxt.add(lblTxt,null);

		pnlInfo.add(lblInfo,null);

		pnlBtn.add(btnResponse,null);
		pnlBtn.add(btnNext,null);
		pnlBtn.add(btnExit,null);

		//-----------------Properties of Label------------------------
		lblMain.setText("Word with Children");
		lblMain.setFont(new java.awt.Font("Dialog", 1, 16));
		lblMain.setBackground(new Color(0,0,144));
		lblMain.setForeground(new Color(0,144,0));
		lblMain.setBorder(BorderFactory.createRaisedBevelBorder());
		lblMain.setOpaque(true);
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setBounds(190,30,200,30);

		lblTxt.setText("Type Word :");
		lblTxt.setForeground(new Color(144,0,0));
		lblTxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxt.setBounds(3,2,75,30);

		lblImage.setOpaque(true);
		lblImage.setBackground(new Color(155,155,155));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.cyan,Color.yellow));
		lblImage.setBounds(70,150,200,180);

		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(1,3,290,73);

		lblList.setText("Stock of Word");
		lblList.setForeground(new Color(144,0,0));
		lblList.setBounds(335,95,90,30);

		//-----------------Properties of TextField------------------------
		txtWord.setBounds(new Rectangle(83, 5, 200, 26));
		txtWord.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						searchData(txtWord.getText().trim());
					}
		});

		taList.setEditable(false);

		pane.setBounds(new Rectangle(5,20,200,300));

		//-----------------Properties of Button------------------------

				//-------Properties of Response Button------------
		btnResponse.setBorder(BorderFactory.createRaisedBevelBorder());
		btnResponse.setMnemonic('R');
		btnResponse.setText("Response");
		btnResponse.setToolTipText("Action Response");
		btnResponse.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnResponse.setBackground(new Color(0,0,128));
		btnResponse.setForeground(new Color(255,255,255));
		btnResponse.setBounds(new Rectangle(3, 4, 76, 26));
		btnResponse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				a=0;
				searchData(txtWord.getText().trim());
			}
		});

				//-------Properties of Next Button------------
		btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNext.setMnemonic('N');
		btnNext.setText("Next");
		btnNext.setToolTipText("Next Word");
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setBackground(new Color(0,0,128));
		btnNext.setForeground(new Color(255,255,255));
		btnNext.setBounds(new Rectangle(80, 4, 76, 26));
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
				{
					String s1 = txtWord.getText();
					txtWord.setText(Next(s1));
					a=1;
					searchData(txtWord.getText().trim());
				}
		});

				//-------Properties of Exit Button------------
		btnExit.setBorder(BorderFactory.createRaisedBevelBorder());
		btnExit.setMnemonic('x');
		btnExit.setText("Exit");
		btnExit.setToolTipText("Exit From Application");
		btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnExit.setBackground(new Color(0,0,128));
		btnExit.setForeground(new Color(255,255,255));
		btnExit.setBounds(new Rectangle(157, 4, 76, 26));
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit ? ","Confirmation",0,3);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});

	setDataToTextArea();

	}//End of constractor


	public static void main(String args[]) //start of main method
	{

		task1 t1=new task1();

	}//End of main method

	//-------------------user defined method--------------------------------

	public void setDataToTextArea()
    {
		try
		{
			ResultSet rst = db.stmt.executeQuery("SELECT Name FROM Stock");
			while(rst.next())
			{
				taList.append(rst.getString("Name"));
				vctData.addElement(rst.getString("Name"));
				taList.append("\n");

			}//end of while
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(task1.this, "ERROR setData "+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
		}

    }//-------end of setDataToTextArea method-------------

	public void searchData(String str)
 	{
		String strSQL =  "Select * from Stock Where Name='"+ str + "'";
		//System.out.println(strSQL);
		try
		{
			rsSupp = db.stmt.executeQuery(strSQL);
			if (rsSupp.next())
			{
				ImageIcon imgImage   = new ImageIcon("./Images/Image/"+str+".gif");
				ImageIcon imgInfo= new ImageIcon("./Images/ImageName/"+str+".gif");
				lblImage.setIcon(imgImage);
				lblInfo.setIcon(imgInfo);
				pnlInfo.setBackground(new Color(120,23,140));
				pnlInfo.setBorder(BorderFactory.createLineBorder(new Color(120,23,140)));
				playSound("./Audio/"+str+".wav");
				if(a != 1)
				{
				JOptionPane.showMessageDialog(null,"Well done !! Spelling is correct.","Result",0);
			    }
			}
			else
			{
				JOptionPane.showMessageDialog(null,
									"Sorry, Spelling is not correct. Please try again ...","Result",0);
			}
		}catch(SQLException sqle)
			{System.out.println("Search Error : "+sqle);}
	}//End of searchData Method

	public void playSound(String fileName)
	   {

		   try
		         {
		             URL url = new URL ("file:" + fileName);
		             AudioClip ac = Applet.newAudioClip (url);
		             ac.stop();
		             ac.play();
		   		     //ac.loop();
	      }catch (Exception e) { System.out.println (e); }
   }//End of playSound method

   public String Next(String str)
      {

   	   String ret="";
   		int pos = vctData.indexOf(str);
   		ret=(String)vctData.elementAt(pos+1);
   		return ret;

   }//End of Next method

}//End of class




