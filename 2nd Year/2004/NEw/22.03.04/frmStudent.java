
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.text.*;


public class frmStudent extends JInternalFrame {
  JLabel lblHead = new JLabel();
  JPanel pnlMain = new JPanel();
  JLabel jLabel1 = new JLabel();
  Border border1;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JTextField txtID = new JTextField();
  JTextField txtName = new JTextField();
  JTextField txtAddress = new JTextField();
  JTextField txtPhone = new JTextField();
  JTextField txtDOB = new JTextField();
  JTextField txtDues = new JTextField();
  JPanel pnlButton = new JPanel();
  JButton btnFirst = new JButton();
  JButton btnPrev = new JButton();
  JButton btnNext = new JButton();
  JButton btnLast = new JButton();
  JButton btnSave = new JButton();
  JButton btnCancel = new JButton();
  JButton btnAdd = new JButton();
  JButton btnEdit = new JButton();
  JButton btnDel = new JButton();
  JButton btnClose = new JButton();
  JButton jButton1 = new JButton();

  boolean isAdd = false;
//===========declair object for database============

  DBUtil db=new DBUtil();
  ResultSet rs;


  public frmStudent() {
// ================ supper class================
    //super("students",true,true,false,false);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  /*
  public static void main(String[] args) {
    frmStudent frmStudent = new frmStudent();
    frmStudent.setVisible(true);
  }
  */

  private void jbInit() throws Exception {



    border1 = BorderFactory.createLineBorder(Color.white,2);
    lblHead.setBackground(Color.black);
    lblHead.setFont(new java.awt.Font("SansSerif", 1, 16));
    lblHead.setForeground(Color.white);
    lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
    lblHead.setOpaque(true);
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);
    lblHead.setText("Student Information");
    lblHead.setBounds(new Rectangle(15, 16, 350, 24));
    // ================ Properties of Internal Frame================

    this.setResizable(false);
    this.setTitle("Student");
    this.setClosable(true);
    this.setMaximizable(true);
    this.setIconifiable(true);
    this.getContentPane().setBackground(Color.white);

    this.getContentPane().setLayout(null);
    this.setLocation(new Point(200,100));
    this.setSize(new Dimension(408, 424));
    pnlMain.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlMain.setBounds(new Rectangle(15, 49, 350, 144));
    pnlMain.setLayout(null);
    jLabel1.setBackground(Color.black);
    jLabel1.setForeground(Color.white);
    jLabel1.setBorder(border1);
    jLabel1.setOpaque(true);
    jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel1.setText("ID Number  ");
    jLabel1.setBounds(new Rectangle(12, 12, 128, 18));
    jLabel2.setBounds(new Rectangle(12, 33, 128, 18));
    jLabel2.setText("Name  ");
    jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel2.setOpaque(true);
    jLabel2.setBorder(border1);
    jLabel2.setForeground(Color.white);
    jLabel2.setBackground(Color.black);
    jLabel3.setBounds(new Rectangle(12, 53, 128, 18));
    jLabel3.setText("Address  ");
    jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel3.setOpaque(true);
    jLabel3.setBorder(border1);
    jLabel3.setForeground(Color.white);
    jLabel3.setBackground(Color.black);
    jLabel4.setBounds(new Rectangle(12, 74, 128, 18));
    jLabel4.setText("Phone  ");
    jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel4.setOpaque(true);
    jLabel4.setBorder(border1);
    jLabel4.setForeground(Color.white);
    jLabel4.setBackground(Color.black);
    jLabel5.setBounds(new Rectangle(12, 94, 128, 18));
    jLabel5.setText("Date of Birth  ");
    jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel5.setOpaque(true);
    jLabel5.setBorder(border1);
    jLabel5.setForeground(Color.white);
    jLabel5.setBackground(Color.black);
    jLabel6.setBounds(new Rectangle(12, 115, 128, 18));
    jLabel6.setText("Dues  ");
    jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel6.setOpaque(true);
    jLabel6.setBorder(border1);
    jLabel6.setForeground(Color.white);
    jLabel6.setBackground(Color.black);

    txtID.setEditable(false);
    txtID.setText("");
    txtID.setBounds(new Rectangle(148, 16, 176, 16));
    txtID.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtName.setBounds(new Rectangle(148, 36, 176, 16));
    txtName.setText("");
    txtName.setEditable(false);
    txtName.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtAddress.setBounds(new Rectangle(148, 56, 176, 16));
    txtAddress.setText("");
    txtAddress.setEditable(false);
    txtAddress.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtPhone.setBounds(new Rectangle(148, 77, 176, 16));
    txtPhone.setText("");
    txtPhone.setEditable(false);
    txtPhone.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtDOB.setBounds(new Rectangle(148, 97, 176, 16));
    txtDOB.setText("");
    txtDOB.setEditable(false);
    txtDOB.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtDues.setBounds(new Rectangle(148, 116, 176, 16));
    txtDues.setText("");
    txtDues.setEditable(false);

    pnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlButton.setBounds(new Rectangle(17, 203, 350, 65));
    pnlButton.setLayout(null);

    btnFirst.setBounds(new Rectangle(19, 10, 75, 19));
    btnFirst.setBorder(BorderFactory.createRaisedBevelBorder());
    btnFirst.setMnemonic('F');
    btnFirst.setText("First");
    btnFirst.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveFirst();
      }
    });

    btnPrev.setBorder(BorderFactory.createRaisedBevelBorder());
    btnPrev.setBounds(new Rectangle(96, 10, 75, 19));
    btnPrev.setMnemonic('P');
    btnPrev.setText("Previous");
    btnPrev.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MovePrevious();
      }
    });

    btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
    btnNext.setBounds(new Rectangle(173, 10, 75, 19));
    btnNext.setMnemonic('N');
    btnNext.setText("Next");
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveNext();
      }
    });

    btnLast.setBorder(BorderFactory.createRaisedBevelBorder());
    btnLast.setBounds(new Rectangle(249, 10, 75, 19));
    btnLast.setMnemonic('L');
    btnLast.setText("Last");
    btnLast.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveLast();
      }
    });

    btnSave.setMnemonic('S');
    btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
    btnSave.setBounds(new Rectangle(19, 34, 75, 19));
    btnSave.setText("Save");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

        if (isAdd)
        {
        	boolean isSave = saveData();
        	if (isSave)
        	{
				setFields(false);
				setButtons(true);
			}
		}
		else
		{

			boolean isSave = updateData();
			if (isSave)
			{
				setFields(false);
				setButtons(true);
			}
		}

		isAdd=false;
      }
    });


    btnCancel.setMnemonic('C');
    btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnCancel.setBounds(new Rectangle(96, 33, 75, 19));
    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFields(false);
        setButtons(true);
        Refresh();
      }
    });

    btnAdd.setMnemonic('A');
    btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
    btnAdd.setBounds(new Rectangle(19, 34, 75, 19));
    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

		isAdd = true;
		setButtons(false);
        clearFields();
        setFields(true);
        txtID.requestFocus();
      }
    });

    btnEdit.setMnemonic('E');
    btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
    btnEdit.setBounds(new Rectangle(96, 34, 75, 19));
    btnEdit.setText("Edit");
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setButtons(false);
		setFields(true);
		txtID.setEditable(false);
        txtID.requestFocus();
      }
    });

    btnDel.setMnemonic('D');
    btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnDel.setBounds(new Rectangle(173, 34, 75, 19));
    btnDel.setText("Delete");
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {


			delData();
      }
    });

    btnClose.setMnemonic('O');
    btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
    btnClose.setBounds(new Rectangle(250, 33, 75, 19));
    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });

    jButton1.setToolTipText("");
    jButton1.setText("sumon");
    jButton1.setBounds(new Rectangle(52, 291, 102, 19));
    pnlMain.add(jLabel1, null);
    pnlMain.add(jLabel2, null);
    pnlMain.add(jLabel3, null);
    pnlMain.add(jLabel4, null);
    pnlMain.add(jLabel5, null);
    pnlMain.add(jLabel6, null);
    pnlMain.add(txtID, null);
    pnlMain.add(txtName, null);
    pnlMain.add(txtAddress, null);
    pnlMain.add(txtPhone, null);
    pnlMain.add(txtDOB, null);
    pnlMain.add(txtDues, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(pnlButton, null);
    pnlButton.add(btnPrev, null);
    pnlButton.add(btnFirst, null);
    pnlButton.add(btnNext, null);
    pnlButton.add(btnLast, null);
    pnlButton.add(btnAdd, null);
    pnlButton.add(btnSave, null);
    pnlButton.add(btnEdit, null);
    pnlButton.add(btnCancel, null);
    pnlButton.add(btnDel, null);
    pnlButton.add(btnClose, null);
    this.getContentPane().add(lblHead, null);
    this.getContentPane().add(pnlMain, null);

    //---------------------- Connect with Database -------------

    Refresh();
  }//=========end of constractor============

  //==========user's define function==========

  public void Refresh()
  {
	  try{
		  rs=db.stmt.executeQuery("Select * from Student");
		  rs.next();
		  Display();
	     }catch(SQLException sqle)
	     {System.out.println("Refresh Error:"+sqle);
	 }
 }//===========end of Refresh method==========

 public void Display()
 {
	 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

	 try{
		 txtID.setText(rs.getString(1));
		 txtName.setText(rs.getString(2));
		 txtAddress.setText(rs.getString(3));
		 txtPhone.setText(rs.getString(4));
		 txtDOB.setText(sdf.format(rs.getDate(5)));
		 txtDues.setText(rs.getString(6));

	     }catch(SQLException sqle)
	     {System.out.println("Display Error:"+sqle);
	 }
 }//===========end of Display method==========
  public void MoveNext()
  {

	 try{
		 if(!rs.next())rs.last();
		 Display();


	     }catch(SQLException sqle)
	     {System.out.println("Move Next Error:"+sqle);
	 }
 }//===========end of movnext method========

  public void MovePrevious()
    {

  	 try{
  		 if(!rs.previous())rs.first();
  		 Display();


  	     }catch(SQLException sqle)
  	     {System.out.println("MovePrevious Error:"+sqle);
  	 }
   }//===========end of MovePrevious method==========

