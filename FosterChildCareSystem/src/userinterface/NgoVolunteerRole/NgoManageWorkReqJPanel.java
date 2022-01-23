/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoVolunteerRole;

import Business.EcoSystem;
import Business.Instructor.Instructor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Voluteers.Volunteer;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author koushik
 */
public class NgoManageWorkReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoManageWorkReqJPanel
     */
     JPanel userProcessContainer;
     public EcoSystem system;
    public Volunteer currentVolunteer;
    public Organization Organization;
    public String role;
    public UserAccount account;    
    
    public NgoManageWorkReqJPanel(JPanel userProcessContainer,UserAccount account, Volunteer currentVolunteer,Organization organization,String Role, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.system = system;
        this.currentVolunteer = currentVolunteer;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCounsellorWorkRequest = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Volunteer Work Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        tblCounsellorWorkRequest.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblCounsellorWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCounsellorWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 620, 100));

        btnBack2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/donate.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 740, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NgoVolunteerWorkAreaJPanel fosterParent = (NgoVolunteerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCounsellorWorkRequest;
    // End of variables declaration//GEN-END:variables
}
