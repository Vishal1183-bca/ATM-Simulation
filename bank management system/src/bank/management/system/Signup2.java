
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;


public class Signup2 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b;
    JRadioButton rb1,rb2,rb3,rb4;
    JTextField tf1,tf2,tf3;
    JComboBox cb1,cb2,cb3,cb4,cb5;
    String formno;
    Signup2(String formno)
    {
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(10,0,100,100);
//        add(image);
        this.formno = formno;
        setTitle("NEW ACCOUND APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway",Font.BOLD,25));
        l1.setBounds(250,50,550,30);
        add(l1);
        
        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(70,140,200,30);
        add(l2);
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Ither"};
        cb1 = new JComboBox(religion);
        cb1.setFont(new Font("Raleway",Font.BOLD,15));
        cb1.setBackground(Color.WHITE);
        cb1.setBounds(250,140,400,30);
        add(cb1);
        
   
        l3 = new JLabel("Category");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(70,190,200,30);
        add(l3);
        String category[] = {"General","OBC","SC","ST","Other"};
        cb2 = new JComboBox(category);
        cb2.setFont(new Font("Raleway",Font.BOLD,15));
        cb2.setBackground(Color.WHITE);
        cb2.setBounds(250,190,400,30);
        add(cb2);
        
   
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(70,240,200,30);
        add(l4);
        String income[] = {"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,00"};
        cb3 = new JComboBox(income);
        cb3.setFont(new Font("Raleway",Font.BOLD,15));
        cb3.setBackground(Color.WHITE);
        cb3.setBounds(250,240,400,30);
        add(cb3);
        
   
        l5 = new JLabel("Educational:");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(70,290,200,30);
        add(l5);
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctracte","Others"};
        cb4 = new JComboBox(education);
        cb4.setFont(new Font("Raleway",Font.BOLD,15));
        cb4.setBackground(Color.WHITE);
        cb4.setBounds(250,290,400,30);
        add(cb4);
        
   
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(70,340,200,30);
        add(l6);
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        cb5 = new JComboBox(occupation);
        cb5.setFont(new Font("Raleway",Font.BOLD,15));
        cb5.setBackground(Color.WHITE);
        cb5.setBounds(250,340,400,30);
        add(cb5);
        
        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(70,390,200,30);
        add(l7);
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway",Font.BOLD,15));
        tf1.setBounds(250,390,400,30);
        add(tf1);
        
        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(70,440,200,30);
        add(l8);
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway",Font.BOLD,15));
        tf2.setBounds(250,440,400,30);
        add(tf2);
        
        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(70,490,200,30);
        add(l9);
        rb1 = new JRadioButton("Yes");
        rb1.setFont(new Font("Raleway",Font.BOLD,15));
        rb1.setBackground(Color.white);
        rb1.setBounds(250, 500, 150, 15);
        add(rb1);
        rb2 = new JRadioButton("No");
        rb2.setFont(new Font("Raleway",Font.BOLD,15));
        rb2.setBackground(Color.white);
        rb2.setBounds(450, 500, 150, 15);
        add(rb2);
        ButtonGroup gbcitizen = new ButtonGroup(); 
        gbcitizen.add(rb1);
        gbcitizen.add(rb2);
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(70,540,200,30);
        add(l10);
        rb3 = new JRadioButton("Yes");
        rb3.setFont(new Font("Raleway",Font.BOLD,15));
        rb3.setBackground(Color.white);
        rb3.setBounds(250, 550, 150, 15);
        add(rb3);
        rb4 = new JRadioButton("No");
        rb4.setFont(new Font("Raleway",Font.BOLD,15));
        rb4.setBackground(Color.white);
        rb4.setBounds(450, 550, 150, 15);
        add(rb4);
        ButtonGroup bgexist = new ButtonGroup(); 
        bgexist.add(rb3);
        bgexist.add(rb4);
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway",Font.BOLD,14));
        l11.setBounds(680,10,150,30);
        add(l11);
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(760,10,60,30);
        add(l12);
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b.setBounds(550,640,100,30);
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
        String religion = (String)cb1.getSelectedItem();
        String category = (String)cb2.getSelectedItem();
        String income = (String)cb3.getSelectedItem();
        String education = (String)cb4.getSelectedItem();
        String occupation = (String)cb5.getSelectedItem();
        String pan = tf1.getText();
        String aadhar = tf2.getText();
        String scitizen = "";
        if(rb1.isSelected())
        {
            scitizen = "Yes";
        }
        else if(rb2.isSelected())
        {
            scitizen = "No";
        }
        String eaccount = "";
        if(rb3.isSelected())
        {
            eaccount = "Yes";
        }
        else if(rb4.isSelected())
        {
            eaccount = "No";
        }
        
        try
        {
            if(tf1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the required Fields");
            }
            else
            {
                Conn c1 = new Conn();
                String q1 = "INSERT INTO Signup2 VALUES('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                new Signup3(formno).setVisible(true);
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
        new Signup2("").setVisible(true);
    }
    
}
