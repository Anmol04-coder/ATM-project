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
import javax.swing.JPasswordField;
import javax.swing.*;


public class Pin extends JFrame implements ActionListener{
    
    JPasswordField pf1,pf2,pf3;
    JButton jb1,jb2;
    JLabel l1,l2,l3,l4;
    
    Pin(){
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("Pin Change");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad = "";
        //for(int i = 0; i!= w; i++);
        
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"Pin Change");
        
        l1 = new JLabel("Change Your Pin");
        l1.setFont(new Font("System", Font.BOLD, 35));
        
        l2 = new JLabel("Current Pin:");
        l2.setFont(new Font("System", Font.BOLD, 22));
        
         l3 = new JLabel("New Pin:");
        l3.setFont(new Font("System", Font.BOLD, 22));
        
         l4 = new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("System", Font.BOLD, 22));
        
        pf1 = new JPasswordField();
        pf1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        pf2 = new JPasswordField();
        pf2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        pf3 = new JPasswordField();
        pf3.setFont(new Font("Raleway", Font.BOLD, 22));
        
        jb1 = new JButton("SAVE");
        jb1.setFont(new Font("Raleway", Font.BOLD,19));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb2 = new JButton("BACK");
        jb2.setFont(new Font("Raleway", Font.BOLD,19));
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        
        setLayout(null);
        
        l1.setBounds(220,120,800,60);
        add(l1);
        
        l2.setBounds(100,240,150,40);
        add(l2);
        
        l3.setBounds(100,300,150,40);
        add(l3);
        
        l4.setBounds(100,360,200,40);
        add(l4);
        
        pf1.setBounds(310,240,360,40);
        add(pf1);
        
        pf2.setBounds(310,300,360,40);
        add(pf2);
        
        pf3.setBounds(310,360,360,40);
        add(pf3);
        
        jb1.setBounds(220,460,160,50);
        add(jb1);
        
        jb2.setBounds(400,460,160,50);
        add(jb2);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setLocation(500,90);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            String a = pf1.getText();
            String b = pf2.getText();
            String c = pf3.getText();

            if(ae.getSource()==jb1){
                if(pf1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Current PIN");
                }
                if(pf2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter new PIN");
                }
                if(pf3.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                if(pf2.getText().equals(pf3.getText())){
                    conn c1 = new conn();
                    String q1 = "update bank set pin = '"+b+"' where pin = '"+a+"'";
                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"'";
                    String q3 = "update signup3 set pin = '"+b+"' where pin = '"+a+"'";
                    
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
                    
                           
                }else{
                    JOptionPane.showMessageDialog(null, "PIN ented Doesn't match");
                }
            }else if(ae.getSource()==jb2){
                new Transaction().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
           e.printStackTrace();
           System.out.println("error: " + e);
        }
    }
    
    public static void main(String[] args){
        new Pin().setVisible(true);
    }
    
}
