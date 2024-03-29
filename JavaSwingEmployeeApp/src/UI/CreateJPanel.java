/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.io.File;
import javax.swing.JFileChooser;
import model.EmployeeHistory;
import model.Employees;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import java.lang.Character;
import java.util.regex.*;

/**
 *
 * @author snehal
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     * 
     */
    EmployeeHistory history;
    String selectedimgpath ="";
    public CreateJPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
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
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblPhno = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtPhno = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnBrowseImage = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblnameerror = new javax.swing.JLabel();
        lblEmpIderror = new javax.swing.JLabel();
        lblageerror = new javax.swing.JLabel();
        lblgendererror = new javax.swing.JLabel();
        lblstartdateerror = new javax.swing.JLabel();
        lblemailerror = new javax.swing.JLabel();
        lblphnoerror = new javax.swing.JLabel();
        lbllevelerror = new javax.swing.JLabel();
        lblteaminfoerror = new javax.swing.JLabel();
        lblpostitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(850, 750));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee");

        lblName.setText("Name:");

        lblEmpId.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblStartDate.setText("Start Date:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });

        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStartDateKeyReleased(evt);
            }
        });

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblPosTitle.setText("Position Title:");

        lblPhno.setText("Cell Phone Number:");

        lblEmail.setText("Email address:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLevelKeyReleased(evt);
            }
        });

        txtTeamInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeamInfoKeyReleased(evt);
            }
        });

        txtPosTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPosTitleKeyReleased(evt);
            }
        });

        txtPhno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhnoKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnBrowseImage.setText("Upload Image:");
        btnBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImageActionPerformed(evt);
            }
        });

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnameerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblnameerror.setForeground(new java.awt.Color(255, 0, 0));

        lblEmpIderror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblEmpIderror.setForeground(new java.awt.Color(255, 0, 0));

        lblageerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblageerror.setForeground(new java.awt.Color(255, 0, 0));

        lblgendererror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblgendererror.setForeground(new java.awt.Color(255, 0, 0));

        lblstartdateerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblstartdateerror.setForeground(new java.awt.Color(255, 0, 51));

        lblemailerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblemailerror.setForeground(new java.awt.Color(255, 0, 0));
        lblemailerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblemailerrorMouseReleased(evt);
            }
        });
        lblemailerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblemailerrorKeyReleased(evt);
            }
        });

        lblphnoerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblphnoerror.setForeground(new java.awt.Color(255, 0, 0));

        lbllevelerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lbllevelerror.setForeground(new java.awt.Color(255, 0, 0));

        lblteaminfoerror.setFont(new java.awt.Font("Helvetica Neue", 0, 8)); // NOI18N
        lblteaminfoerror.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBrowseImage)
                    .addComponent(lblStartDate)
                    .addComponent(lblGender)
                    .addComponent(lblAge)
                    .addComponent(lblEmpId)
                    .addComponent(lblName))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStartDate)
                            .addComponent(lblageerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtAge)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblnameerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmpIderror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmpId)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblLevel)
                                    .addComponent(lblPosTitle)
                                    .addComponent(lblPhno)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(lblEmail))))
                    .addComponent(lblgendererror)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblstartdateerror)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSave)
                        .addGap(220, 220, 220)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblteaminfoerror)
                    .addComponent(txtPosTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txtTeamInfo)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLevel)
                    .addComponent(txtPhno)
                    .addComponent(lblphnoerror)
                    .addComponent(lbllevelerror)
                    .addComponent(lblpostitle)
                    .addComponent(lblemailerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnameerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbllevelerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpIderror)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmpId)
                        .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTeamInfo))
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblteaminfoerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPosTitle)
                        .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2)
                .addComponent(lblageerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhno)
                    .addComponent(lblGender)
                    .addComponent(txtPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblgendererror)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStartDate)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(btnBrowseImage))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblstartdateerror))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btnSave))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblphnoerror)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblemailerror)))
                .addGap(336, 336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String id = txtEmpId.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String date = txtStartDate.getText();
        String level = txtLevel.getText();
        String teaminfo = txtTeamInfo.getText();
        String phno = txtPhno.getText();
        String email = txtEmail.getText();
        String title = txtPosTitle.getText();
        
        
        
        
        Employees e = history.addNewEmployee();
        
        e.setName(name);
        e.setEmployeeId(id);
        e.setAge(age);
        e.setGender(gender);
        e.setStartDate(date);
        e.setLevel(level);
        e.setTeamInfo(teaminfo);
        e.setPositionTitle(title);
        e.setPhonenumber(phno);
        e.setEmailId(email);
        e.setPhoto(selectedimgpath);
        
        //Check if all fields are filled or not
        if(txtName.getText().equals("") || 
           txtEmpId.getText().equals("") ||
           txtAge.getText().equals("") ||
           txtGender.getText().equals("") ||
           txtLevel.getText().equals("") ||
           txtStartDate.getText().equals("") ||
           txtPosTitle.getText().equals("") ||
           txtTeamInfo.getText().equals("") ||
           txtPhno.getText().equals("") ||
           txtEmail.getText().equals("") || lblImage.getIcon()==null){
            
        JOptionPane.showMessageDialog(this,"Please fill data in all fields!.");
        return;
        }
        
        JOptionPane.showMessageDialog(this,"New Employee added!");
        // Clear all text fields after adding a employee record
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPhno.setText("");
        txtEmail.setText("");
        txtPosTitle.setText("");
        lblImage.setIcon(null);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImageActionPerformed
        // TODO add your handling code here:
        
        JFileChooser browseimgfile = new JFileChooser();
        FileNameExtensionFilter ef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseimgfile.addChoosableFileFilter(ef);
        int showDialogue = browseimgfile.showOpenDialog(null);
        if(showDialogue == JFileChooser.APPROVE_OPTION){
            File selectedimgfile = browseimgfile.getSelectedFile();
            selectedimgpath = selectedimgfile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedimgpath);
            ImageIcon ii = new ImageIcon(selectedimgpath);
            Image image = ii.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon (image));
            
        }
        
        
        
    }//GEN-LAST:event_btnBrowseImageActionPerformed
    //Data validation for all fields
    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[a-zA-Z]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtName.getText());
        if(!match.matches()){
            lblnameerror.setText("Name is incorrect. Please enter only characters.");
        }
        else{
            lblnameerror.setText(null);
        }
        
    
       
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[a-zA-Z0-9]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtEmpId.getText());
        if(!match.matches()){
            lblEmpIderror.setText("Employee ID is incorrect. Please enter characters and numbers only.");
        }
        else{
            lblEmpIderror.setText(null);
        }
        
        
        
    }//GEN-LAST:event_txtEmpIdKeyReleased

    private void lblemailerrorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblemailerrorMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblemailerrorMouseReleased

    private void lblemailerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblemailerrorKeyReleased
        // TODO add your handling code here:
        
        
        String pattern = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtEmail.getText());
        if(!match.matches()){
            lblemailerror.setText("Email ID is incorrect. Please enter valid email ID.");
        }
        else{
            lblemailerror.setText(null);
        }
        
        
        
    }//GEN-LAST:event_lblemailerrorKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        
        
        String pattern = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtEmail.getText());
        if(!match.matches()){
            lblemailerror.setText("Email ID is incorrect. Please enter valid email ID.");
        }
        else{
            lblemailerror.setText(null);
        }
        
        
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPhnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhnoKeyReleased
        // TODO add your handling code here:
        
        
        String pattern = "^[0-9]{0,10}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtPhno.getText());
        if(!match.matches()){
            lblphnoerror.setText("Phone number is incorrect. Please enter 10 digits only");
        }
        else{
            lblphnoerror.setText(null);
        }
        
    }//GEN-LAST:event_txtPhnoKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[0-9]{0,3}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtAge.getText());
        if(!match.matches()){
            lblageerror.setText("Age is incorrect. Please enter 3 digits only");
        }
        else{
            lblageerror.setText(null);
        }
        
        
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[a-zA-Z]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtGender.getText());
        if(!match.matches()){
            lblgendererror.setText("Gender is incorrect. Please enter only characters.");
        }
        else{
            lblgendererror.setText(null);
        }
        
        
        
    }//GEN-LAST:event_txtGenderKeyReleased

    private void txtLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[0-9]{0,3}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtLevel.getText());
        if(!match.matches()){
            lbllevelerror.setText("Level is incorrect. Please enter 3 digits only.");
        }
        else{
            lbllevelerror.setText(null);
        }
        
        
        
    }//GEN-LAST:event_txtLevelKeyReleased

    private void txtStartDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyReleased
        // TODO add your handling code here:
        
        String pattern = "^[0-9]{0,2}[/][0-9]{0,2}[/][0-9]{0,4}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtStartDate.getText());
        if(!match.matches()){
            lblstartdateerror.setText("Date is incorrect. Please enter in MM/DD/YYYY.");
        }
        else{
            lblstartdateerror.setText(null);
        }
        
        
        
    }//GEN-LAST:event_txtStartDateKeyReleased

    private void txtTeamInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamInfoKeyReleased
        // TODO add your handling code here:
        
        
        String pattern = "^[a-zA-Z]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtTeamInfo.getText());
        if(!match.matches()){
            lblteaminfoerror.setText("Team Info is incorrect. Please enter only characters.");
        }
        else{
            lblteaminfoerror.setText(null);
        }
        
        
        
        
    }//GEN-LAST:event_txtTeamInfoKeyReleased

    private void txtPosTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosTitleKeyReleased
        // TODO add your handling code here:
        String pattern = "^[a-zA-Z]{0,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(txtPosTitle.getText());
        if(!match.matches()){
            lblpostitle.setText("Position Title is incorrect. Please enter only characters.");
        }
        else{
            lblpostitle.setText(null);
        }
        
        
        
        
    }//GEN-LAST:event_txtPosTitleKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpIderror;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhno;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblageerror;
    private javax.swing.JLabel lblemailerror;
    private javax.swing.JLabel lblgendererror;
    private javax.swing.JLabel lbllevelerror;
    private javax.swing.JLabel lblnameerror;
    private javax.swing.JLabel lblphnoerror;
    private javax.swing.JLabel lblpostitle;
    private javax.swing.JLabel lblstartdateerror;
    private javax.swing.JLabel lblteaminfoerror;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhno;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
