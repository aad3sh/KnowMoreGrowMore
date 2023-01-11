/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.dormitory;

import businesslogic.dormitory.SalaryPayment;
import businesslogic.dormitory.SalaryPaymentHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static businesslogic.dormitory.SalaryPaymentHistory.historysal;

/**
 *
 * @author Hinal
 */
public class ViewSalaryDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewFeesDetails
     */
    
    SalaryPaymentHistory historysal;
    public ViewSalaryDetails(SalaryPaymentHistory historysal) {
        initComponents();
        this.historysal = historysal;
        System.out.println(historysal.getHistorysal().size());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtSalaryAmount = new javax.swing.JTextField();
        txtPaymentMonth = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalaryDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        lblCreateSigns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Salary Payment Details");

        lblTemparature.setText("Payment Month:");

        lblBloodPressure.setText("Salary Amount:");

        lblDate.setText("Date:");

        txtSalaryAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryAmountActionPerformed(evt);
            }
        });

        txtPaymentMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentMonthActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        tblSalaryDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Payment Month", "Fees Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalaryDetails);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalaryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblTemparature, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblDate)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTemparature))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtSalaryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblSalaryDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to Delete");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblSalaryDetails.getModel();
        SalaryPayment SelectedSalaryPayment = (SalaryPayment) table.getValueAt(SelectedIndexRow, 0);
        
        historysal.deleteSalaryPayment(SelectedSalaryPayment);
        
        populateTable();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblSalaryDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to View");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblSalaryDetails.getModel();
        SalaryPayment SelectedSalaryPayment = (SalaryPayment) table.getValueAt(SelectedIndexRow, 0);
        
        txtPaymentMonth.setText(String.valueOf(SelectedSalaryPayment.getPaymentMonth()));
        txtSalaryAmount.setText(String.valueOf(SelectedSalaryPayment.getSalaryAmount()));
        txtDate.setText(SelectedSalaryPayment.getDate());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPaymentMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentMonthActionPerformed

    private void txtSalaryAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryAmountActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTable tblSalaryDetails;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPaymentMonth;
    private javax.swing.JTextField txtSalaryAmount;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        System.out.println();
        
        DefaultTableModel table = (DefaultTableModel) tblSalaryDetails.getModel();
        table.setRowCount(0);
        System.out.println(historysal.getHistorysal().size());
        
        for(SalaryPayment vs: historysal.getHistorysal()){
                Object[] row = new Object[3];
                row[0] = vs;
                row[1] = vs.getPaymentMonth();
                row[2] = vs.getSalaryAmount();
            
                table.addRow(row);
                
        }
    }

}
