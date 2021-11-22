import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class License extends JFrame  implements ActionListener, ChangeListener{

 private JLabel label1, label2;
 private JCheckBox check1;
 private JButton button1, button2;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 String name = "";

 public License(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("License");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Welcome windowWelcome = new Welcome();
  name = windowWelcome.text;

  label1 = new JLabel("TERMS AND CONDITIONS");
  label1.setBounds(215,5,200,30);
  label1.setFont(new Font("Andale Mono", 1, 14));
  label1.setForeground(new Color(0,0,0));
  add(label1);

  textarea1 = new JTextArea();
  textarea1.setEditable(false);
  textarea1.setFont(new Font("Andale Mono", 0, 9));
  textarea1.setText("\n          Terms and Conditions\n\nNo reclamar.");
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,40,575,200);
  add(scrollpane1);

  check1 = new JCheckBox("I, " + name + ", agree");
  check1.setBounds(10,250,300,30);
  check1.addChangeListener(this);
  add(check1);

  button1 = new JButton("Continue");
  button1.setBounds(10,290,100,30);
  button1.addActionListener(this);
  button1.setEnabled(false);
  add(button1);

  button2 = new JButton("Disagree");
  button2.setBounds(120,290,100,30);
  button2.addActionListener(this);
  button2.setEnabled(true);
  add(button2);

  ImageIcon image = new ImageIcon("images/coca-cola.png");
  label2 = new JLabel(image);
  label2.setBounds(315,135,300,300);
  add(label2);
 }

 public void stateChanged(ChangeEvent e){
  if(check1.isSelected() == true){
   button1.setEnabled(true);
   button2.setEnabled(false);
  }
  else{
   button1.setEnabled(false);
   button2.setEnabled(true);
  }
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == button1){
   Main windowMain = new Main();
   windowMain.setBounds(0,0,640,535);
   windowMain.setVisible(true);
   windowMain.setResizable(false);
   windowMain.setLocationRelativeTo(null);
   this.setVisible(false);
  }
  else if(e.getSource() == button2){
   Welcome welcomewindow = new Welcome();
   welcomewindow.setBounds(0,0,350,450);
   welcomewindow.setVisible(true);
   welcomewindow.setResizable(false);
   welcomewindow.setLocationRelativeTo(null);
   this.setVisible(false);
  }
 }

 public static void main(String args[]){
  License windowlicense = new License();
  windowlicense.setBounds(0,0,600,360);
  windowlicense.setVisible(true);
  windowlicense.setResizable(false);
  windowlicense.setLocationRelativeTo(null);

 }
}