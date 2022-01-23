/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TreasurerRole;

import Business.Enterprise.FundRaiserEnterprise;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Koushik
 */
public class FundRaiserBarGraphs extends javax.swing.JPanel {

    /**
     * Creates new form FundRaiserBarGraphs
     */
    FundRaiserEnterprise enterprise;
    public FundRaiserBarGraphs(FundRaiserEnterprise fr) {
        this.enterprise = fr;
        populateGraph();
        
    }
    
    public void populateGraph(){
        DefaultCategoryDataset dcd=new DefaultCategoryDataset();
        dcd.setValue(enterprise.BankBalance, "1", "Enterprise bank balance");
        dcd.setValue(enterprise.DonationsRecieved, "1", "Donations Recieved");
        dcd.setValue(enterprise.StipendsDispensed, "1", "Stipends Dispensed.");

 

        JFreeChart jChart=ChartFactory.createBarChart("K","D","S",dcd,PlotOrientation.VERTICAL,true,true,false);
        
        CategoryPlot plot = jChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrame=new ChartFrame("Koushik",jChart,true);
        chartFrame.setVisible(true);
        chartFrame.setSize(500,400);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 214, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Report"));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 680, 400));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}