/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_management_system;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import Classes.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class product_items extends javax.swing.JFrame {

    /**
     * Creates new form product_items
     */
    
    Classes.Brand brand=new Classes.Brand(0,null, null);
    ArrayList<Classes.Brand> brand_list = brand.brandlist();
    int index=0;
    
            
    public product_items() {
        initComponents();
        this.setLocationRelativeTo(null);
        populateJtablewithBrands();
    }
    
  
       public void display_image(int width,int height, String image, JLabel l1)
    {
       ImageIcon imageicon=new  ImageIcon((image));
       Image imag=imageicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
       l1.setIcon(new ImageIcon(imag));
       
    }     
       public void displaybyteimage(int width,int height, byte[] image_byte, JLabel l1)
    {
       ImageIcon imageicon=new  ImageIcon((image_byte));
       Image imag=imageicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
       l1.setIcon(new ImageIcon(imag));
    }
       
      
          public String set_image()
          {
              JFileChooser file=new JFileChooser();
              file.setDialogTitle("Select the picture");
              file.setCurrentDirectory(new File("c:\\image"));
              FileNameExtensionFilter filter=new FileNameExtensionFilter("image","png","jpg");
              file.addChoosableFileFilter(filter);
              int state =file.showSaveDialog(null);
              String path="";
              if(state == JFileChooser.APPROVE_OPTION)
              {
                  path=file.getSelectedFile().getAbsolutePath();
              }
                                 
              return path;
          }
          public void populateJtablewithBrands()
          {
              brand_list=brand.brandlist();
              String[] columnname={"id","name"};
              Object[][] rows =new Object[brand_list.size()][columnname.length];
              for(int i=0;i<brand_list.size();i++)
              {
                  rows[i][0]=brand_list.get(i).getId();
                  rows[i][1]=brand_list.get(i).getName();
              }
              DefaultTableModel model=new DefaultTableModel(rows,columnname);
              JAllproductlist.setModel(model);
          }
          public void displaybrand_move()
          {
              Classes.Brand brand_select=brand_list.get(index);
              jSpinner_id.setValue(brand_select.getId());
              jTextField_name.setText(brand_select.getName());
              displaybyteimage(jLable_logo.getWidth(),jLable_logo.getHeight(),brand_select.getLogo(),jLable_logo);
              
              
          }
          
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        product_logo = new javax.swing.JLabel();
        product_logo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JAllproductlist = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_id = new javax.swing.JSpinner();
        jTextField_name = new javax.swing.JTextField();
        jLable_logo = new javax.swing.JLabel();
        jButton_brower = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jLable_imagePath = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 11, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Brands");
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
                .addGap(425, 425, 425)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(product_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(product_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(915, Short.MAX_VALUE)))
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

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, -1, -1));

        JAllproductlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JAllproductlist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JAllproductlist.setRowHeight(40);
        JAllproductlist.setSelectionBackground(new java.awt.Color(51, 153, 255));
        JAllproductlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAllproductlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JAllproductlist);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 120, 530, 362));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID :");
        jLabel1.setToolTipText("------");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 132, 45, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 173, -1, 43));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 222, 74, 38));

        jSpinner_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jSpinner_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 132, 115, 35));

        jTextField_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 173, 249, 37));

        jLable_logo.setBackground(new java.awt.Color(255, 255, 255));
        jLable_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLable_logo.setOpaque(true);
        jPanel3.add(jLable_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 222, 194, 161));

        jButton_brower.setBackground(new java.awt.Color(0, 204, 255));
        jButton_brower.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_brower.setForeground(new java.awt.Color(255, 255, 255));
        jButton_brower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-rental-37.png"))); // NOI18N
        jButton_brower.setText("Store ");
        jButton_brower.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton_brower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_browerActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_brower, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 429, 135, 34));

        btnadd.setBackground(new java.awt.Color(255, 153, 51));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-37.png"))); // NOI18N
        btnadd.setText("ADD");
        btnadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel3.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 475, 105, 40));

        txtupdate.setBackground(new java.awt.Color(255, 153, 51));
        txtupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtupdate.setForeground(new java.awt.Color(255, 255, 255));
        txtupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-update-37.png"))); // NOI18N
        txtupdate.setText("Update");
        txtupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });
        jPanel3.add(txtupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 475, 118, 40));

        btndelete.setBackground(new java.awt.Color(255, 153, 51));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-remove-34.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 475, -1, 40));

        btn_first.setBackground(new java.awt.Color(0, 204, 255));
        btn_first.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_first.setForeground(new java.awt.Color(255, 255, 255));
        btn_first.setText("<<");
        btn_first.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });
        jPanel3.add(btn_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 120, -1));

        btn_next.setBackground(new java.awt.Color(0, 204, 255));
        btn_next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText(">");
        btn_next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel3.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 111, -1));

        btn_last.setBackground(new java.awt.Color(0, 204, 255));
        btn_last.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_last.setForeground(new java.awt.Color(255, 255, 255));
        btn_last.setText(">>");
        btn_last.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });
        jPanel3.add(btn_last, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 111, -1));

        jLable_imagePath.setBackground(new java.awt.Color(255, 255, 255));
        jLable_imagePath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLable_imagePath.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLable_imagePath.setOpaque(true);
        jPanel3.add(jLable_imagePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 291, 34));

        btn_refresh.setBackground(new java.awt.Color(51, 255, 0));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 475, 136, 40));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 429, 128, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton_browerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_browerActionPerformed
      String image= set_image();
     display_image(jLable_logo.getWidth(),jLable_logo.getHeight(),image,jLable_logo);
      jLable_imagePath.setText(image);
    }//GEN-LAST:event_jButton_browerActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       
        try {
            String name=jTextField_name.getText();
            byte[] logo=Files.readAllBytes(Paths.get(jLable_imagePath.getText()));
           Classes.Brand  barns=new Classes.Brand(0,name,logo);
           brand.addbrand(name, logo);
           
        } catch (IOException ex) {
            Logger.getLogger(product_items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
            
        try {
            int id=(int) jSpinner_id.getValue();
            String name=jTextField_name.getText();
            byte[] logo;
            if(jLable_imagePath.getText().trim().equals(""))
            {
               logo= brand.getBrandByid(id).getLogo();
            }
            else
            {
                logo=Files.readAllBytes(Paths.get(jLable_imagePath.getText()));
            }
           Classes.Brand  brand =new Classes.Brand(id,name,logo);
           brand.update_brand(id, name, logo);
           
        } catch (IOException ex) {
            Logger.getLogger(product_items.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
    }//GEN-LAST:event_txtupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int id=(int) jSpinner_id.getValue();
        
        int confirm=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this brand?", "confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_NO_OPTION)
        {    
        brand.delete_brand(id);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void JAllproductlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAllproductlistMouseClicked
                
        int index=JAllproductlist.getSelectedRow();
        int id =Integer.valueOf(JAllproductlist.getValueAt(index, 0).toString());
        Classes.Brand brad= brand.getBrandByid(id);
        jSpinner_id.setValue(brad.getId());
       jTextField_name.setText(brad.getName());
       displaybyteimage(jLable_logo.getWidth(),jLable_logo.getHeight(),brad.getLogo(),jLable_logo);
        
    }//GEN-LAST:event_JAllproductlistMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
       populateJtablewithBrands();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(0);
        new home().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
        index=0;
         displaybrand_move();
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        index++;
        if(index>brand_list.size()-1)
        {
            index=brand_list.size()-1;
        }
         displaybrand_move();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
        index=brand_list.size()-1;
         displaybrand_move();
    }//GEN-LAST:event_btn_lastActionPerformed

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
            java.util.logging.Logger.getLogger(product_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JAllproductlist;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_brower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLable_imagePath;
    private javax.swing.JLabel jLable_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_id;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JLabel product_logo;
    private javax.swing.JLabel product_logo1;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
}