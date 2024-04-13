/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Classes.*;
/**
 *
 * @author Administrator
 */
import java.util.logging.Level;
import java.util.logging.Logger;
public class data_base {
    public static Connection getconect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rental_car","root","");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(data_base.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(data_base.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    }
    
}
