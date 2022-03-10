/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JRadioButton rb1, rb2, rb3, rb4;
    JButton jb1, jb2;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    JTextField tf;
    
    Signup3(){
    
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad = "";
        //for(int i = 0; i != w; i++) pad +=;
        pad = String.format("&"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        
        l6 = new JLabel("It would appear on ATM Card/cheque Book and Statements");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        
        l10 = new JLabel("Services Requried");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
        jb1 = new JButton("Submit");
        jb1.setFont(new Font("Raleway",Font.BOLD,14));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb1 = new JButton("Cancle");
        jb1.setFont(new Font("Raleway",Font.BOLD,14));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        cb1 = new JCheckBox("ATM Card");
        cb1.setBackground(Color.WHITE);
        cb1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb2 = new JCheckBox("Internet Banking");
        cb2.setBackground(Color.WHITE);
        cb2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb3 = new JCheckBox("Mobile Banking");
        cb3.setBackground(Color.WHITE);
        cb3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb4 = new JCheckBox("Email Alerts");
        cb4.setBackground(Color.WHITE);
        cb4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb5 = new JCheckBox("Cheque Book");
        cb5.setBackground(Color.WHITE);
        cb5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb6 = new JCheckBox("E-Statement");
        cb6.setBackground(Color.WHITE);
        cb6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        cb7 = new JCheckBox("I hereBy declares that the above entered details correct to the best of my knowledge", true);
        cb7.setBackground(Color.WHITE);
        cb7.setFont(new Font("Raleway", Font.BOLD, 12));
        
        rb1 = new JRadioButton("Saving Account");
        rb1.setFont(new Font("Ralweay",Font.BOLD,16));
        rb1.setBackground(Color.WHITE);
        
        rb2 = new JRadioButton("Fixed Deposit Account");
        rb2.setFont(new Font("Ralweay",Font.BOLD,16));
        rb2.setBackground(Color.WHITE);
        
        rb3 = new JRadioButton("Current Account");
        rb3.setFont(new Font("Ralweay",Font.BOLD,16));
        rb3.setBackground(Color.WHITE);
        
        rb4 = new JRadioButton("Tecurring Deposite Account");
        rb4.setFont(new Font("Ralweay",Font.BOLD,16));
        rb4.setBackground(Color.WHITE);
        
        tf = new JTextField();
        tf.setFont(new Font("Raleway", Font.BOLD,12));
       
        
        setLayout(null);
        
        l11.setBounds(700,10,70,30);
        add(l11);
        
        l1.setBounds(280,40,400,40);
        add(l1); 
        
        l2.setBounds(100,140,200,30);
        add(l2);
        
        rb1.setBounds(100,180,150,30);
        add(rb1);
        
        rb2.setBounds(350,180,300,30);
        add(rb2);
        
        rb3.setBounds(100,220,250,30);
        add(rb3);
        
        rb4.setBounds(350,220,250,30);
        add(rb4);
        
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5.setBounds(100,330,200,20);
        add(l5);
        
        l6.setBounds(330,330,500,20);
        add(l6);
        
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8.setBounds(330,370,200,30);
        add(l8);
        
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10.setBounds(100,450,200,30);
        add(l10);
        
        cb1.setBounds(100,500,200,30);
        add(cb1);
        
        cb2.setBounds(350,500,200,30);
        add(cb2);
        
        cb3.setBounds(100,550,200,30);
        add(cb3);
        
        cb4.setBounds(350,550,200,30);
        add(cb4);
        
        cb5.setBounds(100,600,200,30);
        add(cb5);
        
        cb6.setBounds(350,600,200,30);
        add(cb6);
        
        cb7.setBounds(100,680,600,20);
        add(cb7);
        
        jb1.setBounds(250,720,100,30);
        add(cb1);
        
        jb2.setBounds(420,720,100,30);
        add(cb2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
         String a = null;
         if(rb1.isSelected()){
             a = "Sabing Account";
         }else if(rb2.isSelected()){
             a = "Fixed Deposit Account";
         }else if(rb3.isSelected()){
             a = "Current Account";
         }else if(rb4.isSelected()){
             a = "Recurring Deposit Account";
         }
         
         Random ran = new Random();
         long first7 = (ran.nextLong() % 90000000L)+5050936000000000L;//16 digit random;
         long first8 = Math.abs(first7);
         
         long first3 = (ran.nextLong() % 9000L) + 1000L;//4 digit random
         long first4 = Math.abs(first3);
         
         String b = "";
         if(cb1.isSelected()){
             b = b+" ATM Card";
         }
         if(cb2.isSelected()){
             b = b+" Internet Banking";
         }
         if(cb3.isSelected()){
             b = b+" Mobile Banking";
         }
         if(cb4.isSelected()){
             b = b+"EMAIL Alerts";
         }
         if(cb5.isSelected()){
             b = b+" Cheque Book";
         }
         if(cb6.isSelected()){
             b = b+" E-statement";
         }
         
         String c = tf.getText();
         
         try {
             if(ae.getSource()==jb1){
                 if(b.equals("")){
                     JOptionPane.showMessageDialog(null,"Fill all the required fields");
                 }else {
                     conn c1 = new conn();
                     String q1 = "insert into signup3 values('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";
                     String q2 = "insert into login values('"+first8+"','"+first4+"')";
                     c1.s.executeUpdate(q1);
                     c1.s.executeUpdate(q2);
                     JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);// popup message
                     
                     new Deposit().setVisible(true);
                     setVisible(false);
                 }
                 
             }else if(ae.getSource()==jb2){
                 System.exit(0);
             }
             
         }catch(Exception ex){
             ex.printStackTrace();
         }
    }
    
    public static void main(String[] args){
        new Signup3().setVisible(true);
    }
    
}
