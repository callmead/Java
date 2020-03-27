public class PieceWorker extends Employee
{

	private double rate;
	private int piece;

	public PieceWorker(String first, String last, double r, int p)
	{
		super(first, last);
		setRate(r);
		setPiece(p);
	}


	public void setRate(double r)
	{
			if(r>=0)
			rate=r;
			else
			rate=0;
	}

	public void setPiece(int p)
	{
			if(p>=0)
			piece=p;
			else
			piece=0;
	}
	public double earnings()
	{
		return (piece*rate);
	}
	public String toString()
	{
		String output;
		output=" Piece Worker  "+super.toString()+" earns "+earnings();
		return output;
	}

	public static void main(String args[])
	{
		PieceWorker pw= new PieceWorker("Raju ","Khan",0.02,300);
		System.out.println(pw);
	}
}



