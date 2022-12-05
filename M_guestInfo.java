import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class M_guestInfo extends javax.swing.JFrame {

    /**
     * Creates new form M_guestInfo
     */
    public M_guestInfo() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton_add = new javax.swing.JButton();
        jButton_modify = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton_view = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        Gfname = new javax.swing.JTextField();
        Glname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Gemail = new javax.swing.JTextField();
        ////
        jLabel7 = new javax.swing.JLabel();
       Gaddress = new javax.swing.JTextField();
        ////
        
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_guest = new javax.swing.JTable();
       // f.getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));

        jButton_add.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButton_add.setText("Insert");
        jButton_add.setToolTipText("");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_modify.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButton_modify.setText("Modify");
        jButton_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifyActionPerformed(evt);
            }
        });

        bt_delete.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton_view.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButton_view.setText("View");
        jButton_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jLabel2.setText("Gid");

        jLabel3.setText("Gfname");
        jLabel3.setToolTipText("");
        jLabel6.setText("GGaddress");
        jLabel4.setText("Glname");

        id.setColumns(1);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        Gfname.setColumns(2);

        Glname.setColumns(3);
        Glname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GlnameActionPerformed(evt);
            }
        });

        jLabel5.setText("Gphone_num");

        Phone.setColumns(4);

        jLabel7.setText("Gemail");

        Gemail.setColumns(5);

        jTable_guest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gid", "Gfname", "Glname", "Gphone_num", "Gaddress","Gemail" 
            }
        ));
        jTable_guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_guestMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_guest);

        jDesktopPane1.setLayer(Gfname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Glname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Phone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Gaddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton_view, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(id, javax.swing.JLayeredPane.DEFAULT_LAYER);////
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton_add, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton_modify, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bt_delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Gemail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1Layout.setHorizontalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jDesktopPane1Layout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jDesktopPane1Layout.createSequentialGroup()
        							.addGap(183)
        							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jDesktopPane1Layout.createSequentialGroup()
        							.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jDesktopPane1Layout.createSequentialGroup()
        									.addComponent(jLabel4)
        									.addGap(7)
        									.addComponent(Glname, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jDesktopPane1Layout.createSequentialGroup()
        									.addComponent(jLabel3)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(Gfname, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jDesktopPane1Layout.createSequentialGroup()
        									.addComponent(jLabel2)
        									.addGap(26)
        									.addComponent(id, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
        							.addGap(114)
        							.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5)
        								.addComponent(jLabel6)
        								.addComponent(jLabel7))
        							.addGap(31)
        							.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(Phone)
        								.addComponent(Gaddress, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        								.addComponent(Gemail))))
        					.addContainerGap(379, Short.MAX_VALUE))
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 970, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
        					.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(bt_delete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton_view, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton_add, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButton_modify, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        					.addGap(21))))
        );
        jDesktopPane1Layout.setVerticalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jDesktopPane1Layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5)
        				.addComponent(Phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(Gfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel6)
        					.addComponent(Gaddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        					.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(Glname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18))
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(Gemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
        			.addGroup(jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton_view)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton_add)
        					.addGap(18)
        					.addComponent(jButton_modify)
        					.addGap(18)
        					.addComponent(bt_delete)
        					.addGap(18)
        					.addComponent(jButton4))
        				.addGroup(jDesktopPane1Layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(25, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayout(jDesktopPane1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifyActionPerformed
        // TODO add your handling code here:
         PreparedStatement st;
        java.sql.ResultSet rs;
         DefaultTableModel recordTable = (DefaultTableModel) jTable_guest.getModel();
         try{
         if(jTable_guest.getSelectedRowCount()==1){
             String nid = id.getText();
             String name1 = Gfname.getText();
             String name2 = Glname.getText();
             String ph = Phone.getText();
             String ad = Gaddress.getText();
             String e = Gemail.getText();
             
             recordTable.setValueAt(nid, jTable_guest.getSelectedRow(), 0);
             recordTable.setValueAt(name1, jTable_guest.getSelectedRow(), 1);
             recordTable.setValueAt(name2, jTable_guest.getSelectedRow(), 2);
             recordTable.setValueAt(ph, jTable_guest.getSelectedRow(), 3);
             recordTable.setValueAt(ad, jTable_guest.getSelectedRow(), 4);
             recordTable.setValueAt(e, jTable_guest.getSelectedRow(), 5);
             
             String update_Query = "UPDATE `hms`.`guset` SET `Gfname` = '"+name1+"', `Glname` = '"+name2+"', `Gphone_num` = '"+ph+"',  `Gaddress` = '"+ad+"',`Gemail` = '"+e+"' WHERE `Gid` = '"+nid+"'";
            st = MyConnection.getConnection().prepareStatement(update_Query) ;
            st.executeUpdate();
             JOptionPane.showMessageDialog(rootPane, "Successfully modified");
                         
         }else{
             if(jTable_guest.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "tableis empty");
             }else{
                 JOptionPane.showMessageDialog(rootPane, "Please select single row to modify");
             }
         }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
    
    }//GEN-LAST:event_jButton_modifyActionPerformed

    private void jButton_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
         java.sql.ResultSet rs;
        //st = MyConnection.getConnection().;
        String table = "SELECT * FROM guset";
        try{
        st = MyConnection.getConnection().prepareStatement(table) ;
        rs = st.executeQuery();
        
        while(rs.next()){
            String id = String.valueOf(rs.getInt("Gid"));
            String Gfname = rs.getString("Gfname");
            String Glname = rs.getString("Glname");
            String phone = rs.getString("Gphone_num");
            String Eaddress = rs.getString("Gaddress");
            String Gemail = rs.getString("Gemail");
            String Table_guest[] = {id ,Gfname ,Glname ,phone,Eaddress ,Gemail};
            DefaultTableModel tbmodel = (DefaultTableModel) jTable_guest.getModel();
            
            tbmodel.addRow(Table_guest);
        }
        }catch(Exception e){
                System.out.println(e);
                }
    }//GEN-LAST:event_jButton_viewActionPerformed

    private void GlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GlnameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
        java.sql.ResultSet rs;
        
        String insert_Query = "INSERT INTO `hms`.`guset` (`Gid`, `Gfname`, `Glname`, `Gphone_num`, `Gaddress`, `Gemail`) VALUES (?, ?, ?, ?, ?,?);";
        try {
            st = MyConnection.getConnection().prepareStatement(insert_Query) ;
        
        
        st.setString(1, id.getText());
        st.setString(2, Gfname.getText());
        st.setString(3, Glname.getText());
        st.setString(4, Phone.getText());
        st.setString(5, Gaddress.getText());
        st.setString(6, Gemail.getText());
        
        
        st.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Record Added", "Succesful", 2);
        updateDB();
        } catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton_addActionPerformed
 int nid, deleteditem=0;
    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel recordTable = (DefaultTableModel) jTable_guest.getModel();
        int selectedRows = jTable_guest.getSelectedRow();
        PreparedStatement st;
        java.sql.ResultSet rs;
        
        String insert_Query = "DELETE FROM `hms`.`guset` WHERE Gid=?";
        try {
           nid = Integer.parseInt(recordTable.getValueAt(selectedRows, 0).toString());
            
           
           
             deleteditem = JOptionPane.showConfirmDialog(rootPane, "Confirm if you want to delete record","Warning",JOptionPane.YES_NO_OPTION);
            if(deleteditem == JOptionPane.YES_OPTION){
            
           st = MyConnection.getConnection().prepareStatement(insert_Query) ;
       
        st.setInt(1, nid);
        st.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Record Deleted", "Succesful", 2);
        updateDB();
        id.setText("");
        id.requestFocus();
        Gfname.setText("");
        Glname.setText("");
        Phone.setText("");
        Gaddress.setText("");
        Gemail.setText("");
        
        }
        }catch(HeadlessException | NumberFormatException | SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void jTable_guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_guestMouseClicked
        // TODO add your handling code here:
        DefaultTableModel recordTable = (DefaultTableModel) jTable_guest.getModel();
        int selectedRows = jTable_guest.getSelectedRow();
        
        id.setText(recordTable.getValueAt(selectedRows, 0).toString());
        Gfname.setText(recordTable.getValueAt(selectedRows, 1).toString());
        Glname.setText(recordTable.getValueAt(selectedRows, 2).toString());
        Phone.setText(recordTable.getValueAt(selectedRows, 3).toString());
        Gaddress.setText(recordTable.getValueAt(selectedRows, 4).toString());
        Gemail.setText(recordTable.getValueAt(selectedRows, 5).toString());
        
    }//GEN-LAST:event_jTable_guestMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        HomePageM f = new HomePageM();
        f.setVisible(true);
         f.pack();
            f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed
    public void updateDB(){
        PreparedStatement st;
        java.sql.ResultSet rs;
        
        String update_Query = "SELECT * FROM guset";
        try {
            st = MyConnection.getConnection().prepareStatement(update_Query) ;
        rs = st.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        
        int q = stData.getColumnCount();
        
        DefaultTableModel recordTable = (DefaultTableModel) jTable_guest.getModel();
        recordTable.setRowCount(0);
        
        while(rs.next()){
            Vector CoulmnData = new Vector();
            
            for (int i = 0 ; i <= q ;i++){
                CoulmnData.add(rs.getString("Gid"));
                 CoulmnData.add(rs.getString("Gfname"));
                  CoulmnData.add(rs.getString("Glname"));
                   CoulmnData.add(rs.getString("Gphone_num"));
                   CoulmnData.add(rs.getString("Gaddress"));
                    CoulmnData.add(rs.getString("Gemail"));
                   
                }
             recordTable.addRow(CoulmnData);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
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
            java.util.logging.Logger.getLogger(M_guestInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_guestInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_guestInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_guestInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_guestInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gemail;
    private javax.swing.JTextField Gaddress;
    private javax.swing.JTextField Gfname;
    private javax.swing.JTextField Glname;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton bt_delete;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_modify;
    private javax.swing.JButton jButton_view;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_guest;
    // End of variables declaration//GEN-END:variables
}