/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

/**
 *
 * @author 96653
 */
public class HomePageM extends javax.swing.JFrame {

    /**
     * Creates new form HomePageM
     */
    public HomePageM() {
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

        jButton_room = new javax.swing.JButton();
        jButton_res = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_gInfo = new javax.swing.JButton();
        jButton_bill = new javax.swing.JButton();
        jButton_eInfo = new javax.swing.JButton();
        jButton_logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_room.setText("Room");
        jButton_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_roomActionPerformed(evt);
            }
        });

        jButton_res.setText("Booking");
        jButton_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resActionPerformed(evt);
            }
        });

        jLabel1.setBackground(Color.BLACK);
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("Manager Home page");

        jButton_gInfo.setText("Guests  Info");
        jButton_gInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gInfoActionPerformed(evt);
            }
        });

        jButton_bill.setText("Bill");
        jButton_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_billActionPerformed(evt);
            }
        });

        jButton_eInfo.setText("Employees Info");
        jButton_eInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_eInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eInfoActionPerformed(evt);
            }
        });

        jButton_logOut.setBackground(Color.LIGHT_GRAY);
        jButton_logOut.setText("LogOut");
        jButton_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(45)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton_eInfo, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(jButton_gInfo, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        				.addComponent(jButton_res, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
        			.addGap(106)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton_room, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton_bill, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        			.addGap(59))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(186)
        			.addComponent(jButton_logOut)
        			.addContainerGap(196, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(114, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
        			.addGap(106))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(jLabel1)
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton_gInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton_bill)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton_room, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton_eInfo, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton_res)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton_logOut)
        			.addGap(20))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_billActionPerformed
        // TODO add your handling code here:
        bill b = new bill();
        b.setVisible(true);
        b.pack();
        b.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_billActionPerformed

    private void jButton_gInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gInfoActionPerformed
        // TODO add your handling code here:
        //frame.dispose();
        M_guestInfo mgi = new M_guestInfo();
        mgi.setVisible(true);
        mgi.pack();
        mgi.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_gInfoActionPerformed

    private void jButton_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resActionPerformed
        // TODO add your handling code here:
        reception_try mgi = new reception_try();
        mgi.setVisible(true);
        mgi.pack();
        mgi.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_resActionPerformed

    private void jButton_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_roomActionPerformed
        // TODO add your handling code here:
        M_room mgi = new M_room();
        mgi.setVisible(true);
        mgi.pack();
        mgi.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_roomActionPerformed

    private void jButton_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logOutActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("LogOut");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to LogOut","LogOt",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton_logOutActionPerformed

    private void jButton_eInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eInfoActionPerformed
        // TODO add your handling code here:
        M_Employee m = new M_Employee();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_eInfoActionPerformed
    private JFrame frame;
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
            java.util.logging.Logger.getLogger(HomePageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageM().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_bill;
    private javax.swing.JButton jButton_eInfo;
    private javax.swing.JButton jButton_gInfo;
    private javax.swing.JButton jButton_logOut;
    private javax.swing.JButton jButton_res;
    private javax.swing.JButton jButton_room;
    private javax.swing.JLabel jLabel1;
}