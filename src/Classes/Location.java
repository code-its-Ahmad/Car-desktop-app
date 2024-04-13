/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Location {
    private int id;
    private String city;
    private String address;
    private String customer;
    public Location(int id, String city, String address,String customer) {
        this.id = id;
        this.city = city;
        this.address = address;
        this.customer=customer;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public void addloaction(String city, String address,String customer)
    {
          String insert_query="INSERT INTO `locations`(`city`, `location`, `customer`)VALUES (?,?,?)";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(insert_query);
            ps.setString(1, city);
            ps.setString(2, address);
            ps.setString(3,customer);
            if(ps.executeUpdate() !=0)
            {
             JOptionPane.showMessageDialog(null, "add the new location successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not to update location please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatelocation(int id,String city,String address,String customer)
    {
        String update_query=" UPDATE `locations` SET `city`=?,`location`=?,`customer`=? WHERE `id`=?";
       PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(update_query);
            ps.setString(1, city);
            ps.setString(2, address);
            ps.setString(3, customer);
            ps.setInt(4, id);
            
            if(ps.executeUpdate()!=0)
           {
              JOptionPane.showMessageDialog(null, "update the  location successfully");
           }
           else
            {
                JOptionPane.showMessageDialog(null, "Not to add location please try again");
           }
       } catch (SQLException ex) {
            Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public void deletelocation(int id)
    {
          String delete_query="DELETE FROM `locations` WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(delete_query);
           ps.setInt(1, id);
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "delete the location successfully");
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "Not to delete location please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getData(String query)
      {
          PreparedStatement ps;
          ResultSet rs=null;
          
         try {
             ps=data_base.getconect().prepareStatement(query);
              rs=ps.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
          
      }
  public ArrayList<Location> locationlist()
  {
      ArrayList<Location> localist= new ArrayList<>();
      ResultSet rs=getData("SELECT * FROM `locations` ");
      
         try {
             while(rs.next())
             {
                 System.out.println(rs.getInt(1));
                 System.out.println(rs.getString(2));
                 
                 
                 Location location =new Location (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                 localist.add(location);
             }  } catch (SQLException ex) {
             Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);
         }
         return localist ;
  }

         
    
}
