/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class car_size {
    
    private int id;
    private String car_1;
    private String  car_2;
    private String   car_3;
    private String  car_4;
    private String  car_5;
    private String  car_6;
    private String car_7;
    private String car_8;
    

    public car_size(int id, String  car_1, String car_2, String car_3, String  car_4, String  car_5, String  car_6,String car_7, String car_8) {
        this.id = id;
        this.car_1 = car_1;
        this.car_2 = car_2;
        this.car_3 = car_3;
        this.car_4 = car_4;
        this.car_5 = car_5;
        this.car_6 = car_6;
        this.car_7 = car_7;
        this.car_8 = car_8;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String  getCar_1() {
        return car_1;
    }

    public void setCar_1(String car_1) {
        this.car_1 = car_1;
    }

    public String  getCar_2() {
        return car_2;
    }

    public void setCar_2(String  car_2) {
        this.car_2 = car_2;
    }

    public String  getCar_3() {
        return car_3;
    }

    public void setCar_3(String  car_3) {
        this.car_3 = car_3;
    }

    public String  getCar_4() {
        return car_4;
    }

    public void setCar_4(String  car_4) {
        this.car_4 = car_4;
    }

    public String  getCar_5() {
        return car_5;
    }

    public void setCar_5(String car_5) {
        this.car_5 = car_5;
    }

    public String  getCar_6() {
        return car_6;
    }

    public void setCar_6(String  car_6) {
        this.car_6 = car_6;
    }
      public String  getCar_7() {
        return car_7;
    }

    public void setCar_7(String  car_7) {
        this.car_7 = car_7;
    }
       public String  getCar_8() {
        return car_8;
    }

    public void setCar_8(String  car_8) {
        this.car_8 = car_8;
    }
       
       public ArrayList<car_size> carsize()
  {
      ArrayList<car_size> carsize= new ArrayList<>();
      ResultSet rs=getData("SELECT * FROM `size_of_car`");
      
         try {
             while(rs.next())
              {
                car_size  c1=new car_size(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                 carsize.add(c1);
             }  } 
         catch (SQLException ex) {
             Logger.getLogger(car_size.class.getName()).log(Level.SEVERE, null, ex);
         }
         return carsize ;
  }
      public ResultSet getData(String query)
      {
          PreparedStatement ps;
          ResultSet rs=null;
          
         try {
             ps=data_base.getconect().prepareStatement(query);
              rs=ps.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(car_size.class.getName()).log(Level.SEVERE, null, ex);
         }
         return rs;
          
      }
      public void addCAR_size(String  car_1, String car_2, String car_3, String  car_4, String  car_5, String  car_6,String car_7,String car_8)
    {
          String insert_query="INSERT INTO `size_of_car`( `CAR 1`, `CAR 2`, `CAR 3`, `CAR 4`, `CAR 5`, `CAR 6`, `CAR 7`, `CAR 8`) VALUES(?,?,?,?,?,?,?,?)";
          PreparedStatement ps;
         
        try {
            ps=data_base.getconect().prepareStatement(insert_query);
            ps.setString(1, car_1);
            ps.setString(2, car_2);
            ps.setString(3, car_3);
            ps.setString(4, car_4);
            ps.setString(5,car_5);
            ps.setString(6, car_6);
            ps.setString(7, car_7);
            ps.setString(8, car_8);
            
              if(ps.executeUpdate() !=0)
              {
             int confirm=JOptionPane.showConfirmDialog(null, "Are you sure you want to  ADD a car ?", "confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_NO_OPTION)
        {
          JOptionPane.showMessageDialog(null, "add car  Form is Successfully ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, " Not add a car... please try again ");
        }
              }
        
        } catch (SQLException ex) {
            Logger.getLogger(car_size.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
