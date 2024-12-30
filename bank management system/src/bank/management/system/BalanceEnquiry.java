
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class BalanceEnquiry extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    
    BalanceEnquiry(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,1180,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,960,1080);
        add(image);
        
        l1 = new JLabel();
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(190, 350, 400, 35);
        image.add(l1);
        
        b1 = new JButton("BACK");
        b1.setBounds(390,633,150,35);
        b1.addActionListener(this);
        image.add(b1);
        int balance = 0;
        try
        {
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next())
            {
                if(rs.getString("type").equals("Deposite"))
                {
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else 
                {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        l1.setText("Your Current Account Balance is RS. " + balance);
        
        setLayout(null);
        setSize(960,1080);
        setUndecorated(true);
        setLocation(500,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }
    public static void main(String[] args)
    {
        new BalanceEnquiry("").setVisible(true);
    }
    
}
