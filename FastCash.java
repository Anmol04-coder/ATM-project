/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

package com.mycompany.bankingapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.*;


public class FastCash extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
    JTextField tf;
    
    FastCash(){
         setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("FAST CASH");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad = "";
        //for(int i = 0; i!= w; i++);
        
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"FAST CASH");
        
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD,38));
        
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD,38));
        
        tf = new JTextField();
        tf.setFont(new Font("System", Font.BOLD, 13));
        
        jb1 = new JButton("RS 100");
        jb1.setFont(new Font("System",Font.BOLD,18));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        
        jb2 = new JButton("RS 500");
        jb2.setFont(new Font("System",Font.BOLD,18));
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.WHITE);
        
        jb3 = new JButton("RS 1000");
        jb3.setFont(new Font("System",Font.BOLD,18));
        jb3.setBackground(Color.BLACK);
        jb3.setForeground(Color.WHITE);
        
        jb4 = new JButton("RS 2000");
        jb4.setFont(new Font("System",Font.BOLD,18));
        jb4.setBackground(Color.BLACK);
        jb4.setForeground(Color.WHITE);
        
        jb5 = new JButton("RS 5000");
        jb5.setFont(new Font("System",Font.BOLD,18));
        jb5.setBackground(Color.BLACK);
        jb5.setForeground(Color.WHITE);
        
        jb6 = new JButton("RS 10000");
        jb6.setFont(new Font("System",Font.BOLD,18));
        jb6.setBackground(Color.BLACK);
        jb6.setForeground(Color.WHITE);
        
        jb7 = new JButton("BACK");
        jb7.setFont(new Font("System",Font.BOLD,18));
        jb7.setBackground(Color.BLACK);
        jb7.setForeground(Color.WHITE);
        
        jb8 = new JButton("EXIST");
        jb8.setFont(new Font("System",Font.BOLD,18));
        jb8.setBackground(Color.BLACK);
        jb8.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l2.setBounds(640,10,60,40);
        add(l2);
        
        tf.setBounds(710,10,60,40);
        add(tf);
        
        l1.setBounds(100,100,700,40);
        add(l1);
        
        jb1.setBounds(40,250,300,60);
        add(jb1);
        
        jb2.setBounds(440,250,300,60);
        add(jb2);
        
        jb3.setBounds(40,360,300,60);
        add(jb3);
        
        jb4.setBounds(440,360,300,60);
        add(jb4);
        
        jb5.setBounds(40,470,300,60);
        add(jb5);
        
        jb6.setBounds(440,470,300,60);
        add(jb6);
        
        jb7.setBounds(240,600,300,60);
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
        setLocation(500,90);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            
            String a = tf.getText();
            double balance = 0;
            
            if(ae.getSource()==jb1){
                
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 100;
                    String q1 = "insert into bank values('"+pin+"',null,100,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+100+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);
                
            }
            else if(ae.getSource()==jb2){
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 500;
                    String q1 = "insert into bank values('"+pin+"',null,500,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+500+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);

            }
            else if(ae.getSource()==jb3){
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 1000;
                    String q1 = "insert into bank values('"+pin+"',null,1000,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+1000+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);

            }
            else if(ae.getSource()==jb4){
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 2000;
                    String q1 = "insert into bank values('"+pin+"',null,2000,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+2000+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);

            }
            else if(ae.getSource()==jb5){
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 5000;
                    String q1 = "insert into bank values('"+pin+"',null,5000,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+5000+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);

            }
            else if(ae.getSource()==jb6){
                conn c1=new conn();
                
                ResultSet rs = c1.s.executeQuery("Select * from bank where pin = '"+a+"' ");
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    balance -= 10000;
                    String q1 = "insert into bank values('"+pin+"',null,10000,'"+balance+"')";
                    
                    c1.s.executeUpdate(q1);
                }
                
                JOptionPane.showMessageDialog(null, "Rs. "+10000+"Debited Successfully");
                new Transaction().setVisible(true);
                setVisible(false);

            }
            else if(ae.getSource()==jb7){
                System.exit(0);
            }
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: "+e);
        }
    }
    
    public static void main(String[] args){
        new FastCash().setVisible(true);
    }
    
    
}
