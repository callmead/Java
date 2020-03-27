import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class DBAdminUtil extends JDialog {
  JProgressBar Backup_PB = new JProgressBar();
  JProgressBar Restore_PB = new JProgressBar();
  JButton Backup_BTN = new JButton();
  JButton Restore_BTN = new JButton();
  Runtime run = Runtime.getRuntime();
  String line;
  Process p=null;

  public DBAdminUtil() {
    this.setTitle("Database Backup Utility");
    this.getContentPane().setLayout(null);
    Backup_PB.setBounds(new Rectangle(25, 30, 250, 32));
    Restore_PB.setBounds(new Rectangle(300, 30, 250, 32));
    Backup_BTN.setText("Backup");
    Backup_BTN.setBounds(new Rectangle(90, 70, 90, 32));
    Backup_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent)
				{
				  try {
					p=run.exec("notepad");
				      }
				  catch (Exception e)
				   {
				     e.printStackTrace();
					 System.out.println(e.getMessage());
					 p.destroy();
				   }
				}
    });
    Restore_BTN.setBounds(new Rectangle(360, 70, 90, 32));
    Restore_BTN.setText("Restore");
    Restore_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent)
				{
				  try {
				    p=run.exec("MySQL_Restore_Script.bat");
					  }
				  catch (Exception e)
					{
					  e.printStackTrace();
					  System.out.println(e.getMessage());
					  p.destroy();
				    }
				}
    });
    this.getContentPane().add(Backup_BTN);
    this.getContentPane().add(Backup_PB);
    this.getContentPane().add(Restore_BTN);
    this.getContentPane().add(Restore_PB);
    this.setBounds(20,40,580,180);
  }

  public static void main(String a[])
  {
	 new DBAdminUtil().show();
  }
}