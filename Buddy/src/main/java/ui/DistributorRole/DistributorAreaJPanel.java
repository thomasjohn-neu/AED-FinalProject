/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DistributorRole;

import models.Distributor.Distributor;
import models.AppSystem;
import models.Person.Person;
import models.TaskQueue.TaskQueue;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.TaskQueue.Task;

/**
 *
 * @author thomas
 */
public class DistributorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DistributorAreaJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem business;
    private Person userAccount;

    public DistributorAreaJPanel(JPanel userProcessContainer, Person account, AppSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        populateDistributorTable();
        
        lblName.setText("Welcome "+account.getUsername());
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
        tblDistributor = new javax.swing.JTable();
        btnDeliver = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(48, 47, 67));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDistributor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "WorkID", "Item Name", "Expiry Date", "Pickup Location", "Drop Location", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblDistributor);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 580, 110));

        btnDeliver.setBackground(new java.awt.Color(255, 255, 255));
        btnDeliver.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeliver.setForeground(new java.awt.Color(67, 0, 163));
        btnDeliver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/hand-svgrepo-com.png"))); // NOI18N
        btnDeliver.setText("Deliver to Receiver");
        btnDeliver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });
        add(btnDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 206, 36));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Distribution List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("jLabel2");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDistributor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Task workRequest = (Task) tblDistributor.getValueAt(selectedRow, 0);
            if (workRequest.getStatus().equals("Delivered to Receiver")) {
                JOptionPane.showMessageDialog(null, "Already Assigned ", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                DeliverToReceiverJPanel dtrjp = new DeliverToReceiverJPanel(userProcessContainer, userAccount, business, workRequest);
                userProcessContainer.add("Deliver To Receiver", dtrjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }

    }//GEN-LAST:event_btnDeliverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDeliver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDistributor;
    // End of variables declaration//GEN-END:variables

    private void populateDistributorTable() {
        DefaultTableModel model = (DefaultTableModel) tblDistributor.getModel();

        model.setRowCount(0);
        int i = 0;
        for (Task admin : business.getWorkQueue().getWorkQueue()) {
            Object[] row = new Object[7];

            row[0] = admin;
            row[1] = admin.getProductList().getProductList().get(i).getProductName();
            row[2] = admin.getProductList().getProductList().get(i).getExpiryDate();
            row[3] = admin.getPickUpLocation();
            row[4] = admin.getDropOffLocation();
            row[5] = admin.getReceiver();
            row[6] = admin.getStatus();

            model.addRow(row);
            //i++;
        }
    }
}