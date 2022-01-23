/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InstructorRole;

import Business.ChildCounsellor.ChildCounsellor;
import Business.EcoSystem;
import Business.Instructor.Instructor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrolForTrainingWorkRequest;
import Business.WorkQueue.FosterAChildWorkRequest;
import Business.WorkQueue.RentAHouseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class InstructorManageWorkReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InstructorManageWorkReqJPanel
     */
    JPanel userProcessContainer;
     public EcoSystem system;
    public Instructor currentInstructor;
    public Organization Organization;
    public String role;
    public UserAccount account;     
    public InstructorManageWorkReqJPanel(JPanel userProcessContainer,UserAccount account, Instructor currentInstructor,Organization organization,String Role, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.system = system;
        this.currentInstructor = currentInstructor;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateTable();
    }
    
    public void PopulateTable(){
        DefaultTableModel model = (DefaultTableModel)tblInstWorkRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest wq: this.system.getWorkQueue().getWorkRequestList()){
            if(wq.getClass() == EnrolForTrainingWorkRequest.class){
                Object[] row = new Object[model.getColumnCount()];
                EnrolForTrainingWorkRequest facwq = (EnrolForTrainingWorkRequest)wq;
                if(facwq.getInstructor().getName().equals(this.currentInstructor.getName())){
                    row[0] = facwq.getParent().getName();
                    row[1] = facwq.getReqId();
                    row[2] = facwq.getStatus();
                   ((DefaultTableModel) tblInstWorkRequest.getModel()).addRow(row);
                }
                
            }
        }
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
        tblInstWorkRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Instructor Work Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        tblInstWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Parent", "ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInstWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 620, 100));

        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/comp.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 740, 270));

        btnReject.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 90, 30));

        btnAccept.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InstructorWorkAreaJPanel fosterParent = (InstructorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInstWorkRequest.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblInstWorkRequest.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 1);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    EnrolForTrainingWorkRequest rwq= (EnrolForTrainingWorkRequest)wq;
                    rwq.setStatus("Approved by the Instructor");
                    JOptionPane.showMessageDialog(null, "Request Accepted.");

                }
            }
            PopulateTable();
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInstWorkRequest.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblInstWorkRequest.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 1);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    EnrolForTrainingWorkRequest rwq= (EnrolForTrainingWorkRequest)wq;
                    rwq.setStatus("Rejected by the Instructor");
                    JOptionPane.showMessageDialog(null, "Request Rejected");
                }
            }
            PopulateTable();
    }//GEN-LAST:event_btnRejectActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblInstWorkRequest;
    // End of variables declaration//GEN-END:variables
}