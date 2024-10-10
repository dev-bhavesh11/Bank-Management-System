
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: ACCOUNT DETAILS");
        l1.setFont(new Font("SansSerif",Font.BOLD,22));
        l1.setBounds(260,60,600,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type:- ");
        type.setFont(new Font("Serif",Font.BOLD,18));
        type.setBounds(100,160,200,40);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Serif",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,210,200,40);
        add(r1);
        
        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Serif",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(320,210,200,40);
        add(r2);
        
        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Serif",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,260,200,40);
        add(r3);
        
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Serif",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(320,260,200,40);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4); 
        
        JLabel card = new JLabel("Card Number:- ");
        card.setFont(new Font("Serif",Font.BOLD,18));
        card.setBounds(100,310,200,40);
        add(card);
        
        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-4894");
        cnumber.setFont(new Font("Serif",Font.BOLD,18));
        cnumber.setBounds(300,310,220,40);
        add(cnumber);
        
        JLabel details = new JLabel("This is your 16 digits card number");
        details.setFont(new Font("Serif",Font.BOLD,12));
        details.setBounds(100,340,200,20);
        add(details);
        
        JLabel pin = new JLabel("PIN:- ");
        pin.setFont(new Font("Serif",Font.BOLD,18));
        pin.setBounds(100,370,200,40);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Serif",Font.BOLD,18));
        pnumber.setBounds(300,370,220,40);
        add(pnumber);
        
        JLabel pdetails = new JLabel("This is your 4 digit pin");
        pdetails.setFont(new Font("Serif",Font.BOLD,12));
        pdetails.setBounds(100,400,200,20);
        add(pdetails);
        
        JLabel services = new JLabel("Services Required:- ");
        services.setFont(new Font("Serif",Font.BOLD,18));
        services.setBounds(100,430,200,40);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Serif",Font.BOLD,16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,480,100,40);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Serif",Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(320,480,200,40);
        add(c2);
        
        c3 = new JCheckBox("Mobile  Banking");
        c3.setFont(new Font("Serif",Font.BOLD,16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,530,200,40);
        add(c3);
        
        c4 = new JCheckBox("Cheque Book");
        c4.setFont(new Font("Serif",Font.BOLD,16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(320,530,200,40);
        add(c4);
        
        c5 = new JCheckBox("Email & SMS Alerts");
        c5.setFont(new Font("Serif",Font.BOLD,16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,580,200,40);
        add(c5);
        
        c6 = new JCheckBox("E-statement");
        c6.setFont(new Font("Serif",Font.BOLD,16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(320,580,200,40);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Serif",Font.BOLD,16));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,660,700,40);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("SansSerif",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setFont(new Font("SansSerif",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account" ;
            }
            else if(r2.isSelected()){
                accountType = "Current Account";
            }
            else if(r3.isSelected()){
                accountType = "Fixed Deposit Account";
            }
            else if(r4.isSelected()){
                accountType = "Recurring Account";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pin = "" + Math.abs((random.nextLong()%9000L) + 1000L);
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + " Cheque Book";
            }
            else if(c5.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }
            else if(c6.isSelected()){
                facility = facility + " E-statement";
            }
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is required");
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pin+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
                    
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\nPIN: " + pin);
                    
                    setVisible(false);
                    new Deposit(pin).setVisible(false);
                    
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
