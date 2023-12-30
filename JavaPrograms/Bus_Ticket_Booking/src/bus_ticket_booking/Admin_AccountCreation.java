/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_ticket_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harid
 */
public class Admin_AccountCreation extends javax.swing.JFrame {

    /**
     * Creates new form Admin_AccountCreation
     */
    public Admin_AccountCreation() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        accountcreation = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        mobileno = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        conpass = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtmobno = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtcpass = new javax.swing.JPasswordField();
        CreateAccount = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(508, 381));
        setPreferredSize(new java.awt.Dimension(508, 381));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountcreation.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        accountcreation.setForeground(new java.awt.Color(255, 0, 0));
        accountcreation.setText("Account Creation");
        jPanel1.add(accountcreation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        name.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, -1));

        mobileno.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        mobileno.setText("Mobile No");
        jPanel1.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        emailid.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        emailid.setText("Email Id");
        jPanel1.add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        password.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        conpass.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        conpass.setText("Confirm Password");
        jPanel1.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 180, -1));

        txtmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtmobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 130, 180, -1));
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, -1));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, -1));
        jPanel1.add(txtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 180, -1));

        CreateAccount.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CreateAccount.setText("Create Account");
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(CreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 30));

        exit.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 30));

        Background.setIcon(new javax.swing.ImageIcon("D:\\java programs\\Project Reqirements\\Images\\Edited files\\4d845686128681.5d909dad4ddd3.jpg")); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobnoActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountActionPerformed
        // TODO add your handling code here:
        String name= txtname.getText();
        int mobno= Integer.parseInt(txtmobno.getText());
        String mail=txtmail.getText();
        String pass=txtpass.getText();
        String cpass=txtcpass.getText();
        //  System.out.println(pass);
        if(pass.equals(cpass))
        {
            JOptionPane.showMessageDialog(this,"User Account Created");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bus_ticket_booking","root","");
                PreparedStatement pst=con.prepareStatement("insert into Admin_AccountCreation values(?,?,?,?,?)");
                pst.setString(1, name);
                pst.setInt(2, mobno);
                pst.setString(3, mail);
                pst.setString(4,pass);
                pst.setString(5, cpass);
                pst.executeUpdate();
                pst.close();

            }catch (ClassNotFoundException ex) {
                Logger.getLogger(User_Create_Account.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(User_Create_Account.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            JOptionPane.showMessageDialog(this,"password field is wrong");
        }
    }//GEN-LAST:event_CreateAccountActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    this.setVisible(false);
        
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_AccountCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateAccount;
    private javax.swing.JLabel accountcreation;
    private javax.swing.JLabel conpass;
    private javax.swing.JLabel emailid;
    private javax.swing.JButton exit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mobileno;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmobno;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
