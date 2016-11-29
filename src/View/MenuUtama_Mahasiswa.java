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
public class MenuUtama_Mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama_Mahasiswa
     */
    public MenuUtama_Mahasiswa() {
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

        lblMenuUtamaMhs = new javax.swing.JLabel();
        lblMhsMenu = new javax.swing.JLabel();
        btnJadwalMhs = new javax.swing.JButton();
        btnEditDataMhs = new javax.swing.JButton();
        btnRegistrasiMhs = new javax.swing.JButton();
        btnLogOutMhs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(685, 300));
        setResizable(false);

        lblMenuUtamaMhs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMenuUtamaMhs.setText("Menu Utama");

        lblMhsMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMhsMenu.setText("Mahasiswa");

        btnJadwalMhs.setText("Jadwal Mahasiswa");

        btnEditDataMhs.setText("Edit Data Mahasiswa");

        btnRegistrasiMhs.setText("Registrasi");

        btnLogOutMhs.setText("Log Out");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(186, 606, Short.MAX_VALUE)
                        .addComponent(btnLogOutMhs))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMenuUtamaMhs)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(lblMhsMenu))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnJadwalMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrasiMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditDataMhs))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuUtamaMhs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMhsMenu)
                .addGap(35, 35, 35)
                .addComponent(btnRegistrasiMhs)
                .addGap(18, 18, 18)
                .addComponent(btnEditDataMhs)
                .addGap(18, 18, 18)
                .addComponent(btnJadwalMhs)
                .addGap(42, 42, 42)
                .addComponent(btnLogOutMhs)
                .addContainerGap(12, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(MenuUtama_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditDataMhs;
    private javax.swing.JButton btnJadwalMhs;
    private javax.swing.JButton btnLogOutMhs;
    private javax.swing.JButton btnRegistrasiMhs;
    private javax.swing.JLabel lblMenuUtamaMhs;
    private javax.swing.JLabel lblMhsMenu;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnEditDataMhs() {
        return btnEditDataMhs;
    }

    public JButton getBtnJadwalMhs() {
        return btnJadwalMhs;
    }

    public JButton getBtnLogOutMhs() {
        return btnLogOutMhs;
    }

    public JButton getBtnRegistrasiMhs() {
        return btnRegistrasiMhs;
    }

    public void setBtnEditDataMhs(JButton btnEditDataMhs) {
        this.btnEditDataMhs = btnEditDataMhs;
    }

    public void setBtnJadwalMhs(JButton btnJadwalMhs) {
        this.btnJadwalMhs = btnJadwalMhs;
    }

    public void setBtnLogOutMhs(JButton btnLogOutMhs) {
        this.btnLogOutMhs = btnLogOutMhs;
    }

    public void setBtnRegistrasiMhs(JButton btnRegistrasiMhs) {
        this.btnRegistrasiMhs = btnRegistrasiMhs;
    }

    public void addListener(ActionListener e){
        btnJadwalMhs.addActionListener(e);
        btnLogOutMhs.addActionListener(e);
        btnRegistrasiMhs.addActionListener(e);
        btnEditDataMhs.addActionListener(e);
        btnJadwalMhs.addActionListener(e);   
        btnLogOutMhs.addActionListener(e);
    }
    
    public void showMessage(Component c, String s){
            JOptionPane.showMessageDialog(c,s);
    };
}

