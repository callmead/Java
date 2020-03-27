import java.rmi.*;

public class SMSServer
{


	public SMSServer()
	{
		try{

			SupplierControllerImpl suppImpl = new SupplierControllerImpl();
			//Naming.rebind("rmi://localhost/SupplierController",suppImpl);




			Naming.rebind("rmi://localhost:1099/SupplierController",suppImpl);




		    System.out.println("Server Ready ...");
		}catch(Exception re){System.out.println("Server Not Ready !!!"+re);}


	}//End of Constructor



	public static void main(String args[]){

         new SMSServer();
	}//End of main Method


}//End of SupplierController Class