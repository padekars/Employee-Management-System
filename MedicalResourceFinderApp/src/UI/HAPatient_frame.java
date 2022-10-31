/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author snehal
 */
public class HAPatient_frame extends javax.swing.JFrame {

    /**
     * Creates new form Patient_frame
     */
    
    //PatientDirectory patientlist;
    public HAPatient_frame() {
        initComponents();
        //patientlist = new PatientDirectory();
        populateTable();
        
        
        int cityArraySize = CityDirectory.getCityinstance().getCitylist().size();
        String[] cityArray = new String[cityArraySize];
        int itr = 0;
        
        for(City city: CityDirectory.getCityinstance().getCitylist()) {
            cityArray[itr++] = city.getCityname();
        }
        
        pcity.setModel(new javax.swing.DefaultComboBoxModel<>(cityArray));
        
        
        int commArraySize = CommunityDirectory.getCommunityinstance().getCommunitylist().size();
        String[] communityArray = new String[commArraySize];
        int itr1 = 0;
        
        for(Community c: CommunityDirectory.getCommunityinstance().getCommunitylist()) {
            communityArray[itr1++] = c.getCommunityname();
        }
        
        pcommunity.setModel(new javax.swing.DefaultComboBoxModel<>(communityArray));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        txtpname = new javax.swing.JTextField();
        txtpage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        patienttable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lbliderror = new javax.swing.JLabel();
        lblnameerror = new javax.swing.JLabel();
        lblageerror = new javax.swing.JLabel();
        combobg = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pcity = new javax.swing.JComboBox<>();
        pcommunity = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Patient");

        jLabel1.setText("Patient ID");

        jLabel3.setText("Patient Name");

        jLabel4.setText("Patient Age");

        txtpid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpidKeyReleased(evt);
            }
        });

        txtpname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpnameKeyReleased(evt);
            }
        });

        txtpage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpageKeyReleased(evt);
            }
        });

        jButton1.setText("Create");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Patient Password");

        patienttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Patient Age", "Patient Bloodgroup"
            }
        ));
        patienttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patienttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patienttable);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Patient Bloodgroup");

        jButton4.setText("BACK");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbliderror.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lbliderror.setForeground(new java.awt.Color(255, 0, 0));

        lblnameerror.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblnameerror.setForeground(new java.awt.Color(255, 0, 0));

        lblageerror.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblageerror.setForeground(new java.awt.Color(255, 0, 0));

        combobg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+" }));

        jLabel7.setText("Patient City");

        jLabel8.setText("Patient Community");

        pcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pcommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(83, 83, 83)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbliderror)
                                .addComponent(txtpid, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(txtpname)
                                .addComponent(txtpage)
                                .addComponent(lblnameerror)
                                .addComponent(lblageerror)
                                .addComponent(txtpass)
                                .addComponent(combobg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pcity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pcommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 596, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbliderror)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnameerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblageerror)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(combobg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String name = txtpname.getText();
        String id = txtpid.getText();
        int age = Integer.parseInt(txtpage.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String dob = sdf.format(pdob.getDate());
         String bg = combobg.getSelectedItem().toString();
//        String bp = txtbp.getText();
//        String hb = txthb.getText();
String ppass = txtpass.getText();

        //Check if all fields are filled or not
        if(txtpname.equals("") ||
            txtpid.getText().equals("") ||
            txtpage.getText().equals("") ||
                bg.equals("")
                //||
            //dob.equals("")
                )
        {

            JOptionPane.showMessageDialog(this,"Please fill data in all fields!.");
            return;

        }

        //check if Patient Id already present
        for(Patient p : PatientDirectory.getPatientinstance().getPatientlist())
        {
            if(p.getPersonid().equals(id))
            {

                JOptionPane.showMessageDialog(this,"Username already exists..Please use different User ID!");
                txtpid.setText("");
                return;
            }
           

        }

        Patient p = new Patient(id,name,age,bg,ppass);
        PatientDirectory.getPatientinstance().addNewPatient(p);
        //newpatientdirectory.addNewPatient(p);

        p.setPersonname(name);
        p.setPersonid(id);
        p.setPersonage(age);
        p.setBloodgroup(bg);

        JOptionPane.showMessageDialog(this,"New Patient added!");
        // Clear all text fields after adding a employee record
        txtpname.setText("");
        txtpid.setText("");
        txtpage.setText("");
        //pdob.setDate(null);
        combobg.setSelectedIndex(0);
//        txtpass.setText("");
//        txtbp.setText("");
//        txthb.setText("");
//        
        populateTable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblmodel = (DefaultTableModel) patienttable.getModel();
        if(patienttable.getSelectedRowCount()==1){

            String name = txtpname.getText();
            String empid = txtpid.getText();
            String age = txtpage.getText();
            String bg = combobg.getSelectedItem().toString();

            tblmodel.setValueAt(empid, patienttable.getSelectedRow(), 0);
            tblmodel.setValueAt(name, patienttable.getSelectedRow(), 1);
            tblmodel.setValueAt(age, patienttable.getSelectedRow(), 2);
            tblmodel.setValueAt(bg, patienttable.getSelectedRow(), 3);

            for(Patient e : PatientDirectory.getPatientinstance().getPatientlist()){

                if(e.getPersonid().equals(empid)){
                    e.setPersonname(name);
                    e.setPersonage(Integer.parseInt(age));
                    e.setBloodgroup(bg);

                }
            }
            JOptionPane.showMessageDialog(this,"Patient record updated successfully!!.");
        }
        else{
            if(patienttable.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this,"Table is empty.");
            }
            else{
                //if row is not selected or multiple row are selected
                JOptionPane.showMessageDialog(this,"Please select a single patient record to update");
            }

        }
         txtpid.setText("");
        txtpage.setText("");
        //pdob.setDate(null);
        combobg.setSelectedIndex(0);
        txtpname.setText("");
        txtpass.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void patienttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patienttableMouseClicked
        // TODO add your handling code here:
        
         // TODO add your handling code here:
        DefaultTableModel tblmodel = (DefaultTableModel) patienttable.getModel();
        
        String tblid = tblmodel.getValueAt(patienttable.getSelectedRow(),0).toString();
        String tblname = tblmodel.getValueAt(patienttable.getSelectedRow(),1).toString();
        String tblage = tblmodel.getValueAt(patienttable.getSelectedRow(),2).toString();
        String tblbg = tblmodel.getValueAt(patienttable.getSelectedRow(),3).toString();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String dob = sdf.format(pdob.getDate());
        //String tbldob = tblmodel.getValueAt(jTable1.getSelectedRow(),3).toString();

        txtpname.setText(tblname);
        txtpid.setText(tblid);
        txtpage.setText(tblage);
        combobg.setSelectedItem(tblbg);
        //dob.setDate(tbldob);
        
        
    }//GEN-LAST:event_patienttableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtpidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpidKeyReleased
        // TODO add your handling code here:
        
        
        String pattern = "^[a-zA-Z0-9]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtpid.getText());
        if(!match.matches()){
            lbliderror.setText("ID is incorrect. Please enter characters or numbers.");
        }
        else{
            lbliderror.setText(null);
        }
        
    }//GEN-LAST:event_txtpidKeyReleased

    private void txtpnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnameKeyReleased
        // TODO add your handling code here:
        
        
         String pattern = "^[a-zA-Z]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtpname.getText());
        if(!match.matches()){
            lblnameerror.setText("Name is incorrect. Please enter only characters.");
        }
        else{
            lblnameerror.setText(null);
        }
        
    }//GEN-LAST:event_txtpnameKeyReleased

    private void txtpageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpageKeyReleased
        // TODO add your handling code here:
        
          String pattern = "^[0-9]{0,3}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtpage.getText());
        if(!match.matches()){
            lblageerror.setText("Age is incorrect. Please enter max 3 digits only");
        }
        else{
            lblageerror.setText(null);
        }
        
    }//GEN-LAST:event_txtpageKeyReleased

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
            java.util.logging.Logger.getLogger(HAPatient_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAPatient_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAPatient_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAPatient_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAPatient_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblageerror;
    private javax.swing.JLabel lbliderror;
    private javax.swing.JLabel lblnameerror;
    private javax.swing.JTable patienttable;
    private javax.swing.JComboBox<String> pcity;
    private javax.swing.JComboBox<String> pcommunity;
    private javax.swing.JTextField txtpage;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtpname;
    // End of variables declaration//GEN-END:variables
private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel)patienttable.getModel();
        model.setRowCount(0);
        for(Patient p : PatientDirectory.getPatientinstance().getPatientlist()){
            Object[] row = new Object[10];
            row[0] = p;
            row[1] = p.getPersonname();
            row[2] = p.getPersonage();
            row[3] = p.getBloodgroup();
            
            model.addRow(row);
        }
    }


}
