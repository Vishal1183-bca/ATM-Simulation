
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JRadioButton rb1,rb2,rb3,rb4;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    JButton b1,b2;
    String formno;
    Signup3(String formno)
    {
        this.formno = formno;
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(100,140,200,30);
        add(l2);
        rb1 = new JRadioButton("Saving");
        rb1.setFont(new Font("Raleway",Font.BOLD,16));
        rb1.setBackground(Color.white);
        rb1.setBounds(100,180,250,20);
        add(rb1);
        
        rb2 = new JRadioButton("Fixed Deposite Account");
        rb2.setFont(new Font("Raleway",Font.BOLD,16));
        rb2.setBackground(Color.white);
        rb2.setBounds(350,180,250,20);
        add(rb2);
        
        rb3 = new JRadioButton("Current Account");
        rb3.setFont(new Font("Raleway",Font.BOLD,16));
        rb3.setBackground(Color.white);
        rb3.setBounds(100,220,250,20);
        add(rb3);
        
        rb4 = new JRadioButton("Recurring Deposite Account");
        rb4.setFont(new Font("Raleway",Font.BOLD,16));
        rb4.setBackground(Color.white);
        rb4.setBounds(350,220,250,20);
        add(rb4);
        
        ButtonGroup bgtype = new ButtonGroup();
        bgtype.add(rb1);
        bgtype.add(rb2);
        bgtype.add(rb3);
        bgtype.add(rb4);
        
        l2 = new JLabel("Card Number:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(100,270,200,30);
        add(l2);
        l3 = new JLabel("XXXX-XXXX-XXXX-1334");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(350,270,400,30);
        add(l3);
        l6 = new JLabel("Your 16 Digit Card Number");
        l6.setFont(new Font("Raleway",Font.BOLD,11));
        l6.setBounds(100,300,200,20);
        add(l6);
        
        l4 = new JLabel("PIN:");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,340,200,30);
        add(l4);
        l5 = new JLabel("XXXX");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(350,340,400,30);
        add(l5);
        l7 = new JLabel("Your 4 Digit PIN");
        l7.setFont(new Font("Raleway",Font.BOLD,11));
        l7.setBounds(100,370,200,20);
        add(l7);
        
        l8 = new JLabel("Services Required:");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,420,200,30);
        add(l8);
        
        cb1 = new JCheckBox("ATM CARD");
        cb1.setFont(new Font("Raleway",Font.BOLD,16));
        cb1.setBackground(Color.white);
        cb1.setBounds(100,470,250,20);
        add(cb1);
        
        cb2 = new JCheckBox("Internet Banking");
        cb2.setFont(new Font("Raleway",Font.BOLD,16));
        cb2.setBackground(Color.white);
        cb2.setBounds(350,470,250,20);
        add(cb2);
        
        cb3 = new JCheckBox("Mobile Banking");
        cb3.setFont(new Font("Raleway",Font.BOLD,16));
        cb3.setBackground(Color.white);
        cb3.setBounds(100,510,250,20);
        add(cb3);
        
        cb4 = new JCheckBox("EMAIL & SMS Alert");
        cb4.setFont(new Font("Raleway",Font.BOLD,16));
        cb4.setBackground(Color.white);
        cb4.setBounds(350,510,250,20);
        add(cb4);
        
        cb5 = new JCheckBox("Cheque Book");
        cb5.setFont(new Font("Raleway",Font.BOLD,16));
        cb5.setBackground(Color.white);
        cb5.setBounds(100,550,250,20);
        add(cb5);
        
        cb6 = new JCheckBox("E-Statement");
        cb6.setFont(new Font("Raleway",Font.BOLD,16));
        cb6.setBackground(Color.white);
        cb6.setBounds(350,550,250,20);
        add(cb6);
        
        
        cb7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        cb7.setFont(new Font("Raleway",Font.BOLD,13));
        cb7.setBackground(Color.white);
        cb7.setBounds(100,630,600,20);
        add(cb7);
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.setBounds(270,670,100,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway",Font.BOLD,16));
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.setBounds(420,670,100,30);
        b2.addActionListener(this);
        add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ev)
    {
        String atype = null;
        if(rb1.isSelected())
        {
            atype = "Saving Account";
        }
        else if(rb2.isSelected())
        {
            atype = "Fixed Deposite Account";
        }
        else if(rb3.isSelected())
        {
            atype = "Current Account";
        }
        else if(rb4.isSelected())
        {
            atype = "Recurring Deposite Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(cb1.isSelected())
        {
            facility =  facility + " ATM Card";
        }
        else if(cb2.isSelected())
        {
            facility = facility + " Internet Banking";
        }
        else if(cb3.isSelected())
        {
            facility = facility + " Mobile Banking";
        }
         else if(cb4.isSelected())
        {
            facility = facility + " EMAIL Alerts";
        }
         else if(cb5.isSelected())
        {
            facility = facility + " Cheque Book";
        }
         else if(cb6.isSelected())
        {
            facility = facility + " E-Statement";
        }
        
        try
        {
            if(ev.getSource() == b1)
            {
                
            
                if(atype.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill all the Required Fields");
                }
                else
                {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number: " + cardno + "\n PIN: " + pin );
                    setVisible(false);
                    new Login().setVisible(true);
                     
                    
                
                    
                }
            } 
            else if(ev.getSource() == b2)
            {
                System.exit(0);
            }
            {
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args)
    {
        new Signup3("").setVisible(true);
    }
    
}
