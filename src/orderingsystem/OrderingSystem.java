/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;
import java.sql.*;


/**
 *
 * @author ARJAY
 */
public class OrderingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/usersdb";
        String user = "root";
        String pass = "admin";
        
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection(url,user,pass);
           System.out.println("Driver load successfull");
    }catch (Exception e){System.out.println(e);}
    }

}