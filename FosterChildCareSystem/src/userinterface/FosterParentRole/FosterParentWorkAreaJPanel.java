/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FosterAChildWorkRequest;
import Business.WorkQueue.RentAHouseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Koushik
 */
public class FosterParentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterParentWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    
    public Parent currentParent;
    public FosterParentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ComputeCurrentParent();
        labelheading.setText("Hello "+ this.currentParent.getName());
        lblBalance.setText("Your current accoiunt balance is "+ this.currentParent.Amount);
        this.Filldata();
    }
    
    public void Filldata(){
        for(WorkRequest wq: this.system.getWorkQueue().getWorkRequestList()){
            if(wq.getClass() == FosterAChildWorkRequest.class){
                FosterAChildWorkRequest fcwq = (FosterAChildWorkRequest)wq;
                if(fcwq.getParent().Name.equals(this.currentParent.getName())){
                     lblChilds.setText("Foster:  "+((FosterAChildWorkRequest)wq).child.Name);

                }
            }
            if(wq.getClass() == RentAHouseWorkRequest.class){
                RentAHouseWorkRequest frwq = (RentAHouseWorkRequest)wq;
                if(frwq.getParent().Name.equals(this.currentParent.getName())){
                    lblHouses.setText("Booked:  "+ ((RentAHouseWorkRequest)wq).house.getHouseName());
                }
            }
        }
    }
    
    public void ComputeCurrentParent(){
        String name = this.account.getEmployee().getName();
        
        this.currentParent = this.enterprise.getParentDirectory().getParentByName(name);
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
        btnRental = new javax.swing.JButton();
        btnFosterChild = new javax.swing.JButton();
        btnStipend = new javax.swing.JButton();
        btnTrainers = new javax.swing.JButton();
        labelheading = new javax.swing.JLabel();
        lblChilds = new javax.swing.JLabel();
        lblHouses = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 170, 110));

        btnRental.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnRental.setText("Rent A House");
        btnRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalActionPerformed(evt);
            }
        });
        add(btnRental, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 180, 110));

        btnFosterChild.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnFosterChild.setText("Foster A Child");
        btnFosterChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFosterChildActionPerformed(evt);
            }
        });
        add(btnFosterChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 170, 110));

        btnStipend.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnStipend.setText("Request A Stipend");
        btnStipend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStipendActionPerformed(evt);
            }
        });
        add(btnStipend, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 370, 110));

        btnTrainers.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnTrainers.setText("Enrol for Training");
        btnTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainersActionPerformed(evt);
            }
        });
        add(btnTrainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 180, 110));

        labelheading.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        labelheading.setText("Hello<parent name>");
        add(labelheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 220, 30));

        lblChilds.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        add(lblChilds, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 150, 30));

        lblHouses.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        add(lblHouses, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FosterParentRole/index(1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 430));

        lblBalance.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 320, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
         ViewProfileJPanel viewProfile=new ViewProfileJPanel(userProcessContainer,account,currentParent,organization,account.getRole().toString(), system);
         userProcessContainer.add("View Profile",viewProfile);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalActionPerformed
        // TODO add your handling code here:
        RentalJPanel rental=new RentalJPanel(userProcessContainer,account,currentParent,organization,account.getRole().toString(), system);
        userProcessContainer.add("Foster Child List",rental);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnRentalActionPerformed

    private void btnFosterChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFosterChildActionPerformed
        // TODO add your handling code here:
        FosterAChild fosterChild=new FosterAChild(userProcessContainer,account,currentParent,network,enterprise, system);
        userProcessContainer.add("Foster Child List",fosterChild);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFosterChildActionPerformed

    private void btnTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainersActionPerformed
        // TODO add your handling code here:
        TrainerJPanel trainer=new TrainerJPanel(userProcessContainer,account,currentParent,network,enterprise, system);
        userProcessContainer.add("View Trainers",trainer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTrainersActionPerformed

    private void btnStipendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStipendActionPerformed
        // TODO add your handling code here:
         FosterParentRequestAStipendJPanel stipend=new FosterParentRequestAStipendJPanel(userProcessContainer,account,currentParent,network,enterprise, system);
        userProcessContainer.add("Request Stipend",stipend);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnStipendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFosterChild;
    private javax.swing.JButton btnRental;
    private javax.swing.JButton btnStipend;
    private javax.swing.JButton btnTrainers;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelheading;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblChilds;
    private javax.swing.JLabel lblHouses;
    // End of variables declaration//GEN-END:variables
}
