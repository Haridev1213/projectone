/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_ticket_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harid
 */
public class User_login extends javax.swing.JFrame {

    /**
     * Creates new form User_login
     */
    public User_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminlog = new javax.swing.JLabel();
        boxpanel = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        logbutton = new javax.swing.JButton();
        createacc = new javax.swing.JButton();
        forgetpass = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminlog.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        adminlog.setForeground(new java.awt.Color(255, 255, 0));
        adminlog.setText("User Login");
        jPanel1.add(adminlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        boxpanel.setBackground(new java.awt.Color(233, 189, 218));
        boxpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        username.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        username.setText("User Name");

        pass1.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        pass1.setText("Password");

        txtname.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        logbutton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        logbutton.setText("Login");
        logbutton.setToolTipText("");
        logbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbuttonActionPerformed(evt);
            }
        });

        createacc.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        createacc.setText("Create Account");
        createacc.setToolTipText("");
        createacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccActionPerformed(evt);
            }
        });

        forgetpass.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        forgetpass.setText("Forget Password");
        forgetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetpassActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxpanelLayout = new javax.swing.GroupLayout(boxpanel);
        boxpanel.setLayout(boxpanelLayout);
        boxpanelLayout.setHorizontalGroup(
            boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                        .addGroup(boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forgetpass)
                            .addComponent(createacc))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                        .addComponent(logbutton)
                        .addGap(39, 39, 39))))
            .addGroup(boxpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(username)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                        .addGroup(boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boxpanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pass1))
                            .addGroup(boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(txtpass)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(46, 46, 46))))
        );
        boxpanelLayout.setVerticalGroup(
            boxpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxpanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createacc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgetpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(boxpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 150, 260));

        background.setIcon(new javax.swing.ImageIcon("D:\\java programs\\Project Reqirements\\Images\\Edited files\\resize-16444970541316067365resize1644480505967778022busbooking11.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void forgetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetpassActionPerformed
        // TODO add your handling code here:
        User_fpass ufp=new User_fpass();
        ufp.setVisible(true);
        
    }//GEN-LAST:event_forgetpassActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_exitActionPerformed

    private void logbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbuttonActionPerformed
        // TODO add your handling code here:
   String aname=txtname.getText();
   String pass=txtpass.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bus_ticket_booking","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from user_accountcreatiom");
            while(rs.next())
            {
               
                if(aname.equals(rs.getString(1))&&pass.equals(rs.getString(4)))
                        {
                            JOptionPane.showMessageDialog(this, "Login Success");
                            User_Control ua=new User_Control();
                            ua.setVisible(true);
                            
                        }
                else
                {
                    txtname.setText("");
                    txtpass.setText("");
                }
              
                  
                    
                     
                  } 
              
            
                             
                    
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_login.class.getName()).log(Level.SEVERE, null, ex);
        }

   
        
    }//GEN-LAST:event_logbuttonActionPerformed

    private void createaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccActionPerformed
        // TODO add your handling code here:
        User_Create_Account uc=new User_Create_Account();
        uc.setVisible(true);
    }//GEN-LAST:event_createaccActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

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
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlog;
    private javax.swing.JLabel background;
    private javax.swing.JPanel boxpanel;
    private javax.swing.JButton createacc;
    private javax.swing.JButton exit;
    private javax.swing.JButton forgetpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logbutton;
    private javax.swing.JLabel pass1;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
