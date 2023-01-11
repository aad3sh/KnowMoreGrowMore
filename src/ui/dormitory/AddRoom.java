/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.dormitory;

import businesslogic.dormitory.RoomBooking;
import businesslogic.dormitory.RoomBookingHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinal
 */
public class AddRoom extends javax.swing.JPanel {

    /**
     * Creates new form AddRoom
     */
//    HospitalEntryHistory HospitalHistory;
//    public AddRoom(HospitalEntryHistory HospitalHistory) {
//        initComponents();
//        this.HospitalHistory = HospitalHistory;
    //private EcoSystem ecoSystem;
     RoomBookingHistory historyroom;
    public AddRoom( RoomBookingHistory historyroom ){
         //   RoomBookingHistory historyroom) {
        initComponents();
       this.historyroom = historyroom;
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        txtRoomActive = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Room Number:");

        jLabel2.setText("Room Active(Y/N):");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Add Room Details");

        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });
        txtRoomNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRoomNumberKeyPressed(evt);
            }
        });

        txtRoomActive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRoomActiveKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addComponent(txtRoomActive, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(370, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
//        String RoomNumber = txtRoomNumber.getText();
//        String RoomActive = txtRoomActive.getText();
//        String Hospital = txtHospital.getText();
//        String Employee = txtEmployee.getText();
//        
//        RoomBookingHistory.addRoomNumber(txtRoomNumber.getText());
//        RoomBookignHistory.addRoomActive(txtRoomActive.getText());
//        
//        HospitalEntry x = HospitalHistory.addNewHospitalDetails();
//        x.setRoomNumber(RoomNumber);
//        x.setRoomActive(RoomActive);
//        x.setEmployee(Employee);
//        x.setHospital(Hospital);

        String RoomNumber = txtRoomNumber.getText();
        String RoomActive = txtRoomActive.getText();
//        String Date = txtDate.getText();
//        String UserName = txtUserName.getText();
 //       RoomBooking rm = ecoSystem.getRoomBookingHistory().addNewRoom();
        RoomBooking rm = historyroom.addNewRoom();
        System.out.println(historyroom.getHistoryroom().size());
        rm.setRoomNumber(RoomNumber);
        rm.setRoomActive(RoomActive);
//        rm.setDate(Date);
//        rm.setUserName(UserName);
        
        JOptionPane.showMessageDialog(this, "Room Details are Saved");
        
        txtRoomNumber.setText("");
        txtRoomActive.setText("");
        /*HospitalDetails.addCity(txtCity.getText());
        HospitalDetails.addCommunity(txtCommunity.getText());
        HospitalDetails.addEmployee(txtEmployee.getText());
        HospitalDetails.addHospital(txtHospital.getText());
        
        
        for(String s:HospitalDetails.getCities()){
            if(HospitalDetails.getCities().size() == 1){
                HospitalDetails.AddCityandCommunity(s, HospitalDetails.getCommunities());
            }
            else{
                
                Set<String> Keys = HospitalDetails.getCitykeys();
                for(String k:Keys){
                    if(txtCity.getText().equals(k)){
                        HospitalDetails.getCommunityArray(k).add(txtCommunity.getText());
                    }
                }
                
            }
            }*/
                
  
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRoomNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoomNumberKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar(); if(Character.isDigit(c)|| Character.isISOControl(c))
        {
            txtRoomNumber.setEditable(true);
        }
        else
        {
            txtRoomNumber.setEditable(false);
            JOptionPane.showMessageDialog(this, "Invalid Input \nenter room number in digits only");
        }
    }//GEN-LAST:event_txtRoomNumberKeyPressed

    private void txtRoomActiveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoomActiveKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    if(Character.isLetter(c)|| Character.isISOControl(c))
    {
        if(c == 'Y' ||c == 'N' || c == 'y'||c == 'n')
        {
            txtRoomActive.setEditable(true);
        }
        else
        {
            txtRoomActive.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter Y/y for Yes, N/n for No");
        }
    }
    }//GEN-LAST:event_txtRoomActiveKeyPressed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtRoomActive;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
