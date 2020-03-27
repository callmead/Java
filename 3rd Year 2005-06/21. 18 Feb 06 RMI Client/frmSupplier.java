
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;
import java.sql.*; //For ResultSet
import java.text.*; //For SimpleDateFormat

//---------- RMI ----------
import java.rmi.*;

import tools.diit.*;

public class frmSupplier extends JFrame
{

  JPanel pnlMain = new JPanel();
  JPanel pnlButton = new JPanel();

  JLabel lblID = new JLabel();
  JLabel lblName = new JLabel();
  JLabel lblAddress = new JLabel();
  JLabel lblPhone = new JLabel();
  JLabel lblCel = new JLabel();
  JLabel lblEMail = new JLabel();
  JLabel lblEDate = new JLabel();

  JTextField txtID = new JTextField();
  JTextField txtName = new JTextField();
  JTextField txtAddress = new JTextField();
  JTextField txtPhone = new JTextField();
  JTextField txtCel = new JTextField();
  JTextField txtEMail = new JTextField();
  JTextField txtEDate = new JTextField();

  JButton btnFirst = new JButton();
  JButton btnPrev = new JButton();
  JButton btnNext= new JButton();
  JButton btnLast = new JButton();

  JButton btnAdd  = new JButton();
  JButton btnSave = new JButton();
  JButton btnEdit = new JButton();
  JButton btnCancel = new JButton();
  JButton btnDel  = new JButton();
  JButton btnRefresh = new JButton();
  JButton btnFind= new JButton();

  JDate pnlDate = new JDate();


   //--------- (RMI) Declare Server Object --------------
   SupplierController suppcon;
   Supplier supp = new Supplier();
   //----------------------------------------------

   boolean isAdd=false;

    public frmSupplier() {
        try {
          jbInit();
        }
        catch(Exception e) {
          e.printStackTrace();
        }
      }

   public static void main(String[] args) {
        frmSupplier frmSupplier = new frmSupplier();
        frmSupplier.setVisible(true);
   }

   private void jbInit() throws Exception {

       //-------------------------------------
       try{
       //suppcon = (SupplierController)Naming.lookup("rmi://ServerAddress:1099/SupplierController");
       suppcon = (SupplierController)Naming.lookup("rmi://dpc91/SupplierController");
       //suppcon = (SupplierController)Naming.lookup("rmi://192.168.1.38/SupplierController");
       }catch(Exception ec){}

       //--------- Properties of Frame-------
       this.setTitle("Supplier");
       this.setBounds(200,10,400,400);
       this.getContentPane().setLayout(null);
       this.getContentPane().setBackground(new Color(128,128,128));
       this.getContentPane().add(pnlMain);
       this.getContentPane().add(pnlButton);

	   //this.setFrameIcon(null);
       //this.setClosable(true);

       pnlMain.setBounds(20,30,350,240);
       pnlMain.setBorder(BorderFactory.createTitledBorder(" Supplier Information "));
       pnlMain.setLayout(null);

       pnlButton.setBounds(20,290,350,65);
       pnlButton.setLayout(null);

        //-------- Adding Components to Panel------
        pnlMain.add(lblID);
		pnlMain.add(lblName);
		pnlMain.add(lblAddress);
		pnlMain.add(lblPhone);
		pnlMain.add(lblCel);
		pnlMain.add(lblEMail);
		pnlMain.add(lblEDate);

		pnlMain.add(txtID);
		pnlMain.add(txtName);
		pnlMain.add(txtAddress);
		pnlMain.add(txtPhone);
		pnlMain.add(txtCel);
		pnlMain.add(txtEMail);
		pnlMain.add(txtEDate);
		pnlMain.add(pnlDate);

		pnlButton.add(btnFirst);
		pnlButton.add(btnPrev);
		pnlButton.add(btnNext);
		pnlButton.add(btnLast);
		pnlButton.add(btnAdd);
		pnlButton.add(btnEdit);
		pnlButton.add(btnSave);
		pnlButton.add(btnCancel);
		pnlButton.add(btnDel);
		pnlButton.add(btnFind);
		pnlButton.add(btnRefresh);

        //-------- Properties of Labels -------------
        lblID.setText("ID Number ");
        lblID.setBounds(10,20,100,25);
        lblID.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblID.setForeground(Color.white);
        lblID.setBackground(Color.black);
        lblID.setOpaque(true); //Default False : Transparent
        lblID.setHorizontalAlignment(SwingConstants.RIGHT);

        lblName.setText("Name ");
        lblName.setBounds(10,50,100,25);
        lblName.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblName.setForeground(Color.white);
        lblName.setBackground(Color.black);
        lblName.setOpaque(true); //Default False : Transparent
        lblName.setHorizontalAlignment(SwingConstants.RIGHT);

        lblAddress.setText("Address ");
        lblAddress.setBounds(10,80,100,25);
        lblAddress.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblAddress.setForeground(Color.white);
        lblAddress.setBackground(Color.black);
        lblAddress.setOpaque(true); //Default False : Transparent
        lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);

