package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton signin, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField; 
    
    Login(){ 
        
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
         Image i2 = i1.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel label = new JLabel(i3);
         label.setBounds(120,30,50,50);
         add(label);
         
         JLabel text = new JLabel("Welcome to ATM");
         text.setFont(new Font("SansSerif",Font.BOLD,38));
         text.setBounds(200,30,400,50);
         add(text);
         
         JLabel cardno = new JLabel("Card No");
         cardno.setFont(new Font("Serif",Font.BOLD,25));
         cardno.setBounds(120,120,150,50);
         add(cardno);
         
         cardTextField = new JTextField();
         cardTextField.setBounds(300,120,250,40);
         cardTextField.setFont(new Font("Verdana",Font.BOLD,15));
         add(cardTextField);

         JLabel pin = new JLabel("PIN");
         pin.setFont(new Font("Serif",Font.BOLD,25));
         pin.setBounds(120,180,150,50);
         add(pin);
         
         pinTextField = new JPasswordField();
         pinTextField.setBounds(300,180,250,40);
         pinTextField.setFont(new Font("Verdana",Font.BOLD,15));
         add(pinTextField);
         
         signin = new JButton ("SIGN IN");
         signin.setBounds(300,300,120,30);
         signin.setBackground(Color.BLACK);
         signin.setForeground(Color.WHITE);
         signin.setFont(new Font("SansSerif",Font.BOLD,14));
         signin.addActionListener(this);
         add(signin);
         
         clear = new JButton ("CLEAR");
         clear.setBounds(430,300,120,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.setFont(new Font("SansSerif",Font.BOLD,14));
         clear.addActionListener(this);
         add(clear);
         
         signup = new JButton ("SIGN UP");
         signup.setBounds(300,350,250,30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.setFont(new Font("SansSerif",Font.BOLD,14));
         signup.addActionListener(this);
         add(signup);
         

         
         getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == signin){
                Conn conn = new Conn();
                String cardnumber = cardTextField.getText();
                String pinnumber = pinTextField.getText();
                String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
                try{
                    ResultSet rs = conn.s.executeQuery(query);
                    if(rs.next()){
                        setVisible(false);
                        new Transactions(pinnumber).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Incorrect Card Number of Pin");
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
    
}
