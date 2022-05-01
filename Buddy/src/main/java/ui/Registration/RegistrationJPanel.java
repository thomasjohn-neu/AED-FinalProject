/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Registration;

import models.Contributor.Contributor;
import models.Distributor.Distributor;
import models.AppSystem;
import models.Registration.Registration;
import models.Role.ContributorRole;
import models.Role.DistributorRole;
import models.Role.VolunteerRole;
import models.Person.Person;
import models.Volunteer.Volunteer;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.MainJFrame;
//import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import models.Registration.Registration;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author thomas
 */
public class RegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    private String imgPath;
    
    public RegistrationJPanel(JPanel userProcessContainer, AppSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateRole();
        populateCarrier();
        populateLocation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        comboRole = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboLocation = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        cPasswordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnUploadPhoto = new javax.swing.JButton();
        comboCarrier = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(243, 244, 246));
        setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Manage Registrations");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        btnRegister.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 160, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        txtName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Confirm Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("User Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        txtUserName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, -1));

        comboRole.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoleActionPerformed(evt);
            }
        });
        add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Role");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Carrier");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        comboLocation.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 140, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Email");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 40, -1));

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 140, -1));

        txtPhone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Phone Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        passwordField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, -1));

        cPasswordField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(cPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Location");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Photo");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        btnUploadPhoto.setText("Upload Image");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });
        add(btnUploadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 140, -1));

        comboCarrier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(comboCarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        String name = txtName.getText();
        String userName = txtUserName.getText();
        
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        char[] passwordCharArray1 = cPasswordField.getPassword();
        String cpassword = String.valueOf(passwordCharArray1);
        
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String role = String.valueOf(comboRole.getSelectedItem());
        String carrier = String.valueOf(comboCarrier.getSelectedItem());
        String location = String.valueOf(comboLocation.getSelectedItem());
        
        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 2 || Pattern.matches("^[A-Za-z]+$", name) == false) {
                throw new Exception("Please enter valid  Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if (userName == null || userName.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (userName.length() < 2) {
                throw new Exception("Please enter valid User Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if (password == null || password.isEmpty()) {
                throw new NullPointerException("Password field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password should contain atleast one letter, one number, one special character ");

            return;
        }
        if ( password.equals(cpassword)){
            
        }else{
            JOptionPane.showMessageDialog(null, "Passwords dont match");
            return;
        }
        
        try {

            if (email == null || email.isEmpty()) {
                throw new NullPointerException("Email field is Empty");
            } else if (Pattern.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", email) == false) {
                throw new Exception("Invalid Email format");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Email is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Email format");

            return;
        }
        
        try {

            if (phone == null || phone.isEmpty()) {
                throw new NullPointerException("Phone Number field is Empty");
            } else if (Pattern.matches("^[0-9]{10}$", phone) == false) {
                throw new Exception("Invalid Phone Number format");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Phone Number is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number format");

            return;
        }
        
        if (imgPath == null){
                   JOptionPane.showMessageDialog(null, "Please upload a photo");
                   return;
               }
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName) == false) {
             JOptionPane.showMessageDialog(null, "  User Name already exists ");
         } 
        else{
         Registration registration = new Registration(name, role, userName, password, email, phone, carrier, location, imgPath, "New Request");
         system.getRegistrationDirectory().AddRegistration( registration, name, role, userName, password, email, phone, carrier, location, imgPath, "New Request");


        txtName.setText("");
        txtUserName.setText("");
        passwordField.setText("");
        cPasswordField.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        populateRole();
        populateCarrier();
        populateLocation();

        JOptionPane.showMessageDialog(null, "Registration Done! Please wait while we process your application");
     }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        
        JFileChooser uploadImageFile = new JFileChooser();
            //Filter image extension
            FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
            uploadImageFile.addChoosableFileFilter(filter);
            try{
            int showOpenDialogue = uploadImageFile.showOpenDialog(null);
            if ( showOpenDialogue == JFileChooser.APPROVE_OPTION ){
               File selectedImageFile = uploadImageFile.getSelectedFile();
               String selectedImagePath = selectedImageFile.getAbsolutePath();
               if (selectedImagePath == null){
                   JOptionPane.showMessageDialog(null, "Please upload a photo");
                   return;
               }
               else
                    imgPath = selectedImagePath;

            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error uploading photo");
            }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void comboRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JComboBox<String> comboCarrier;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateRole() {
        comboRole.removeAllItems();
        comboRole.addItem("Volunteer");
        comboRole.addItem("Contributor");
        comboRole.addItem("Receiver");
    }

    private void populateCarrier() {
        comboCarrier.removeAllItems();
        comboCarrier.addItem("ATT");
        comboCarrier.addItem("Sprint");
        comboCarrier.addItem("TMobile");
        comboCarrier.addItem("Verizon");
    }

    private void populateLocation() {
        comboLocation.removeAllItems();
        comboLocation.addItem("Back Bay");
        comboLocation.addItem("Chinatown");
        comboLocation.addItem("Roxbury");
    }
}
