import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.sound.sampled.*;
import java.io.*;

public class Task_1 extends JFrame
{


  JTextField txt=new JTextField();
  JLabel lbl=new JLabel(" ");
  JLabel labTask=new JLabel("TASK-1 ",JLabel.CENTER);
  JLabel lbDiit=new JLabel("DIIT ",JLabel.CENTER);

  JLabel lbT=new JLabel(" ");
  JLabel lbCheck=new JLabel("Check",JLabel.CENTER);
  JLabel lbVocabulary=new JLabel("Vocabulary Box",JLabel.CENTER);
  JLabel lblImage = new JLabel(new ImageIcon("image.gif"));
  JLabel lblMoynul = new JLabel(new ImageIcon("moynul.gif"));

  JButton btnResponse=new JButton("Response");
  JButton btnNext=new JButton("Next Word");
  JButton btnExit=new JButton("Exit");
  JButton btnClear=new JButton("Clear");
  JButton btnA=new JButton("A");
  JButton btnB=new JButton("B");
  JButton btnC=new JButton("C");
  JButton btnD=new JButton("D");
  JButton btnE=new JButton("E");
  JButton btnF=new JButton("F");
  JButton btnG=new JButton("G");
  JButton btnH=new JButton("H");
  JButton btnI=new JButton("I");
  JButton btnJ=new JButton("J");
  JButton btnK=new JButton("K");
  JButton btnL=new JButton("L");
  JButton btnM=new JButton("M");
  JButton btnN=new JButton("N");
  JButton btnO=new JButton("O");
  JButton btnP=new JButton("P");
  JButton btnQ=new JButton("Q");
  JButton btnR=new JButton("R");
  JButton btnS=new JButton("S");
  JButton btnT=new JButton("T");
  JButton btnU=new JButton("U");
  JButton btnV=new JButton("V");
  JButton btnW=new JButton("W");
  JButton btnX=new JButton("X");
  JButton btnY=new JButton("Y");
  JButton btnZ=new JButton("Z");



  String strData = "  Moynul \n  Welcome \n  Apple \n  Cat \n  Dog \n  Cow \n  Orange \n  Computer \n  Mouse \n  Flower \n  Pen \n  Amrela \n  Book \n  Pencil \n  Mobile \n  Horse \n  Tiger \n  Lion \n  Snake \n  Deer \n  Fox \n  Hare \n  Rat \n  Ass \n  Ram \n  Goat \n  Whale \n  Hog \n  Peacock \n  Mayna \n  Cock \n  Bird \n  Frog \n  Fish \n  Fly \n  Hive \n  Gold \n  Artist \n  Teacher \n  Train \n  Ship \n  News \n  Father \n  Mother \n  Brother \n  Sister \n  Son \n  Friend \n  Chair \n  Picture \n  Umbrella \n  Book \n  College \n  Univrsity \n  Story \n";
  JPanel pnlMain = new JPanel();
  JTextArea txaData = new JTextArea(strData);

  String strPredefined = "Hello This is MOYNUL";
  Vector vctString = new Vector();
  Vector vctTokens = new Vector();
  Clip clip;

  Font f=new Font("impact",3,22);
  Font F=new Font("ms sans serif",3,13);
  Color hbg= new Color(0,255,255);
  Color fg= new Color(255,255,255);
  Color bg= new Color(0,0,0);
  Color hbg1= new Color(255,0,0);
  Color hbg2= new Color(0,128,0);
  Color hbg3= new Color(0,0,255);
  Color hbg4= new Color(0,255,0);
  Color hbg5= new Color(51,102,0);


Task_1()
{

  Container c=this.getContentPane();
  c.setLayout(null);
  c.setBackground(new Color(158,175,29));//(63,193,75));
  setDefaultCloseOperation(3);

//************************TASK PROPERTIES************************

c.add(labTask);
  labTask.setBounds(250,20,120,30);
  labTask.setBorder(BorderFactory.createBevelBorder(0));
  labTask.setForeground(Color.blue);
  labTask.setBackground(Color.black);
  labTask.setOpaque(true);
  labTask.setFont(f);
  labTask.addMouseListener(new MouseAdapter(){
      public void mouseEntered(MouseEvent e)
       {labTask.setBackground(hbg);
         }
       public void mouseExited(MouseEvent e)
       {labTask.setBackground(bg);
         }
	});


 c.add(lbT);
  lbT.setBounds(245,14,130,40);
  lbT.setOpaque(false);
  lbT.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,10)));

