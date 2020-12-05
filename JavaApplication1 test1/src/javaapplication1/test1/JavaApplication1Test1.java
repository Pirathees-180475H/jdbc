/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.test1;
import java.sql.*;
/**
 *
 * @author PTS
 */
public class JavaApplication1Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
   
            Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/blood","root","dovpts");  

           Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from donor"); 
            
            
   while(rs.next())  
          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
         con.close();  
          }catch(Exception e){ System.out.println(e);}  
    }
    
}
