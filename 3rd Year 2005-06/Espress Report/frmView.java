//package beximtex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import tools.diit.*;



public class frmView extends JFrame
{//Class

        JButton btnOk = new JButton();



        public frmView()
        {//Cons
			this.setBounds(0,0,400,400);
			this.getContentPane().add(btnOk);
			this.getContentPane().setLayout(null);
			btnOk.setBounds(5,5,80,25);
			btnOk.setText("Show");
			btnOk.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String SQL="SELECT HW_POGR.TransactionID, HW_POGR.OID, HW_POGR.Item, HW_POGR.QtyOrd, HW_POGR.LastDate, HW_POGR.DeliveryAt, Suppliers.SID, Suppliers.Name, Suppliers.Address, Suppliers.Email, Suppliers.Phone, Suppliers.Fax FROM Suppliers, HW_POGR WHERE (Suppliers.SID = HW_POGR.SID)";
					//QBViewer ggg = new QBViewer(SQL,"./reports/PO1.rpt","./Data/Beximco.mdb","Admin", "askmee",1);
					//QBIViewer ggg = new QBIViewer(SQL,"./reports/PO1.rpt","./Data/Beximco.mdb","Admin", "askmee",1);//SQL Server2 , 3 ORacle, 4MySQL
					QBDialog ggg = new QBDialog(SQL,"./reports/PO1.rpt","./Data/Beximco.mdb","Admin", "askmee",1);
					ggg.setVisible(true);
				}
			});

        }//Cons

        public static void main(String atgs[])
        {
			frmView fv = new frmView();
			fv.setVisible(true);
		}


}//Class