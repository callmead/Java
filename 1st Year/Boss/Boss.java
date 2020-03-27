public class Boss extends Employee
{
public Boss(String first,String last,double salary)// constructor
 {
	 super(first,last);
	 setWeeklySalary(salary);
   }

 private double weeklySalary;

  public void setWeeklySalary(double salary)
  {
	  if(salary>=0)
	      weeklySalary=salary;
	     else
	      weeklySalary=0;
	}
	 public String toString()
	 {
		String output="Boss"+super.toString()+"earns"+earnings();
		   return output;

	     }


public double earnings()
{
	return weeklySalary;

   }

public static void main(String args[])
{
	Boss boss=new Boss("Raihan","Rahman",50000);

	System.out.println(boss);
   }
}