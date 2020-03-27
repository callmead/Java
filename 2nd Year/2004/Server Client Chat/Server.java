import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame
{//Class
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private int counter = 1;

	public Server()
	{//Cons
		super(".:: SeRvEr ::.");
		Container container = getContentPane();
		enterField = new JTextField();
		enterField.setEnabled(false);

		enterField.addActionListener( new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				sendData(e.getActionCommand());
			}
		});

		container.add(enterField, BorderLayout.NORTH);
		displayArea = new JTextArea();

		container.add(new JScrollPane(displayArea),BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);

	}//End Cons

	public void runServer()
	{//run server
		try
		{
			server = new ServerSocket(5000,100);
			while(true)
			{
				waitForConnection();
				getStreams();
				processConnection();
				++counter;
			}
		}catch(IOException ioE)
		{
			System.out.println("Error: "+ioE);
			ioE.printStackTrace();
		}//End Try Catch
	}//end run server

	public void waitForConnection() throws IOException
	{//waitforconnection
		displayArea.setText("Waiting for Connection\n");
		connection = server.accept();
		displayArea.append("Connectyion "+counter+" received from: "+connection.getInetAddress().getHostName());
	}//End waitforconnection

	public void getStreams() throws IOException
	{//getStreams
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		displayArea.append("\nGot I/O streams\n");
	}//end getStreams

	public void processConnection() throws IOException
	{//Process Connection
		String message = "Server>>> Connection sucessful";
		output.writeObject(message);
		output.flush();
		enterField.setEnabled(true);

		do
		{
			try
			{
				message = (String)input.readObject();
				displayArea.append("\n"+message);
				displayArea.setCaretPosition(displayArea.getText().length());
			}catch(ClassNotFoundException cnf)
			{
				System.out.println("Error: "+cnf);
				displayArea.append("\nUnknown Object Type Received !!!");
			}
		}while(!message.equals("CLIENT>>> TERMINATE"));
	}//Process Connection

	public void closeConnection() throws IOException
	{//Close Connection
		displayArea.append("\nUser terminated connection");
		enterField.setEnabled(false);
		output.close();
		connection.close();
	}//Close Connection

	private void sendData(String message)
	{//Send Data
		try
		{
			output.writeObject("SERVER>>> "+message);
			output.flush();
			displayArea.append("\nSERVER>>>"+message);
		}catch(IOException ioE)
		{
			System.out.println("Error: "+ioE);
			displayArea.append("\nError Writing Object!!!");
		}
	}//Send Data

	public static void main (String x[])
	{//main
		Server app = new Server();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.runServer();
	}//End main
}//End Class
