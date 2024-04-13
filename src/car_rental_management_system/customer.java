/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_management_system;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    Classes.Customer_form Customer=new Classes.Customer_form(0, null, null, null, null,null);
     ArrayList<Classes.Customer_form> customer_list =Customer.customerlist();
     int index=0;
    public customer() {
        initComponents();
        this.setLocationRelativeTo(null);
       populateJtablewithlocation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    public void populateJtablewithlocation()
          {
              customer_list=Customer.customerlist();
              String[] columnname={"id","name","date of Birth","phone","email","address"};
              Object[][] rows =new Object[customer_list.size()][columnname.length];
              for(int i=0;i<customer_list.size();i++)
              {
                  rows[i][0]=customer_list.get(i).getId();
                  rows[i][1]=customer_list.get(i).getName();
                  rows[i][2]=customer_list.get(i).getDate_of_birth();
                   rows[i][3]=customer_list.get(i).getPhone();
                    rows[i][4]=customer_list.get(i).getEmail();
                     rows[i][5]=customer_list.get(i).getAddress();
                     
              }
              DefaultTableModel model=new DefaultTableModel(rows,columnname);
             jtable_customer_list.setModel(model);
          }
    public void displaylocation_move()
          {
              Classes.Customer_form customer=customer_list.get(index);
              jTextField_name.setText(customer.getName());
              jTextField_phone.setText(customer.getPhone());
              date_format.setDateFormatString(customer.getDate_of_birth());
              jTextField_email.setText(customer.getEmail());
             jTextArea_address.setText(customer.getAddress());
             
              
          }
       public boolean verify(String add_or_update) {
        String Name = jTextField_name.getText();
        String  PHONE = jTextField_phone.getText();
        String  EMAIL = jTextField_email.getText();
        String  ADDRESS = jTextArea_address.getText();
        boolean val=false;
       if(!Name.trim().equals("")&&!PHONE.trim().equals("")&&!EMAIL.trim().equals("")&&!ADDRESS.trim().equals(""))
       {
           val= true;
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Enter the valid model and Classs","invalid Information",2);
            val =false;
           
       }
       return val;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSpinner_id = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel_spi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        product_logo = new javax.swing.JLabel();
        product_logo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_customer_list = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        date_format = new com.toedter.calendar.JDateChooser();

        jButton1.setText("jButton1");

        jSpinner_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_spi.setBackground(new java.awt.Color(255, 51, 51));
        jPanel_spi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 11, true));
        jPanel_spi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CUSTOMER");
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
                .addContainerGap(451, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(product_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(product_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(979, Short.MAX_VALUE)))
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

        jPanel_spi.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 1130, -1));

        jtable_customer_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtable_customer_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtable_customer_list.setRowHeight(60);
        jtable_customer_list.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jtable_customer_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_customer_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_customer_list);

        jPanel_spi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 620, 460));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Address");
        jPanel_spi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, 38));

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
        jPanel_spi.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 105, 40));

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
        jPanel_spi.add(txtupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 118, 40));

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
        jPanel_spi.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, 40));

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
        jPanel_spi.add(btn_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, -1));

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
        jPanel_spi.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 111, -1));

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
        jPanel_spi.add(btn_last, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 111, -1));

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
        jPanel_spi.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 136, 40));

        jButton_exit.setBackground(new java.awt.Color(255, 0, 0));
        jButton_exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_exit.setText("Exit");
        jButton_exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        jPanel_spi.add(jButton_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 128, 32));

        jTextArea_address.setColumns(20);
        jTextArea_address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea_address.setRows(5);
        jScrollPane2.setViewportView(jTextArea_address);

        jPanel_spi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 310, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel_spi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel_spi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 30));
        jPanel_spi.add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 160, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth");
        jLabel6.setToolTipText("");
        jPanel_spi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone");
        jPanel_spi.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 30));
        jPanel_spi.add(jTextField_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email*");
        jPanel_spi.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));
        jPanel_spi.add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 40));
        jPanel_spi.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 30));
        jPanel_spi.add(jLocaleChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        date_format.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                date_formatAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel_spi.add(date_format, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_spi, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_spi, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtable_customer_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_customer_listMouseClicked
         int index=jtable_customer_list.getSelectedRow();
     jSpinner1.setValue(Integer.valueOf(jtable_customer_list.getValueAt(index, 0).toString()));
     jTextField_name.setText(jtable_customer_list.getValueAt(index, 1).toString());
     date_format.setDateFormatString(jtable_customer_list.getValueAt(index, 2).toString());
     jTextField_phone.setText(jtable_customer_list.getValueAt(index, 3).toString());
     jTextField_email.setText(jtable_customer_list.getValueAt(index, 4).toString());
      jTextArea_address.setText(jtable_customer_list.getValueAt(index, 5).toString());   
    }//GEN-LAST:event_jtable_customer_listMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
              String Name = jTextField_name.getText();
              String  PHONE = jTextField_phone.getText();
              String  EMAIL = jTextField_email.getText();
              String  ADDRESS = jTextArea_address.getText();
           SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(date_format.getDate());
              
            if(verify("add"))
            {
              Customer.addcustomer(Name, date, PHONE, EMAIL, ADDRESS);
            }
          
        } catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
   try {
              int id=(int)jSpinner1.getValue();
              String Name = jTextField_name.getText();
              String  PHONE = jTextField_phone.getText();
              String  EMAIL = jTextField_email.getText();
              String  ADDRESS = jTextArea_address.getText();
           SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(date_format.getDate());
              
            if(verify("edit"))
            {
              Customer.update_customer(id, Name, date, PHONE, EMAIL, ADDRESS);
            }
          
        } catch (Exception ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      int id=(int) jSpinner1.getValue();
        
        int confirm=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this customer?", "confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_NO_OPTION)
        {    
           Customer.deletecustomer(id);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
      
        index=0;
        displaylocation_move();

    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        index++;
        if(index>customer_list.size()-1)
        {
            index=customer_list.size()-1;
        }
        displaylocation_move();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
    
        index=customer_list.size()-1;
        displaylocation_move();

    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
    populateJtablewithlocation();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        System.out.println(0);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void date_formatAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_date_formatAncestorAdded
          
    }//GEN-LAST:event_date_formatAncestorAdded

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private com.toedter.calendar.JDateChooser date_format;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_spi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner_id;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTable jtable_customer_list;
    private javax.swing.JLabel product_logo;
    private javax.swing.JLabel product_logo1;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
}
