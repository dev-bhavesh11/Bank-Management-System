package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTF, aadharTF; 
    JRadioButton eyes, eno, syes, sno; 
    JButton next;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno) {
        
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
                
        JLabel additionalDetails = new JLabel ("Page 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("SansSerif",Font.BOLD,22));
        additionalDetails.setBounds(260,60,600,40);
        add(additionalDetails);
        
        JLabel rel = new JLabel("Religion:-");
        rel.setFont(new Font("Serif",Font.BOLD,18));
        rel.setBounds(100,160,200,40);
        add(rel);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,160,400,40);
        add(religion);
        
       
        JLabel cat = new JLabel("Category:-");
        cat.setFont(new Font("Serif",Font.BOLD,18));
        cat.setBounds(100,210,200,40);
        add(cat);
        
        
        String valCategory[] = {"General", "OBC", "SC", "ST"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,210,400,40);
        add(category);
        

        JLabel inc = new JLabel("Income:-");
        inc.setFont(new Font("Serif",Font.BOLD,18));
        inc.setBounds(100,260,200,40);
        add(inc);
        
        String valincome[] = {"Null", "<1,00,000", "<2,50,000","<5,00,000","upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBackground(Color.WHITE);
        income.setBounds(300,260,400,40);
        add(income);
        
        
        JLabel edc = new JLabel("Educational");
        edc.setFont(new Font("Serif",Font.BOLD,18));
        edc.setBounds(100,310,200,40);
        add(edc);
          
        JLabel qua = new JLabel("Qualification:-");
        qua.setFont(new Font("Serif",Font.BOLD,18));
        qua.setBounds(100,330,200,40);
        add(qua);
        
        String educationvalues[] = {"Non-Graduate", "Graduate", "Post-Graduation","Metric","Diploma"};
        education = new JComboBox(educationvalues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,310,400,40);
        add(education);
        
        JLabel occ = new JLabel("Occupation:-");
        occ.setFont(new Font("Serif",Font.BOLD,18));
        occ.setBounds(100,360,200,40);
        add(occ);
        
        String valoccupation[] = {"Student", "Unemployed", "Self-Employed","Business","Salaried","Retired","Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,360,400,40);
        add(occupation);        
        
        JLabel pan = new JLabel("PAN Number:-");
        pan.setFont(new Font("Serif",Font.BOLD,18));
        pan.setBounds(100,410,200,40);
        add(pan);
        
        panTF = new JTextField();
        panTF.setFont(new Font("Verdana",Font.BOLD,14));
        panTF.setBounds(300,410,400,40);
        add(panTF);
        
        JLabel aad = new JLabel("Aadhar Number:-");
        aad.setFont(new Font("Serif",Font.BOLD,18));
        aad.setBounds(100,460,200,40);
        add(aad);
        
        aadharTF = new JTextField();
        aadharTF.setFont(new Font("Verdana",Font.BOLD,14));
        aadharTF.setBounds(300,460,400,40);
        add(aadharTF);
         
        JLabel sc = new JLabel("Senior Citizen:-");
        sc.setFont(new Font("Serif",Font.BOLD,18));
        sc.setBounds(100,510,200,40);
        add(sc);
        
        syes = new JRadioButton("YES");
        syes.setBackground(Color.white);
        syes.setBounds(300,510,100,40);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBackground(Color.white);
        sno.setBounds(430,510,100,40);
        add(sno);
        
        ButtonGroup scgroup = new ButtonGroup();
        scgroup.add(syes);
        scgroup.add(sno);
        
        
        JLabel ea = new JLabel("Exisiting Account:-");
        ea.setFont(new Font("Serif",Font.BOLD,18));
        ea.setBounds(100,560,200,40);
        add(ea);
        
        eyes = new JRadioButton("YES");
        eyes.setBackground(Color.white);
        eyes.setBounds(300,560,100,40);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBackground(Color.white);
        eno.setBounds(430,560,100,40);
        add(eno);
        
        ButtonGroup eagroup = new ButtonGroup();
        eagroup.add(eyes);
        eagroup.add(eno);
        
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
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome =   (String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String pan = panTF.getText();
        String aadhar = aadharTF.getText();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String exisitingacc = null;
        if(eyes.isSelected()){
            exisitingacc = "Yes";
        }
        else if(eno.isSelected()){
            exisitingacc = "No";
        }
        
 
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+exisitingacc+"') ";
                c.s.executeUpdate(query);
                
                //signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
    
}
