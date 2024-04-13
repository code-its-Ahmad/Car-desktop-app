/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_management_system;

import Classes.Car;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class carList extends javax.swing.JFrame {

    /**
     * Creates new form carList
     */
Classes.Car car = new Classes.Car(0, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null);
ArrayList<Classes.Car> car_list = car.carlist();
int index=0;
    public carList() {
        initComponents();
        this.setLocationRelativeTo(null);
        populateJtablewithcar_list();
    }
        public void displaybyteimage(int width,int height, byte[] image_byte, JLabel l1)
    {
       ImageIcon imageicon=new  ImageIcon((image_byte));
       Image imag=imageicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
       l1.setIcon(new ImageIcon(imag));
    }
         
        
     public void populateJtablewithcar_list()
          {       
            ArrayList<Classes.Car> car_list = car.carlist();
            /*
            int id, String brand, String model, String fuel, int passenger, String color, String classs,
            int price,String Gearbox, String air_con, String airbags, String suroof, String heats_seats, 
            String nav_system, String bluetooth, String electric_window, String gps, String Automatic_park
            
            `id`, `brand`, `model`, `fuel`, `passenger`, `color`, `class`, `price/day`, 
            `Gearbox`, `Air Conditioning`, `Airbags`, `Sunroof`, `Heated Seats`, `Bluetooth`, 
            `Electric windows`, `Navigation System`, `GPS`, `Auto Park Assist`
            */
              String[] columnname={"id","brand","model","fuel","passenger","color","class","price/day","Gearbox","Air Conditioning","Airbags","Sunroof","Heated Seats","bluetooth","electric_window","Navigation System","GPS","Auto Park Assist"};
              Object[][] rows =new Object[car_list.size()][columnname.length];
              for(int i=0;i<car_list.size();i++)
              {
                  rows[i][0]=car_list.get(i).getId();
                  rows[i][1]=car_list.get(i).getBrand();
                  rows[i][2]=car_list.get(i).getModel();
                  rows[i][3]=car_list.get(i).getFuel();
                  rows[i][4]=car_list.get(i).getPassenger();
                  rows[i][5]=car_list.get(i).getColor();
                  rows[i][6]=car_list.get(i).getClasss();
                  rows[i][7]=car_list.get(i).getPrice();
                  rows[i][8]=car_list.get(i).getGearbox();
                  rows[i][9]=car_list.get(i).getAir_con();
                  rows[i][10]=car_list.get(i).getAirbags();
                  rows[i][11]=car_list.get(i).getSuroof();
                  rows[i][12]=car_list.get(i).getHeats_seats();
                  rows[i][13]=car_list.get(i).getBluetooth();
                  rows[i][14]=car_list.get(i).getElectric_window();
                  rows[i][15]=car_list.get(i).getNav_system();
                  rows[i][16]=car_list.get(i).getGps();
                  rows[i][17]=car_list.get(i).getAutomatic_park();
                  
              }
              DefaultTableModel model=new DefaultTableModel(rows,columnname);
             jtable_car_list.setModel(model);
             
          }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        product_logo = new javax.swing.JLabel();
        product_logo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_car_list = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 11, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Car List");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 7, true));

        product_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-fire-68.png"))); // NOI18N

        product_logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-fire-68.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(546, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439)
                .addComponent(product_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(product_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1189, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(product_logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 1340, -1));

        jtable_car_list.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtable_car_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtable_car_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtable_car_list.setRowHeight(40);
        jtable_car_list.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jtable_car_list.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtable_car_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_car_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_car_list);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1320, 390));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 170, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(">>");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtable_car_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_car_listMouseClicked
//           int index= jtable_car_list.getSelectedRow();
//        int id =Integer.valueOf(jtable_car_list.getValueAt(index, 0).toString());
//           ArrayList<Car.CarImage> imag = car.carimagelist(id);
//           displaybyteimage(jLabel_car_image.getWidth(),jLabel_car_image.getHeight(),imag.get(0).getCar_img(),jLabel_car_image);
    }//GEN-LAST:event_jtable_car_listMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateJtablewithcar_list();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(carList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_car_list;
    private javax.swing.JLabel product_logo;
    private javax.swing.JLabel product_logo1;
    // End of variables declaration//GEN-END:variables
}
