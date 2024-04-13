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
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
public class Customer_form {
    private int id;
    private String name;
    private String date_of_birth;
    private String phone;
    private String email;
    private String address;

    public Customer_form(int id, String name, String date_of_birth, String phone, String email,String address) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.phone=phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void addcustomer(  String name, String date_of_birth, String phone, String email,String address)
    {
          String insert_query="INSERT INTO `customer`( `Name`, `Date of Birth`, `Phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(insert_query);
            ps.setString(1, name);
            ps.setString(2, date_of_birth);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, address);                        
            if(ps.executeUpdate()!=0)
            {
             JOptionPane.showMessageDialog(null, "add the new customer  successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not to add customer please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void update_customer(int id, String name, String date_of_birth, String phone, String email,String address)
    {
        String update_query=" UPDATE `customer` SET `Name`=?,`Date of Birth`=?,`Phone`=?,`email`=?,`address`=? WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(update_query);
            ps.setString(1, name);
            ps.setString(2, date_of_birth);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.setInt(6, id);
            
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "update the new customer successfully");
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Not to update customer please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deletecustomer(int id)
    {
          String delete_query="DELETE FROM `customer` WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(delete_query);
           ps.setInt(1, id);
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "delete the customer successfully");
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "Not to delete customer please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
          
      }
  public ArrayList<Customer_form> customerlist()
  {
      ArrayList<Customer_form> cuslist= new ArrayList<>();
      ResultSet rs=getData("SELECT * FROM `customer`");
      
         try {
             while(rs.next())
             {
                 System.out.println(rs.getInt(1));
                 System.out.println(rs.getString(2));
                 System.out.println(rs.getString(3));
                 System.out.println(rs.getString(4));
                 System.out.println(rs.getString(5));
                 System.out.println(rs.getString(6));
                 
                 
                 Customer_form c1=new  Customer_form (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                 cuslist.add(c1);
             }  } catch (SQLException ex) {
             Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
         }
         return cuslist;
  }
     public HashMap<String ,Integer> customerhashmap()
          {
              HashMap<String ,Integer> cus_map=new  HashMap <String ,Integer>();
              ResultSet rs=getData("SELECT * FROM `customer`");
              
         try {
             while(rs.next())
             {
             cus_map.put(rs.getString(2),rs.getInt(1));
             }
         } catch (SQLException ex) {
             Logger.getLogger(Customer_form.class.getName()).log(Level.SEVERE, null, ex);
         }
              
            return   cus_map;
          }
         
    
    
}

    
    
