
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JLabel t1,t2,t3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    
    
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        t1 = new JLabel("Welcome to ATM");
        t1.setFont(new Font("Owsward",Font.BOLD,38));
        t1.setBounds(200, 40, 450, 40);
        add(t1);
        
        t2 = new JLabel("Card No:");
        t2.setFont(new Font("Raleway",Font.BOLD,28));
        t2.setBounds(125, 150, 375, 30);
        add(t2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        add(tf1);
        
        t3 = new JLabel("PIN:");
        t3.setFont(new Font("Raleway",Font.BOLD,28));
        t3.setBounds(125, 220, 375, 30);
        add(t3);
        
        pf2 = new JPasswordField(15);
        pf2.setBounds(300,220,230,30);
        pf2.setFont(new Font("Arial",Font.BOLD,14));
        add(pf2);
        
        b1 = new JButton("SIGN IN");
        b1.setBounds(300,300,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial",Font.BOLD,14));
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(430,300,100,30);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(300,350 , 230, 30);
        add(b3);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            if(ae.getSource() == b1)
            {
                Conn c1 = new Conn();
                String cardno = tf1.getText();
                String pin = pf2.getText();
                String q = "SELECT * FROM login WHERE cardno = '"+cardno+"' AND pin = '"+pin+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next())
                {
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                
                
                
            }
            
            else if(ae.getSource() == b2)
           {
               tf1.setText("");
               pf2.setText("");
           }
           else if(ae.getSource() == b3)
           {
               setVisible(false);
               new Signup().setVisible(true);
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new Login().setVisible(true);
    }
    
}
