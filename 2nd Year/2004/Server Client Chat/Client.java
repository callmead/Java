import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame
{
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String chatServer;
	private Socket client;

	public Client(String host)
	{
		super("Client");

		//set server to which this client connects
		chatServer = host;
		Container container = getContentPane();
		//create enterFeild and register listener
		enterField = new JTextField();
		enterField.setEnabled(false);
		enterField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				sendData(event.getActionCommand());

			}//end of anonymous inner class

		});//end call to addActionListener

		container.add(enterField, BorderLayout.NORTH);

		//create displaysArea
		displayArea = new JTextArea();
		container.add(new JScrollPane(displayArea),BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);

	}//End of Constructor

		//connect to server and process messages from server
		public void runClient()
		{
			//connect to server, getStreams, process Connection
			try
			{
				//Step1: Create a socket to make connection
				connectToServer();

				//Step2: Get the input and output streams
				getStreams();

				//Step3: Process Connection
				processConnection();

				//Step4: Close Connection
				closeConnection();
			}//end of try

			//server closed connection
			catch(EOFException eofException)
			{
				System.out.println("Server terminated connection");
			}//end of catch

			//process problems communicating with server
			catch(IOException ioException)
			{
				ioException.printStackTrace();


			}//end of catch1

		}//end of runClient

		//get streams to send and recive data
		private void getStreams()throws IOException
		{
			//set up output stream for objects
			output = new ObjectOutputStream(client.getOutputStream());

			//flush output buffer to send header information

			output.flush();

			//set up input stream for objects

			input = new ObjectInputStream(client.getInputStream());
			displayArea.append("\nGot I/O streams\n");

		}//end of getStreams

		//connect to server
		private void connectToServer()throws IOException
		{
				displayArea.setText("Attempting connection\n");

				//create Socket to make connection to server
				client = new Socket(InetAddress.getByName(chatServer),5000);

				//display connection information
				displayArea.append("Connected to: "+client.getInetAddress().getHostName());
		}//end of connectToServer

		//process connection with server
		private void processConnection()throws IOException
		{
			//enable enterField so clientuser can send message
			enterField.setEnabled(true);

			//process messages sent from server
			do
			{
				//read message and display it
				try
				{
					message = (String)input.readObject();
					displayArea.append("\n" + message);
					displayArea.setCaretPosition(displayArea.getText().length());
				}//end of do try

				//catch problems reading from server
				catch(ClassNotFoundException classNotFoundException)
				{
					displayArea.append("\nUnKnown object type recived");
				}//end of do catch
			}//end of do
			while(!message.equals("SERVER>>> TERMINATE"));
		}//end of processConnection

		//close stream and socket
		private void closeConnection() throws IOException
		{
				displayArea.append("\nClosing connection");

				output.close();
				input.close();
				client.close();
		}//end of closeConnection

		//send message to server
		private void sendData(String message)
		{
			//send obejct to server
			try
			{
				output.writeObject("Client>>> "+ message);
				output.flush();
				displayArea.append("\nClient>>>" + message);
			}//end of sendData try

			//process problems sending object
			catch(IOException ioException)
			{
					displayArea.append("\nError writing object");


			}//end of sendData catch


		}//end of sendData

		//execute application
		public static void main(String args[])
		{
			Client application;

			if(args.length == 0)
			application = new Client("127.0.0.1");

			else
			application = new Client(args[0]);

			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			application.runClient();
		}//end of main

}//End ofClass