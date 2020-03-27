import javax.swing.*; // Border Layout
import java.awt.*;
import java.awt.event.*;
public class test
{
 public static void main (String args[])
 {
  FrameClass test = new FrameClass();     // test is a kind of a Variable
 }
}

class FrameClass

{
 JFrame frm1 = new JFrame("Test");      //Caption of the Frame

 JButton btnInsert = new JButton("Insert");    // For Button
 String str1 = new String();

 JButton btnCopy = new JButton("Copy");     // For Button
 JButton btnPaste = new JButton("Paste");    // For Button
 JButton btnDelete = new JButton("Delete");    // For Button
 JButton btnExit = new JButton("Exit");     // For Button
 JButton btnCut = new JButton("Cut");

 JLabel lbl1 = new JLabel ("Type Ur Text");    // For a Label

 JTextField txtBox = new JTextField(20);    // For TextBox
 JTextArea txtArea = new JTextArea();     // For TextArea
 Container c;           // For Button

 JPanel pnlNorth=new JPanel();
 JPanel pnlSouth=new JPanel();

 FrameClass()
 {
  frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE); // If U dont Add this coding here then what will happen that when U will close the form the DOS window will not close by any key check it out by Ur self
  frm1.setSize(400,400);         // Size of Frame Windth and Height
  c=frm1.getContentPane();        // For giving the Form Area to C and after it we just add things on Form now Form is Ready to add objects
  txtArea.setLineWrap(true); 	//For Line End and Start New Line.
  c.setLayout(new BorderLayout());      // For sub dividing the From's Layout to South North East West and Center

  //pnlNorth.setLayout(new GridLayout(1,3));
  pnlNorth.add(lbl1);         // For Showing Button
  pnlNorth.add(txtBox);
  pnlNorth.add(btnInsert);

  c.add(pnlNorth,"North");        //For Showing lable

  c.add(txtArea,"Center");       //For Showing textbox

  //To Add Command Buttons in South Pannel
  pnlSouth.setLayout(new GridLayout(1,4));
  pnlSouth.add(btnCut);
  pnlSouth.add(btnCopy);         // For Showing Button
  pnlSouth.add(btnPaste);
  pnlSouth.add(btnDelete);
  pnlSouth.add(btnExit);

  //Now to Add Buttons Event
  btnInsert.addActionListener(new DoIt());

  btnCut.addActionListener(new DoIt());
  btnCopy.addActionListener(new DoIt());
  btnPaste.addActionListener(new DoIt());
  btnDelete.addActionListener(new DoIt());
  btnExit.addActionListener(new DoIt());      //For Action Listenening Event to Do Something

  c.add(pnlSouth,"South");        //For Showing lable

  frm1.show();           // For showing Form
 }
 //Class for the Action Listner
 class DoIt implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   if (e.getSource()==btnInsert)
    {
    str1 = txtBox.getText();      //For copy from txtBox to txtArea
    //txtArea.setText(str1);
    txtArea.insert (str1,txtArea.getCaretPosition()); //or TA.Insert ("Test",
//    txtArea.getcaretPos());  //For Insert Text
    }


   if (e.getSource()==btnCut)
    {
    txtArea.cut();
    }
   if (e.getSource()==btnCopy)
    {
    txtArea.copy();
    }
   if (e.getSource()==btnPaste)
    {
    txtArea.paste();
    }
   if (e.getSource()==btnDelete)
    {
    JOptionPane.showMessageDialog(null,"As You Wish");
    txtArea.replaceSelection("");
    }
   if (e.getSource()==btnExit)
    {
    JOptionPane.showMessageDialog(null,"Thank You And Good Bye");
    System.exit(0);
    }
  }
 }
}