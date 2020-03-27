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

	/**
	 *	Default Constructor With no parameter
	 *
	 */

	public SupplierControllerImpl() throws RemoteException
	{
		Refresh();

	}//End of Constructor

	/**
	 *	Move to next record
	 *  @return Supplier Object
	 */

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

	/**
	 *	Open a Table
	 *
	 */

    public void Refresh()
    {
        try{
                rsSupp=db.stmt.executeQuery("SELECT * FROM Supply");
        }catch(SQLException sqle){
                System.out.println("data Refresh Error in Impl:"+sqle);
          }
	}

	/**
	 *	Data Insert into Supply Table
	 *  @param Supplier Class Object
	 *  @return boolean true or false value
	 */

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

	/**
	 *	Data Update into Supply Table
	 *  @param Supplier Class Object
	 *  @return boolean true or false value
	 */

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

	/**
	 *	Check Data Exist or Not
	 *  @param String Criteria
	 *  @return boolean true or false value
	 */

  public boolean isFound(String srchStr)
  {

              try
              {
              	   String srch = "SELECT * FROM Supply "+ srchStr;
				   rsSupp = db.stmt.executeQuery(srch);
				   if (!rsSupp.next()) {
					   Refresh();
					   return false;
			       }
        	  }catch(SQLException sqle){
                System.out.println("Supplier data isFind Error :"+sqle);
                return false;
			    }

         Refresh();
         return true;
	}//End of isFound Data

	/**
	 *	Data Search from Supply Table
	 *  @param String Criteria
	 *  @return Supplier Class Object
	 */

    public Supplier SearchData(String srchStr)
    {
        Supplier supp = new Supplier();

        if (srchStr.equals("")) return supp;
	    else
		{
    	//--------------- Check -----------------
        String srch = "";


              try
              {

              	   srch = "SELECT * FROM Supply "+ srchStr;
				   System.out.println(srch);

				   rsSupp = db.stmt.executeQuery(srch);

				   if (rsSupp.next()) {
						supp.setIDNumber(rsSupp.getString(1));
						supp.setSName(rsSupp.getString(2));
						supp.setAddress(rsSupp.getString(3));
						supp.setPhoneNo(rsSupp.getString(4));
						supp.setMobileNo(rsSupp.getString(5));
						supp.setEmail(rsSupp.getString(6));
						supp.setEnrolldate(rsSupp.getString(7));
			       }
				   Refresh();

        	  }catch(SQLException sqle){
                System.out.println("Supplier data Find Error :"+sqle);
                }

       }

	   return supp;
    }//End of Search Data

	/**
	 *	Data Delete from Supply Table
	 *  @param String Criteria
	 *
	 */

    public void DeleteData(String strQuery)
    {
		System.out.println(strQuery);
		try{
           db.stmt.executeUpdate(strQuery);
           Refresh();
        }catch(SQLException sqle){
             System.out.println("Supplier data Delete Error :"+sqle);}
	}//End of Delete Data

    /**
	 *  Get All Supplier Name.
	 *
	 * @param  FileName No parameters
	 */

	//------------------ Get Supplier Name ----------------------
    public Vector getSupplierName()
    {
        Vector temp = new Vector();
        ResultSet rsTemp;
        try
		{

			//---------- Execute SQL statement----------
			rsTemp=db.stmt.executeQuery("Select * from Supply");
			while(rsTemp.next())
			{
				temp.addElement(rsTemp.getString(2));

			}//End of While Loop

		}catch(SQLException sqle)
		   {System.out.println("Supplier Name get Error");}

        return temp;
   }//End of getSupplierName

}//End of SupplierController Class