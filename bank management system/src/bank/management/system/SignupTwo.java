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
    
    public static void main(String args[]){
        new SignupTwo("");
    }
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Addtional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion1 = new JLabel("Religion:");
        religion1.setFont(new Font("Raleway", Font.BOLD, 20));
        religion1.setBounds(100,140,100,30);
        add(religion1);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel category1 = new JLabel("Category:");
        category1.setFont(new Font("Raleway", Font.BOLD, 20));
        category1.setBounds(100,190,200,30);
        add(category1);
        
        String valCategory[] = {"General", "OBC", "EBC",  "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
                
        JLabel income1 = new JLabel("Income:");
        income1.setFont(new Font("Raleway", Font.BOLD, 20));
        income1.setBounds(100,240,200,30);
        add(income1);
        
        String catIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(catIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
                
        JLabel education1 = new JLabel("Educational");
        education1.setFont(new Font("Raleway", Font.BOLD, 20));
        education1.setBounds(100,290,200,30);
        add(education1);
               
        
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,312,200,30);
        add(qualification);
        
        String educationValues[] = {"Under-Graduate", "Graduate", "Post-Graduate", "Inter", "Matric", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 295, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel occupation1 = new JLabel("Occupation:");
        occupation1.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation1.setBounds(100,350,200,30);
        add(occupation1);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Farmer", "HouseWife", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 350, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel pan1 = new JLabel("PAN Number:");
        pan1.setFont(new Font("Raleway", Font.BOLD, 20));
        pan1.setBounds(100,400,200,30);
        add(pan1);
        
        pan = new JTextField();
        pan.setFont(new Font("Raileway",Font.BOLD,14));
        pan.setBounds(300, 400, 400, 30);
        add(pan);
        
        JLabel aadhar1 = new JLabel("Aadhar Number:");
        aadhar1.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar1.setBounds(100,455,200,30);
        add(aadhar1);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raileway",Font.BOLD,14));
        aadhar.setBounds(300, 455, 400, 30);
        add(aadhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100,510,200,30);
        add(seniorcitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 510, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 510, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);

        JLabel exisitingaccount = new JLabel("Exisiting Account:");
        exisitingaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exisitingaccount.setBounds(100,555,200,30);
        add(exisitingaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 555, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 555, 400, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
                
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 610, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
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
    }
}
