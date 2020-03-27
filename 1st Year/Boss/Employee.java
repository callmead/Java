
  public abstract class Employee
  {
    private String firstName;
    private String lastName;

    Employee(String first,String last)
    {
      firstName=first;
      lastName=last;
     }

   public String toString()
   {
     String output=firstName+" "+lastName;
      return output;
    }

    public abstract double earnings();
   /* public static void main(String args[])
    {
      Employee emp1=new Employee("S.A","ZABER");
      System.out.println(emp1.toString());

   }*/
}