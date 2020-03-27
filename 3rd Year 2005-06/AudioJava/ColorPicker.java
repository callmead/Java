// ColorPicker.java
// A quick test of the JColorChooser dialog.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPicker extends JFrame {

  public ColorPicker() {
    super("JColorChooser Test Frame");
    setSize(200, 100);
    final JButton go = new JButton("Show JColorChooser");
    go.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c;
        c = JColorChooser.showDialog(
                  ((Component)e.getSource()).getParent(),
                  "Demo", Color.blue);
        go.setBackground(c);
      }
    });
    getContentPane().add(go);
    addWindowListener(new BasicWindowMonitor());
  }

  public static void main(String args[]) {
    ColorPicker cp = new ColorPicker();
    cp.setVisible(true);
  }
}
