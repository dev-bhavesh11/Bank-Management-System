package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTF, fnameTF, emailTF, addressTF, cityTF, pinTF, stateTF; 
    JRadioButton male, female, pns, married, unmarried, other; 
    JButton next;
    JDateChooser date;
    
    SignupOne() {
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel ("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("SansSerif",Font.BOLD,38));
        formno.setBounds(140,40,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel ("Page 1: PERSONAL DETAILS");
        personalDetails.setFont(new Font("SansSerif",Font.BOLD,22));
        personalDetails.setBounds(260,100,600,40);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:-");
        name.setFont(new Font("Serif",Font.BOLD,18));
        name.setBounds(100,160,200,40);
        add(name);
        
        nameTF = new JTextField();
        nameTF.setFont(new Font("Verdana",Font.BOLD,14));
        nameTF.setBounds(300,160,400,40);
        add(nameTF);
        
        JLabel fname = new JLabel("Father's Name:-");
        fname.setFont(new Font("Serif",Font.BOLD,18));
        fname.setBounds(100,210,200,40);
        add(fname);
        
        fnameTF = new JTextField();
        fnameTF.setFont(new Font("Verdana",Font.BOLD,14));
        fnameTF.setBounds(300,210,400,40);
        add(fnameTF);
        
        JLabel dob = new JLabel("Date of Birth:-");
        dob.setFont(new Font("Serif",Font.BOLD,18));
        dob.setBounds(100,260,200,40);
        add(dob);
        
        date = new JDateChooser();
        date.setBounds(300,260,400,40);
        date.setForeground(new Color(105,105,105));
        add(date);
        
        JLabel gender = new JLabel("Gender:-");
        gender.setFont(new Font("Serif",Font.BOLD,18));
        gender.setBounds(100,310,200,40);
        add(gender);
        
        male = new JRadioButton("male");
        male.setBackground(Color.white);
        male.setBounds(300,310,100,40);
        add(male);
        
        female = new JRadioButton("female");
        female.setBackground(Color.white);
        female.setBounds(430,310,100,40);
        add(female);
        
        pns = new JRadioButton("Prefer Not Say");
        pns.setBackground(Color.white);
        pns.setBounds(560,310,150,40);
        add(pns);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(pns);
        
        JLabel email = new JLabel("Email Address:-");
        email.setFont(new Font("Serif",Font.BOLD,18));
        email.setBounds(100,360,200,40);
        add(email);
        
        emailTF = new JTextField();
        emailTF.setFont(new Font("Verdana",Font.BOLD,14));
        emailTF.setBounds(300,360,400,40);
        add(emailTF);
        
        JLabel ms = new JLabel("Marital Status:-");
        ms.setFont(new Font("Serif",Font.BOLD,18));
        ms.setBounds(100,410,200,40);
        add(ms);
        
        married = new JRadioButton("Married");
        married.setBackground(Color.white);
        married.setBounds(300,410,100,40);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.white);
        unmarried.setBounds(430,410,100,40);
        add(unmarried);
        
        other = new JRadioButton("Divorced");
        other.setBackground(Color.white);
        other.setBounds(560,410,150,40);
        add(other);
        
        ButtonGroup msgroup = new ButtonGroup();
        msgroup.add(married);
        msgroup.add(unmarried);
        msgroup.add(other);

        
        JLabel address = new JLabel("Address:-");
        address.setFont(new Font("Serif",Font.BOLD,18));
        address.setBounds(100,460,200,40);
        add(address);
        
        addressTF = new JTextField();
        addressTF.setFont(new Font("Verdana",Font.BOLD,14));
        addressTF.setBounds(300,460,400,40);
        add(addressTF);
        
        JLabel city = new JLabel("City:-");
        city.setFont(new Font("Serif",Font.BOLD,18));
        city.setBounds(100,510,200,40);
        add(city);
        
        cityTF = new JTextField();
        cityTF.setFont(new Font("Verdana",Font.BOLD,14));
        cityTF.setBounds(300,510,400,40);
        add(cityTF);
        
        JLabel pincode = new JLabel("Pin Code:-");
        pincode.setFont(new Font("Serif",Font.BOLD,18));
        pincode.setBounds(100,560,200,40);
        add(pincode);
        
        pinTF = new JTextField();
        pinTF.setFont(new Font("Verdana",Font.BOLD,14));
        pinTF.setBounds(300,560,400,40);
        add(pinTF);
        
        JLabel state = new JLabel("State:-");
        state.setFont(new Font("Serif",Font.BOLD,18));
        state.setBounds(100,610,200,40);
        add(state);
        
        stateTF = new JTextField();
        stateTF.setFont(new Font("Verdana",Font.BOLD,14));
        stateTF.setBounds(300,610,400,40);
        add(stateTF);
        
        next = new JButton("Next");
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.setFont(new Font("SansSerif",Font.BOLD,14));
        next.setBounds(600,680,100,40);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTF.getText();
        String fname = fnameTF.getText();
        String dob = ((JTextField)date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        else if(pns.isSelected()){
            gender = "Other";
        }
        String email = emailTF.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Divorced";
        }
        String address = addressTF.getText();
        String city = cityTF.getText();
        String pin = pinTF.getText();
        String state = stateTF.getText();
        
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required!");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"') ";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
    
}
