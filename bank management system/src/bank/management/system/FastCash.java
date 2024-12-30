
package bank.management.system;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener

{
    JLabel t1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,960,1080);
        add(image);
        
        t1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        t1.setBounds(220,300,700,30);
        t1.setForeground(Color.white);
        t1.setFont(new Font("System",Font.BOLD,16));
        image.add(t1);
        
        b1 = new JButton("100");
        b1.setBounds(170,499,150,35);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("500");
        b2.setBounds(390,499,150,35);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("1000");
        b3.setBounds(170,543,150,35);
        add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("2000");
        b4.setBounds(390,543,150,35);
        add(b4);
        b4.addActionListener(this);
        
        b5 = new JButton("5000");
        b5.setBounds(170,588,150,35);
        add(b5);
        b5.addActionListener(this);
        
        b6 = new JButton("10000");
        b6.setBounds(390,588,150,35);
        add(b6);
        b6.addActionListener(this);
        
        b7 = new JButton("BACK");
        b7.setBounds(390,633,150,35);
        add(b7);
        b7.addActionListener(this);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(960,1080);
        setLocation(500,0);
        //setUndecorated(true);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ev)
    {
        try
        {
            String amount = ((JButton)ev.getSource()).getText();
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pin+"'");
            int balance = 0;
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
            if(ev.getSource() != b7 && balance < Integer.parseInt(amount)) // balance is less then the user want's to withdrwl 
            {
                JOptionPane.showMessageDialog(null,"Insuffient Balance");
                return;
            }
            if(ev.getSource() == b7)
            {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
            else
            {
                Date date = new Date();
                c1.s.executeUpdate("INSERT INTO bank VALUES('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited SuccessFully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Erroe." + e);
        }
        
    }
    public static void main(String[] args)
    {
        new FastCash("").setVisible(true);
    }
    
}