c.add(lbl);
  lbl.setBounds(40,260,550,160);
  lbl.setOpaque(false);
  lbl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,9)," Alphabet Box"));


c.add(lbCheck);
  lbCheck.setBounds(170,60,70,35);
  lbCheck.setBorder(BorderFactory.createLineBorder(Color.red,5));
  lbCheck.setFont(F);

c.add(lbDiit);
  lbDiit.setBounds(480,180,70,35);
  lbDiit.setForeground(hbg5);
  lbDiit.setFont(f);


c.add(lbVocabulary);
  lbVocabulary.setBounds(250,95,120,25);
    lbVocabulary.setFont(F);


c.add(txt);
  txt.setBounds(247,60,200,35);
  txt.setToolTipText("Write the Word");
  txt.setBorder(BorderFactory.createLineBorder(Color.red));
  txt.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,5)));
  txt.setForeground(fg);
  txt.setBackground(hbg2);
  txt.setOpaque(true);
  txt.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
         }
        public void mouseExited(MouseEvent e)
        {
         }
	});
	txt.addKeyListener(new KeyAdapter()
	{
		public void keyReleased(KeyEvent ke)
		{
			txt.setText(""+txt.getText().toUpperCase());
		}

	});


c.add(lblImage);
  lblImage.setBounds(440, 20, 144, 144);
  lblImage.setCursor(new Cursor(Cursor.MOVE_CURSOR));
  lblImage.setToolTipText("Free Accsess");

c.add(lblMoynul);
  lblMoynul.setBounds(25, 35, 144, 190);
  lblMoynul.setCursor(new Cursor(Cursor.HAND_CURSOR));


//******************** Panel to hold text box **************************

c.add(pnlMain);
  pnlMain.setBounds(200,116,213,140);
  pnlMain.setLayout(null);
  pnlMain.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,8)));
  pnlMain.setOpaque(false);

//------------------ textarea properties -----------------

  txaData.setEditable(false);// make the textarea not editable
  JScrollPane scp = new JScrollPane(txaData);	//make the textarea scroll able
  scp.setBounds(9, 10, 197, 122);
  pnlMain.add(scp);
  txaData.setCursor(new Cursor(Cursor.HAND_CURSOR));
  txaData.setToolTipText("Click to Word");
  txaData.setBackground(bg);//(Color.black);
  txaData.setForeground(fg);
  txaData.addMouseListener(new MouseAdapter(){
      public void mouseEntered(MouseEvent e)
      {txaData.setBackground(hbg2);
       }
      public void mouseExited(MouseEvent e)
      {txaData.setBackground(bg);
       }
	});


//*********************** RESPONSE PROPERTIES ****************************

c.add(btnResponse);
  btnResponse.setBounds(220,435,95,25);
  btnResponse.setCursor(new Cursor(Cursor.HAND_CURSOR));
  btnResponse.setToolTipText("Click to Response");
  btnResponse.setMnemonic('R');
  btnResponse.setBorder(BorderFactory.createBevelBorder(0));
  btnResponse.setBorder(BorderFactory.createLineBorder(Color.green));
  btnResponse.setBackground(bg);//(Color.black);
  btnResponse.setForeground(hbg1);//(Color.red);
  btnResponse.setOpaque(true);
  btnResponse.setFont(F);

btnResponse.addMouseListener(new MouseAdapter(){
    public void mouseEntered(MouseEvent e)
     {btnResponse.setBackground(hbg4);
       }
     public void mouseExited(MouseEvent e)
     {btnResponse.setBackground(bg);
       }
	});

  // ------------------------ ACTION FOR RESPONSE BUTTON -----------------------------

btnResponse.addActionListener(new ActionListener()
  	{
		public void actionPerformed(ActionEvent ae)
		{
			boolean found = searchWord(txaData.getText(), txt.getText().trim());
			if(found)
			{
				String st = txt.getText().trim();
			//	System.out.println(st);
				playClip(new File("sound\\"+st+".wav"));


				JOptionPane.showMessageDialog(Task_1.this, "Spelling is correct ");
			}
			else
			{
				JOptionPane.showMessageDialog(Task_1.this, "Spelling is not correct ");
			}
		}

	});

//******************************* CLEAR PROPERTIES *****************************************

