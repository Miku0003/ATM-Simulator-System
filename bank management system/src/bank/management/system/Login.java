package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup , clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/blogo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(80, 10, 100, 100);
        add(label);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpg"));
        Image i5 = i4.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel background = new JLabel(i6);
        background.setBounds(0 , 0, 800, 480);
        add(background);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 35));
        text.setBounds(200, 40, 400, 40);
//        text.setForeground(new Color(0, 128, 128));
        background.add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 30));
        cardno.setBounds(120, 150, 150, 30);
        background.add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        background.add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(120, 220, 400, 40);
        background.add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        background.add(pinTextField);
        
        login =new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(new Color(51, 153, 255));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        background.add(login);
        
        clear =new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(new Color(255, 102, 102));
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        background.add(clear);
        
        signup =new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(new Color(51, 153, 255));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        background.add(signup);
        
//        Color c1 = new Color(8, 27, 41);
//        getContentPane().setBackground(Color.WHITE);
        
        setSize(700,480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card Number or PIN");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
                 
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}