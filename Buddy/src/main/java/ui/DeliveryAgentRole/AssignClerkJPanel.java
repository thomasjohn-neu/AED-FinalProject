/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAgentRole;

import models.DeliveryAgency.Clerk;
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

public class AssignClerkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryManJPanel
     */
    private JPanel userProcessContainer;
    private Person account;
    Task workRequest;
    AppSystem system;

    public AssignClerkJPanel(JPanel userProcessContainer, Person account, Task workRequest, AppSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.workRequest = workRequest;
        this.system = system;
        initComponents();
        
        populateClerkTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClerkPerson = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Assign Clerk");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        tblClerkPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblClerkPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 460, 161));

        btnAssign.setBackground(new java.awt.Color(67, 0, 163));
        btnAssign.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign Clerk");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblClerkPerson.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a driver from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Clerk clerk  = (Clerk)tblClerkPerson.getValueAt(selectedRow, 0);   
            clerk.getWorkQueue().addWorkRequesttoQueue(workRequest);
            workRequest.setClerk(clerk);
            system.getClerkDirectory().addWorkRequesttoClerk(clerk, workRequest);
            
            JOptionPane.showMessageDialog(null, "Clerk has been assigned");

            account.getClerkList().addWorkRequesttoClerk(clerk, workRequest);
            workRequest.setStatus("Assigned to Clerk");
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
    private javax.swing.JTable tblClerkPerson;
    // End of variables declaration//GEN-END:variables

    private void populateClerkTable() {
    DefaultTableModel model = (DefaultTableModel) tblClerkPerson.getModel();

        model.setRowCount(0);
        
          for (Person admin : system.getUserAccountDirectory().getUserAccountList()) {
               
               if(admin.getUsername().equals(account.getUsername())) {
    
                Object[] row = new Object[2];
                
                for(Clerk clerk1: account.getClerkList().getClerkList())

                {
            
                row[0] = clerk1;
                row[1] = clerk1.getStatus();

                model.addRow(row);
                
                
                }
            }

        }    
    }
}
