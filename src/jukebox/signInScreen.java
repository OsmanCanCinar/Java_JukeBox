//@author osman 17070006056
package jukebox;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class signInScreen extends javax.swing.JFrame {

    public signInScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signInPanel = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        close_Btn = new javax.swing.JLabel();
        signInIcon = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        signIn_Btn = new javax.swing.JButton();
        signUpLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        signInPanel.setBackground(new java.awt.Color(237, 85, 59));

        signInLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(204, 202, 204));
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Sign In");

        close_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_x_40px.png"))); // NOI18N
        close_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_BtnMouseClicked(evt);
            }
        });

        signInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_login_50px.png"))); // NOI18N

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(signInIcon)
                .addGap(18, 18, 18)
                .addComponent(signInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_Btn)
                .addContainerGap())
        );
        signInPanelLayout.setVerticalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signInLabel)
                    .addComponent(signInIcon))
                .addContainerGap())
        );

        userPanel.setBackground(new java.awt.Color(23, 63, 95));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(236, 240, 241));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(236, 240, 241));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");

        userNameField.setBackground(new java.awt.Color(108, 122, 137));
        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameField.setForeground(new java.awt.Color(228, 241, 254));

        passwordField.setBackground(new java.awt.Color(108, 122, 137));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(228, 241, 254));

        signIn_Btn.setBackground(new java.awt.Color(68, 108, 179));
        signIn_Btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signIn_Btn.setForeground(new java.awt.Color(204, 202, 204));
        signIn_Btn.setText("Sign In");
        signIn_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_BtnActionPerformed(evt);
            }
        });

        signUpLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(204, 202, 204));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("Sign Up for Free!");
        signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(userNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(signIn_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameField))
                .addGap(48, 48, 48)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addGap(22, 22, 22)
                .addComponent(signIn_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_BtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_BtnMouseClicked

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        signUpScreen suc = new signUpScreen();
        suc.setVisible(true);
        suc.pack();
        suc.setLocationRelativeTo(null);
        suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void signIn_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_BtnActionPerformed
       PreparedStatement ps;
       ResultSet rs;
       String uname = userNameField.getText();
       String pass =  passwordField.getText();
       String query = "SELECT * FROM `java_signin_signup` WHERE `user_userName` =? AND `user_Password` =?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2,pass);
            rs = ps.executeQuery();
            if(rs.next()) {
                homeScreen hs = new homeScreen();
                hs.setVisible(true);
                hs.pack();
                hs.setLocationRelativeTo(null);
                hs.greetingLabel1.setText("Welcome " + uname);
            }
            else {
                JOptionPane.showMessageDialog(null, "Username/Password Incorrect!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(signInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signIn_BtnActionPerformed
   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(signInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signInScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_Btn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel signInIcon;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JButton signIn_Btn;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
