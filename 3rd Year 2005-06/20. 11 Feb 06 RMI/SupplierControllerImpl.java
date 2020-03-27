import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;

import java.sql.*;
import java.text.*;

public class SupplierControllerImpl extends UnicastRemoteObject implements SupplierController
{

	//------------- Global Objects -----------------
    //----------- Declare class Object -----------
    DBConn db = new DBConn();
    ResultSet rsSupp;

    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM, yyyy");

	public SupplierControllerImpl() throws RemoteException
	{
		Refresh();

	}//End of Constructor

	public Supplier moveNext(){

		Supplier supp = new Supplier();

        try{
	    	if (!rsSupp.next()) rsSupp.last();

			supp.setIDNumber(rsSupp.getString(1));
			supp.setSName(rsSupp.getString(2));
			supp.setAddress(rsSupp.getString(3));
			supp.setPhoneNo(rsSupp.getString(4));
			supp.setMobileNo(rsSupp.getString(5));
			supp.setEmail(rsSupp.getString(6));
			supp.setEnrolldate(sdf.format(rsSupp.getDate(7)));

        }catch(SQLException sqle)
	       {System.out.println("Server : move first error !!!");}

		return supp;

    };


    public void Refresh()
    {
        try{
                rsSupp=db.stmt.executeQuery("SELECT * FROM Supply");
        }catch(SQLException sqle){
                System.out.println("data Refresh Error in Impl:"+sqle);
          }
	}

    public boolean insetData(Supplier supp)
    {

        try{
                //-----------------------------------------------------
		    	String strQuery="Insert into Supply Values(" +
		                    "'" + supp.getIDNumber()   + "',"+
		                    "'" + supp.getSName()      + "',"+
		                    "'" + supp.getAddress()    + "',"+
		                    "'" + supp.getPhoneNo()    + "',"+
		                    "'" + supp.getMobileNo()   + "',"+
		                    "'" + supp.getEmail()      + "',"+
		                    "'" + supp.getEnrolldate() + "')";

		        System.out.println(strQuery);


		           db.stmt.executeUpdate(strQuery);
		           Refresh();
		 }catch(SQLException sqle){
		                System.out.println("data Save Error :"+sqle);
		                return false;
		          }

		return true;

    }//End of insertData Method

    public boolean updateData(Supplier supp)
    {
          try
		  {
	         //-----------------------------------------------------
			 String strQuery="Update Supply SET " +
						//"IDNumber = " + "'" + txtID.getText()        +"',"+
						"SName = "      + "'" + supp.getSName()        + "',"+
						"Address = "    + "'" + supp.getAddress()      + "',"+
						"PhoneNo = "    + "'" + supp.getPhoneNo()      + "',"+
						"MobileNo = "   + "'" + supp.getMobileNo()     + "',"+
						"Email = "      + "'" + supp.getEmail()        + "',"+
						"Enrolldate = " + "'" + supp.getEnrolldate()   + "' "+
						"Where IDNumber = " + "'" + supp.getIDNumber() +"'";


    	    System.out.println(strQuery);
			//---------- Execute SQL statement----------
			db.stmt.executeUpdate(strQuery);
			Refresh();

		  }catch(SQLException sqle){
			   System.out.println("UpDate Error"+sqle);
		       return false;
		 }

        return true;
  }//End of updateData Method


}//End of SupplierController Class