import javax.swing.JOptionPane;  // Master Piece for Sorting, And Searching.
public class test
{
  public static void main(String args[])
   {
 	 String choice;
	 int ch;
	 String subchoice;
	 int subch;
	 int a[];				//Array to Store 5 Values step1
	 a=new int[50]; 		//Array to Store 5 Values step2
	 int i;					//Used for Loop
	 int j;					//for another loop
	 String num;			//for Inputing a Value as String
	 int num1;				//for Converting String Value to Int
	 boolean search=false;	//Used for Search
	 int min;

//////////////// For Random Number Generating and Printing ///////////////////

		for (i=0;i<50;i++){
				a[i]=(int)(Math.random()*1000);
				System.out.print(" "+(a[i]));
		}
///////////////////////The Main Menu Part//////////////////////////////////////////////////////

		do {
 		    choice = JOptionPane.showInputDialog ("1) Sort. \n2) Search. \n3) Exit.");
	 	    ch = Integer.parseInt(choice);

		    if (ch==1){
				 choice = "Sorting...!";
				 JOptionPane.showMessageDialog(null, "You Have Chosen " + choice);

						/////////////////////Sorting Sub Menu Part/////////////////////////////////////////

 			    			subchoice = JOptionPane.showInputDialog ("1) Acending Order...? \n2) Decending Order...? \n3) Back.");
	 			    		subch = Integer.parseInt(subchoice);

								if (subch==1){
											min = a[0];
											for (i=0;i<49;i++){
												for (j=i+1;j<50;j++){
													if (a[i] > a[j]){
		                       					 		min = a[i];
														a[i]=a[j];
														a[j]=min;
													}
												}
											}

								System.out.println("\n****************************");
								System.out.println("Sorted Numbers in Ascending Order are...");
									for (j=0;j<50;j++){
									System.out.print(" "+a[j]);
									}
								System.out.println("\n****************************");
								}

								if (subch==2){
											min = a[0];
											for (i=0;i<49;i++){
												for (j=i+1;j<50;j++){
													if (a[i] < a[j]){
		                      		 					min = a[i];
														a[i]=a[j];
														a[j]=min;
													}
												}
											}

								System.out.println("\n****************************");
								System.out.println("Sorted Numbers in Decending Order are...");
									for (j=0;j<50;j++){
									System.out.print(" "+a[j]);
									}
								System.out.println("\n****************************");
								}
							if (subch > 3 || subch< 1){
							JOptionPane.showMessageDialog(null, "You Have Chosen wrong option" );
							}

						///////////////////////////////End of Sub sorting Part///////////////////////////

			if (ch==2){
			     		num = JOptionPane.showInputDialog ("Enter Number to Search...");
						num1 = Integer.parseInt(num);
							for (i=0;i<50;i++){
								if (a[i] == num1){
									search = true;
								}
						}

						if (search == true){
							System.out.println("\n*********************");
							System.out.println(+(num1)+" is found...");
							System.out.println("***********************");
						}

						else{
							System.out.println("\n*********************");
							System.out.println(+(num1)+" is not found...");
							System.out.println("***********************");
						}
				}

				if (ch > 3 || ch< 1){

				JOptionPane.showMessageDialog(null, "You Have Chosen wrong option" );
				}

			}
   		}while (ch!=3);

				JOptionPane.showMessageDialog(null, "Thanks You. And Good Bye " );
				System.exit(0);
		////////////////////////////End of Main Menu Part ////////////////////////////////////
	}
}
