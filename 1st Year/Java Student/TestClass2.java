import javax.swing.*;
public class TestClass2
{
	public static void main(String args[])
	{
		int a;
		//A test1=new A();
		A test2=new A(3);
		//A test3=new A("Test");
		test2.a=5;
		a=test2.getData();
		System.out.println("Ur Data is "+a);
	}

}
class A
{
	int a;
	int b;
	A()
	{
		System.out.println("Class A has been created ");
	}
	A(String s)
	{
		System.out.println("Ur value is "+s);
	}
	A(int n)
	{
		a=n;
		System.out.println("Class A has been created and initialized");
	}
	int getData()
	{
		return a;
	}
}
