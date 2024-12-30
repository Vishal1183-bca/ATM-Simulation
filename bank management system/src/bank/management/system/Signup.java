
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    JDateChooser dateChooser;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    JButton b;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+ 1000L;
    String first = ""+Math.abs(first4);
    Signup()
    {
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,0,100,100);
        add(image);
        
        

        
        l1 = new JLabel("APPLICTION FORM NO. " + first);
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        l1.setBounds(140, 30, 600, 40);
        add(l1);
        
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(250,90,250,30);
        add(l2);
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(80,140,200,30);
        add(l3);
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway",Font.BOLD,14));
        tf1.setBounds(250,140,450,30);
        add(tf1);
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(80,190,200,30);
        add(l4);
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway",Font.BOLD,14));
        tf2.setBounds(250, 190, 450, 30);
        add(tf2);
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(80, 240, 200, 30);
        add(l5);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(250,240,450,30);
        add(dateChooser);
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(80,290,200,30);
        add(l6);
        rb1 = new JRadioButton("Male");
        rb1.setFont(new Font("Raleway",Font.BOLD,14));
        rb1.setBackground(Color.WHITE);
        rb1.setBounds(250,290,150,30);
        add(rb1);
        rb2 = new JRadioButton("Female");
        rb2.setFont(new Font("Raleway",Font.BOLD,14));
        rb2.setBackground(Color.white);
        rb2.setBounds(440,290,200,30);
        add(rb2);
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(rb1);
        groupgender.add(rb2);
        
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(80,340,200,30);
        add(l7);
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway",Font.BOLD,14));
        tf3.setBounds(250, 340, 450, 30);
        add(tf3);
        
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(80,390,200,30);
        add(l8);
        rb3 = new JRadioButton("Married");
        rb3.setFont(new Font("Raleway",Font.BOLD,14));
        rb3.setBackground(Color.WHITE);
        rb3.setBounds(250,390,150,30);
        add(rb3);
        rb4 = new JRadioButton("UnMarried");
        rb4.setFont(new Font("Raleway",Font.BOLD,14));
        rb4.setBackground(Color.white);
        rb4.setBounds(440,390,150,30);
        add(rb4);
        rb5 = new JRadioButton("Other");
        rb5.setFont(new Font("Raleway",Font.BOLD,14));
        rb5.setBackground(Color.white);
        rb5.setBounds(630,390,150,30);
        add(rb5);
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(rb3);
        groupstatus.add(rb4);
        groupstatus.add(rb5);
        
        
        l8 = new JLabel("Address:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(80,440,200,30);
        add(l8);
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway",Font.BOLD,14));
        tf4.setBounds(250, 440, 450, 30);
        add(tf4);
        
        l9 = new JLabel("City:");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(80,490,200,30);
        add(l9);
        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway",Font.BOLD,14));
        tf5.setBounds(250, 490, 450, 30);
        add(tf5);
        
        l10 = new JLabel("State:");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(80,540,200,30);
        add(l10);
        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway",Font.BOLD,14));
        tf6.setBounds(250, 540, 450, 30);
        add(tf6);
        
        l11 = new JLabel("PIN Code:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(80,590,200,30);
        add(l11);
        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway",Font.BOLD,14));
        tf7.setBounds(250, 590, 450, 30);
        add(tf7);
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway",Font.BOLD,14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(600,650,100,30);
        add(b);
        b.addActionListener(this);
        
        
        

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno = first;
        String name = tf1.getText();
        String fname = tf2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(rb1.isSelected())
        {
            gender = "Male";
        }
        else if(rb2.isSelected())
        {
            gender = "Female";
        }
        String email = tf3.getText();
        String marital = null;
        if(rb3.isSelected())
        {
            marital = "Married";
        }
        else if(rb4.isSelected())
        {
            marital = "UnMarried";
        }
        else if(rb5.isSelected())
        {
            marital = "Other";
        }
        String address = tf4.getText();
        String city = tf5.getText();
        String state = tf6.getText();
        String pincode = tf7.getText();
        
        try
        {
            if(tf1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the Required Fields");
            }
            else
            {
                Conn c1 = new Conn();
                String q1 = "insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c1.s.executeUpdate(q1);
                new Signup2(first).setVisible(true);
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new Signup().setVisible(true);
        
    }
    
}
