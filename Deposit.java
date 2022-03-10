/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.bankingapplication;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Deposit extends JFrame implements ActionListener{

    JTextField tf1,tf2;
    JButton jb1,jb2,jb3;
    JLabel l1,l2,l3;
    
    Deposit(){
         setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("DEPOSITE");
        int y = fm.stringWidth(" ");
        int z = getWidth()-(3*x);
        int w = z/y;
        
        String pad = "";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"DEPOSITE");
        
        l1 = new JLabel("Enter Amount You Want");
        l1.setFont(new Font("System", Font.BOLD,35));
        
        l2 = new JLabel("To Deposite");
        l2.setFont(new Font("System", Font.BOLD,35));
        
        l3 = new JLabel("Enter Pin");
        l3.setFont(new Font("System", Font.BOLD,14));
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 22));
                
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        jb1 = new JButton("DEPOSITE");
        jb1.setFont(new Font("System",Font.BOLD, 18));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb2 = new JButton("BACK");
        jb2.setFont(new Font("System",Font.BOLD, 18));
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        
        jb3 = new JButton("EXIT");
        jb3.setFont(new Font("System",Font.BOLD, 18));
        jb3.setBackground(Color.BLACK);
        jb3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l3.setBounds(620, 10, 80, 30);
        add(l3);
        
        tf2.setBounds(700,10,40,30);
        add(tf2);
        
        l1.setBounds(150, 150, 800,60);
        add(l1);
        
        l2.setBounds(290, 210, 800, 60);
        add(l2);
        
        tf1.setBounds(260,300,300,50);
        add(tf1);
        
        jb1.setBounds(260,380,125,50);
        add(jb1);
        
        jb2.setBounds(415,380,125,50);
        add(jb2);
                
        jb3.setBounds(300,550,200,50);
        add(jb3);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(500,90);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try{
            
            String a = tf1.getText();
            String b = tf2.getText();
            
            if(ae.getSource()==jb1){
                if(tf1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Depoite");
                } else{
                    conn c1 = new conn();
                    
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+b+"' ");
                    
                    double balance = 0;
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        balance = rs.getDouble("balance");
                        
                        double d = Double.parseDouble(a);
                        balance += d;
                        String q1 = "insert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
                        c1.s.executeUpdate(q1);
                    }
                    
                    JOptionPane.showMessageDialog(null, "Rs. "+a+" Deposited Successfully");
                    
                    new Transaction().setVisible(true);
                }
                
            }else if(ae.getSource()==jb2){
                new Transaction().setVisible(true);
                setVisible(false);
            }else if(ae.getSource()==jb3){
                System.exit(0);
            }
                    
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("Error: "+e);
        }
    }
    
    public static void main(String[] args){
        new Deposit().setVisible(true);
    }
    
}
