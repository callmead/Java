import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class frmCombo extends JFrame
{
	JPanel pnlMain = new JPanel();
	JComboBox cboFruit = new JComboBox();
	JButton cmdCount  = new JButton();
		public frmCombo()
		{
			//Properties of JFrame
			this.setTitle("EXAMPLE_OF_COMBO_BOX");
			this.setBounds(200,100,400,400);
			this.getContentPane().setLayout(null);
			this.getContentPane().add(pnlMain);
			//Properties of JPanel
			pnlMain.setLayout(null);
			pnlMain.setBounds(25,35,340,300);
			pnlMain.setBackground(Color.blue);
			pnlMain.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
			pnlMain.setBorder(BorderFactory.createLineBorder(Color.black,3));
			pnlMain.add(cboFruit);
			pnlMain.add(cmdCount);
			//Properties of comboBox
			cboFruit.setBounds(30,30,200,20);
			/*adding item to the combobox.*/
			cboFruit.addItem("Mango");
			cboFruit.addItem("Apple");
			cboFruit.addItem("Banana");
			cboFruit.addItem("Water Mellon");
			cboFruit.addItem("Orange");
			cboFruit.addItem("Lichee");
			cboFruit.addItem("Jack Fruit");
			cboFruit.setMaximumRowCount(4);
			//Properties of Button
			cmdCount.setText("Count");
			cmdCount.setBounds(240,30,70,20);
			cmdCount.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e)
				{
					JOptionPane.showMessageDialog(null,"Total items" + cboFruit.getItemCount());
				}
			});
		}
		public static void main(String args[])
		{
				frmCombo com = new frmCombo();
				com.setVisible(true);

		}
}

