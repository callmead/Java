import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class frmTest extends JFrame
{
	JPanel pnlFields = new JPanel();
	JPanel pnlDate = new JPanel();
	JPanel pblButtons = new JPanel();
	JLabel lblName = new JLabel();
	JLabel lblAddress = new JLabel();
	JLabel lblPhone = new JLabel();
	JLabel lblDOB = new JLabel();
	JLabel lblT = new JLabel();
	JLabel lblYear = new JLabel();
	JLabel lblMonth = new JLabel();
	JLabel lblDAY = new JLabel();
	JTextField txtName = new JTextField();
	JTextField txtAddress = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtDOB = new JTextField();
	JButton btnOK = new JButton();
	JButton btnSelect = new JButton();
	JButton btnClose = new JButton();
	JComboBox cboYear = new JComboBox();
	JComboBox cboMonth = new JComboBox();
	JComboBox cboDay = new JComboBox();

	public frmTest()
	{
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnlFields);
		this.getContentPane().add(pblButtons);
		this.setBounds(10,10,410,250);
		this.setDefaultCloseOperation(3);
		pnlFields.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlFields.setBounds(new Rectangle(14, 16, 374, 131));
		pnlFields.setLayout(null);
		lblName.setText("NAME");
		lblName.setBounds(new Rectangle(16, 10, 106, 24));
		lblName.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblAddress.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblAddress.setBounds(new Rectangle(16, 38, 106, 24));
		lblAddress.setText("ADDRESS");
		lblPhone.setText("TELEPHONE");
		lblPhone.setBounds(new Rectangle(16, 64, 106, 24));
		lblPhone.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblDOB.setBounds(new Rectangle(16, 92, 106, 24));
		lblDOB.setText("DATE OF BIRTH");
		lblDOB.setFont(new java.awt.Font("Tahoma", 1, 11));
 		lblDOB.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setText("");
		txtName.setBounds(new Rectangle(126, 11, 229, 23));
		txtName.setFont(new java.awt.Font("Tahoma", 1, 11));
		txtDOB.setBounds(new Rectangle(126, 93, 151, 23));
		txtDOB.setFont(new java.awt.Font("Tahoma", 1, 11));
		txtDOB.setText("");
		txtAddress.setFont(new java.awt.Font("Tahoma", 1, 11));
		txtAddress.setBounds(new Rectangle(126, 39, 229, 23));
		txtAddress.setText("");
		txtPhone.setText("");
		txtPhone.setBounds(new Rectangle(126, 65, 151, 23));
		txtPhone.setFont(new java.awt.Font("Tahoma", 1, 11));
		btnSelect.setText("...");
		btnSelect.setBounds(new Rectangle(281, 93, 22, 23));
		btnSelect.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pnlDate.setVisible(true);
				btnSelect.setVisible(false);
			}
		});
		pblButtons.setBorder(BorderFactory.createLineBorder(Color.black));
		pblButtons.setBounds(new Rectangle(14, 154, 374, 43));
		pblButtons.setLayout(null);
		btnClose.setText("CLOSE");
		btnClose.setBounds(new Rectangle(276, 8, 91, 28));
		btnClose.setFont(new java.awt.Font("Tahoma", 1, 11));
		btnClose.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(ActionEvent x2)
			{
				dispose();
			}
		});
		pnlDate.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlDate.setBounds(new Rectangle(81, 45, 213, 71));
		pnlDate.setLayout(null);
		lblT.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblT.setBounds(new Rectangle(7, 2, 111, 24));
		lblT.setText("Please Select Date");
		lblYear.setText("YEAR");
		lblYear.setBounds(new Rectangle(6, 21, 49, 24));
		lblYear.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblMonth.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblMonth.setBounds(new Rectangle(65, 21, 49, 24));
		lblMonth.setText("MONTH");
		lblDAY.setFont(new java.awt.Font("Tahoma", 1, 11));
		lblDAY.setBounds(new Rectangle(124, 21, 49, 24));
		lblDAY.setText("DAY");
		cboYear.setBounds(new Rectangle(6, 42, 57, 23));
		cboMonth.setBounds(new Rectangle(65, 42, 57, 23));
		cboDay.setBounds(new Rectangle(124, 42, 57, 23));
		btnOK.setBounds(new Rectangle(184, 42, 22, 23));
		btnOK.setText("OK");
		btnOK.setMnemonic('O');
		btnOK.setBorder(BorderFactory.createRaisedBevelBorder());
		btnOK.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x2)
			{
				txtDOB.setText(createDate());
				pnlDate.setVisible(false);
				btnSelect.setVisible(true);
			}
		});
		pnlFields.add(pnlDate);
		pnlFields.add(txtName);
		pnlFields.add(lblName);
		pnlFields.add(txtAddress);
		pnlFields.add(lblAddress);
		pnlFields.add(txtPhone);
		pnlFields.add(lblPhone);
		pnlFields.add(lblDOB);
		pnlFields.add(txtDOB);
		pnlFields.add(btnSelect);
		pnlDate.add(lblT);
		pnlDate.add(lblYear);
		pnlDate.add(lblMonth);
		pnlDate.add(cboYear);
		pnlDate.add(cboMonth);
		pnlDate.add(cboDay);
		pnlDate.add(lblDAY);
		pnlDate.add(btnOK);
		pblButtons.add(btnClose);
		addComboItems();
		cboYear.setMaximumRowCount(10);
		cboMonth.setMaximumRowCount(10);
		cboDay.setMaximumRowCount(10);
		pnlDate.setVisible(false);
	}

	public static void main(String args[])
	{
		frmTest cons = new frmTest();
		cons.setVisible(true);
	}

	private void addComboItems()
	{
		for (int i=1900;i<=2020;i++)
		{
			cboYear.addItem(String.valueOf(i));
		}

		cboMonth.addItem("JAN");
		cboMonth.addItem("FEB");
		cboMonth.addItem("MAR");
		cboMonth.addItem("APR");
		cboMonth.addItem("MAY");
		cboMonth.addItem("JUN");
		cboMonth.addItem("JUL");
		cboMonth.addItem("AUG");
		cboMonth.addItem("SEP");
		cboMonth.addItem("OCT");
		cboMonth.addItem("NOV");
		cboMonth.addItem("DEC");

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("00");

		for (int i=1;i<=31;i++)
		{
			cboDay.addItem(String.valueOf(df.format(i)));
		}

	}

	private String createDate()
	{
		String s = 	(String)cboYear.getSelectedItem()+"-"+
		(String)cboMonth.getSelectedItem()+"-"+
		(String)cboDay.getSelectedItem();
		return s;
	}
}