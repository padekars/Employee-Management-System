/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.*;

/**
 *
 * @author snehal
 */
public class EncounterFrame extends javax.swing.JFrame {

    /**
     * Creates new form EncounterFrame
     */
    public EncounterFrame() {
        initComponents();
        
        populateTable();
        
        
        int patientArraySize = PatientDirectory.getPatientinstance().getPatientlist().size();
        String[] patientArray = new String[patientArraySize];
        int itr = 0;
        
        for(Patient p: PatientDirectory.getPatientinstance().getPatientlist()) {
            patientArray[itr++] = p.getPersonname();
        }
        
        pcombo.setModel(new javax.swing.DefaultComboBoxModel<>(patientArray));
        
        
        int doctorArraySize = DoctorDirectory.getDoctorinstance().getDoctorlist().size();
        String[] doctorArray = new String[doctorArraySize];
        int itr1 = 0;
        
        for(Doctor d: DoctorDirectory.getDoctorinstance().getDoctorlist()) {
            doctorArray[itr1++] = d.getPersonname();
        }
        
        dcombo.setModel(new javax.swing.DefaultComboBoxModel<>(doctorArray));
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
        txteid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pcombo = new javax.swing.JComboBox<>();
        dcombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edate = new javax.swing.JTextField();
        bpcombo = new javax.swing.JComboBox<>();
        txtoxy = new javax.swing.JTextField();
        hrcombo = new javax.swing.JComboBox<>();
        txttemp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        encountertable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Create Encounter");

        jLabel2.setText("Encounter ID");

        jLabel3.setText("Patient");

        jLabel4.setText("Doctor");

        pcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Blood Pressure");

        jLabel6.setText("Heart Rate");

        jLabel7.setText("Oxygen Level");

        jLabel8.setText("Temperature");

        jLabel9.setText("Encounter Date");

        bpcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Low" }));

        txtoxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoxyActionPerformed(evt);
            }
        });

        hrcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Low", "Medium" }));

        encountertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Patient", "Doctor", "Date", "Blood Pressure", "Heart Rate", "Oxygen Level", "Temperature"
            }
        ));
        jScrollPane1.setViewportView(encountertable);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(150, 150, 150)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pcombo, 0, 140, Short.MAX_VALUE)
                                    .addComponent(dcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edate)
                                    .addComponent(txteid))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bpcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hrcombo, 0, 139, Short.MAX_VALUE)
                                    .addComponent(txtoxy)
                                    .addComponent(txttemp)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bpcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(hrcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtoxy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtoxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoxyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoxyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                
        int selectedrowindex = encountertable.getSelectedRow();

        if (selectedrowindex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        
                DefaultTableModel model = (DefaultTableModel)encountertable.getModel();
                VitalSigns selectedemployee = (VitalSigns) model.getValueAt(selectedrowindex,0);
                VitalsignsDirectory.getVitalinstance().deleteVital(selectedemployee);
        
                JOptionPane.showMessageDialog(this,"Community record deleted.");
        
                populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String id = txteid.getText();
        int oxy = Integer.parseInt(txtoxy.getText());
        int temp = Integer.parseInt(txttemp.getText());
        String bp = bpcombo.getSelectedItem().toString();
        String hr = hrcombo.getSelectedItem().toString();
        String date = edate.getText();
        String p = pcombo.getSelectedItem().toString();
        String d = dcombo.getSelectedItem().toString();

        //Check if all fields are filled or not
        if(
            txteid.getText().equals("") ||
            txtoxy.getText().equals("")){

            JOptionPane.showMessageDialog(this,"Please fill data in all fields!.");
            return;

        }
         

        VitalSigns v = new VitalSigns(id,date, p,d,bp,hr,oxy,temp);
        VitalsignsDirectory.getVitalinstance().addNewVitals(v);
        //newpatientdirectory.addNewPatient(p);

        v.setEncounterID(id);
        v.setPatientname(p);
        v.setDoctorname(d);
        v.setEncounterDate(date);
        v.setBloodpressure(bp);
        v.setHeartrate(hr);
        v.setOxygenlevel(oxy);
        v.setTemperature(temp);
        
        
        
        JOptionPane.showMessageDialog(this,"New Encounter added!");
        // Clear all text fields after adding a city record
        txteid.setText("");
        txtoxy.setText("");
        txttemp.setText("");
        edate.setText("");
        
        populateTable();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblmodel = (DefaultTableModel) encountertable.getModel();
        if(encountertable.getSelectedRowCount()==1){

            String empid = txteid.getText();
            String p = pcombo.getSelectedItem().toString();
            String d = dcombo.getSelectedItem().toString();
            String date = edate.getText();
            int oxy = Integer.parseInt(txtoxy.getText());
            int temp = Integer.parseInt(txttemp.getText());
            String bp = bpcombo.getSelectedItem().toString();
            String hr = hrcombo.getSelectedItem().toString();
            

                        tblmodel.setValueAt(empid, encountertable.getSelectedRow(), 0);
                        tblmodel.setValueAt(p, encountertable.getSelectedRow(), 1);
                        tblmodel.setValueAt(d, encountertable.getSelectedRow(), 2);
                        tblmodel.setValueAt(date, encountertable.getSelectedRow(), 3);
                        tblmodel.setValueAt(bp, encountertable.getSelectedRow(), 4);
                        tblmodel.setValueAt(hr, encountertable.getSelectedRow(), 5);
                        tblmodel.setValueAt(oxy, encountertable.getSelectedRow(), 6);
                        tblmodel.setValueAt(temp, encountertable.getSelectedRow(), 7);
            
                        for(VitalSigns v : VitalsignsDirectory.getVitalinstance().getVitallist()){
                
                                if(v.getEncounterID().equals(empid)){

                                        v.setEncounterID(empid);
                                        v.setPatientname(p);
                                        v.setDoctorname(d);
                                        v.setEncounterDate(date);
                                        v.setBloodpressure(bp);
                                        v.setHeartrate(hr);
                                        v.setOxygenlevel(oxy);
                                        v.setTemperature(temp);
                    
                                    }
                            }
            JOptionPane.showMessageDialog(this,"Community record updated successfully!!.");
        }
        else{
            if(encountertable.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this,"Table is empty.");
            }
            else{
                //if row is not selected or multiple row are selected
                JOptionPane.showMessageDialog(this,"Please select a single community record to update");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncounterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bpcombo;
    private javax.swing.JComboBox<String> dcombo;
    private javax.swing.JTextField edate;
    private javax.swing.JTable encountertable;
    private javax.swing.JComboBox<String> hrcombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pcombo;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtoxy;
    private javax.swing.JTextField txttemp;
    // End of variables declaration//GEN-END:variables
private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)encountertable.getModel();
        model.setRowCount(0);
        for(VitalSigns p : VitalsignsDirectory.getVitalinstance().getVitallist()){
            Object[] row = new Object[10];
            row[0] = p;
            row[1] = p.getPatientname();
            row[2] = p.getDoctorname();
            row[3] = p.getEncounterDate();
            row[4] = p.getBloodpressure();
            row[5] = p.getHeartrate();
            row[6] = p.getOxygenlevel();
            row[7] = p.getTemperature(); 
            
            model.addRow(row);
        }
    }

}