c.add(btnClear);
  btnClear.setBounds(70,435,95,25);
  btnClear.setCursor(new Cursor(Cursor.HAND_CURSOR));
  btnClear.setToolTipText("Click to Clear");
  btnClear.setMnemonic('C');
  btnClear.setBorder(BorderFactory.createBevelBorder(0));
  btnClear.setBorder(BorderFactory.createLineBorder(Color.green));
  btnClear.setBackground(bg);//(Color.black);
  btnClear.setForeground(hbg1);//(Color.red);
  btnClear.setOpaque(true);
  btnClear.setFont(F);
btnClear.addMouseListener(new MouseAdapter(){
      public void mouseEntered(MouseEvent e)
       {btnClear.setBackground(hbg5);
         }
       public void mouseExited(MouseEvent e)
       {btnClear.setBackground(bg);
         }
	});
btnClear.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	txt.setText("");
	}
	});

//************************* NEXT PROPERTIES****************************

c.add(btnNext);
  btnNext.setBounds(370,435,95,25);
  btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
  btnNext.setToolTipText("Click to Next Word");
  btnNext.setMnemonic('N');
  btnNext.setBorder(BorderFactory.createBevelBorder(0));
  btnNext.setBorder(BorderFactory.createLineBorder(Color.green));
  btnNext.setBackground(bg);//(Color.black);
  btnNext.setForeground(hbg1);//(Color.red);
  btnNext.setOpaque(true);
  btnNext.setFont(F);
btnNext.addMouseListener(new MouseAdapter(){
  	 public void mouseEntered(MouseEvent e)
  	{btnNext.setBackground(hbg2);
  	 }
  	public void mouseExited(MouseEvent e)
  	{btnNext.setBackground(bg);
  	 }
	});

	btnNext.addActionListener(new ActionListener()
	{
	  public void actionPerformed(ActionEvent e)
	{
		String st = nextWord(txt.getText().trim());
	//	System.out.println(st);
		playClip(new File("sound\\"+st+".wav"));
		txt.setText(st.toUpperCase());
	}
	});


	//nextWord(String word1)


//************************EXIT PROPERTIES************************

c.add(btnExit);
  btnExit.setBounds(500,435,90,25);
  btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
  btnExit.setToolTipText("Click to Exit");
  btnExit.setMnemonic('E');
  btnExit.setBorder(BorderFactory.createBevelBorder(0));
  btnExit.setBorder(BorderFactory.createLineBorder(Color.green));
  btnExit.setBackground(bg);//(Color.black);
  btnExit.setForeground(hbg1);//(Color.red);
  btnExit.setOpaque(true);
  btnExit.setFont(F);

btnExit.addMouseListener(new MouseAdapter(){
    public void mouseEntered(MouseEvent e)
    {btnExit.setBackground(hbg3);
     }
    public void mouseExited(MouseEvent e)
    {btnExit.setBackground(bg);
     }
	});

