/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Signup2 extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton jb;
    JRadioButton rb1,rb2,rb3,rb4;
    JTextField tf1,tf2,tf3;
    JComboBox cb1,cb2,cb3,cb4,cb5;
   
    Signup2(){
        
        setFont(new Font("System",Font.BOLD,22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad = " ";
        //for(int i = 0; i != w; i++)pad += " ";
        pad = String.format("&"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additional Detalis");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        
        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        
        l6 = new JLabel("Qualification:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        
        l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8 = new JLabel("PAN NUMBER:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        
        l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
        l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        
        
        jb = new JButton("Next");
        jb.setFont(new Font("Raleway",Font.BOLD,14));
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.WHITE);
        
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway",Font.BOLD,14));
        
        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway",Font.BOLD,14));
        
        rb1 = new JRadioButton("Yes");
        rb1.setFont(new Font("Raleway",Font.BOLD,14));
        rb1.setBackground(Color.WHITE);
        
        rb2 = new JRadioButton("NO");
        rb2.setFont(new Font("Raleway",Font.BOLD,14));
        rb2.setBackground(Color.WHITE);
        
        rb3 = new JRadioButton("YES");
        rb3.setFont(new Font("Raleway",Font.BOLD,14));
        rb3.setBackground(Color.WHITE);
        
        rb4 = new JRadioButton("NO");
        rb4.setFont(new Font("Raleway",Font.BOLD,14));
        rb4.setBackground(Color.WHITE);
        
        
        String religion[] = {"Hindu","Muslim","sikh","Christian","Other"};
        cb1 = new JComboBox(religion);
        cb1.setBackground(Color.WHITE);
        cb1.setFont(new Font("Raleway",Font.BOLD,14));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        cb2 = new JComboBox(category);
        cb2.setBackground(Color.WHITE);
        cb2.setFont(new Font("Raleway",Font.BOLD,14));
        
        String income[] = {"NULL","<1,20,000","<2,50000","<250000","upto 1000000","above 1000000"};
        cb3 = new JComboBox(income);
        cb3.setBackground(Color.WHITE);
        cb3.setFont(new Font("Raleway",Font.BOLD,14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        cb4 = new JComboBox(education);
        cb4.setBackground(Color.WHITE);
        cb4.setFont(new Font("Raleway",Font.BOLD,14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Other"};
        cb5 = new JComboBox(occupation);
        cb5.setBackground(Color.WHITE);
        cb5.setFont(new Font("Raleway",Font.BOLD,14));
        
        setLayout(null);
        
        l12.setBounds(700,10,60,30);
        add(l12);
        
        tf3.setBounds(760, 10, 60, 30);
        add(tf3);
        
        l1.setBounds(280, 30, 600, 40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        cb1.setBounds(350, 120, 320, 30);
        add(cb1);
        
        l3.setBounds(100, 170, 100, 30);
        add(l3);
        
        cb2.setBounds(350,170,320,30);
        add(cb2);
        
        l4.setBounds(100, 220, 100, 30);
        add(l4);
        
        cb3.setBounds(350, 220, 320, 30);
        add(cb3);
        
        l5.setBounds(100, 270, 150, 30);
        add(l5);
        
        cb4.setBounds(350, 270, 320, 30);
        add(cb4);
        
        l11.setBounds(100, 290, 150, 30);
        add(l11);
        
        l6.setBounds(100, 340, 150, 30);
        add(l6);
        
        cb5.setBounds(350, 340, 320, 30);
        add(cb5);
        
        l7.setBounds(100, 390, 150, 30);
        add(l7);
        
        tf1.setBounds(350, 390, 320, 30);
        add(tf1);
        
        l8.setBounds(100, 390, 150, 30);
        add(l8);
        
        tf2.setBounds(100, 390, 200, 30);
        add(tf2);
        
        l9.setBounds(100, 490, 100, 30);
        add(l9);
        
        rb1.setBounds(350,490,100,30);
        add(rb1);
        
        rb2.setBounds(460,490,100,30);
        add(rb2);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        rb3.setBounds(350,540,100,30);
        add(rb3);
        
        rb4.setBounds(460,540,100,30);
        add(rb4);
        
        jb.setBounds(570,640,100,30);
        add(jb);
        
        jb.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(500,120);
        setVisible(true);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String a = (String)cb1.getSelectedItem();
        String b = (String)cb2.getSelectedItem();
        String c = (String)cb3.getSelectedItem();
        String d = (String)cb4.getSelectedItem();
        String e = (String)cb5.getSelectedItem();
        
        
        String f = tf1.getText();
        String g = tf2.getText();
        
        String h = "";
        if(rb1.isSelected()){
            h = "Yes";
        }else if(rb2.isSelected()){
            h = "NO";
        }
        
        String i = "";
        if(rb3.isSelected()){
            i = "Yes";
        }else if(rb4.isSelected()){
            i = "NO";
        }
        
        try{
            if(tf2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                conn c1 = new conn();
                //String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
                c1.s.executeUpdate("insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')");
                
                new Signup3().setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup2().setVisible(true);
    }
}
