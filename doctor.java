/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tunki
 */
public class doctor extends javax.swing.JFrame {

    private JFrame frame;

    /**
     * Creates new form inpatient
     */
    public doctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDoctorAge = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jDoctorId = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jDoctorName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jAddButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jSaveButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jMainButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jContactNo = new javax.swing.JTextField();
        jDepartment = new javax.swing.JComboBox<>();
        jGenderComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCTOR INFORMATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 20, 550, 60);

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setText("Department");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(740, 240, 120, 25);

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel21.setText("Age");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(240, 240, 35, 25);

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel22.setText("Name");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(240, 190, 51, 25);

        jDoctorAge.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jDoctorAge);
        jDoctorAge.setBounds(440, 230, 210, 40);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1370, 5));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 80, 1370, 10);

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel17.setText("Doctor ID");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(240, 140, 87, 25);

        jDoctorId.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jDoctorId);
        jDoctorId.setBounds(440, 130, 210, 40);

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel23.setText("Gender");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(740, 140, 80, 25);

        jDoctorName.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jDoctorName);
        jDoctorName.setBounds(440, 180, 210, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jAddButton.setBackground(new java.awt.Color(204, 255, 255));
        jAddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jAddButton.setText("Add");
        jAddButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jAddButton);
        jAddButton.setBounds(240, 20, 130, 40);

        jDeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        jDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jDeleteButton);
        jDeleteButton.setBounds(570, 20, 130, 40);

        jSaveButton.setBackground(new java.awt.Color(153, 255, 255));
        jSaveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSaveButton.setText("Save");
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jSaveButton);
        jSaveButton.setBounds(410, 20, 130, 40);

        jExitButton.setBackground(new java.awt.Color(153, 255, 255));
        jExitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jExitButton.setText("Exit");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(jExitButton);
        jExitButton.setBounds(740, 20, 130, 40);

        jMainButton.setBackground(new java.awt.Color(153, 255, 255));
        jMainButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMainButton.setText("Main Form");
        jPanel3.add(jMainButton);
        jMainButton.setBounds(910, 20, 140, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 340, 1370, 70);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Contact No", "Department"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 430, 810, 150);

        jLabel24.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel24.setText("Contact No");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(740, 190, 120, 25);

        jContactNo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jPanel1.add(jContactNo);
        jContactNo.setBounds(910, 180, 210, 40);

        jDepartment.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(jDepartment);
        jDepartment.setBounds(910, 230, 210, 40);

        jGenderComboBox.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jGenderComboBox);
        jGenderComboBox.setBounds(910, 130, 210, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/health-2082630.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1958, 950);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 34, 14);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDepartmentActionPerformed

    private void jGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderComboBoxActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed

        mainmenu main = new mainmenu();
        this.setVisible(false);
        main.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No Data to delete", "Hospital Management System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select row to delete", "Hospital Management System", JOptionPane.OK_OPTION);
            }
        } else if (JOptionPane.showConfirmDialog(frame, "Confrim if you want to Delete this row", "Hospital Management Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            model.removeRow(jTable1.getSelectedRow());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed

    }//GEN-LAST:event_jSaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jContactNo;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JComboBox<String> jDepartment;
    private javax.swing.JTextField jDoctorAge;
    private javax.swing.JTextField jDoctorId;
    private javax.swing.JTextField jDoctorName;
    private javax.swing.JButton jExitButton;
    private javax.swing.JComboBox<String> jGenderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jMainButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}