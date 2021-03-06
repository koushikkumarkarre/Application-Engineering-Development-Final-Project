/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HouseLessorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.HouseLessor.HouseLessor;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SysAdminRole.ManageEnterpriseJPanel;

/**
 *
 * @author Koushik
 */
public class HouseLessorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseLessorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    public HouseLessor currentHouseLessor;
    
    public HouseLessorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ComputeCurrentHouseLessor();

    }
    
    public void ComputeCurrentHouseLessor(){
        String name = this.account.getEmployee().getName();
        
        this.currentHouseLessor = this.enterprise.getHouseLessorDirectory().getHouseLessorByName(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewProfile = new javax.swing.JButton();
        btnManageWorkRequest = new javax.swing.JButton();
        manageHouses = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 180, 110));

        btnManageWorkRequest.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnManageWorkRequest.setText("Manage Work Request");
        btnManageWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestActionPerformed(evt);
            }
        });
        add(btnManageWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 110));

        manageHouses.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        manageHouses.setText("Manage Houses");
        manageHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHousesActionPerformed(evt);
            }
        });
        add(manageHouses, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 170, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/buyer2 (2).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 740, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
          HouseLessorViewProfileJPanel viewProfile = new HouseLessorViewProfileJPanel(userProcessContainer, account, currentHouseLessor, organization,account.getRole().toString(), system);
        userProcessContainer.add("HouseLessorViewProfileJPanel",viewProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnManageWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestActionPerformed
        // TODO add your handling code here:
         houseLessorManageWorkReqJPanel ManageReq = new houseLessorManageWorkReqJPanel(userProcessContainer, account, currentHouseLessor, organization,account.getRole().toString(), system);
        userProcessContainer.add("HouseLessorManageWorkReqJPanel",ManageReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageWorkRequestActionPerformed

    private void manageHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHousesActionPerformed
        // TODO add your handling code here:
         ManageHouseJPanel ManageReq = new ManageHouseJPanel(userProcessContainer, account, currentHouseLessor, organization,account.getRole().toString(), system);
        userProcessContainer.add("HouseLessorManageWorkReqJPanel",ManageReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHousesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageWorkRequest;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageHouses;
    // End of variables declaration//GEN-END:variables
}
