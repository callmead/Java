
public class HourlyWorker extends Employee
{
  private double Hourly;

  private int Salary;

  public void setHourly(double p)
  {
	if(p>=0)
	Hourly=p;
	else
	Hourly=0;
  }

  public void setSalary(int n)
  {
	if(n>=0)
	Salary=n;
	else
	Salary=0;
  }
  public double earnings()
  {
	return (Salary*Hourly);
  }
  public String toString()
  {
	String output;
	output="HourlyWorker:"+ super.toString()+  " earns:" +  earnings();//toString:method main output return
	return output;
  }
  public HourlyWorker(String first,String last,int p,int n)
  {
	super(first,last);//super class constructor.method call
	setHourly(p);

	setSalary(n);
  }
  public static void main(String args[])
  {
	HourlyWorker cw=new HourlyWorker("Aa Khama","Ferdous:",  10, 300);
	System.out.println(cw);
  }
}


//extends-key inrerit.

//class=1.Abstract=no object.
    // 2.concrete=object & sub.

    //final=class,variable,method