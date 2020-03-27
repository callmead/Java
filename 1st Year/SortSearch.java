import javax.swing.JOptionPane;
public class SortSearch
{
	public static void main(String args[])
	{
		int a[]= new int[50];
		String str1=new String(" ");
		int num;
		String choice1=new String(" ");
		int ch;
		String choice2=new String(" ");
		int ch1;
		int temp;
		int i;
		int j;
		String str2=new String(" ");
		int ch2;
		int max;
		int min;
		boolean flag=false;
		for (i=0;i<50;i++)
		{
			a[i]=1+(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		do
		{
			str1=JOptionPane.showInputDialog("Please Make a Choice........\n1) Sorting..?\n2)Surching..?\n3)Maxmum or Minimum...?\n4)Exit.");
			num=Integer.parseInt(str1);
			if(num==1)
			{
				choice1=JOptionPane.showInputDialog("Please Enter a Choice.....\n1)Ascending...  ?\n2)Descending.... ?\n3)Back to the main...?\n4)Exit...");
				ch= Integer.parseInt(choice1);
				if(ch==1)
				{
					for(i=0;i<49;i++)
					{
						for(j=(i+1);j<50;j++)
						{
							if(a[i]>a[j])
							{
								temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}
						}
					}
					System.out.println(" ");
					System.out.println("-------------------------------------------- ");
					System.out.println("The numbers are sorting into Ascending form:- ");
					for(i=0;i<50;i++)
					System.out.print(a[i]+" ");
				}


				if(ch==2)
				{
					for(i=0;i<49;i++)
					{
						for(j=(i+1);j<50;j++)
						{
							if(a[i]<a[j])
							{
								temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}
						}
					}
					System.out.println(" ");
					System.out.println("------------------------------------------------- ");
					System.out.println("The numbers are sorting into Descending form:- ");
					for(i=0;i<50;i++)
					System.out.print(a[i]+" ");
				}
				if(ch==4)
				{
					JOptionPane.showMessageDialog(null," Thank you for use . \nAllah Hafiz......... ");
					break;

				}
			}
			if(num==2)
			{
				choice2=JOptionPane.showInputDialog("Please enter a number to search.");
				ch1=Integer.parseInt(choice2);
				for(i=0;i<50;i++)
				{
					if(a[i]==ch1)
					{
						flag=true;
					}
				}
					if (flag==true)
					{
						JOptionPane.showMessageDialog(null,"The number is found");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"The number is not found");
					}


			}
			if(num==3)
			{
				str2=JOptionPane.showInputDialog(" What You Want to Find...\n1)Maximum Number....?\n2)Minimum number....?\n3)Exit.");
				ch2=Integer.parseInt(str2);
				if(ch2==1)
				{
					max=a[0];
					for(i=1;i<50;i++)
						{
							if(max<a[i])
							{
								max=a[i];
							}
						}
						JOptionPane.showMessageDialog(null,"The Maximum number :- \n"+max);
				}
				if(ch2==2)
				{
					min=a[0];
					for(i=1;i<50;i++)
					{
						if(min>a[i])
							{
								min=a[i];
							}
					}

					JOptionPane.showMessageDialog(null,"The Minimum number :-\n"+min);
				}
				if(ch2==3)
				{
					JOptionPane.showMessageDialog(null," Thank you for use . \nAllah Hafiz......... ");
					break;

				}
			}
			if(num>4||num<1)
			{
				JOptionPane.showMessageDialog(null,"Are you  Select Wrong Number........!");
			}
			if (num==4)
			{
				JOptionPane.showMessageDialog(null," Thank you for use . \nAllah Hafiz......... ");

			}




		}while(num!=4);



		System.exit(0);
	}
}