/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAdminRole;

import models.Contribution.Contribution;
import models.DeliveryAgent.DeliveryAgent;
import models.AppSystem;
import models.Products.Product;
import models.Products.ProductList;
import models.Person.Person;
import models.TaskQueue.TaskQueue;
import models.TaskQueue.Task;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naina
 */
public class AssignDeliveryAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryAgencyJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    Person user;
    Contribution contribution;
    Task workRequest;
    public AssignDeliveryAgencyJPanel(JPanel userProcessContainer, Person account, AppSystem system, Contribution contribution,Task workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = account;
        this.system = system;
        this.contribution = contribution;
        this.workRequest = workRequest;
        populateDeliveryAgencyTable();
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
        tblDeliveryAgency = new javax.swing.JTable();
        btnAssignDeliveryAgency = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveryAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryAgency);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 404, 91));

        btnAssignDeliveryAgency.setBackground(new java.awt.Color(67, 0, 163));
        btnAssignDeliveryAgency.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAssignDeliveryAgency.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignDeliveryAgency.setText("Assign Order");
        btnAssignDeliveryAgency.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAssignDeliveryAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryAgencyActionPerformed(evt);
            }
        });
        add(btnAssignDeliveryAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 150, 40));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignDeliveryAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryAgencyActionPerformed

        int selectedRow = tblDeliveryAgency.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String userName = (String) tblDeliveryAgency.getValueAt(selectedRow, 0);
            
            for(Person ua1 : system.getUserAccountDirectory().getUserAccountList()){
                if(ua1.getUsername().equals(userName)){
                    contribution.setStatus("Assigned to Agency");
                    workRequest.setStatus("Assigned to Agency");
                    workRequest.setDeliveryAgencyAdminName(ua1.getUsername());
                    ua1.getWorkQueue().addWorkRequesttoQueue(workRequest);
                    JOptionPane.showMessageDialog(null, "Assigned to Delivery Agency");
                    
                }
            }
            
        }
    }

    private void populateDeliveryAgencyTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveryAgency.getModel();

        model.setRowCount(0);
        for (DeliveryAgent admin : system.getDeliveryAgentDirectory().getDeliveryAgentDirectory()) {

//            for (DeliveryAgent deliveryAgent : system.getDeliveryAgentDirectory().getDeliveryAgentDirectory()) {
                Object[] row = new Object[1];
                row[0] = admin.getUserName();
                model.addRow(row);
//            }

        }
    }//GEN-LAST:event_btnAssignDeliveryAgencyActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDeliveryAgency;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryAgency;
    // End of variables declaration//GEN-END:variables
}
