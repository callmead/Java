
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class frmStudent extends JFrame {
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JPanel jPanel3 = new JPanel();
  TitledBorder titledBorder1;

  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JLabel jLabel7 = new JLabel();

  JTextField txtSID = new JTextField();
  JTextField txtSName = new JTextField();
  JTextField txtAddress = new JTextField();
  JTextField txtPhone = new JTextField();
  JTextField txtDOB = new JTextField();
  JTextField txtDues = new JTextField();

  JButton btnCancel = new JButton();
  JButton btnSave = new JButton();
  JButton btnDelete = new JButton();
  JButton btnClose = new JButton();
  JButton btnAdd = new JButton();
  JButton btnEdit = new JButton();

  JButton btnPrev = new JButton();
  JButton btnFirst = new JButton();
  JButton btnLast = new JButton();
  JButton btnNext = new JButton();


  public frmStudent() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    frmStudent frmStudent = new frmStudent();
    frmStudent.setVisible(true);

  }

  private void jbInit() throws Exception {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(new Color(187, 218, 252),new Color(91, 107, 123)),"Student Information");

    this.setResizable(false);
    this.setTitle("Student");
    this.getContentPane().setLayout(null);
    this.setLocation(200,100);
    this.setSize(new Dimension(385, 328));
    this.getContentPane().add(jPanel1, null);
	this.getContentPane().add(jPanel2, null);
	this.getContentPane().add(jPanel3, null);
	this.setDefaultCloseOperation(3);


    jPanel1.setBorder(titledBorder1);
    jPanel1.setBounds(new Rectangle(23, 34, 337, 181));
    jPanel1.setLayout(null);

    jPanel2.setBounds(new Rectangle(26, 220, 332, 42));
	jPanel2.setLayout(null);

    jPanel3.setBounds(new Rectangle(24, 255, 342, 40));
    jPanel3.setLayout(null);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel1.setText("ID Number  ");
    jLabel1.setBounds(new Rectangle(16, 32, 122, 16));

    jLabel2.setBounds(new Rectangle(16, 55, 122, 16));
    jLabel2.setText("Name  ");
    jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel3.setBounds(new Rectangle(16, 80, 122, 16));
    jLabel3.setText("Address  ");
    jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel4.setBounds(new Rectangle(16, 104, 122, 16));
    jLabel4.setText("Phone  ");
    jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel5.setBounds(new Rectangle(16, 127, 122, 16));
    jLabel5.setText("Date of Birth  ");
    jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel6.setBounds(new Rectangle(16, 150, 122, 16));
    jLabel6.setText("Dues  ");
    jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel7.setBackground(Color.white);
    jLabel7.setOpaque(true);
    jLabel7.setBounds(new Rectangle(42, 9, 257, 21));

    txtSID.setBounds(new Rectangle(151, 32, 157, 16));
    txtSName.setBounds(new Rectangle(151, 55, 157, 16));
    txtAddress.setBounds(new Rectangle(150, 80, 157, 16));
    txtPhone.setBounds(new Rectangle(150, 104, 157, 16));
    txtDOB.setBounds(new Rectangle(151, 127, 157, 16));
    txtDues.setBounds(new Rectangle(151, 150, 157, 16));

    btnAdd.setMnemonic('A');
    btnAdd.setText("Add");
    btnAdd.setBounds(new Rectangle(9, 11, 76, 21));

    btnEdit.setMnemonic('E');
    btnEdit.setText("Edit");
    btnEdit.setBounds(new Rectangle(89, 11, 76, 21));

    btnSave.setBounds(new Rectangle(9, 11, 76, 21));
    btnSave.setText("Save");
    btnSave.setMnemonic('S');

    btnCancel.setMnemonic('C');
    btnCancel.setText("Cancel");
    btnCancel.setBounds(new Rectangle(89, 11, 76, 21));

    btnDelete.setBounds(new Rectangle(170, 11, 76, 21));
    btnDelete.setText("Delete");
    btnDelete.setMnemonic('D');

    btnClose.setBounds(new Rectangle(250, 11, 76, 21));
    btnClose.setText("Close");
    btnClose.setMnemonic('L');


    btnFirst.setBounds(new Rectangle(3, 9, 19, 21));
    btnFirst.setIcon(new ImageIcon("first.gif"));
    btnFirst.setMnemonic('F');

    btnPrev.setMnemonic('P');
    btnPrev.setIcon(new ImageIcon("prior.gif"));
    btnPrev.setBounds(new Rectangle(22, 9, 19, 21));

    btnNext.setBounds(new Rectangle(301, 9, 19, 21));
    btnNext.setIcon(new ImageIcon("next.gif"));
    btnNext.setMnemonic('S');

    btnLast.setBounds(new Rectangle(321, 9, 19, 21));
    btnLast.setIcon(new ImageIcon("last.gif"));
    btnLast.setMnemonic('T');

    jPanel1.add(jLabel1, null);
    jPanel1.add(jLabel2, null);
    jPanel1.add(jLabel3, null);
    jPanel1.add(jLabel4, null);
    jPanel1.add(jLabel5, null);
    jPanel1.add(jLabel6, null);

    jPanel1.add(txtSID, null);
    jPanel1.add(txtPhone, null);
    jPanel1.add(txtDOB, null);
    jPanel1.add(txtDues, null);
    jPanel1.add(txtAddress, null);
    jPanel1.add(txtSName, null);

    jPanel2.add(btnDelete, null);
    jPanel2.add(btnClose, null);
    jPanel2.add(btnAdd, null);
    jPanel2.add(btnSave, null);
    jPanel2.add(btnEdit, null);
    jPanel2.add(btnCancel, null);

    jPanel3.add(btnFirst, null);
    jPanel3.add(btnPrev, null);
    jPanel3.add(btnLast, null);
    jPanel3.add(btnNext, null);
    jPanel3.add(jLabel7, null);
  }
}