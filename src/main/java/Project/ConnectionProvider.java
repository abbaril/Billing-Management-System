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
public class ConnectionProvider {
    public static Connection getCon()
    {
   
        final String db = "jdbc:mysql://localhost:3306/tickets";
        final String name = "root";
        final String password = "admin";
        
        //Connection conn = null;
        //Statement smt = null;
        
         try
        {
            Connection conn = DriverManager.getConnection(db, name, password);
            System.out.println("Connnecting to db successfully");
           
            System.out.println("Inserted the record in to database");
            
            return conn;
            
        }catch(SQLException e){
            return null;
        }
        
        
    }
    
    
}
