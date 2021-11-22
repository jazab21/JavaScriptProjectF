import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{

 private JTextField textfield1;
 private JLabel label1, label2, label3, label4;
 private JButton button1;
 public static String text = "";

 public Welcome(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Welcome");
  getContentPane().setBackground(new Color(255,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  ImageIcon image1 = new ImageIcon("images/logo-coca.png");
  label1 = new JLabel(image1);
  label1.setBounds(25,15,300,150);
  add(label1);

  label2 = new JLabel("Vacation Control System");
  label2.setBounds(35,135,300,30);
  label2.setFont(new Font("Andale Mono", 3, 18));
  label2.setForeground(new Color(255,255,255));
  add(label2);

  label3 = new JLabel("Insert Name");
  label3.setBounds(45,212,200,30);
  label3.setFont(new Font("Andale Mono", 1, 12));
  label3.setForeground(new Color(255,255,255));
  add(label3);

  label4 = new JLabel("© 2020 The Coca-Cola Company");
  label4.setBounds(85,375,300,30);
  label4.setFont(new Font("Andale Mono", 1, 12));
  label4.setForeground(new Color(255,255,255));
  add(label4);

  textfield1 = new JTextField();
  textfield1.setBounds(45,240,255,25);
  textfield1.setBackground(new Color(224,224,224));
  textfield1.setFont(new Font("Andale Mono", 1, 14));
  textfield1.setForeground(new Color(255,0,0));
  add(textfield1);

  button1 = new JButton("Log in");
  button1.setBounds(125,280,100,30);
  button1.setBackground(new Color(255,255,255));
  button1.setFont(new Font("Andale Mono", 1, 14));
  button1.setForeground(new Color(255,0,0));
  button1.addActionListener(this);
  add(button1);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == button1){ 
   text = textfield1.getText().trim();
   if(text.equals("")){
    JOptionPane.showMessageDialog(null, "Insert your name.");
   }
   else{
    License windowlicense = new License();
    windowlicense.setBounds(0,0,600,360);
    windowlicense.setVisible(true);
    windowlicense.setResizable(false);
    windowlicense.setLocationRelativeTo(null);
    this.setVisible(false);
   }
  }
 }

 public static void main(String args[]){
  Welcome welcomewindow = new Welcome();
  welcomewindow.setBounds(0,0,350,450);
  welcomewindow.setVisible(true);
  welcomewindow.setResizable(false);
  welcomewindow.setLocationRelativeTo(null);
 }
}