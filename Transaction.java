/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.*;

public class Transaction extends JFrame implements ActionListener{

    JLabel l1;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
    //String pin;
    Transaction(){
        //this.pin = pin;
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("TRANSACTION");
        int y = fm.stringWidth(" ");
        int z = getWidth()-(3*x);
        int w = z/y;
        String pad = "";
        //for(int i = 0; i != w; i++) pad += " ";
        pad = String.format("$"+w+"s", pad);
        setTitle(pad+"TRANSATION");
        
        l1 = new JLabel("Please Select Yoour Transaction");
        l1.setFont(new Font("System", Font.BOLD, 38));
        
        jb1 = new JButton("DEPOSIT");
        jb1.setFont(new Font("System", Font.BOLD, 18));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb2 = new JButton("CASH WITHDRAWL");
        jb2.setFont(new Font("System", Font.BOLD, 18));
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        
        jb3 = new JButton("FAST CASH");
        jb3.setFont(new Font("System", Font.BOLD, 18));
        jb3.setBackground(Color.BLACK);
        jb3.setForeground(Color.WHITE);
        
        jb4 = new JButton("MINI STATEMENT");
        jb4.setFont(new Font("System", Font.BOLD, 18));
        jb4.setBackground(Color.BLACK);
        jb4.setForeground(Color.WHITE);
        
        jb5 = new JButton("PIN CHANGE");
        jb5.setFont(new Font("System", Font.BOLD, 18));
        jb5.setBackground(Color.BLACK);
        jb5.setForeground(Color.WHITE);
        
        jb6 = new JButton("BALANCE eNQUIRY");
        jb6.setFont(new Font("System", Font.BOLD, 18));
        jb6.setBackground(Color.BLACK);
        jb6.setForeground(Color.WHITE);
        
        jb7 = new JButton("EXIT");
        jb7.setFont(new Font("System", Font.BOLD, 18));
        jb7.setBackground(Color.BLACK);
        jb7.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(100,100,700,40);
        add(l1);
        
        jb1.setBounds(170,499,150,35);
        add(jb1);
        
        jb2.setBounds(390,499,150,35);
        add(jb2);
        
        jb3.setBounds(170,543,150,35);
        add(jb3);
        
        jb4.setBounds(390,543,150,35);
        add(jb4);
        
        jb5.setBounds(170,588,150,35);
        add(jb5);
        
        jb6.setBounds(390,588,150,35);
        add(jb6);
        
        jb7.setBounds(390,633,150,35);
        add(jb7);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(500,50);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==jb1){
            new Deposit().setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==jb2){
            new withdrawl().setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==jb3){
            new FastCash().setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==jb4){
            new Login().setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==jb5){
            new Pin(pin).setVisible(true);
            setVisible(false);
        }else if(ae.getSource()==jb6){
            String pinn = JOptionPane.showInputDialog("Enter PIN:");
            conn c1 = new conn();
            
            try{
                ResultSet rs = c1.s.executeQuery("SELECT balance FROM bank ORDER BY pin = '"+pinn+"' DESC LIMIT 1");// DESC LIMIT fetch last input deltail form database of same id;
                
                if(rs.next()){//move column to column;
                    String balance = rs.getString("balance");
                    JOptionPane.showMessageDialog(null,"YOUR ACCOUNT BALANCE IS " + balance);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==jb7){
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transaction("").setVisible(true);
    }
}
