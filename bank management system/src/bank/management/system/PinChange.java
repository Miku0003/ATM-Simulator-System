package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {
    
    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;
        
    PinChange(String pinnumber) {
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(830, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 830, 830);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 20));
        text.setBounds(220, 260, 500, 35);
        image.add(text);
        
        JLabel pintext = new JLabel("Enter New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 18));
        pintext.setBounds(150, 310, 180, 25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(320, 305, 150, 25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD, 18));
        repintext.setBounds(150, 350, 180, 25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(320, 350, 150, 25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(320, 440, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(320, 475, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(830,830);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();

                if(!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match.");
                    return;
                }
                
                if(npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter new PIN.");
                    return;
                }
                
                if(rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN.");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"'where pin = '"+pinnumber+"'";
                String query2 = "update login set pin = '"+rpin+"'where pin = '"+pinnumber+"'";
                String query3 = "update signupthree set pin = '"+rpin+"'where pin = '"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN Changed Successfully.");
                
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                
            } catch(Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new PinChange("").setVisible(true);
    }
}
