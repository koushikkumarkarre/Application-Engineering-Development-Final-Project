/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;

/**
 *
 * @author koushik
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageEnterprise = new javax.swing.JButton();
        btnManageEntAdmin = new javax.swing.JButton();
        ManageNetwork = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageEnterprise.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 180, -1));

        btnManageEntAdmin.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        btnManageEntAdmin.setText("Manage Enterprise Admin");
        btnManageEntAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEntAdminActionPerformed(evt);
            }
        });
        add(btnManageEntAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        ManageNetwork.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        ManageNetwork.setText("Manage Network");
        ManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetworkActionPerformed(evt);
            }
        });
        add(ManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 180, -1));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton1.setText("Manage Work Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 180, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 740, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageWorkRequestJPanel manageWorkReq = new ManageWorkRequestJPanel(userProcessContainer,account, organization, enterprise, network, system);
        userProcessContainer.add("ManageWorkRequestJPanel",manageWorkReq);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetworkActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageEnterPrisePanel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageNetworkJPanel",manageEnterPrisePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageNetworkActionPerformed

    private void btnManageEntAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEntAdminActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterPrisePanel = new ManageEnterpriseAdminJPanel(userProcessContainer,system);
        userProcessContainer.add("ManageEnterpriseAdminJPanel",manageEnterPrisePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEntAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:

        ManageEnterpriseJPanel manageEnterPrisePanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageEnterpriseJPanel",manageEnterPrisePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageNetwork;
    private javax.swing.JButton btnManageEntAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
