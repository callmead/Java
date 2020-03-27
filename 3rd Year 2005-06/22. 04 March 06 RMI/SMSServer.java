import java.rmi.Naming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SMSServer extends JFrame
{
	JLabel lblDisplay = new JLabel();

	public SMSServer()
	{
		//--------- Screen Design ------------------

		this.setTitle("Ready - Server");
		this.setBounds(200,100,300,200);
		this.setResizable(false);
		this.setState(1); //0 = Normal //1 = Minimized


		this.getContentPane().add(lblDisplay,BorderLayout.CENTER);

        this.addWindowListener(new WindowAdapter(){
		public void windowActivated(WindowEvent e){}
		public void windowDeativated(WindowEvent e){}
		public void windowOpened(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowClosing(WindowEvent e){System.exit(0);}

	});


		//--------------Properties of LAbel --------------

        lblDisplay.setText("Server Ready ...");
		lblDisplay.setOpaque(true);
		lblDisplay.setForeground(Color.green);
		lblDisplay.setBackground(Color.black);
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setFont(new Font(lblDisplay.getFont().getName(),1,24));

		try{

            //-------------------- Implementation Object ---------------
			SupplierControllerImpl suppImpl = new SupplierControllerImpl();
			//CommonControllerImpl   commImpl = new CommonControllerImpl();
			//PurchaseControllerImpl purcImpl = new PurchaseControllerImpl();
			//StockControllerImpl    stokImpl = new StockControllerImpl();
			//InvoiceControllerImpl  invoImpl = new InvoiceControllerImpl();
			//InvoiceDetailsControllerImpl  invodImpl = new InvoiceDetailsControllerImpl();
			//LogonControllerImpl    logImpl  = new LogonControllerImpl();

			//---------------------- Rebind ---------------------------------
			Naming.rebind("rmi://localhost:1099/SupplierController",suppImpl);
			//Naming.rebind("rmi://localhost:1099/CommonController",commImpl);
			//Naming.rebind("rmi://localhost:1099/PurchaseController",purcImpl);
			//Naming.rebind("rmi://localhost:1099/StockController",stokImpl);
			//Naming.rebind("rmi://localhost:1099/InvoiceController",invoImpl);
			//Naming.rebind("rmi://localhost:1099/InvoiceDetailsController",invodImpl);
			//Naming.rebind("rmi://localhost:1099/LogonController",logImpl);

			System.out.println("Server Ready ...");

		}catch(Exception re){
			lblDisplay.setForeground(Color.red);
			lblDisplay.setText("Server Not Ready !!!");
			this.setTitle("Nor Ready");
			this.setState(0);
			//System.out.println("Server Not Ready !!!"+re);
			}



	}//End of Constructor



	public static void main(String args[]){

         new SMSServer().setVisible(true);;
	}//End of main Method


}//End of SupplierController Class