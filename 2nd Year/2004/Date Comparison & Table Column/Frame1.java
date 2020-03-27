import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



import java.util.*;
import java.text.*;

/**
* Title:
* Description:
* Copyright:    Copyright (c) 2004
* Company:
* @author
* @version 1.0
*/

public class Frame1 extends JFrame
{
	JButton jButton1 = new JButton();
	JTextField jTextField1 = new JTextField();
	JTextField jTextField2 = new JTextField();
	JLabel jLabel1 = new JLabel();
	JScrollPane jScrollPane1 = new JScrollPane();
	JTable jTable1 = new JTable(10,10);

	public Frame1()
	{
		try
		{
			jbInit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		Frame1 frame1 = new Frame1();
		frame1.setVisible(true);
	}

	private void jbInit() throws Exception
	{

		this.setBounds(200,50,400,400);
		jButton1.setText("jButton1");
		jButton1.setBounds(new Rectangle(270, 243, 90, 27));
		jButton1.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}
		});

		this.getContentPane().setLayout(null);
		jTextField1.setBounds(new Rectangle(56, 32, 302, 21));
		jTextField2.setBounds(new Rectangle(55, 64, 296, 26));
		jLabel1.setBorder(BorderFactory.createLineBorder(Color.black));
		jLabel1.setBounds(new Rectangle(58, 104, 297, 25));
		jScrollPane1.setBounds(new Rectangle(54, 149, 314, 84));

		jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
		jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);

		this.getContentPane().add(jButton1, null);
		this.getContentPane().add(jTextField1, null);
		this.getContentPane().add(jTextField2, null);
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jScrollPane1, null);
		jScrollPane1.getViewport().add(jTable1, null);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		jTextField1.setText(sdf.format(new Date()));
	}

	void jButton1_actionPerformed(ActionEvent e)
	{

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt1 = new Date();

		try
		{
			dt1=sdf.parse(jTextField1.getText());
			long d1 = dt1.getTime();
			System.out.println(""+d1);
			Date dt2 = new Date();
			dt2=sdf.parse(jTextField2.getText());
			long d2 = dt2.getTime();
			System.out.println(""+d2);
			long d= d2-d1;
			System.out.println(""+d);
			long diff = d/(24*60*60*1000);
			System.out.println(""+diff);
			jLabel1.setText(String.valueOf(diff));

			if (diff>=0) System.out.println("Ok"); else System.out.println("Not");
			//if(dt2.after(dt1)) jLabel1.setText("Ok"); else jLabel1.setText("Not Ok");
		}catch(ParseException pe){}
	}
}
