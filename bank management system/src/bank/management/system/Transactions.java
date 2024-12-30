
package bank.management.system;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class Transactions extends JFrame implements ActionListener

{
    JLabel t1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Transactions(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,960,1080);
        add(image);
        
        t1 = new JLabel("Please Select Your Transaction");
        t1.setBounds(220,300,700,30);
        t1.setForeground(Color.white);
        t1.setFont(new Font("System",Font.BOLD,16));
        image.add(t1);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(170,499,150,35);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(390,499,150,35);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("FAST CASH");
        b3.setBounds(170,543,150,35);
        add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(390,543,150,35);
        add(b4);
        b4.addActionListener(this);
        
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(170,588,150,35);
        add(b5);
        b5.addActionListener(this);
        
        b6 = new JButton("BAKANCE ENQUIRY");
        b6.setBounds(390,588,150,35);
        add(b6);
        b6.addActionListener(this);
        
        b7 = new JButton("EXIT");
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
        if(ev.getSource()==b1)
        {
            setVisible(false);
            new Deposite(pin).setVisible(true);
        }
        else if(ev.getSource() == b2)
        {
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }
        else if(ev.getSource() == b3)
        {
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        else if(ev.getSource() == b4)
        {
            setVisible(false);
            new Ministatement(pin).setVisible(true);
        }
        else if(ev.getSource() == b5)
        {
            setVisible(false);
            new Pin(pin).setVisible(true);
        }
        else if(ev.getSource() == b6)
        {
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ev.getSource() == b7)
        {
            System.exit(0);
        }
        
    }
    public static void main(String[] args)
    {
        new Transactions("").setVisible(true);
    }
    
}
