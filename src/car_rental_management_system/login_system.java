package car_rental_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Classes.data_base;
import java.lang.String;
/**
 *
 * @author Administrator
 */
public class login_system extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    

    /**
     * Creates new form login_system
     */
    public login_system() {
        initComponents();
        con= data_base.getconect();
        
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton_customer = new javax.swing.JRadioButton();
        jRadioButton_user = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        m_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m_password = new javax.swing.JLabel();
        checkbox = new javax.swing.JCheckBox();
        btn_login = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtUsername = new javax.swing.JComboBox<>();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        buttonGroup1.add(jRadioButton_customer);
        jRadioButton_customer.setText("customer");

        buttonGroup1.add(jRadioButton_user);
        jRadioButton_user.setText("username");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 153, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("                   LOGIN FORM                                           ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 46));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 216, -1, 42));

        txtname.setForeground(new java.awt.Color(51, 51, 51));
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 264, 263, 40));

        m_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_name.setForeground(new java.awt.Color(255, 0, 0));
        m_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                m_nameKeyReleased(evt);
            }
        });
        jPanel1.add(m_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 155, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 347, 136, 39));

        m_password.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(m_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 152, 28));

        checkbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkbox.setText("show password");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 128, 30));

        btn_login.setBackground(new java.awt.Color(51, 204, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 533, 107, 39));

        btncancel.setBackground(new java.awt.Color(255, 0, 0));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 533, 104, 39));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-male-user-64.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-password-64-2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 80, 60));

        jPasswordField1.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 392, 263, 44));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Don't  have An account Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 230, 30));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Customer", "Admin", " " }));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 170, 40));

        txtuser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("user_name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_rental_management_system/31e5f4b3028de0cff28b1d12e93e167a (1).jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 710, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
         if(checkbox.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_checkboxActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
                          String  username=txtname.getText();
                          String  pass=jPasswordField1.getText();
                          String  select=txtuser.getText();
                          int chk=0;
                          if(username.trim().equals(""))
                        {
                            JOptionPane.showMessageDialog(this, "please enter the full_name...");
                            chk=1;
                        }
                         if(pass.trim().equals(""))
                        {
                            JOptionPane.showMessageDialog(this, "please enter the password...");
                            chk=1;
                        }
                          if(select.trim().equals(""))
                        {
                            JOptionPane.showMessageDialog(this, "please enter the username...");
                            chk=1;
                        }
                          
                         int confirm=JOptionPane.showConfirmDialog(null, "Are you sure you want to username and password is correct?", "confirm",JOptionPane.YES_NO_OPTION);
                          if(confirm==JOptionPane.YES_NO_OPTION)
                        {
                          JOptionPane.showMessageDialog(this, "please wait...");
                        }
                            String name= txtname.getText();
                            String pas=jPasswordField1.getText();
                            String user=txtuser.getText();
                            
                            
                            
                            try{
                                String query="SELECT * FROM `user` WHERE first_name=? AND password=? AND username=?";                            
                                ps=con.prepareCall(query);
                                ps.setString(1, name);
                                ps.setString(2, pas);
                                ps.setString(3, user);
                                rs=ps.executeQuery();
                                if (rs.next()) 
                                {
                                   JOptionPane.showMessageDialog(this, "Your login was successful.");
                                   new home(username, user).setVisible(true);
                                   dispose(); 
                                } 
                                else 
                                {
                                    JOptionPane.showMessageDialog(this, "Your login failed. Please check your credentials.");
                                   int option = JOptionPane.showConfirmDialog(null, "Do you want to register?", "Register", JOptionPane.YES_NO_OPTION);
                                  if (option == JOptionPane.YES_OPTION) 
                                  {
                                     new Register_sign_up().setVisible(true);
                                  }
                               }
                            }catch(Exception e)
                            {
                                System.out.println(e);
                            }
                            
          
           
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
          if(txtname .getText().trim().toLowerCase().equals("email@gmail.com"))
        {
            txtname.setText("");
            txtname.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
          if(txtname.getText().trim().toLowerCase().equals("email@gmail.com")||txtname.getText().trim().toLowerCase().equals(""))
        {
            txtname.setText("username");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
         String password=String.valueOf(jPasswordField1.getPassword());
        
        if(password.trim().toLowerCase().equals("password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        String password=String.valueOf(jPasswordField1.getPassword());
        if(password.trim().toLowerCase().equals("password")||password.trim().toLowerCase().equals(""))
        {
            jPasswordField1.setText("password");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void m_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_nameKeyReleased
         String email_pattern="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern=Pattern.compile(email_pattern);
        Matcher match=pattern.matcher(txtname.getText());
        if(!match.matches())
        {
            m_name.setText("Email is incorrect");
        }else{
            m_name.setText(null);
        }
    }//GEN-LAST:event_m_nameKeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

             new Register_sign_up().setVisible(true);
             new login_system().setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        String username=txtUsername.getSelectedItem().toString();
        txtuser.setText(username);
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(login_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton_customer;
    private javax.swing.JRadioButton jRadioButton_user;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel m_name;
    private javax.swing.JLabel m_password;
    private javax.swing.JComboBox<String> txtUsername;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
