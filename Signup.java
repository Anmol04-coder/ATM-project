/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;

/**
 *
 * @author HP
 */
public class Signup extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    JButton jb;
    JComboBox cb1,cb2,cb3;
    
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)*1000L;
    String first = ""+Math.abs(first4);
    
    Signup(){
        //Move the text to the center;
        
        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        //for (int i = 0; i!= w; i++) pad+=" ";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FROM");
        
        
        l1 = new JLabel("APPLICATION FORM NO. "+first);
        l1.setFont(new Font("Raleway", Font.BOLD,32));
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        
        l3 = new JLabel("Name: ");
        l3.setFont(new Font("Raleway", Font.BOLD,20));
        
        l4 = new JLabel("Father Name: ");
        l4.setFont(new Font("Raleway", Font.BOLD,20));
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD,20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD,20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD,20));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD,20));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD,20));
        
        l10 = new JLabel("City");
        l10.setFont(new Font("Raleway", Font.BOLD,20));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD,20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD,20));

        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD,14));

        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD,14));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway",Font.BOLD,14));
        
        jb = new JButton("Next");
        jb.setFont(new Font("Raleway",Font.BOLD,14));
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);
        
        rb1 = new JRadioButton("Male");
        rb1.setFont(new Font("Raleway", Font.BOLD,14));
        rb1.setBackground(Color.WHITE);
        
        rb2 = new JRadioButton("Female");
        rb2.setFont(new Font("Raleway", Font.BOLD,14));
        rb2.setBackground(Color.WHITE);
        
        rb3 = new JRadioButton("Married");
        rb3.setFont(new Font("Raleway", Font.BOLD,14));
        rb3.setBackground(Color.WHITE);
        
        rb4 = new JRadioButton("Unmarried");
        rb4.setFont(new Font("Raleway", Font.BOLD,14));
        rb4.setBackground(Color.WHITE);
        
        rb5 = new JRadioButton("Other");
        rb5.setFont(new Font("Raleway", Font.BOLD,14));
        rb5.setBackground(Color.WHITE);
        
        String date[] = {"1","2","3","4","5","6","7","8","9"};
        cb1 = new JComboBox(date);
        cb1.setBackground(Color.WHITE);
        
        String month[] = {"Jannary","February","March","April","May","June","July","August","Setp","OCT","NOV","DEC"};
        cb2 = new JComboBox(month);
        cb2.setBackground(Color.WHITE);
        
        String year[] = {"1990","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006"};
        cb3 = new JComboBox(year);
        cb3.setBackground(Color.WHITE);
        
//        JDatePicker dateChooser = new JDatePicker();
//	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//	dateChooser.setForeground(new Color(105, 105, 105));
//	dateChooser.setBounds(137, 337, 200, 29);
//	add(dateChooser);

        setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);
        
        l2.setBounds(290,80,600,30);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        tf1.setBounds(300,140,400,30);
        add(tf1);
        
        l4.setBounds(100,190,200,30);
        add(l4);
        
        tf2.setBounds(300,190,400,30);
        add(tf2);
        
        l5.setBounds(100,240,200,30);
        add(l5);
        
        cb1.setBounds(300, 240, 50, 30);
        add(cb1);
        
        cb2.setBounds(400,240,100,30);
        add(cb2);
        
        cb3.setBounds(550,240,70,30);
        add(cb3);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        rb1.setBounds(300,290,60,30);
        add(rb1);
        
        rb2.setBounds(450,290,90,30);
        add(rb2);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        tf3.setBounds(300,340,400,30);
        add(tf3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        rb3.setBounds(300,390,100,30);
        add(rb3);
        
        rb4.setBounds(450,390,100,30);
        add(rb4);
        
        rb5.setBounds(635,390,100,30);
        add(rb5);
        
        
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        tf4.setBounds(300,440,400,30);
        add(tf4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        tf5.setBounds(300,490,400,30);
        add(tf5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        tf6.setBounds(300,540,400,30);
        add(tf6);
        
        l12.setBounds(100,590,200,30);
        add(l12);
        
        tf7.setBounds(300,590,400,30);
        add(tf7);
        
        jb.setBounds(620,660,80,30);
        add(jb);
        
        jb.addActionListener(this); 
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = first;
        String a = tf1.getText();
        String b = tf2.getText();
        
        String ac = (String)cb1.getSelectedItem();
        String bc = (String)cb2.getSelectedItem();
        String cc = (String)cb3.getSelectedItem();
        String date = ac+ "/" + bc + "/" + cc;
        
        String d = null;
        if(rb1.isSelected()){
            d="Male";
        }else if(rb2.isSelected()){
            d = "Female";
        }
        
        String e = tf3.getText();
        String f = null;
        if(rb3.isSelected()){
            f="Married";
        }else if(rb4.isSelected()){
            f = "Unmarried";
        }else if(rb5.isSelected()){
            f = "Other";
        }
        
        String g = tf4.getText();
        String h = tf5.getText();
        String i = tf6.getText();
        String j = tf7.getText();
        
        try{
            
            if(tf6.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
           }else{

                conn c1 = new conn();
                String q1 = "insert into signup values('"+formno+"','"+a+"','"+b+"','" +date+"','" + d  + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i +"','" + j +"')";
                System.out.println("Q1:"+ q1);
                c1.s.executeUpdate("insert into signup values('"+formno+"','"+a+"','"+b+"','" +date+"','" + d  + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i +"','" + j +"')");
            }
//               try
//               {
//               Connection con = conn.takeConnection();
//               
//               String query = "insert into signup values('\"+formno+\"','\"+a+\"','\"+b+\"','\" +date+\"','\" + d  + \"','\" + e + \"','\" + f + \"','\" + g + \"','\" + h + \"','\" + i +\"','\" + j +\"')";
//               Statement st = con.createStatement();
//               int p = st.executeUpdate(query);
//               if(p==1)
//               {
//                new Signup2().setVisible(true);
//                 setVisible(false);    
//               }
//               
//               }
//               catch(Exception ew)
//               {
//                   ew.printStackTrace();
//               }
//               
//            }
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("error:"+ex);
        }
            
    }
    
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
    
}