        lblPhone.setText("Phone No. ");
        lblPhone.setBounds(10,110,100,25);
        lblPhone.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblPhone.setForeground(Color.white);
        lblPhone.setBackground(Color.black);
        lblPhone.setOpaque(true); //Default False : Transparent
        lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);

        lblCel.setText("Mobile No. ");
        lblCel.setBounds(10,140,100,25);
        lblCel.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblCel.setForeground(Color.white);
        lblCel.setBackground(Color.black);
        lblCel.setOpaque(true); //Default False : Transparent
        lblCel.setHorizontalAlignment(SwingConstants.RIGHT);

        lblEMail.setText("E-Mail Address ");
        lblEMail.setBounds(10,170,100,25);
        lblEMail.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblEMail.setForeground(Color.white);
        lblEMail.setBackground(Color.black);
        lblEMail.setOpaque(true); //Default False : Transparent
        lblEMail.setHorizontalAlignment(SwingConstants.RIGHT);

        lblEDate.setText("Enroll Date ");
        lblEDate.setBounds(10,200,100,25);
        lblEDate.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lblEDate.setForeground(Color.white);
        lblEDate.setBackground(Color.black);
        lblEDate.setOpaque(true); //Default False : Transparent
        lblEDate.setHorizontalAlignment(SwingConstants.RIGHT);

        //-------- Properties of Labels -------------
        txtID.setBounds(120,20,100,25);
        txtID.setDisabledTextColor(Color.black);

        txtName.setBounds(120,50,130,25);
        txtName.setDisabledTextColor(Color.black);

        txtAddress.setBounds(120,80,150,25);
        txtAddress.setDisabledTextColor(Color.black);

        txtPhone.setBounds(120,110,100,25);
        txtPhone.setDisabledTextColor(Color.black);

        txtCel.setBounds(120,140,130,25);
        txtCel.setDisabledTextColor(Color.black);

        txtEMail.setBounds(120,170,130,25);
        txtEMail.setDisabledTextColor(Color.black);

        txtEDate.setBounds(120,200,130,25);
        txtEDate.setDisabledTextColor(Color.black);

        //--------------- Date --------------------
        pnlDate.setLocation(120,200);

        //------------ Properties of Buttons ------
        btnAdd.setBounds(5,35,80,25);
        btnAdd.setText("Add");
        btnAdd.setMnemonic('A');
        btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //-------- Button States --------
                setButtons(false);
                //------- Set Field State --------
                setFields(true);

                //--------- Clear Fields -------------
                clearFields();
                //-------- Set Flags ---------------
                isAdd=true;

            }
        });

        btnEdit.setBounds(90,35,80,25);
        btnEdit.setText("Edit");
        btnEdit.setMnemonic('E');
        btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
        btnEdit.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
                //-------- Button States --------
                setButtons(false);
                //------- Set Field State --------
                setFields(true);

				String d = txtEDate.getText().substring(0,2);
                String m = txtEDate.getText().substring(3,6);
                String y = txtEDate.getText().substring(8,12);



             }
        });

        btnSave.setBounds(5,35,80,25);
        btnSave.setText("Save");
        btnSave.setMnemonic('S');
        btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSave.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					saveData();
				}
		});

        btnCancel.setBounds(90,35,80,25);
        btnCancel.setText("Cancel");
        btnCancel.setMnemonic('C');
        btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCancel.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
			{
					//-------- Button States --------
					setButtons(true);
					//------- Set Field State --------
					setFields(false);
					//--------- Refresh Database Record ------------
					try{
						 suppcon.Refresh();
					}catch(RemoteException re){}

					//-------- Set Flags ---------------
					isAdd=false;


			}
		});

        btnDel.setBounds(175,35,80,25);
        btnDel.setText("Delete");
        btnDel.setMnemonic('D');
        btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
        btnDel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{

				}
		});

        btnFind.setBounds(260,35,80,25);
        btnFind.setText("Find");
        btnFind.setMnemonic('F');
        btnFind.setBorder(BorderFactory.createRaisedBevelBorder());
        btnFind.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{

				}
		});

        btnRefresh.setBounds(260,35,80,25);
        btnRefresh.setText("Refresh");
        btnRefresh.setMnemonic('R');
        btnRefresh.setBorder(BorderFactory.createRaisedBevelBorder());
        btnRefresh.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
						//--------- Button State ---------
						setButtonsRefresh(true);
				}
		});


        //------- Set Field State --------
        setFields(false);
        setButtons(true);

        //--------- Refresh Database Record ------------
        try{
		     suppcon.Refresh();
        }catch(RemoteException re){ System.out.println("Open Error");}

        //-------- Display Data RMI------------------------
		try{
				supp=suppcon.moveNext();
				display();
	    }catch(RemoteException re){ System.out.println("Show Error" + re);}

	    System.out.println("Client Ready");

      }//End of Constructor


	//------------------ UserDefined Method -------------
    public void setButtons(boolean bVal)
    {

                btnFirst.setEnabled(bVal);
                btnPrev.setEnabled(bVal);
                btnNext.setEnabled(bVal);
                btnLast.setEnabled(bVal);
                btnAdd.setVisible(bVal);
                btnEdit.setVisible(bVal);
                btnSave.setVisible(!bVal);
                btnCancel.setVisible(!bVal);
                btnDel.setEnabled(bVal);
                btnFind.setEnabled(bVal);
                //btnRefresh.setEnabled(false);
	}

	public void setButtonsRefresh(boolean bVal)
	{

                btnFirst.setEnabled(bVal);
                btnPrev.setEnabled(bVal);
                btnNext.setEnabled(bVal);
                btnLast.setEnabled(bVal);
                btnAdd.setEnabled(bVal);
                btnEdit.setEnabled(bVal);
                //btnSave.setVisible(!bVal);
                //btnCancel.setVisible(!bVal);
                btnDel.setEnabled(bVal);
                btnFind.setVisible(bVal);
                btnRefresh.setVisible(!bVal);
	}

	public void setFields(boolean tVal)
	{

        txtID.setEnabled(tVal);
        txtName.setEnabled(tVal);
        txtAddress.setEnabled(tVal);
        txtPhone.setEnabled(tVal);
        txtCel.setEnabled(tVal);
        txtEMail.setEnabled(tVal);

        txtEDate.setEnabled(false);
        txtEDate.setVisible(!tVal);

        pnlDate.setVisible(tVal);

	}

	public void clearFields()
	{

        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtCel.setText("");
        txtEMail.setText("");

	}

	public boolean save()
	{

       boolean savesucc=false;

 	   //---------------------- Generate Date ------------------------
 	    String bd = pnlDate.getDate();
 	    txtEDate.setText(bd);

        //---------- Initialize Supplier Object ----------------
        supp.setIDNumber(txtID.getText());
		supp.setSName(txtName.getText());
		supp.setAddress(txtAddress.getText());
		supp.setPhoneNo(txtPhone.getText());
		supp.setMobileNo(txtCel.getText());
		supp.setEmail(txtEMail.getText());
		supp.setEnrolldate(txtEDate.getText());

    	try{
			 savesucc = suppcon.insetData(supp);
        }catch(RemoteException re){
                System.out.println("Call Data Save Error :"+re);
                return savesucc;
          }

        return savesucc;
	}//End of Save Method

	public boolean update()
	{

       boolean updatesucc=false;

 	   //---------------------- Generate Date ------------------------
 	    String bd = pnlDate.getDate();
 	    txtEDate.setText(bd);

        //---------- Initialize Supplier Object ----------------
        supp.setIDNumber(txtID.getText());
		supp.setSName(txtName.getText());
		supp.setAddress(txtAddress.getText());
		supp.setPhoneNo(txtPhone.getText());
		supp.setMobileNo(txtCel.getText());
		supp.setEmail(txtEMail.getText());
		supp.setEnrolldate(txtEDate.getText());

    	try{
			 updatesucc = suppcon.updateData(supp);
        }catch(RemoteException re){
                System.out.println("Call Data UpDate Error :"+re);
                return updatesucc;
          }

        return updatesucc;

	}//End of UpdateData

    public void saveData()
    {
					if (isAdd==true)
                    {
						if (save()==false)
						{
							JOptionPane.showMessageDialog(null,
						        "Sorry, Unable to Insert New Record !!!\n"+
						        "Please try with valid Data ...");

						}
						else
						{
							//-------- Button States -------------
							setButtons(true);
							//-------- Field State-------
							setFields(false);
						}
					}
					else
					{
						if (update()==false)
						{
							JOptionPane.showMessageDialog(null,
								"Sorry, Unable to Update Record !!!\n"+
								"Please try with valid Data ...");

						}
						else
						{
							//-------- Button States -------------
							setButtons(true);
							//-------- Field State-------
							setFields(false);
						}
					}

					//------- Refresh Purchase -----
					try{
						 suppcon.Refresh();
					}catch(RemoteException re){}

			        //------- Set Flag--------
					isAdd=false;
  }//End of saveData Method


	//------------------- Database Type Method ---------------
	public void display()
	{

               txtID.setText(supp.getIDNumber());
               txtName.setText(supp.getSName());
               txtAddress.setText(supp.getAddress());
               txtPhone.setText(supp.getPhoneNo());
               txtCel.setText(supp.getMobileNo());
 	           txtEMail.setText(supp.getEmail());
 	           //txtEDate.setText(String.valueOf(rsSupp.getDate(7)));
 	           txtEDate.setText(supp.getEnrolldate());

	}//End of display Method


}//End of Class
