
package com.mycompany.bankingapplication;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/AtmProject","root","");
            s=c.createStatement();
            if(c!=null){
                System.out.print("successfull");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
//    public static Connection takeConnection()
//    {
//        Connection con = null;
//        try
//        {
//           //Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AtmProject","root","");
//             
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return con;
//    }
}
