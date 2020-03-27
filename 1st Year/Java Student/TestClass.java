import javax.swing.*;
public class TestClass
{
	public static void main(String args[])
	{
		A test=new A();
	}

}
class A
{
	int a;
	int b;
	A()
	{
		System.out.println("Class A has been created");
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
