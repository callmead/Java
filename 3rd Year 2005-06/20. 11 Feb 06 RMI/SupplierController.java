import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SupplierController extends Remote
{


	public Supplier moveNext()  throws RemoteException;

    public void Refresh() throws RemoteException;
	public boolean insetData(Supplier supp) throws RemoteException;
	public boolean updateData(Supplier supp) throws RemoteException;


}//End of SupplierController Class