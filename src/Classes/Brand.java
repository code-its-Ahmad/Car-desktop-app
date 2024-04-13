/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Classes.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Brand {
     private int id;
    private  String name;
    private byte[] logo;

    public Brand(int id, String name, byte[] logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
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

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.setLogo(logo);
    }
    
    public void addbrand(String name,byte[] logo)
    {
        String add_query="INSERT INTO `brand`(`name`, `logo`) VALUES (?,?)";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(add_query);
            ps.setString(1, name);
            ps.setBytes(2, logo);
            
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "add the new brand successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not brand to be add please enter the new brand");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Brand .class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 public void update_brand(int id,String name,byte[] logo)
    {
        String update_query="UPDATE `brand` SET `name`=?,`logo`=? WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(update_query);
            ps.setString(1, name);
            ps.setBytes(2, logo);
            ps.setInt(3, id);
            
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "update the new brand successfully");
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Not to update brand please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Brand .class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void delete_brand(int id)
    {
        String delete_query="DELETE FROM `brand` WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(delete_query);
            ps.setInt(1, id);
            if(ps.executeUpdate()!=0)
            {
               JOptionPane.showMessageDialog(null, "delete the new brand successfully");
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "Not to delete brand please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Brand .class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
          
      }
  public ArrayList<Brand> brandlist()
  {
      ArrayList<Brand> bradlist= new ArrayList<>();
      ResultSet rs=getData("SELECT * FROM `brand` ");
      
         try {
             while(rs.next())
             {
                 System.out.println(rs.getInt(1));
                 System.out.println(rs.getString(2));
                 
                 
                 Brand brand=new  Brand (rs.getInt(1),rs.getString(2),rs.getBytes(3));
                 bradlist.add(brand);
             }  } catch (SQLException ex) {
             Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
         }
         return bradlist ;
  }
   public Brand getBrandByid(int brand_id)
   {
       String query="SELECT * FROM `brand` WHERE `id`="+brand_id;
       ResultSet rs=getData(query);
       Brand brand=null;
         try {
             rs.next();
             brand=new Brand(rs.getInt(1),rs.getString(2),rs.getBytes(3));
         } catch (SQLException ex) {
             Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
         }
         return brand;
   }
          public HashMap<String ,Integer> brandhashmap()
          {
              HashMap<String ,Integer> brad_map=new  HashMap<String ,Integer>();
              ResultSet rs=getData("SELECT * FROM `brand` ");
              
         try {
             while(rs.next())
             {
             brad_map.put(rs.getString(2),rs.getInt(1));
             }
         } catch (SQLException ex) {
             Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
         }
              
            return   brad_map;
          }
       
}