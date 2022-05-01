/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.StoreAdminRole;

import models.AppSystem;
import models.Person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author naina
 */
public class ManageStoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoreJPanel
     */
    
    private JPanel userProcessContainer;
    private AppSystem ecosystem;
    private Person userAccount;
    public ManageStoreJPanel(JPanel userProcessContainer, Person account, AppSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        
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

        jLabel1 = new javax.swing.JLabel();
        btnAddContribution = new javax.swing.JButton();
        btnViewContribution = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(48, 47, 67));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Store");

        btnAddContribution.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAddContribution.setForeground(new java.awt.Color(67, 0, 163));
        btnAddContribution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/plus.png"))); // NOI18N
        btnAddContribution.setText("Add Contribution");
        btnAddContribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddContributionActionPerformed(evt);
            }
        });

        btnViewContribution.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnViewContribution.setForeground(new java.awt.Color(67, 0, 163));
        btnViewContribution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/note.png"))); // NOI18N
        btnViewContribution.setText("View Contribution History");
        btnViewContribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewContributionActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addGap(89, 89, 89)
                .addComponent(btnAddContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnViewContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddContributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddContributionActionPerformed
        // TODO add your handling code here:
        AddContributionJPanel acjp = new AddContributionJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Add Contribution", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddContributionActionPerformed

    private void btnViewContributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewContributionActionPerformed
        // TODO add your handling code here:
        ViewContributionHistoryJPanel vchjp = new ViewContributionHistoryJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("View Contribution History", vchjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewContributionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddContribution;
    private javax.swing.JButton btnViewContribution;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