btnExit.addActionListener(new ActionListener()
	{
	  public void actionPerformed(ActionEvent e)
	{
	  int a=JOptionPane.showConfirmDialog(Task_1.this,"Are u sure?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
	  if(a==0 )
	  System.exit(0);
	}
 });

 //*****************************Alphabet properties***************

c.add(btnA);
  btnA.setBounds(58,285,49,25);
  btnA.setToolTipText("Click to A");
  btnA.setBorder(BorderFactory.createBevelBorder(0));
  btnA.setBorder(BorderFactory.createLineBorder(Color.green));
  btnA.setBackground(Color.black);
  btnA.setForeground(Color.red);
  btnA.setOpaque(true);
   //A1=new String[10];
  btnA.addActionListener(new ActionListener( )
   	 { public void actionPerformed( ActionEvent e)
   		 {	txt.setText(txt.getText()+"A"); }
	});

c.add(btnB);
  btnB.setBounds(116,285,49,25);
  btnB.setToolTipText("Click to B");
  btnB.setBorder(BorderFactory.createBevelBorder(0));
  btnB.setBorder(BorderFactory.createLineBorder(Color.green));
  btnB.setBackground(Color.black);
  btnB.setForeground(Color.red);
  btnB.setOpaque(true);
btnB.addActionListener(new ActionListener( )
  	 { public void actionPerformed( ActionEvent e)
  		 {	txt.setText(txt.getText()+"B"); }
	});

c.add(btnC);
  btnC.setBounds(174,285,49,25);
  btnC.setToolTipText("Click to C");
  btnC.setBorder(BorderFactory.createBevelBorder(0));
  btnC.setBorder(BorderFactory.createLineBorder(Color.green));
  btnC.setBackground(Color.black);
  btnC.setForeground(Color.red);
  btnC.setOpaque(true);
  btnC.addActionListener(new ActionListener( )
  	 { public void actionPerformed( ActionEvent e)
  		 {	txt.setText(txt.getText()+"C"); }
	});

c.add(btnD);
  btnD.setBounds(232,285,49,25);
  btnD.setToolTipText("Click to D");
  btnD.setBorder(BorderFactory.createBevelBorder(0));
  btnD.setBorder(BorderFactory.createLineBorder(Color.green));
  btnD.setBackground(Color.black);
  btnD.setForeground(Color.red);
  btnD.setOpaque(true);
  btnD.addActionListener(new ActionListener( )
  	 { public void actionPerformed( ActionEvent e)
  		 {	txt.setText(txt.getText()+"D"); }
	});

c.add(btnE);
  btnE.setBounds(290,285,49,25);
  btnE.setToolTipText("Click to E");
  btnE.setBorder(BorderFactory.createBevelBorder(0));
  btnE.setBorder(BorderFactory.createLineBorder(Color.green));
  btnE.setBackground(Color.black);
  btnE.setForeground(Color.red);
  btnE.setOpaque(true);
  btnE.addActionListener(new ActionListener( )
  	 { public void actionPerformed( ActionEvent e)
  		 {	txt.setText(txt.getText()+"E"); }
	});

c.add(btnF);
  btnF.setBounds(348,285,49,25);
  btnF.setToolTipText("Click to F");
  btnF.setBorder(BorderFactory.createBevelBorder(0));
  btnF.setBorder(BorderFactory.createLineBorder(Color.green));
  btnF.setBackground(Color.black);
  btnF.setForeground(Color.red);
  btnF.setOpaque(true);
  btnF.addActionListener(new ActionListener( )
  	 { public void actionPerformed( ActionEvent e)
  		 {	txt.setText(txt.getText()+"F"); }
	});

c.add(btnG);
  btnG.setBounds(406,285,49,25);
  btnG.setToolTipText("Click to G");
  btnG.setBorder(BorderFactory.createBevelBorder(0));
  btnG.setBorder(BorderFactory.createLineBorder(Color.green));
  btnG.setBackground(Color.black);
  btnG.setForeground(Color.red);
  btnG.setOpaque(true);
  btnG.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"G"); }
	});

c.add(btnH);
  btnH.setBounds(464,285,49,25);
  btnH.setToolTipText("Click to H");
  btnH.setBorder(BorderFactory.createBevelBorder(0));
  btnH.setBorder(BorderFactory.createLineBorder(Color.green));
  btnH.setBackground(Color.black);
  btnH.setForeground(Color.red);
  btnH.setOpaque(true);
  btnH.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"H"); }
  	});

c.add(btnI);
  btnI.setBounds(522,285,49,25);
  btnI.setToolTipText("Click to I");
  btnI.setBorder(BorderFactory.createBevelBorder(0));
  btnI.setBorder(BorderFactory.createLineBorder(Color.green));
  btnI.setBackground(Color.black);
  btnI.setForeground(Color.red);
  btnI.setOpaque(true);
  btnI.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"I"); }
	});

c.add(btnJ);
  btnJ.setBounds(58,325,49,25);
  btnJ.setToolTipText("Click to J");
  btnJ.setBorder(BorderFactory.createBevelBorder(0));
  btnJ.setBorder(BorderFactory.createLineBorder(Color.green));
  btnJ.setBackground(Color.black);
  btnJ.setForeground(Color.red);
  btnJ.setOpaque(true);
  btnJ.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"J"); }
  	});

c.add(btnK);
  btnK.setBounds(116,325,49,25);
  btnK.setToolTipText("Click to K");
  btnK.setBorder(BorderFactory.createBevelBorder(0));
  btnK.setBorder(BorderFactory.createLineBorder(Color.green));
  btnK.setBackground(Color.black);
  btnK.setForeground(Color.red);
  btnK.setOpaque(true);
  btnK.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"K"); }
	});

c.add(btnL);
  btnL.setBounds(174,325,49,25);
  btnL.setToolTipText("Click to L");
  btnL.setBorder(BorderFactory.createBevelBorder(0));
  btnL.setBorder(BorderFactory.createLineBorder(Color.green));
  btnL.setBackground(Color.black);
  btnL.setForeground(Color.red);
  btnL.setOpaque(true);
  btnL.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"L"); }
	});

