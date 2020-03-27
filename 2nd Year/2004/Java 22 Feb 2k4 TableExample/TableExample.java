//Java 22th Feb 2004 Table Example

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TableExample extends JFrame
{//Class

	JLabel lblHead = new JLabel();
	JPanel pnl = new JPanel();
	JButton btnClose = new JButton();
	JTable table = new JTable(30,14);//JTable(rows,columns)
	JScrollPane sp = new JScrollPane(); //Scroll for Table Required.

	public TableExample()
	{//Constructor
		this.setTitle("Table Example");
		this.setBounds(200,100,400,400);
		this.setDefaultCloseOperation(3);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnl);
		this.getContentPane().add(lblHead);
		this.getContentPane().add(btnClose);
		//----------------------

		//Properties of Label...
		lblHead.setText("List of All Students");
		lblHead.setBounds(25,25,350,25);
		lblHead.setOpaque(true);
		lblHead.setForeground(Color.white);
		lblHead.setBackground(Color.red);
		lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setFont(new Font("Tahoma",1,12));
		//----------------------

		//Properties of Panel...
		pnl.setBounds(25,60,350,250);
		pnl.setBorder(BorderFactory.createLineBorder(Color.black));
		//pnl.add(table,BorderLayout.CENTER);//When not using ScrollPane
		pnl.setLayout(new BorderLayout());
		pnl.add(sp,BorderLayout.CENTER);

		//----------------------

		//Properties of ScrollPane...
		sp.getViewport().add(table);
		//---------------------------

		//Properties of Table...
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//----------------------

		//Properties of Button...
		btnClose.setText("Close");
		btnClose.setMnemonic('l');
		btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
		btnClose.setBounds(275,330,100,25);
		btnClose.setFont(new Font("Tahoma",1,12));
		btnClose.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		//-----------------------

	}//Constructor

	public static void main(String a[])
	{//Main
		TableExample frm = new TableExample();
		frm.setVisible(true);
	}//Main
}//Class