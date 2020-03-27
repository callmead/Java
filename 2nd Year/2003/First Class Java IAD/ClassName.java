public class ClassName
{//Class
	public ClassName()
	{//Constructor
		//Initialize all variables, componontsm controls just like FormLoad
		System.out.println("Print from Contructor");
	}//End Constructor

	public static void main (String a[])
	{//Main Method
		ClassName obj = new ClassName();//Calling ClassName to work
		System.out.println("Print from Main Method");
	}//End Main
}//End Class