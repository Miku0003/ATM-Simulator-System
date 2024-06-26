package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 850, 800);
        add(label);
        
        
        JLabel additionalDetails = new JLabel("Page 2: Addtional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
        additionalDetails.setForeground(new Color(199, 21, 133));
        additionalDetails.setBounds(270,50,400,40);
        label.add(additionalDetails);
        
        JLabel religion1 = new JLabel("Religion:");
        religion1.setFont(new Font("Raleway", Font.BOLD, 20));
        religion1.setBounds(100,140,100,30);
        label.add(religion1);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        label.add(religion);
        
        JLabel category1 = new JLabel("Category:");
        category1.setFont(new Font("Raleway", Font.BOLD, 20));
        category1.setBounds(100,190,200,30);
        label.add(category1);
        
        String valCategory[] = {"General", "OBC", "EBC",  "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        label.add(category);
                
        JLabel income1 = new JLabel("Income:");
        income1.setFont(new Font("Raleway", Font.BOLD, 20));
        income1.setBounds(100,240,200,30);
        label.add(income1);
        
        String catIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(catIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        label.add(income);
                
        JLabel education1 = new JLabel("Educational");
        education1.setFont(new Font("Raleway", Font.BOLD, 20));
        education1.setBounds(100,290,200,30);
        label.add(education1);
               
        
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,312,200,30);
        label.add(qualification);
        
        String educationValues[] = {"Under-Graduate", "Graduate", "Post-Graduate", "Inter", "Matric", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 295, 400, 30);
        education.setBackground(Color.WHITE);
        label.add(education);
        
        JLabel occupation1 = new JLabel("Occupation:");
        occupation1.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation1.setBounds(100,350,200,30);
        label.add(occupation1);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Farmer", "HouseWife", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 350, 400, 30);
        occupation.setBackground(Color.WHITE);
        label.add(occupation);
        
        
        JLabel pan1 = new JLabel("PAN Number:");
        pan1.setFont(new Font("Raleway", Font.BOLD, 20));
        pan1.setBounds(100,400,200,30);
        label.add(pan1);
        
        pan = new JTextField();
        pan.setFont(new Font("Raileway",Font.BOLD,14));
        pan.setBounds(300, 400, 400, 30);
        label.add(pan);
        
        JLabel aadhar1 = new JLabel("Aadhar Number:");
        aadhar1.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar1.setBounds(100,455,200,30);
        label.add(aadhar1);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raileway",Font.BOLD,14));
        aadhar.setBounds(300, 455, 400, 30);
        label.add(aadhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100,510,200,30);
        label.add(seniorcitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 510, 100, 30);
        syes.setOpaque(false);
        syes.setFont(new Font("Raleway", Font.BOLD, 20));
        label.add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 510, 100, 30);
        sno.setOpaque(false);
        sno.setFont(new Font("Raleway", Font.BOLD, 20));
        label.add(sno);
        
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);

        JLabel exisitingaccount = new JLabel("Exisiting Account:");
        exisitingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exisitingaccount.setBounds(100,555,200,30);
        label.add(exisitingaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 555, 100, 30);
        eyes.setOpaque(false);
        eyes.setFont(new Font("Raleway", Font.BOLD, 20));
        label.add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 555, 100, 30);
        eno.setOpaque(false);
        eno.setFont(new Font("Raleway", Font.BOLD, 20));
        label.add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
                
        next = new JButton("Next");
        next.setBackground(new Color(51, 153, 255));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(610, 610, 90, 30);
        next.addActionListener(this);
        label.add(next);
        
//        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen = "Yes";
        }else if(sno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String exisitingaccount = null;
        if(eyes.isSelected()) {
            exisitingaccount = "Yes";
        }else if(eno.isSelected()){
            exisitingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        
        try{
            
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";
                c.s.executeUpdate(query);
                
                //SignupThree Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);            
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        new SignupTwo("");
    }

}
