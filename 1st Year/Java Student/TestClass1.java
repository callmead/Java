import javax.swing.*;
public class TestClass1
{
	public static void main(String args[])
	{
		A test1=new A();
		A test2=new A(3);
		A test3=new A("Test");
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
		System.out.println("Class A has been created and initialized");
	}
	int getData()
	{
		return a;
	}
}
