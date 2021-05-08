/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tunki
 */
public class Hospitalmain extends javax.swing.JFrame {
private JFrame frame;
Connection conn;
    
    public Hospitalmain() {
        initComponents();
        conn = DBConnect.connect();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPrintTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jUpdate = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jPatient = new javax.swing.JButton();
        jGP = new javax.swing.JButton();
        jDoctor = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jPrint = new javax.swing.JButton();
        jPrescription = new javax.swing.JButton();
        jLogin = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jInformation = new javax.swing.JTextField();
        jStorage = new javax.swing.JTextField();
        jDose = new javax.swing.JTextField();
        jNumberofTablets = new javax.swing.JTextField();
        jLOT = new javax.swing.JTextField();
        jIssuedDate = new javax.swing.JTextField();
        jExpDate = new javax.swing.JTextField();
        jDailyDose = new javax.swing.JTextField();
        jSideEffect = new javax.swing.JTextField();
        jInstructions = new javax.swing.JTextField();
        jMachines = new javax.swing.JTextField();
        jPatientID = new javax.swing.JTextField();
        jNFS = new javax.swing.JTextField();
        jPatientName = new javax.swing.JTextField();
        jDateOfBirth = new javax.swing.JTextField();
        jPatientAddress = new javax.swing.JTextField();
        jReferenceNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 230, 222), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEMS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1310, 80));

        jPanel3.setBackground(new java.awt.Color(143, 230, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 230, 222), 15));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel2.setText("PATIENT DESCRIPTION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(255, 255, 255))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 830, 60));

        jPanel4.setBackground(new java.awt.Color(143, 230, 222));

        jPrintTextArea1.setEditable(false);
        jPrintTextArea1.setColumns(20);
        jPrintTextArea1.setRows(5);
        jScrollPane2.setViewportView(jPrintTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 480, 440));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection", "Panado", "Ibuprofen", "Paracetemol", "Grandpa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel4.setText("Dose (mg):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setText("Number of Tablets:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setText("LOT:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel7.setText("Issued Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setText("Expire Date:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setText("Daily Dose:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setText("Possible Side Effects:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel11.setText("Storage Advice:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setText("Reference No:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jPanel5.setBackground(new java.awt.Color(143, 230, 222));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 229, 220), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(jUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, -1, -1));

        jReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jPanel5.add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 14, -1, -1));

        jPatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPatient.setText("Patient");
        jPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientActionPerformed(evt);
            }
        });
        jPanel5.add(jPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 14, -1, -1));

        jGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jGP.setText("GP Appointment");
        jGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGPActionPerformed(evt);
            }
        });
        jPanel5.add(jGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 14, -1, -1));

        jDoctor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDoctor.setText("Doctor");
        jDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoctorActionPerformed(evt);
            }
        });
        jPanel5.add(jDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 14, -1, -1));

        jDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 14, -1, -1));

        jExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel5.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 14, -1, -1));

        jPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPrint.setText("Print");
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });
        jPanel5.add(jPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 14, -1, -1));

        jPrescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPrescription.setText("Prescription");
        jPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrescriptionActionPerformed(evt);
            }
        });
        jPanel5.add(jPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 14, -1, -1));

        jLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLogin.setText("Logout");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jPanel5.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 14, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 1310, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel13.setText("Name of Tablets");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel14.setText("Using Machines:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel15.setText("Meds Instructions:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setText("Patient ID:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel17.setText("NHS Number:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel18.setText("Patient Name:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel19.setText("Date of Birth:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel20.setText("Patient Address:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel21.setText("Further Information:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jInformation.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 190, 30));

        jStorage.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 190, 30));

        jDose.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 190, 30));

        jNumberofTablets.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jNumberofTablets, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 190, 30));

        jLOT.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jLOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 190, 30));

        jIssuedDate.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jIssuedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 30));

        jExpDate.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 190, 30));

        jDailyDose.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jDailyDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDailyDoseActionPerformed(evt);
            }
        });
        getContentPane().add(jDailyDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 190, 30));

        jSideEffect.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jSideEffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSideEffectActionPerformed(evt);
            }
        });
        getContentPane().add(jSideEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 190, 30));

        jInstructions.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 190, 30));

        jMachines.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jMachines, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 190, 30));

        jPatientID.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 190, 30));

        jNFS.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jNFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 190, 30));

        jPatientName.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 30));

        jDateOfBirth.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 190, 30));

        jPatientAddress.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        getContentPane().add(jPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 190, 30));

        jReferenceNo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jReferenceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReferenceNoActionPerformed(evt);
            }
        });
        getContentPane().add(jReferenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 190, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Tablets", "Reference No", "Dose", "Number of Tablets", "LOT", "Issued Date", "Expire Date", "Daily Dose", "Possible Side Effects", "Information", "Storage Advice", "Machines", "Instructions", "Patient ID", "NHS Number", "Patient Name", "Date of Birth", "Patient Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 1310, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        String Name, Ref, dailyDose, Dose, NumberTablets, expDate, information, effect, issued, 
                instructons, storage, LOT, machines, NFS, DateofB, Address, Id, Pre;   
        
        Name = jPatientName.getText();
        Ref = jReferenceNo.getText();
        dailyDose = jDailyDose.getText();
        Dose = jDose.getText();
        NumberTablets = jNumberofTablets.getText();
        expDate = jExpDate.getText();
        information = jInformation.getText();
        effect = jSideEffect.getText();
        issued = jIssuedDate.getText();
        instructons = jInstructions.getText();
        storage = jStorage.getText();
        LOT = jLOT.getText();
        machines = jMachines.getText();
        NFS = jNFS.getText();
        DateofB = jDateOfBirth.getText();
        Address = jPatientAddress.getText();
        Id = jPatientID.getText();
    try {
        String st = "INSERT INTO `prescription`(`reference`,`dose`, "
                + "`numberOftablets`, `LOT`, `issued`, `expiredate`, "
                + "`dailydose`, `sideeffect`, `information`, `storage`, `machines`, "
                + "`instructions`, `patientid`, `NFS`, `patientname`, `dateofbirth`, "
                + "`patientaddress`)"
                + " VALUES ('"+Ref+"', '"+Dose+"', '"+NumberTablets+"', '"+LOT+"',"
                + " '"+issued+"', '"+expDate+"', '"+dailyDose+"', '"+effect+"', '"+information+"', "
                + " '"+storage+"', '"+machines+"', '"+instructons+"', '"+Id+"', '"+NFS+"',"
                + " '"+Name+"', '"+DateofB+"', '"+Address+"')";
        PreparedStatement sql = conn.prepareStatement(st);
        if(sql.execute()){
         JOptionPane.showMessageDialog(null, "Successfull");
        }
        else{
            JOptionPane.showMessageDialog(null, "Unsuccessful");
        }
        
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{jComboBox1.getSelectedItem().toString(),
        jReferenceNo.getText(), jDose.getText(), jNumberofTablets.getText(), 
        jLOT.getText(), jIssuedDate.getText(), jExpDate.getText() ,jDailyDose.getText(),
        jSideEffect.getText(), jInformation.getText(), jStorage.getText(), jMachines.getText(),
        jInstructions.getText(), jPatientID.getText(), jNFS.getText(), jPatientName.getText(), jDateOfBirth.getText(),
        jPatientAddress.getText()});        // TODO add your handling code here:
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jReferenceNo.setText("");
             jDailyDose.setText("");
             jDose.setText("");
             jNumberofTablets.setText("");
             jExpDate.setText("");
             jInformation.setText("");
             jSideEffect.setText("");
             jIssuedDate.setText("");
             jInstructions.setText("");
             jStorage.setText("");
             jLOT.setText("");
             jMachines.setText("");
             jNFS.setText("");
             jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
             jPrintTextArea1.setText("");     
             jComboBox1.getModel().setSelectedItem("Selection");// TODO add your handling code here:
    }//GEN-LAST:event_jResetActionPerformed

    private void jPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientActionPerformed

    private void jGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGPActionPerformed

    private void jDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDoctorActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confrim if you want to exit","Hospital Management Systems",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
                
    }//GEN-LAST:event_jExitActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
    try {
        jPrintTextArea1.print();
    } catch (PrinterException ex) {
        java.util.logging.Logger.getLogger(Hospitalmain.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jPrintActionPerformed

    private void jPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrescriptionActionPerformed
        String Name, Ref, dailyDose, Dose, NumberTablets, expDate, information, effect, issued, 
                instructons, storage, LOT, machines, NFS, DateofB, Address, Id, Pre;   
        
        Name = jPatientName.getText();
        Ref = jReferenceNo.getText();
        dailyDose = jDailyDose.getText();
        Dose = jDose.getText();
        NumberTablets = jNumberofTablets.getText();
        expDate = jExpDate.getText();
        information = jInformation.getText();
        effect = jSideEffect.getText();
        issued = jIssuedDate.getText();
        instructons = jInstructions.getText();
        storage = jStorage.getText();
        LOT = jLOT.getText();
        machines = jMachines.getText();
        NFS = jNFS.getText();
        DateofB = jDateOfBirth.getText();
        Address = jPatientAddress.getText();
        Id = jPatientID.getText();
        Pre = "";
        
        if ( jComboBox1.getSelectedItem().equals("Panado")){
            
            Pre = "Panando";
        }
        else if (jComboBox1.getSelectedItem().equals("Ibuprofen")){
            Pre = "Ibuprofen";
        }
        else if (jComboBox1.getSelectedItem().equals("Paracetemol")){
           Pre = "Paracetemol";
        }
        else if (jComboBox1.getSelectedItem().equals("Grandpa")){
          Pre = "Grandpa";
        }
        jPrintTextArea1.setText("");
        jPrintTextArea1.append("\t\t\n\tHospital Management System \n"
                +"\nPatient Name :\t\t"+Name
                +"\nPatient ID:\t\t"+Id
                +"\nDate of Birth:\t\t"+DateofB
                +"\nPatient Address:\t"+Address
                +"\nPrescription:\t\t"+Pre
                +"\n\nReference:\t\t"+Ref
                +"\nDaily Dose:\t\t"+dailyDose
                +"\nDose:\t\t"+Dose
                +"\nNumber of Tablets:\t"+NumberTablets
                +"\nIssued Date:\t\t"+issued
                +"\nExpire Date:\t\t"+expDate
                +"\nSide Effects:\t\t"+effect
                +"\nInstructons:\t\t"+instructons
                +"\nStorage Advice:\t\t"+storage
                +"\nLOT:\t\t"+LOT
                +"\nUsing Machnes:\t"+machines
                +"\n\n\t We care about your Health.");

    }//GEN-LAST:event_jPrescriptionActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        this.setVisible(false);
        Login login =new Login();
        login.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if ( jComboBox1.getSelectedItem().equals("Panado")){
             jReferenceNo.setText("Pan238371");
             jDailyDose.setText("3");
             jDose.setText("6");
             jNumberofTablets.setText("24");
             jExpDate.setText("05/7/2025");
             jInformation.setText("Place Dispensary");
             jSideEffect.setText("Laziness");
             jIssuedDate.setText("19/04/2021");
             jInstructions.setText("Take one after 3 hours");
             jStorage.setText("Store in cool dry place");
             jLOT.setText("474743");
             jMachines.setText("No");
             jNFS.setText("489483");
             jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
             
        }
        
        else if (jComboBox1.getSelectedItem().equals("Selection")){
            jReferenceNo.setText("");
             jDailyDose.setText("");
             jDose.setText("");
             jNumberofTablets.setText("");
             jExpDate.setText("");
             jInformation.setText("");
             jSideEffect.setText("");
             jIssuedDate.setText("");
             jInstructions.setText("");
             jStorage.setText("");
             jLOT.setText("");
             jMachines.setText("");
             jNFS.setText("");
            jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
             jPrintTextArea1.setText("");
        }
        
        else if (jComboBox1.getSelectedItem().equals("Ibuprofen")){
            jReferenceNo.setText("Ibru737373");
             jDailyDose.setText("2");
             jDose.setText("4");
             jNumberofTablets.setText("12");
             jExpDate.setText("12/12/2023");
             jInformation.setText("Place Dispensary");
             jSideEffect.setText("Bleeding");
             jIssuedDate.setText("14/04/2021");
             jInstructions.setText("Use water only");
             jStorage.setText("Cool, Dry place");
             jLOT.setText("383922");
             jMachines.setText("No");
             jNFS.setText("484983");
             jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
        }
        
        else if (jComboBox1.getSelectedItem().equals("Paracetemol")){
            jReferenceNo.setText("Par7373");
             jDailyDose.setText("4");
             jDose.setText("12");
             jNumberofTablets.setText("24");
             jExpDate.setText("02/04/2023");
             jInformation.setText("Place Dispensary");
             jSideEffect.setText("Dizziness");
             jIssuedDate.setText("11/05/2021");
             jInstructions.setText("Use water only");
             jStorage.setText("Cool, Dry place");
             jLOT.setText("47922");
             jMachines.setText("No");
             jNFS.setText("147393");
             jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
        }
        
        else {
            jReferenceNo.setText("Gr87373");
             jDailyDose.setText("2");
             jDose.setText("6");
             jNumberofTablets.setText("18");
             jExpDate.setText("02/10/2022");
             jInformation.setText("Place Dispensary");
             jSideEffect.setText("Dizziness");
             jIssuedDate.setText("07/04/2021");
             jInstructions.setText("Use water only");
             jStorage.setText("Cool, Dry place");
             jLOT.setText("5832");
             jMachines.setText("No");
             jNFS.setText("409383");
             jDateOfBirth.setText("");
             jPatientAddress.setText("");
             jPatientID.setText("");
             jPatientName.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jReferenceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReferenceNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReferenceNoActionPerformed

    private void jDailyDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDailyDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDailyDoseActionPerformed

    private void jSideEffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSideEffectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSideEffectActionPerformed

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
            java.util.logging.Logger.getLogger(Hospitalmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospitalmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospitalmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospitalmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospitalmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jDailyDose;
    private javax.swing.JTextField jDateOfBirth;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jDoctor;
    private javax.swing.JTextField jDose;
    private javax.swing.JButton jExit;
    private javax.swing.JTextField jExpDate;
    private javax.swing.JButton jGP;
    private javax.swing.JTextField jInformation;
    private javax.swing.JTextField jInstructions;
    private javax.swing.JTextField jIssuedDate;
    private javax.swing.JTextField jLOT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogin;
    private javax.swing.JTextField jMachines;
    private javax.swing.JTextField jNFS;
    private javax.swing.JTextField jNumberofTablets;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jPatient;
    private javax.swing.JTextField jPatientAddress;
    private javax.swing.JTextField jPatientID;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JButton jPrescription;
    private javax.swing.JButton jPrint;
    private javax.swing.JTextArea jPrintTextArea1;
    private javax.swing.JTextField jReferenceNo;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSideEffect;
    private javax.swing.JTextField jStorage;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}