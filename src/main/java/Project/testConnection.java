/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author HP 14-AL
 */
public class testConnection {
    public static void main(String[] args){
        
        final String db = "jdbc:mysql://localhost:3306/tickets";
        final String name = "root";
        final String password = "admin";
        
        Connection conn = null;
        Statement smt = null;
        
        try
        {
            conn = DriverManager.getConnection(db, name, password);
            System.out.println("Connnecting to db successfully");
            
            smt = conn.createStatement();
            String sql = "INSERT INTO buyer(name, contactNo, email, address,gender )" + 
                    "VALUES('Abba'. '12345678', 'abba@email.com', 'Home', 'male' )";
            smt.executeUpdate(sql);
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
    
}
