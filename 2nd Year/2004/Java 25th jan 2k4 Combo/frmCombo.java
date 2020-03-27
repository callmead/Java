import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class frmCombo extends JFrame
{
	JPanel pnlMain = new JPanel();
	JComboBox cboFruit = new JComboBox();
	JButton cmdCount = new JButton();

	public frmCombo()
	{

		this.setTitle("Example of Combo Box");
		this.setBounds(200,100,400,400);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnlMain);

		//Properties of Panel

		pnlMain.setLayout(null);
		pnlMain.setBounds(25,34,340,300);
		pnlMain.setBackground(Color.yellow);
		pnlMain.setBorder(BorderFactory.createLineBorder(Color.blue,5));
		pnlMain.add(cboFruit);
		pnlMain.add(cmdCount);

		//Properties of Combo Box

		cboFruit.setBounds(30,30,200,30);
		cboFruit.addItem("Apple");
		cboFruit.addItem("Orange");
		cboFruit.addItem("Banana");
		cboFruit.addItem("Grape");
		cboFruit.addItem("Mango");
		cboFruit.addItem("Lichee");
		cboFruit.addItem("Jackfruit");
		cboFruit.addItem("Jambura");
		cboFruit.addItem("Watermelon");
		cboFruit.addItem("Straw Berry");
		cboFruit.setMaximumRowCount(4);

		//Properties of Button

		cmdCount.setBounds(240,30,70,30);
		cmdCount.setText("Count");
		cmdCount.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

				JOptionPane.showMessageDialog(null,"Total Item"+cboFruit.getItemCount());
				System.exit(0);
				}
			});
	}
		public static void main(String args[])
		{
			frmCombo obj=new frmCombo();
			obj.setVisible(true);
	}
}