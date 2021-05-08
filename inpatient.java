/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tunki
 */
public class inpatient extends javax.swing.JFrame {
    
    private JFrame frame;
    Connection conn;

    /**
     * Creates new form inpatient
     */
    public inpatient() {
        initComponents();
        conn = DBConnect.connect();
        RoomcomboCall();
        
    }
    
    public void RoomcomboCall() {
        
        String sql = "select * from room where status =?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "unallocated");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                jRoomComboBox.addItem(rs.getString("room_no"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inpatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRegDate = new javax.swing.JTextField();
        jPatientAddress = new javax.swing.JTextField();
        jContactNo = new javax.swing.JTextField();
        jPatientAge = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPatientID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jGenderComboBox = new javax.swing.JComboBox<>();
        jRoomComboBox = new javax.swing.JComboBox<>();
        jPatientName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jAddButton = new javax.swing.JButton();
        jSaveButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jSearchButton5 = new javax.swing.JButton();
        jCloseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPatientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPATIENT REGISTRATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 20, 550, 60);

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setText("Room NO");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(740, 190, 100, 25);

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel18.setText("Address");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(240, 340, 72, 25);

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel20.setText("Contact NO");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(240, 390, 103, 25);

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel19.setText("Gender");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(240, 290, 63, 25);

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel21.setText("Age");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(240, 240, 35, 25);

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel22.setText("Name");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(240, 190, 51, 25);

        jRegDate.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jRegDate);
        jRegDate.setBounds(910, 130, 210, 40);

        jPatientAddress.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jPatientAddress);
        jPatientAddress.setBounds(440, 330, 210, 40);

        jContactNo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jContactNo);
        jContactNo.setBounds(440, 380, 210, 40);

        jPatientAge.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jPatientAge);
        jPatientAge.setBounds(440, 230, 210, 40);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1370, 5));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 80, 1370, 10);

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel17.setText("Patient ID");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(240, 140, 87, 25);

        jPatientID.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientIDActionPerformed(evt);
            }
        });
        jPanel1.add(jPatientID);
        jPatientID.setBounds(440, 130, 210, 40);

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel23.setText("Reg Date");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(740, 140, 81, 25);

        jGenderComboBox.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jGenderComboBox);
        jGenderComboBox.setBounds(440, 280, 210, 40);

        jRoomComboBox.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jRoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jRoomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jRoomComboBox);
        jRoomComboBox.setBounds(910, 180, 210, 40);

        jPatientName.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jPatientName);
        jPatientName.setBounds(440, 180, 210, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jAddButton.setBackground(new java.awt.Color(204, 255, 255));
        jAddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jAddButton.setText("Add");
        jAddButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jAddButton);
        jAddButton.setBounds(230, 20, 130, 40);

        jSaveButton.setBackground(new java.awt.Color(204, 255, 255));
        jSaveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSaveButton.setText("Save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jSaveButton);
        jSaveButton.setBounds(390, 20, 130, 40);

        jDeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        jDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jDeleteButton);
        jDeleteButton.setBounds(550, 20, 130, 40);

        jSearchButton5.setBackground(new java.awt.Color(153, 255, 255));
        jSearchButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSearchButton5.setText("Search");
        jSearchButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jSearchButton5);
        jSearchButton5.setBounds(710, 20, 130, 40);

        jCloseButton.setBackground(new java.awt.Color(153, 255, 255));
        jCloseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCloseButton.setText("Close");
        jCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jCloseButton);
        jCloseButton.setBounds(860, 20, 130, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 450, 1370, 70);

        jPatientTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Address", "Contact No", "Reg Number", "Room Number"
            }
        ));
        jScrollPane1.setViewportView(jPatientTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 530, 930, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/health-2082630.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, 0, 1410, 770);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderComboBoxActionPerformed

    }//GEN-LAST:event_jGenderComboBoxActionPerformed

    private void jRoomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoomComboBoxActionPerformed

    }//GEN-LAST:event_jRoomComboBoxActionPerformed

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseButtonActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to close this window", "Hospital Management Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            mainmenu main = new mainmenu();
            this.setVisible(false);
            main.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCloseButtonActionPerformed

    private void jSearchButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButton5ActionPerformed
        inpatientsearch search = new inpatientsearch();
        search.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jSearchButton5ActionPerformed

    private void jPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientIDActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        String Name, ID, Age, Gender, Contact, RegDate, Room, Address;
        
        Name = jPatientName.getText();
        ID = jPatientID.getText();
        Age = jPatientAge.getText();
        Gender = jGenderComboBox.getSelectedItem().toString();
        Address = jPatientAddress.getText();
        Contact = jContactNo.getText();
        RegDate = jRegDate.getText();
        Room = jRoomComboBox.getSelectedItem().toString();
        
        try {
            String st = "INSERT INTO `inpatient`(`name`,`id`, "
                    + "`age`, `gender`, `address`, `contact`, `regdate`, `room`)"
                    + " VALUES ('" + Name + "', '" + ID + "', '" + Age + "', '" + Gender + "',"
                    + " '" + Address + "', '" + Contact + "', '" + RegDate + "', '" + Room + "')";
            PreparedStatement sql = conn.prepareStatement(st);
            sql.execute();
            JOptionPane.showMessageDialog(null, "Successfull");
            jPatientID.setText("");
            jPatientName.setText("");
            jPatientAge.setText("");
            jGenderComboBox.getSelectedItem().equals("");
            jPatientAddress.setText("");
            jContactNo.setText("");
            jRegDate.setText("");
            jRoomComboBox.getSelectedItem().equals("");
            String al = "Allocated";
            String update = "UPDATE `room` SET`status`='" + al + "' WHERE room_no ='" + Room + "' ";
            PreparedStatement up = conn.prepareStatement(update);
            up.execute();
            RoomcomboCall();
            conn.close();
            // TODO add your handling code here:*/
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
        String Name, ID, Age, Gender, Contact, RegDate, Room, Address;
        
        Name = jPatientName.getText();
        ID = jPatientID.getText();
        Age = jPatientAge.getText();
        Gender = jGenderComboBox.getSelectedItem().toString();
        Address = jPatientAddress.getText();
        Contact = jContactNo.getText();
        RegDate = jRegDate.getText();
        Room = jRoomComboBox.getSelectedItem().toString();
        
        DefaultTableModel model = (DefaultTableModel) jPatientTable.getModel();
        model.addRow(new Object[]{ID, Name, Age, Gender, Address, Contact, RegDate, Room});
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
         DefaultTableModel model = (DefaultTableModel) jPatientTable.getModel();
        if (jPatientTable.getSelectedRow() == -1) {
            if (jPatientTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No Data to delete", "Hospital Management System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select row to delete", "Hospital Management System", JOptionPane.OK_OPTION);
            }
        } else if (JOptionPane.showConfirmDialog(frame, "Confrim if you want to Delete this row", "Hospital Management Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            model.removeRow(jPatientTable.getSelectedRow());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JTextField jContactNo;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JComboBox<String> jGenderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPatientAddress;
    private javax.swing.JTextField jPatientAge;
    private javax.swing.JTextField jPatientID;
    private javax.swing.JTextField jPatientName;
    private javax.swing.JTable jPatientTable;
    private javax.swing.JTextField jRegDate;
    private javax.swing.JComboBox<String> jRoomComboBox;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchButton5;
    // End of variables declaration//GEN-END:variables
}
