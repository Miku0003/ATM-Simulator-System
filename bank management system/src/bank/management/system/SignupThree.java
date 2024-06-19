package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton saccount, fdaccount, caccount, rdaccount;
    JCheckBox atmservice, ibservice, mbservice, alertservice, chequeservice, statementservice, declare;
    JButton submit, cancel;
    
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 100, 200, 30);
        add(type);
        
        saccount = new JRadioButton("Saving Account");
        saccount.setFont(new Font("Raleway", Font.BOLD, 16));
        saccount.setBackground(Color.WHITE);
        saccount.setBounds(100, 140, 200, 20);
        add(saccount);
        
        fdaccount = new JRadioButton("Fixed Deposit Account");
        fdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        fdaccount.setBackground(Color.WHITE);
        fdaccount.setBounds(350, 140, 235, 20);
        add(fdaccount);
        
        caccount = new JRadioButton("Current Account");
        caccount.setFont(new Font("Raleway", Font.BOLD, 16));
        caccount.setBackground(Color.WHITE);
        caccount.setBounds(100, 180, 200, 20);
        add(caccount);
        
        rdaccount = new JRadioButton("Recurring Deposit Account");
        rdaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        rdaccount.setBackground(Color.WHITE);
        rdaccount.setBounds(350, 180, 235, 20);
        add(rdaccount);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(saccount);
        groupaccount.add(fdaccount);
        groupaccount.add(caccount);
        groupaccount.add(rdaccount);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 230, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-6798");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 230, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 255, 300, 20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 300, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 300, 300, 30);
        add(pnumber);
        
        JLabel pindetails = new JLabel("Your 4 Digit PIN");
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100, 325, 300, 20);
        add(pindetails);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 380, 200, 30);
        add(services);
        
        atmservice = new JCheckBox("ATM CARD");
        atmservice.setBackground(Color.WHITE);
        atmservice.setFont(new Font("Raleway", Font.BOLD, 16));
        atmservice.setBounds(100, 430, 200, 30);
        add(atmservice);
        
        ibservice = new JCheckBox("Internet Banking");
        ibservice.setBackground(Color.WHITE);
        ibservice.setFont(new Font("Raleway", Font.BOLD, 16));
        ibservice.setBounds(350, 430, 200, 30);
        add(ibservice);
        
        mbservice = new JCheckBox("Mobile Banking");
        mbservice.setBackground(Color.WHITE);
        mbservice.setFont(new Font("Raleway", Font.BOLD, 16));
        mbservice.setBounds(100, 480, 200, 30);
        add(mbservice);
        
        alertservice = new JCheckBox("E-mail & SMS Alerts");
        alertservice.setBackground(Color.WHITE);
        alertservice.setFont(new Font("Raleway", Font.BOLD, 16));
        alertservice.setBounds(350, 480, 200, 30);
        add(alertservice);
        
        chequeservice = new JCheckBox("Cheque Book");
        chequeservice.setBackground(Color.WHITE);
        chequeservice.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeservice.setBounds(100, 530, 200, 30);
        add(chequeservice);
        
        statementservice = new JCheckBox("E-Statement");
        statementservice.setBackground(Color.WHITE);
        statementservice.setFont(new Font("Raleway", Font.BOLD, 16));
        statementservice.setBounds(350, 530, 200, 30);
        add(statementservice);
        
        declare = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        declare.setBackground(Color.WHITE);
        declare.setFont(new Font("Raleway", Font.BOLD, 12));
        declare.setBounds(100, 600, 600, 30);
        add(declare);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(200, 650, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancle");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(400, 650, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(saccount.isSelected()) {
                accountType = "Saving Account";
            } else if(fdaccount.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if(caccount.isSelected()) {
                accountType = "Current Account";
            } else if(rdaccount.isSelected()) {
                accountType = "Reccuring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(atmservice.isSelected()) {
                facility = facility + "ATM Card";
            } else if(ibservice.isSelected()) {
                facility = facility + "Internet Banking";
            } else if(mbservice.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if(alertservice.isSelected()) {
                facility = facility + "E-mail & SMS alerts";
            } else if(chequeservice.isSelected()) {
                facility = facility + "Cheque Book";
            } else if(statementservice.isSelected()) {
                facility = facility + "E-Statement";
            } 
            
            try{
//                if(accountType.equals("")) {
//                    JOptionPane.showMessageDialog(null, "Account Type is Required");
//                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\n PIN: "+pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
//                }
            } catch (Exception e) {
                System.out.println(e);
            }
            
        } else if(ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