c.add(btnM);
  btnM.setBounds(232,325,49,25);
  btnM.setToolTipText("Click to M");
  btnM.setBorder(BorderFactory.createBevelBorder(0));
  btnM.setBorder(BorderFactory.createLineBorder(Color.green));
  btnM.setBackground(Color.black);
  btnM.setForeground(Color.red);
  btnM.setOpaque(true);
  btnM.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"M"); }
	});

c.add(btnN);
  btnN.setBounds(290,325,49,25);
  btnN.setToolTipText("Click to N");
  btnN.setBorder(BorderFactory.createBevelBorder(0));
  btnN.setBorder(BorderFactory.createLineBorder(Color.green));
  btnN.setBackground(Color.black);
  btnN.setForeground(Color.red);
  btnN.setOpaque(true);
  btnN.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"N"); }
  	});


c.add(btnO);
  btnO.setBounds(348,325,49,25);
  btnO.setToolTipText("Click to O");
  btnO.setBorder(BorderFactory.createBevelBorder(0));
  btnO.setBorder(BorderFactory.createLineBorder(Color.green));
  btnO.setBackground(Color.black);
  btnO.setForeground(Color.red);
  btnO.setOpaque(true);
  btnO.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"O"); }
	});

c.add(btnP);
  btnP.setBounds(406,325,49,25);
  btnP.setToolTipText("Click to P");
  btnP.setBorder(BorderFactory.createBevelBorder(0));
  btnP.setBorder(BorderFactory.createLineBorder(Color.green));
  btnP.setBackground(Color.black);
  btnP.setForeground(Color.red);
  btnP.setOpaque(true);
  btnP.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"P"); }
	});

c.add(btnQ);
  btnQ.setBounds(464,325,49,25);
  btnQ.setToolTipText("Click to Q");
  btnQ.setBorder(BorderFactory.createBevelBorder(0));
  btnQ.setBorder(BorderFactory.createLineBorder(Color.green));
  btnQ.setBackground(Color.black);
  btnQ.setForeground(Color.red);
  btnQ.setOpaque(true);
  btnQ.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"Q"); }
	});

c.add(btnR);
  btnR.setBounds(522,325,49,25);
  btnR.setToolTipText("Click to R");
  btnR.setBorder(BorderFactory.createBevelBorder(0));
  btnR.setBorder(BorderFactory.createLineBorder(Color.green));
  btnR.setBackground(Color.black);
  btnR.setForeground(Color.red);
  btnR.setOpaque(true);
  btnR.addActionListener(new ActionListener( )
  		 { public void actionPerformed( ActionEvent e)
  			 {	txt.setText(txt.getText()+"R"); }
	});

c.add(btnS);
  btnS.setBounds(58,365,49,25);
  btnS.setToolTipText("Click to S");
  btnS.setBorder(BorderFactory.createBevelBorder(0));
  btnS.setBorder(BorderFactory.createLineBorder(Color.green));
  btnS.setBackground(Color.black);
  btnS.setForeground(Color.red);
  btnS.setOpaque(true);
  btnS.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"S"); }
  	});

c.add(btnT);
  btnT.setBounds(116,365,49,25);
  btnT.setToolTipText("Click to T");
  btnT.setBorder(BorderFactory.createBevelBorder(0));
  btnT.setBorder(BorderFactory.createLineBorder(Color.green));
  btnT.setBackground(Color.black);
  btnT.setForeground(Color.red);
  btnT.setOpaque(true);
  btnT.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"T"); }
	});

c.add(btnU);
  btnU.setBounds(174,365,49,25);
  btnU.setToolTipText("Click to U");
  btnU.setBorder(BorderFactory.createBevelBorder(0));
  btnU.setBorder(BorderFactory.createLineBorder(Color.green));
  btnU.setBackground(Color.black);
  btnU.setForeground(Color.red);
  btnU.setOpaque(true);
  btnU.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"U"); }
  	});


c.add(btnV);
  btnV.setBounds(232,365,49,25);
  btnV.setToolTipText("Click to V");
  btnV.setBorder(BorderFactory.createBevelBorder(0));
  btnV.setBorder(BorderFactory.createLineBorder(Color.green));
  btnV.setBackground(Color.black);
  btnV.setForeground(Color.red);
  btnV.setOpaque(true);
  btnV.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"V"); }
  	});


