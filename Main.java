import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{

 private JMenuBar mb;
 private JMenu menuOptions, menuCalculate, menuAbout, menuBackground;
 private JMenuItem miCalculate, miRed, miBlack, miPurple, miCreator, miExit, miNew;
 private JLabel labelLogo, labelWelcome, labelTitle, labelName, labelLNFather, labelLNMother, labelDepartment, labelSeniority, labelResult, labelfooter;
 private JTextField txtWorkerName, txtWorkerLNFather, txtWorkerLNMother;
 private JComboBox comboDepartment, comboSeniority;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 String nameA = "";

 public Main(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Main Screen");
  getContentPane().setBackground(new Color(255,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Welcome windowWelcome = new Welcome();
  nameA = windowWelcome.text;

  mb = new JMenuBar();
  mb.setBackground(new Color(255,0,0));
  setJMenuBar(mb);

  menuOptions = new JMenu("Options");
  menuOptions.setBackground(new Color(255,0,0));
  menuOptions.setFont(new Font("Andale Mono", 1, 14));
  menuOptions.setForeground(new Color(255,255,255));
  mb.add(menuOptions);

  menuCalculate = new JMenu("Calculate");
  menuCalculate.setBackground(new Color(255,0,0));
  menuCalculate.setFont(new Font("Andale Mono", 1, 14));
  menuCalculate.setForeground(new Color(255,255,255));
  mb.add(menuCalculate);

  menuAbout = new JMenu("About");
  menuAbout.setBackground(new Color(255,0,0));
  menuAbout.setFont(new Font("Andale Mono", 1, 14));
  menuAbout.setForeground(new Color(255,255,255));
  mb.add(menuAbout);

  menuBackground = new JMenu("Background");
  menuBackground.setBackground(new Color(255,0,0));
  menuBackground.setFont(new Font("Andale Mono", 1, 14));
  menuBackground.setForeground(new Color(255,255,255));
  menuOptions.add(menuBackground);

  miCalculate = new JMenuItem("Vacations");
  miCalculate.setFont(new Font("Andale Mono", 1, 14));
  miCalculate.setForeground(new Color(255,0,0));
  menuCalculate.add(miCalculate);
  miCalculate.addActionListener(this);

  miRed = new JMenuItem("Red");
  miRed.setFont(new Font("Andale Mono", 1, 14));
  miRed.setForeground(new Color(255,0,0));
  menuBackground.add(miRed);
  miRed.addActionListener(this);

  miBlack = new JMenuItem("Black");
  miBlack.setFont(new Font("Andale Mono", 1, 14));
  miBlack.setForeground(new Color(255,0,0));
  menuBackground.add(miBlack);
  miBlack.addActionListener(this);

  miPurple = new JMenuItem("Purple");
  miPurple.setFont(new Font("Andale Mono", 1, 14));
  miPurple.setForeground(new Color(255,0,0));
  menuBackground.add(miPurple);
  miPurple.addActionListener(this);

  miNew = new JMenuItem("New");
  miNew.setFont(new Font("Andale Mono", 1, 14));
  miNew.setForeground(new Color(255,0,0));
  menuOptions.add(miNew);
  miNew.addActionListener(this);

  miCreator = new JMenuItem("Creator");
  miCreator.setFont(new Font("Andale Mono", 1, 14));
  miCreator.setForeground(new Color(255,0,0));
  menuAbout.add(miCreator);
  miCreator.addActionListener(this);

  miExit = new JMenuItem("Exit");
  miExit.setFont(new Font("Andale Mono", 1, 14));
  miExit.setForeground(new Color(255,0,0));
  menuOptions.add(miExit);
  miExit.addActionListener(this);

  ImageIcon image = new ImageIcon("images/logo-coca.png");
  labelLogo = new JLabel(image);
  labelLogo.setBounds(5,5,250,100);
  add(labelLogo);

  labelWelcome = new JLabel("Welcome " + nameA);
  labelWelcome.setBounds(280,30,300,50);
  labelWelcome.setFont(new Font("Andale Mono", 1, 32));
  labelWelcome.setForeground(new Color(255,255,255));
  add(labelWelcome);

  labelTitle = new JLabel("Complete with the worker's information");
  labelTitle.setBounds(45,140,900,25);
  labelTitle.setFont(new Font("Andale Mono", 0, 24));
  labelTitle.setForeground(new Color(255,255,255));
  add(labelTitle);

  labelName = new JLabel("Complete Name");
  labelName.setBounds(25,188,180,25);
  labelName.setFont(new Font("Andale Mono", 1, 12));
  labelName.setForeground(new Color(255,255,255));
  add(labelName);

  txtWorkerName = new JTextField();
  txtWorkerName.setBounds(25,213,150,25);
  txtWorkerName.setBackground(new java.awt.Color(224,224,224));
  txtWorkerName.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtWorkerName.setForeground(new java.awt.Color(255,0,0));
  add(txtWorkerName);

  labelLNFather = new JLabel("Father's last name:");
  labelLNFather.setBounds(25,248,180,25);
  labelLNFather.setFont(new Font("Andale Mono", 1, 12));
  labelLNFather.setForeground(new Color(255,255,255));
  add(labelLNFather);

  txtWorkerLNFather = new JTextField();
  txtWorkerLNFather.setBounds(25,273,150,25);
  txtWorkerLNFather.setBackground(new java.awt.Color(224,224,224));
  txtWorkerLNFather.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtWorkerLNFather.setForeground(new java.awt.Color(255,0,0));
  add(txtWorkerLNFather);

  labelLNMother = new JLabel("Mother's last name:");
  labelLNMother.setBounds(25,308,180,25);
  labelLNMother.setFont(new Font("Andale Mono", 1, 12));
  labelLNMother.setForeground(new Color(255,255,255));
  add(labelLNMother);

  txtWorkerLNMother = new JTextField();
  txtWorkerLNMother.setBounds(25,333,150,25);
  txtWorkerLNMother.setBackground(new java.awt.Color(224,224,224));
  txtWorkerLNMother.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtWorkerLNMother.setForeground(new java.awt.Color(255,0,0));
  add(txtWorkerLNMother);

  labelDepartment = new JLabel("Select department");
  labelDepartment.setBounds(220,188,180,25);
  labelDepartment.setFont(new Font("Andale Mono", 1, 12));
  labelDepartment.setForeground(new Color(255,255,255));
  add(labelDepartment);

  comboDepartment = new JComboBox();
  comboDepartment.setBounds(220,213,220,25);
  comboDepartment.setBackground(new java.awt.Color(224,224,224));
  comboDepartment.setFont(new java.awt.Font("Andale Mono", 1, 14));
  comboDepartment.setForeground(new java.awt.Color(255,0,0));
  add(comboDepartment);
  comboDepartment.addItem("");
  comboDepartment.addItem("Sales and customer service");
  comboDepartment.addItem("Logistic");
  comboDepartment.addItem("Managment");

  labelSeniority = new JLabel("Select years worked");
  labelSeniority.setBounds(220,248,180,25);
  labelSeniority.setFont(new Font("Andale Mono", 1, 12));
  labelSeniority.setForeground(new Color(255,255,255));
  add(labelSeniority);

  comboSeniority = new JComboBox();
  comboSeniority.setBounds(220,273,220,25);
  comboSeniority.setBackground(new java.awt.Color(224,224,224));
  comboSeniority.setFont(new java.awt.Font("Andale Mono", 1, 14));
  comboSeniority.setForeground(new java.awt.Color(255,0,0));
  add(comboSeniority);
  comboSeniority.addItem("");
  comboSeniority.addItem("1 year");
  comboSeniority.addItem("2 to 6 years");
  comboSeniority.addItem("More than 7 years");

  labelResult = new JLabel("Result:");
  labelResult.setBounds(220,307,180,25);
  labelResult.setFont(new Font("Andale Mono", 1, 12));
  labelResult.setForeground(new Color(255,255,255));
  add(labelResult);

  textarea1 = new JTextArea();
  textarea1.setEditable(false);
  textarea1.setBackground(new Color(224,224,224));
  textarea1.setFont(new Font("Andale Mono", 1, 11));
  textarea1.setForeground(new Color (255,0,0));
  textarea1.setText("\n  Here the result will be show.");
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(220,333,385,90);
  add(scrollpane1);

  labelfooter = new JLabel("© 2020 The Coca-Cola Company");
  labelfooter.setBounds(135,445,500,30);
  labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
  labelfooter.setForeground(new java.awt.Color(255,255,255));
  add(labelfooter);
 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == miCalculate){

   String nameW = txtWorkerName.getText();
   String LNF = txtWorkerLNFather.getText();
   String LNM = txtWorkerLNMother.getText();
   String Department = comboDepartment.getSelectedItem().toString();
   String Seniority = comboSeniority.getSelectedItem().toString();
   if(nameW.equals("") || LNF.equals("") || LNM.equals("") || Department.equals("") || Seniority.equals("")){
    JOptionPane.showMessageDialog(null, "Must fill ALL blanks.");
   }
   else{
    if(Department.equals("Sales and customer service")){
     if(Seniority.equals("1 year")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 6 days of vacation");
     }
     if(Seniority.equals("2 to 6 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 14 days of vacation");
     }
     if(Seniority.equals("More than 7 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 20 days of vacation");
     }
    }
    if(Department.equals("Logistic")){
     if(Seniority.equals("1 year")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 7 days of vacation");
     }
     if(Seniority.equals("2 to 6 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 15 days of vacation");
     }
     if(Seniority.equals("More than 7 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 22 days of vacation");
     }
    }
    if(Department.equals("Managment")){
     if(Seniority.equals("1 year")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 10 days of vacation");
     }
     if(Seniority.equals("2 to 6 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 20 days of vacation");
     }
     if(Seniority.equals("More than 7 years")){
      textarea1.setText("\n  The worker " + nameW + " " + LNF + " " + LNM + "\n  who works in " + Department + "\n  have 30 days of vacation");
     }
    }
   }
  }
  if(e.getSource() == miRed){
   getContentPane().setBackground(new Color(255,0,0));
  }
  if(e.getSource() == miBlack){
   getContentPane().setBackground(new Color(0,0,0));
  }
  if(e.getSource() == miPurple){
   getContentPane().setBackground(new Color(51,0,51));
  }
  if(e.getSource() == miNew){
   txtWorkerName.setText("");
   txtWorkerLNFather.setText("");
   txtWorkerLNMother.setText("");
   comboDepartment.setSelectedIndex(0);
   comboSeniority.setSelectedIndex(0);
   textarea1.setText("\n  Here the result will be show.");
  }
  if(e.getSource() == miExit){
   Welcome welcomewindow = new Welcome();
   welcomewindow.setBounds(0,0,350,450);
   welcomewindow.setVisible(true);
   welcomewindow.setResizable(false);
   welcomewindow.setLocationRelativeTo(null);
   this.setVisible(false);
  }
  if(e.getSource() == miCreator){
   JOptionPane.showMessageDialog(null,"Made by Anon");
  }
 }

 public static void main(String args[]){
  Main windowMain = new Main();
  windowMain.setBounds(0,0,640,535);
  windowMain.setVisible(true);
  windowMain.setResizable(false);
  windowMain.setLocationRelativeTo(null);
 }
}