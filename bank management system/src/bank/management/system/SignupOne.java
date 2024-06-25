package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, genderTextField, emailTextField, maritalTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, othe;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        setTitle("APPLICATION FORM PAGE: 1");
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setForeground(new Color(0, 128, 128));
        formno.setBounds(140,20, 600,40);
        add(formno);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icon/2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(850, 750, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel background = new JLabel(i6);
        background.setBounds(0 , 0, 850, 750);
        add(background);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290,80,400,30);
        personDetails.setForeground(new Color(199, 21, 133));
        background.add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        background.add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raileway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        background.add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        background.add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raileway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        background.add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        background.add(dob);
        
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        background.add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        background.add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 120, 30);
        male.setOpaque(false);
        male.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
//        female.setBackground(Color.WHITE);
        female.setOpaque(false);
        female.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(female);

        other = new JRadioButton("Other");
        other.setBounds(625, 290, 120, 30);
        other.setOpaque(false);
        other.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        background.add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raileway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        background.add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        background.add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setOpaque(false);
        married.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 150, 30);
        unmarried.setOpaque(false);
        unmarried.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(unmarried);
        
        othe = new JRadioButton("Other");
        othe.setBounds(625, 390, 100, 30);
        othe.setOpaque(false);
        othe.setFont(new Font("Raleway", Font.BOLD, 20));
        background.add(othe);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(othe);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        background.add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raileway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        background.add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        background.add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raileway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        background.add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        background.add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raileway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        background.add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        background.add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raileway",Font.BOLD,14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        background.add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(new Color(51, 153, 255));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(610, 640, 90, 30);
        next.addActionListener(this);
        background.add(next);
        
//        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        }else if(female.isSelected()) {
            gender = "Female";
        }else if(other.isSelected()) {
            gender = "Other";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(othe.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father Name is Required");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pin Code is Required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String args[]){

        new SignupOne();
    }

}