c.add(btnW);
  btnW.setBounds(290,365,49,25);
  btnW.setToolTipText("Click to W");
  btnW.setBorder(BorderFactory.createBevelBorder(0));
  btnW.setBorder(BorderFactory.createLineBorder(Color.green));
  btnW.setBackground(Color.black);
  btnW.setForeground(Color.red);
  btnW.setOpaque(true);
  btnW.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"W"); }
	});

c.add(btnX);
  btnX.setBounds(348,365,49,25);
  btnX.setToolTipText("Click to X");
  btnX.setBorder(BorderFactory.createBevelBorder(0));
  btnX.setBorder(BorderFactory.createLineBorder(Color.green));
  btnX.setBackground(Color.black);
  btnX.setForeground(Color.red);
  btnX.setOpaque(true);
  btnX.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"X"); }
	});

c.add(btnY);
  btnY.setBounds(406,365,49,25);
  btnY.setToolTipText("Click to Y");
  btnY.setBorder(BorderFactory.createBevelBorder(0));
  btnY.setBorder(BorderFactory.createLineBorder(Color.green));
  btnY.setBackground(Color.black);
  btnY.setForeground(Color.red);
  btnY.setOpaque(true);
  btnY.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"Y"); }
  	});



c.add(btnZ);
  btnZ.setBounds(464,365,49,25);
  btnZ.setToolTipText("Click to Z");
  btnZ.setBorder(BorderFactory.createBevelBorder(0));
  btnZ.setBorder(BorderFactory.createLineBorder(Color.green));
  btnZ.setBackground(Color.black);
  btnZ.setForeground(Color.red);
  btnZ.setOpaque(true);
  btnZ.addActionListener(new ActionListener( )
  			 { public void actionPerformed( ActionEvent e)
  				 {	txt.setText(txt.getText()+"Z"); }
	});

	btnNext.addActionListener(
				new ActionListener( )
				{
					public void actionPerformed( ActionEvent e)
					{
						// JOptionPane.showMessageDialog(null,"You have clicked the next button");
					}
			}
			);




this.setSize(620,520);
this.setLocation(120,40);
this.setTitle("                                               MOYNUL,ROLL_NO-04,IADCS,DIIT");
this.show();

}

public static void main(String args[])
{

Task_1 f=new Task_1();
}

//************************* own method/DONT TUCH *************************

public boolean searchWord(String originalMsg, String strSrc)
  {
        StringTokenizer token = new StringTokenizer(originalMsg);
        vctTokens.removeAllElements();
        int tokenCount = token.countTokens();
        String foundWord = null;
        while(token.hasMoreTokens())
        {
                vctTokens.addElement(token.nextToken());
        }
        for(int i = 0; i < tokenCount; i++)
        {
                if(String.valueOf(vctTokens.elementAt(i)).equalsIgnoreCase(strSrc))
                {
					return true;
                }
                else
                {
					// do nothing if data not found
                }
        }
        return false;

  }//--------------------- end of searchWord---------------------

  public String nextWord(String word1)
  {
	  StringTokenizer token1 = new StringTokenizer(strData.toUpperCase());

	  Vector vctWords = new Vector();
	  vctWords.removeAllElements();
		while(token1.hasMoreTokens())
		{
			vctWords.addElement(token1.nextToken());


		}
		//		System.out.println(vctWords);

		int pos = vctWords.indexOf((Object)word1);
//		System.out.println("nextWord of "+word1+" is "+vctWords.elementAt(pos+1));

	return String.valueOf(vctWords.elementAt(pos+1));
  }//end of nextWord

  ///****************START OF METHOD******************************
  	public void playClip(File getFile)
  	{
		File file;
  		try
  		{
  			file = getFile;
  			AudioInputStream audiosource = AudioSystem.getAudioInputStream(file);
              DataLine.Info info = new DataLine.Info(Clip.class, audiosource.getFormat());
              clip = (Clip)AudioSystem.getLine(info);
              clip.open(audiosource);
          }
  	        catch(UnsupportedAudioFileException e){/*JOptionPane.showMessageDialog(null, "Error "+e);*/}
  	        catch(LineUnavailableException e){/*JOptionPane.showMessageDialog(null, "Error "+e);*/}
  	        catch(IOException e){/*JOptionPane.showMessageDialog(null, "Error "+e);*/}
  	        clip.start();


  	}


}