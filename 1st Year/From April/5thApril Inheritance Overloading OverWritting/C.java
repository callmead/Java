class C extends B
{//Class C Starts

	protected void func3()
	{//Func 3 starts
		System.out.println("This is a Protected Function");
	}//func 3 ends

	public static void main (String r[])
	{//main Function

		C c1 = new C();
		c1.func1(); //Function Present in Class A
		c1.func2();	//Function Present in Class B
		c1.func3();	//Function Present in Class C

	}//end Main Function

}//Class C Ends