public void MoveFirst()
    {

  	 try{
  		 rs.first();
  		 Display();


  	     }catch(SQLException sqle)
  	     {System.out.println("MoveFirst Error:"+sqle);
  	 }
   }//===========end of MoveFirst method==========

 public void MoveLast()
     {

   	 try{
   		 rs.last();
   		 Display();


   	     }catch(SQLException sqle)
   	     {System.out.println("MoveLast Error:"+sqle);
   	 }
   }//===========end of MoveLast method===

   //===================Methods of clearFields =======================================
  public void clearFields()
  {
	    txtID.setText("");
	    txtName.setText("");
	    txtAddress.setText("");
	    txtPhone.setText("");
	    txtDOB.setText("");
        txtDues.setText("0");
  }

  public void setFields(boolean val)
  {
	    txtID.setEditable(val);
		txtName.setEditable(val);
		txtAddress.setEditable(val);
		txtPhone.setEditable(val);
		txtDOB.setEditable(val);
        txtDues.setEditable(val);

  }
  public void setButtons(boolean val)
  {
	     btnFirst.setEnabled(val);
	     btnPrev.setEnabled(val);
		 btnNext.setEnabled(val);
		 btnLast.setEnabled(val);

		 btnAdd.setVisible(val);
		 btnEdit.setVisible(val);
		 btnSave.setVisible(!val);
		 btnCancel.setVisible(!val);

		 btnDel.setEnabled(val);
		 btnClose.setEnabled(val);


  }

  public boolean saveData()
  {

	 try{
			String s = "Insert into Student Values ("+
			           "'"+txtID.getText()+"',"+
			           "'"+txtName.getText()+"',"+
			           "'"+txtAddress.getText()+"',"+
			           "'"+txtPhone.getText()+"',"+
			           "'"+txtDOB.getText()+"',"+
			               txtDues.getText()+")";

	        System.out.println(s);

			//=====================data save into table ================


	         db.stmt.executeUpdate(s);

	         //======================= Refresh Data =================

	          Refresh();
	          return true;



	     }catch(SQLException sqle){
			 JOptionPane.showMessageDialog(null,"Sorry, Unable to save data !!!");
			 System.out.println(sqle);
			 return false;

		  }


  }// End of SaveData


   public boolean updateData()
    {

  	 try{
  			String s = "UPDATE Student SET "+
  			     	   "SID="+"'"+txtID.getText()+"',"+
  			           "Name="+"'"+txtName.getText()+"',"+
  			           "Address="+"'"+txtAddress.getText()+"',"+
  			           "Phone="+"'"+txtPhone.getText()+"',"+
  			           "DOB="+"'"+txtDOB.getText()+"',"+
  			           "Dues="+txtDues.getText()+" "+
  			           "WHERE SID="+"'"+txtID.getText()+"'";

  	        System.out.println(s);

  			//=====================data Edit into table ================


  	         db.stmt.executeUpdate(s);

  	         //======================= Refresh Data =================

  	          Refresh();
  	          return true;



  	     	}catch(SQLException sqle){
				 JOptionPane.showMessageDialog(null,"Sorry, Unable to Update data !!!");
				 System.out.println(sqle);
				 return false;

		      }
	}//End of UPDATE

   public void delData()
    {


  			String s = "Delete From Student WHERE SID="+"'"+txtID.getText()+"'";
  	        System.out.println(s);
			try {            //=========ConfirmDialog Box================
				     int opt = JOptionPane.showConfirmDialog(null,
				                 "Do you want to detele this record ?",
				                 "Delete Confirmation",0,3);


				     if(opt == JOptionPane.YES_OPTION)
				     {

  						//=====================data Delete into table ================
  	        			 db.stmt.executeUpdate(s);

  	        			 //======================= Refresh Data =================
  	        			  Refresh();
					  }//End of if statement

  	     	}catch(SQLException sqle){
				 JOptionPane.showMessageDialog(null,"Sorry, Unable to Delete data !!!");
				 System.out.println(sqle);


		      }
	}//End of Delete

}