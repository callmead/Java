import javax.swing.*;
public class EmployeeTest
{
  public static void main(String args[])
  {
	  String output;
	  Boss boss=new Boss("Arif","Hasan",50000);
	  output=boss.toString();
	  CommissionWorker commissionWorker=new CommissionWorker("Kabir","Ahmed",8000,0.20,300);
	  output+="\n"+commissionWorker.toString();

	  PieceWorker pieceWorker=new PieceWorker("Razo","Ahmed",500,5);
	  output+="\n"+pieceWorker.toString();

	  HourlyWorker hourlyWorker=new HourlyWorker("Zahan","Ahmed",40,80);
	  output+="\n"+hourlyWorker.toString();

	  JOptionPane.showMessageDialog(null,output);





    }
}
