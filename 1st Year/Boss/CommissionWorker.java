public class CommissionWorker extends Employee
{
  private double salary;
  private double commission;
  private int quantity;

  public void setSalary(double s)
  {
     if(s>=0)
       salary=s;
     else
       salary=0;
   }
  public void setCommission(double c)
  {
	  if(c>=0)
	     commission=c;
	  else
	     commission=0;
    }

   public void setQuantity(int n)
   {
	   if(n>=0)
	      quantity=n;
	   else
	      quantity=0;
    }

   public double earnings()
   {
	   return salary+(quantity*commission);
    }

    public String toString()
    {
		String output;
		output=" Commission WorkerL: "+super.toString()+"  earns: "+earnings();
		return output;
	  }

	 public CommissionWorker(String first,String last,double sal,double c,int q)
	 {
		 super(first,last);
		 setSalary(sal);
		 setCommission(c);
		 setQuantity(q);
	     }

	  public static void main(String args[])
	  {
		  CommissionWorker cw=new CommissionWorker("Niloy","Tonoy",8000,0.2,300);
		  System.out.println(cw);
	    }
  }