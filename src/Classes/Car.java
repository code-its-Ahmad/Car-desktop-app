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

public class Car {
    
    private int id;
    private String brand;
    private String model;
    private String fuel;
    private int passenger;
    private String color;
    private String classs;
    private int price;
    private String Gearbox;
    private String air_con;
    private String airbags;
    private String suroof;
    private String heats_seats;
    private String nav_system;
    private String bluetooth;
    private String electric_window;
    private String gps;
    private String Automatic_park;

    public Car(int id, String brand, String model, String fuel, int passenger, String color, String classs, int price,String Gearbox, String air_con, String airbags, String suroof, String heats_seats, String bluetooth, String electric_window, String nav_system, String gps, String Automatic_park) 
    {   
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.passenger = passenger;
        this.color = color;
        this.classs = classs;
         this.price = price;
        this.Gearbox = Gearbox;
        this.air_con = air_con;
        this.airbags = airbags;
        this.suroof = suroof;
        this.heats_seats = heats_seats;
        this.nav_system = nav_system;
        this.bluetooth = bluetooth;
        this.electric_window = electric_window;
        this.gps = gps;
        this.Automatic_park = Automatic_park;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
      public int getPassenger() {
        return passenger;
    }
      public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getGearbox() {
        return Gearbox;
    }

    public void setGearbox(String Gearbox) {
        this.Gearbox = Gearbox;
    }


    public String getAir_con() {
        return air_con;
    }

    public void setAir_con(String air_con) {
        this.air_con = air_con;
    }

    public String getAirbags() {
        return airbags;
    }

    public void setAirbags(String airbags) {
        this.airbags = airbags;
    }

    public String getSuroof() {
        return suroof;
    }

    public void setSuroof(String suroof) {
        this.suroof = suroof;
    }

    public String getHeats_seats() {
        return heats_seats;
    }

    public void setHeats_seats(String heats_seats) {
        this.heats_seats = heats_seats;
    }
      public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    
     public String getElectric_window() {
        return electric_window;
    }

    public void setElectric_window(String electric_window) {
        this.electric_window = electric_window;
    }


    public String getNav_system() {
        return nav_system;
    }

    public void setNav_system(String nav_system) {
        this.nav_system = nav_system;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getAutomatic_park() {
        return Automatic_park;
    }

    public void setAutomatic_park(String Automatic_park) {
        this.Automatic_park = Automatic_park;
    }
    
      public ArrayList<Car> carlist()
  {
      ArrayList<Car> carlist= new ArrayList<>();
      ResultSet rs=getData("SELECT * FROM `cars`");
      
         try {
             while(rs.next())
              {
                 Car c1=new  Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18));  
                 carlist.add(c1);
             }  } 
         catch (SQLException ex) {
             Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
         }
         return carlist ;
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
    
    public void addCAR(String brand,String model,String fuel,int passenger,String color,String classs,int price,String Gearbox, String air_con,String airbags,String suroof ,String heats_seats,String bluetooth,String electric_window ,String nav_system,String gps,String Automatic_pak)
    {
          String insert_query="INSERT INTO `cars`( `brand`, `model`, `fuel`, `passenger`, `color`, `class`, `price/day`, `Gearbox`, `Air Conditioning`, `Airbags`, `Sunroof`, `Heated Seats`, `Bluetooth`, `Electric windows`, `Navigation System`, `GPS`, `Auto Park Assist`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(insert_query);
            ps.setString(1, brand);
            ps.setString(2, model);
            ps.setString(3, fuel);
            ps.setInt(4, passenger);
            ps.setString(5, color);
            ps.setString(6, classs);
            ps.setInt(7, price);
            ps.setString(8, Gearbox);
            ps.setString(9, air_con);
            ps.setString(10, airbags);
            ps.setString(11, suroof);
            ps.setString(12, heats_seats);
            ps.setString(13, bluetooth);
            ps.setString(14, electric_window);
            ps.setString(15, nav_system);
            ps.setString(16, gps);
            ps.setString(17, Automatic_pak);
            if(ps.executeUpdate() !=0)
            {
              int confirm=JOptionPane.showConfirmDialog(null, "Are you sure you want to add new Car?", "confirm",JOptionPane.YES_NO_OPTION);
             if(confirm==JOptionPane.YES_NO_OPTION)
            {
              JOptionPane.showMessageDialog(null, "add the new Car successfully ");
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    public void addcar_image(int car_id,byte[] car_image)
    {
        String add_query="INSERT INTO `car_image`(`carr_id`, `car_image`) VALUES (?,?)";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(add_query);
            ps.setInt(1, car_id);
            ps.setBytes(2, car_image);
            
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "add the new car successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not car to be add please enter the new brand");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Car .class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 public void update_car(int id, String brand, String model, String fuel, int passenger, String color, String classs, int price,String Gearbox, String air_con, String airbags, String suroof, String heats_seats, String bluetooth, String electric_window, String nav_system, String gps, String Automatic_park)
    {
        String update_query="UPDATE `cars` SET `brand`=?,`model`=?,`fuel`=?,`passenger`=?,`color`=?,`class`=?,`price/day`=?,`Gearbox`=?,`Air Conditioning`=?,`Airbags`=?,`Sunroof`=?,`Heated Seats`=?,`Bluetooth`=?,`Electric windows`=?,`Navigation System`=?,`GPS`=?,`Auto Park Assist`=? WHERE `id`=?";
        
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(update_query);
             ps.setString(1, brand);
            ps.setString(2, model);
            ps.setString(3, fuel);
            ps.setInt(4, passenger);
            ps.setString(5, color);
            ps.setString(6, classs);
            ps.setInt(7, price);
            ps.setString(8, Gearbox);
            ps.setString(9, air_con);
            ps.setString(10, airbags);
            ps.setString(11, suroof);
            ps.setString(12, heats_seats);
            ps.setString(13, bluetooth);
            ps.setString(14, electric_window);
            ps.setString(15, nav_system);
            ps.setString(16, gps);
            ps.setString(17, Automatic_park);
            ps.setInt(18, id);
            if(ps.executeUpdate()!=0)
            {
              JOptionPane.showMessageDialog(null, "update the new car successfully");
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Not to update car please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void delete_car(int id)
    {
        String delete_query="DELETE FROM `cars` WHERE `id`=?";
        PreparedStatement ps;
        try {
            ps=data_base.getconect().prepareStatement(delete_query);
            ps.setInt(1, id);
            if(ps.executeUpdate()!=0)
            {
               JOptionPane.showMessageDialog(null, "delete the new car successfully");
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "Not to delete car please try again");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public class CarImage
    {
        private int img_id;
        private int car_id;
        private byte[] car_img;

        public CarImage() {
        }

        public CarImage(int img_id, int car_id, byte[] car_img) {
            this.img_id = img_id;
            this.car_id = car_id;
            this.car_img = car_img;
        }

        public int getImg_id() {
            return img_id;
        }

        public void setImg_id(int img_id) {
            this.img_id = img_id;
        }

        public int getCar_id() {
            return car_id;
        }

        public void setCar_id(int car_id) {
            this.car_id = car_id;
        }

        public byte[] getCar_img() {
            return car_img;
        }

        public void setCar_img(byte[] car_img) {
            this.car_img = car_img;
        }
        
    }
    
          public ArrayList<CarImage> carimagelist(int car_id)
  {
      ArrayList<CarImage> image= new ArrayList<>();
      ResultSet rs=getData("SELECT `id`, `carr_id`, `car_image` FROM `car_image` WHERE `carr_id`= "+car_id);
      CarImage car_image;
         try {
               
             while(rs.next())
              {
                  car_image=new CarImage();
                  car_image.setImg_id(rs.getInt(1));
                  car_image.setCar_id(rs.getInt(2));
                  car_image.setCar_img(rs.getBytes(3));
                  image.add(car_image);
                  
                  
             }  
         }catch (SQLException ex) {
             Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
         }
         return image ;
  }
          
            public Car getcarByid(int car_id)
   {
       String query="SELECT * FROM `cars` WHERE `id`="+car_id;
       ResultSet rs=getData(query);
       Car car=null;
         try {
               while(rs.next())
               {
                  car=new Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18));
               }
         } catch (SQLException ex) {
             Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
         }
         return car;
   }    
}
