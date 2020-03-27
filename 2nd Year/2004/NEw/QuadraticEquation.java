import javax.swing.*;
import java.text.*;
public class QuadraticEquation
{
	private int a;
	private int b;
	private int c;
	private double root1;
	private double root2;
	private double root3;
	QuadraticEquation()

	{
		a=3;
		b=6;
		c=2;
	}

QuadraticEquation(int p,int q,int r)

{
	if(q*q-4*p*r>=0)

	{
		a=p;
		b=q;
		c=r;

	}
	else

	{
	throw new IllegalArgumentException("Invalid parameter");
	}

}

public double calculateRoot1()

{
	root1=(-b+Math.sqrt(b*b-4*a*c)/(2*a));
	return root1;

}

public double calculateRoot2()

{
	root2=(-b-Math.sqrt(b*b-4*a*c)/(2*a));
	return root2;

}
public String toString()

{
	String output;
	DecimalFormat twoDigits = new DecimalFormat("0.00");
output = "Equation :" + a + "x^2+"+b+"x+"+c;

output+= "\nroot1:"+twoDigits.format(calculateRoot1());

output+= "\nroot2:"+twoDigits.format(calculateRoot2());
return output;
}

public static void main(String args[])

{
	QuadraticEquation qe=new QuadraticEquation();

	JOptionPane.showMessageDialog(null,qe);
	System.exit(0);

}

}



























