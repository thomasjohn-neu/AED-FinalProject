/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAgentRole;

import models.DeliveryAgency.Driver;
import models.DeliveryMan.DeliveryMan;
import models.AppSystem;
import models.Person.Person;
import models.Volunteer.Volunteer;
import models.TaskQueue.Task;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naina
 */

public class AssignDriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private Person account;
    Task workRequest;
    AppSystem system;

    public AssignDriverJPanel(JPanel userProcessContainer, Person account, Task workRequest, AppSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.workRequest = workRequest;
        this.system = system;
        initComponents();
        
        populateDriverTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryPerson = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 450, 161));

        btnAssign.setBackground(new java.awt.Color(67, 0, 163));
        btnAssign.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign Driver");
        btnAssign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/back.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Assign Driver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblDeliveryPerson.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a driver from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            Driver driver  = (Driver)tblDeliveryPerson.getValueAt(selectedRow, 0);   
            driver.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setDriver(driver);
            system.getDriverDirectory().addWorkRequesttoDriver(driver, workRequest);

            account.getDriverList().addWorkRequesttoDriver(driver, workRequest);
            //system.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setStatus("Assigned to Driver");
            JOptionPane.showMessageDialog(null, "Contribution assigned to Driver");

            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryPerson;
    // End of variables declaration//GEN-END:variables

    private void populateDriverTable() {
    DefaultTableModel model = (DefaultTableModel) tblDeliveryPerson.getModel();

        model.setRowCount(0);
        
          for (Person admin : system.getUserAccountDirectory().getUserAccountList()) {
               
               if(admin.getUsername().equals(account.getUsername())) {
                  //System.out.println(admin.getUsername()+" "+user.getUsername());
    
                Object[] row = new Object[3];
                
                System.out.println(account.getDriverList().getDriverList().size()+" DRIVER LIST SIZE in assign driver page");
                for(Driver driver1: account.getDriverList().getDriverList())

                {
                //System.out.println(driver1.getFirstName());
                row[0] = driver1;
                row[1] = driver1.getUserName();
                row[2] = driver1.getStatus();

                model.addRow(row);
                
                }
            }

        }    
    }
}
