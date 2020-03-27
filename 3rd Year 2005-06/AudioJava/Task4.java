	import java.applet.*;

	import java.awt.*;
	import java.awt.event.*;

	import java.util.*;

	import javax.swing.*;


	class Task4 extends JFrame {

		JButton b1;
		ImageIcon imi = new ImageIcon("add.gif");
		JLabel limi = new JLabel(imi);
		JLabel ran = new JLabel("Random");
		int j;
		String jj;
		Random rr = new Random();
		private AudioClip sound1;
		private AudioClip sound2;
		private AudioClip sound3;
		private AudioClip sound4;
		private AudioClip sound5;
		private AudioClip sound6;

		Task4() {
			super("Task 2");

			Container c = getContentPane();
			c.setLayout(null);
			c.setBackground(Color.pink);
			b1 = new JButton("Button");
			b1.setForeground(Color.green);
			b1.setBounds(150, 20, 100, 40);
			c.add(b1);

			JPanel ps = new JPanel();
			ps.setLayout(null);
			ps.setBorder(BorderFactory.createEtchedBorder(Color.green,
			                                                  Color.white));
			ps.setBackground(Color.black);
			ps.setBounds(100, 80, 170, 120);
			limi.setBounds(20, 20, 100, 80);
			ps.add(limi);
			c.add(ps);
			ran.setBounds(150, 200, 100, 80);
			c.add(ran);
			setBounds(200, 200, 450, 350);

			b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						for (int p = 1; p < 7; p++) {
							j = (Math.abs(rr.nextInt()) % 6) + 1;
							jj = String.valueOf(j);
							ran.setText(jj);
						}

						//*****************************************************
						if (j == 1) {
							imi = new ImageIcon("d1.jpg");
							limi.setIcon(imi);

							// sound1=getAudioClip("aqa.wav");
							//play("aqa.wav");
						}

						if (j == 2) {
							imi = new ImageIcon("d2.jpg");
							limi.setIcon(imi);

							//sound2=getAudioClip(getDocumentBase(),".wav");
							//sound2.play();
						}

						if (j == 3) {
							imi = new ImageIcon("d3.jpg");
							limi.setIcon(imi);

							// sound3=getAudioClip(getDocumentBase(),".wav");
						}

						if (j == 4) {
							imi = new ImageIcon("d4.jpg");
							limi.setIcon(imi);

							//sound4=getAudioClip(getDocumentBase(),".wav");
						}

						if (j == 5) {
							imi = new ImageIcon("d5.jpg");
							limi.setIcon(imi);

							//sound5=getAudioClip(getDocumentBase(),".wav");
						}

						if (j == 6) {
							imi = new ImageIcon("d6.jpg");
							limi.setIcon(imi);

							//sound6=getAudioClip(getDocumentBase(),".wav");
						}
					}
				});
			show();
		}

		public static void main(String [] easrsdf) {

			Task4 bt = new Task4();
		}
	}
