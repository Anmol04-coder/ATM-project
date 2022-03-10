package com.mycompany.bankingapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf1;
    JButton jb1,jb2,jb3;
    
    Login(){
        
        //Move the text to the center;
        
        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
        int y = fm.stringWidth(" ");
        int z = getWidth()-x;
        int w = z/y;
        String pad = "";
        //for(int i = 0; i != w; i++) pad += " ";
        pad = String.format("%" + w + "s", pad);
        setTitle(pad+"AUTOMATED TELLER MACHINE");
        
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD,38));
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway",Font.BOLD,28));
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway",Font.BOLD,28));
        
        tf1 = new JTextField(15);
        pf1 = new JPasswordField(15);
        
        jb1 = new JButton("SIGN IN");
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb2 = new JButton("CLEAR");
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        
        jb3 = new JButton("SIGN UP");
        jb3.setBackground(Color.BLACK);
        jb3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(175, 50, 450, 200);
        add(l1);
        
        l2.setBounds(125, 150, 375, 200);
        add(l2);
        
        l3.setBounds(125, 220, 375, 200);
        add(l3);
        
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(300, 235, 250, 30);
        add(tf1);
        
        pf1.setFont(new Font("Arial",Font.BOLD,14));
        pf1.setBounds(300, 310, 250, 30);
        add(pf1);
        
        jb1.setFont(new Font("Arial",Font.BOLD,14));
        jb1.setBounds(300, 400, 100, 30);
        add(jb1);
        
        jb2.setFont(new Font("Arial", Font.BOLD,14));
        jb2.setBounds(430, 400, 100, 30);
        add(jb2);
        
        jb3.setFont(new Font("Arial", Font.BOLD,14));
        jb3.setBounds(300,450,230,30);
        add(jb3);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(650,700);
        setLocation(500,200);//default Size of courser;
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        try{
            
            
            if(ae.getSource()==jb1){//when we click sign in;
                conn c1 = new conn();
                String a = tf1.getText();
                String b = pf1.getText();
                String q = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){//rs.next to retrive data from database .next() jump from column to column;
                    new Transaction().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Password");//show a pop up window when input a worg id or password;
                }
            }else if(ae.getSource()==jb2){ // when we click clear;
                tf1.setText("");
                pf1.setText("");
            }else if(ae.getSource()==jb3){ // when we click sign up
                new Signup().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error:"+e);
        }
    }
    
    public static void main(String[] args){
        new Login().setVisible(true);
    }

}
