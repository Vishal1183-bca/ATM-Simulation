
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Deposite  extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    Deposite(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1080,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,960,1080);
        add(image);
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.white);
        l1.setBounds(190,350,400,35);
        image.add(l1);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        t1.setBounds(190, 420, 320, 25);
        image.add(t1);
        setLayout(null);
        
        b1 = new JButton("DEPOSITE");
        b1.addActionListener(this);
        b1.setBounds(390,588,150,35);
        image.add(b1);
        b2 = new JButton("BACK");
        b2.addActionListener(this);
        b2.setBounds(390,633,150,35);
        image.add(b2);
        
        setSize(960,1080);
        setUndecorated(true);
        setLocation(500,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource() == b1)
            {
                if(t1.getText().equals(""))
                {
                    
                
                    JOptionPane.showMessageDialog(null,"Please enter the Amount to you want to Deposite");
                }
                else
                {
                    
                    Conn c1 = new Conn();
                    String q1 = "INSERT INTO bank VALUES('"+pin+"','"+date+"','Deposite','"+amount+"')";
                    c1.s.executeUpdate(q1);
                   
                    
                    JOptionPane.showMessageDialog(null,"Rs." + amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                
                }
            }
            else if(ae.getSource() == b2)
            {
                  setVisible(false);
                  new Transactions(pin).setVisible(true);
            }
            
        }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        public static void main(String[] args)
        {
            new Deposite("").setVisible(true);
        }
    
    }
