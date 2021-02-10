//@author osman 17070006056
package jukebox;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class signUpScreen extends javax.swing.JFrame {

    public signUpScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signInPanel = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        close_Btn = new javax.swing.JLabel();
        signInIcon = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        signUp_Btn = new javax.swing.JButton();
        navigateToSignIn = new javax.swing.JLabel();
        reEnterPasswordLabel = new javax.swing.JLabel();
        reEnterPasswordField = new javax.swing.JPasswordField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lasttNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        signInPanel.setBackground(new java.awt.Color(237, 85, 59));

        signUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(204, 202, 204));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("Sign Up");

        close_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_x_40px.png"))); // NOI18N
        close_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_BtnMouseClicked(evt);
            }
        });

        signInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_login_rounded_up_50px.png"))); // NOI18N

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(signInIcon)
                .addGap(18, 18, 18)
                .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(signUpLabel)
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

        signUp_Btn.setBackground(new java.awt.Color(68, 108, 179));
        signUp_Btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signUp_Btn.setForeground(new java.awt.Color(204, 202, 204));
        signUp_Btn.setText("Sign Up");
        signUp_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_BtnActionPerformed(evt);
            }
        });

        navigateToSignIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        navigateToSignIn.setForeground(new java.awt.Color(204, 202, 204));
        navigateToSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navigateToSignIn.setText("Already Have an Account? Sign In! ");
        navigateToSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navigateToSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navigateToSignInMouseClicked(evt);
            }
        });

        reEnterPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reEnterPasswordLabel.setForeground(new java.awt.Color(236, 240, 241));
        reEnterPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reEnterPasswordLabel.setText("Re-Enter Password:");

        reEnterPasswordField.setBackground(new java.awt.Color(108, 122, 137));
        reEnterPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reEnterPasswordField.setForeground(new java.awt.Color(228, 241, 254));

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(236, 240, 241));
        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name:");

        firstNameField.setBackground(new java.awt.Color(108, 122, 137));
        firstNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(228, 241, 254));

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(236, 240, 241));
        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("Last Name:");

        lasttNameField.setBackground(new java.awt.Color(108, 122, 137));
        lasttNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lasttNameField.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanelLayout.createSequentialGroup()
                            .addComponent(firstNameLabel)
                            .addGap(104, 104, 104)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                            .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lastNameLabel)
                                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabel)
                                    .addComponent(userNameLabel)))
                            .addGap(106, 106, 106)
                            .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lasttNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(userPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(reEnterPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(navigateToSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reEnterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(userPanelLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(signUp_Btn))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lasttNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reEnterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reEnterPasswordLabel))
                .addGap(42, 42, 42)
                .addComponent(signUp_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(navigateToSignIn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_BtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_BtnMouseClicked

    private void navigateToSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navigateToSignInMouseClicked
        signInScreen sin = new signInScreen();
        sin.setVisible(true);
        sin.pack();
        sin.setLocationRelativeTo(null);
        sin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_navigateToSignInMouseClicked

    private void signUp_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_BtnActionPerformed
        String fname = firstNameField.getText();
        String lname = lasttNameField.getText();
        String uname = userNameField.getText();
        String pass = String.valueOf(passwordField.getPassword());
        String re_pass = String.valueOf(reEnterPasswordField.getPassword());
        if(uname.equals("")) {
            JOptionPane.showMessageDialog(null, "Add an Username");
        } else if(pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Add an Password");
        } else if(!pass.equals(re_pass)) {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match. Retype it Please");
        } else if(checkUserName(uname)) {
            JOptionPane.showMessageDialog(null, "Username is Already Taken");
        } else {
            PreparedStatement ps;
            String query = "INSERT INTO `java_signin_signup`(`user_FirstName`, `user_LastName`, `user_userName`, `user_Password`, `user_ReTypePassword`) VALUES (?,?,?,?,?)";
            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, uname);
                ps.setString(4, pass);
                ps.setString(5, re_pass);
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New User Successfully Created");
                }
            } catch (SQLException ex) {
                Logger.getLogger(signUpScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_signUp_BtnActionPerformed

    public boolean checkUserName(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `java_signin_signup` WHERE `user_userName` =?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if(rs.next()){
                checkUser = true;
            }
        } catch(SQLException e) {
            Logger.getLogger(signUpScreen.class.getName()).log(Level.SEVERE,null,e);
        }
        return checkUser;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_Btn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lasttNameField;
    private javax.swing.JLabel navigateToSignIn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField reEnterPasswordField;
    private javax.swing.JLabel reEnterPasswordLabel;
    private javax.swing.JLabel signInIcon;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JButton signUp_Btn;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
