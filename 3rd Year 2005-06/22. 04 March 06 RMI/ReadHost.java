import java.io.*;
import javax.swing.*;

class ReadHost{

	String serverAddress=null;
	BufferedReader br=null;

	public ReadHost()
	{
		try{
			br=new BufferedReader(new FileReader("server.inf"));
			serverAddress=br.readLine();


		}catch(FileNotFoundException _ex)
		 {
			 serverAddress=JOptionPane.showInputDialog(null,
			                      "Enter The Server IP address");

			 try{

				 if(br!=null) br.close();
				 PrintWriter pw=new PrintWriter(new
				              FileOutputStream("server.inf"));
				 pw.println(serverAddress);
				 pw.close();
			 }catch(Exception e) {}
		 }
		 catch(IOException ex){}
		 //end of outer try
	}//end of constructor

	public String getHost()
	{
		return "rmi://"+serverAddress+"/";
	}

}