class B extends A
{//Class B Starts

	protected void func2()
	{//func2 Starts
		System.out.println("function 2");
	}//end of func2

	public static void main (String a[])

	{//Main Function Starts

		B b1 = new B();	// Creating an Object in class B
		b1.func1();		// Calling Functions

		b1.func2(); //calling func2 we dont need to declear new Object for this we can use the same Object

	}//Main Function Ends

}//Class B End
