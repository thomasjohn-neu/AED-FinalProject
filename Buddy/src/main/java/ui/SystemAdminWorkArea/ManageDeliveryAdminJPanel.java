/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import models.DeliveryAdmin.DeliveryAdmin;
import models.AppSystem;
import models.Role.DeliveryAdminRole;
import models.Person.Person;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomas
 */
public class ManageDeliveryAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryAdminJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    Person user;
    private String imgPath;

    public ManageDeliveryAdminJPanel(JPanel userProcessContainer, AppSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateDeliveryAdminTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryAdmin = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/plus.png"))); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setMaximumSize(new java.awt.Dimension(75, 30));
        btnCreate.setMinimumSize(new java.awt.Dimension(75, 30));
        btnCreate.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, -1));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/view.png"))); // NOI18N
        btnView.setText("View");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.setMaximumSize(new java.awt.Dimension(75, 30));
        btnView.setMinimumSize(new java.awt.Dimension(75, 30));
        btnView.setPreferredSize(new java.awt.Dimension(75, 30));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 90, -1));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setMaximumSize(new java.awt.Dimension(75, 30));
        btnDelete.setMinimumSize(new java.awt.Dimension(75, 30));
        btnDelete.setPreferredSize(new java.awt.Dimension(75, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 100, -1));

        btnRefresh.setBackground(new java.awt.Color(67, 0, 163));
        btnRefresh.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.setMaximumSize(new java.awt.Dimension(75, 30));
        btnUpdate.setMinimumSize(new java.awt.Dimension(75, 30));
        btnUpdate.setPreferredSize(new java.awt.Dimension(75, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, -1));

        tblDeliveryAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryAdmin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 404, 91));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("UserName");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 230, 40));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 210, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 230, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/contributors.png"))); // NOI18N
        jLabel4.setText("DeliveryAdmin List");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String name = txtName.getText();
        String userName = txtUserName.getText();

        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);


        String role = "Delivery Admin";

        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
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

            } else if (userName.length() < 5) {
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
                throw new NullPointerException("Pwd field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName) == false) {
            JOptionPane.showMessageDialog(null, "  User Name already exists ");
        } else {
            Person ua1 = system.getUserAccountDirectory().createUserAccount(name, userName, password, null, new DeliveryAdminRole());
            system.getUserAccountDirectory().updateUserAccount(user, name, userName, password);

            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            
            populateDeliveryAdminTable();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectRow = tblDeliveryAdmin.getSelectedRow();
        txtUserName.setEditable(false);

        if (selectRow >= 0) {
            String username = (String) tblDeliveryAdmin.getValueAt(selectRow, 1);
            String pwd = (String) tblDeliveryAdmin.getValueAt(selectRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            for( DeliveryAdmin deliveryAdmin : system.getDeliveryAdminDirectory().getDeliverAdmin()){
                if( username.equals(deliveryAdmin.getUserName())){
                    txtName.setText(deliveryAdmin.getName());
                    txtUserName.setText(deliveryAdmin.getUserName());
                    txtPassword.setText(deliveryAdmin.getPassword());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryAdmin.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblDeliveryAdmin.getValueAt(selectedRow, 1);
                String pwd = (String) tblDeliveryAdmin.getValueAt(selectedRow, 2);
                Person user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getContributorDirectory().deleteContributor(user.getUsername());

                populateDeliveryAdminTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateDeliveryAdminTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblDeliveryAdmin.getSelectedRow();

        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        String name = txtName.getText();
        String uname = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());

        try {
            if (name == null || name.isEmpty()) {
                throw new NullPointerException(" Name field is Empty");

            } else if (name.length() < 5 || Pattern.matches("^[A-Za-z]+$", name) == false) {
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
            if (uname == null || uname.isEmpty()) {
                throw new NullPointerException("User Name field is Empty");

            } else if (uname.length() < 5) {
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
                throw new NullPointerException("Pwd field is Empty");
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password) == false) {
                throw new Exception("Invalid Password");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        system.getUserAccountDirectory().updateUserAccount(user, name, uname, password);
        populateDeliveryAdminTable();
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateDeliveryAdminTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryAdmin.getModel();

        model.setRowCount(0);

        // Updating the contributorTable
        for (Person user : system.getUserAccountDirectory().getUserAccountList()) {

            if ("models.Role.DeliveryAdminRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];

                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();

                model.addRow(row);
            }

        }
    }
}
