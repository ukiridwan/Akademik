/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Login_Mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MenuLogin
     */
    public Login_Mahasiswa() {
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

        jTabbedPane3 = new javax.swing.JTabbedPane();
        lblLoginMhs = new javax.swing.JLabel();
        txtUnameMhs = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        BtnLoginMhs = new javax.swing.JButton();
        BtnChangeLoginToDosen = new javax.swing.JButton();
        BtnChangeLoginToAdmin = new javax.swing.JButton();
        lblSbgMahasiswa = new javax.swing.JLabel();
        txtPassMhs = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(685, 300));

        lblLoginMhs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblLoginMhs.setText("Login");

        txtUnameMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblUsername.setText("Username");

        lblPass.setText("Password");

        BtnLoginMhs.setText("Login");

        BtnChangeLoginToDosen.setText("Dosen");

        BtnChangeLoginToAdmin.setText("Admin");

        lblSbgMahasiswa.setText("Sebagai Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSbgMahasiswa)
                    .addComponent(lblLoginMhs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(27, 27, 27)
                        .addComponent(txtUnameMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPass)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnLoginMhs)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txtPassMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnChangeLoginToDosen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnChangeLoginToAdmin)
                        .addGap(66, 66, 66)))
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginMhs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSbgMahasiswa)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnameMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPassMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(BtnLoginMhs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnChangeLoginToDosen)
                    .addComponent(BtnChangeLoginToAdmin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChangeLoginToAdmin;
    private javax.swing.JButton BtnChangeLoginToDosen;
    private javax.swing.JButton BtnLoginMhs;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblLoginMhs;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSbgMahasiswa;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassMhs;
    private javax.swing.JTextField txtUnameMhs;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnLoginMhs() {
        return BtnLoginMhs;
    }

    public JButton getBtnChangeLoginToAdmin() {
        return BtnChangeLoginToAdmin;
    }

    public JButton getBtnChangeLoginToDosen() {
        return BtnChangeLoginToDosen;
    }

    public String getTxtPassMhs() {
        return txtPassMhs.getText();
    }

    public int getTxtUnameMhs() {
        int val = 0;
        try {
            val = Integer.parseInt(txtUnameMhs.getText());
        }catch (NumberFormatException e){
            return val; 
        } 
        return val;
    }

    public void setTxtPassMhs(JPasswordField txtPassMhs) {
        this.txtPassMhs = txtPassMhs;
    }

    public void setTxtUnameMhs(JTextField txtUnameMhs) {
        this.txtUnameMhs = txtUnameMhs;
    }

    public void setBtnLoginMhs(JButton BtnLoginMhs) {
        this.BtnLoginMhs = BtnLoginMhs;
    }

    public void setBtnChangeLoginToAdmin(JButton BtnChangeLoginToAdmin) {
        this.BtnChangeLoginToAdmin = BtnChangeLoginToAdmin;
    }

    public void setBtnChangeLoginToDosen(JButton BtnChangeLoginToDosen) {
        this.BtnChangeLoginToDosen = BtnChangeLoginToDosen;
    }
    
    public void addListener(ActionListener e){
        BtnLoginMhs.addActionListener(e);
        BtnChangeLoginToAdmin.addActionListener(e);
        BtnChangeLoginToDosen.addActionListener(e);        
    }
    
    public void showMessage(Component c, String s){
            JOptionPane.showMessageDialog(c,s);
    };
}

