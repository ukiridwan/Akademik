/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class EditData_Mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form EditData_Mahasiswa
     */
    public EditData_Mahasiswa() {
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

        txtInputNama = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        lblNim = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        lblAlamat = new javax.swing.JLabel();
        lblNoTlp = new javax.swing.JLabel();
        txtInputNoTlp = new javax.swing.JTextField();
        btnUpdteDataMhs = new javax.swing.JButton();
        lblDataMahasiswa = new javax.swing.JLabel();
        btnMenuUtamaMhs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNama.setText("Nama");

        lblNim.setText("NIM");

        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        lblAlamat.setText("Alamat");

        lblNoTlp.setText("No. Telp");

        btnUpdteDataMhs.setText("Update");

        lblDataMahasiswa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDataMahasiswa.setText("Data Mahasiswa");

        btnMenuUtamaMhs.setText("Menu Utama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama)
                            .addComponent(lblNim)
                            .addComponent(lblAlamat)
                            .addComponent(lblNoTlp))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdteDataMhs)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtInputNama)
                                .addComponent(txtNIM)
                                .addComponent(txtAlamat)
                                .addComponent(txtInputNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addComponent(btnMenuUtamaMhs)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDataMahasiswa)
                        .addGap(250, 250, 250))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblDataMahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama)
                            .addComponent(txtInputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNim)
                            .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlamat)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNoTlp)
                            .addComponent(txtInputNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdteDataMhs)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMenuUtamaMhs)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

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
            java.util.logging.Logger.getLogger(EditData_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuUtamaMhs;
    private javax.swing.JButton btnUpdteDataMhs;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblDataMahasiswa;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblNoTlp;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtInputNama;
    private javax.swing.JTextField txtInputNoTlp;
    private javax.swing.JTextField txtNIM;
    // End of variables declaration//GEN-END:variables

    public void setTxtAlamat(String s) {
        this.txtAlamat.setText(s);
    }

    public void setTxtInputNama(String s) {
        this.txtInputNama.setText(s);
    }

    public void setTxtInputNoTlp(String s) {
        this.txtInputNoTlp.setText(s);
    }

    public void setTxtNIM(String s) {
        this.txtNIM.setText(s);
    }

    public void setBtnMenuUtama(String s) {
        this.btnMenuUtamaMhs.setText(s);
    }

    public void setBtnUpdteDataMhs(String s) {
        this.btnUpdteDataMhs.setText(s);
    }

    public JButton getBtnMenuUtama() {
        return btnMenuUtamaMhs;
    }

    public JButton getBtnUpdteDataMhs() {
        return btnUpdteDataMhs;
    }

    public String getTxtAlamat() {
        return txtAlamat.getText();
    }

    public String getTxtInputNama() {
        return txtInputNama.getText();
    }

    public String getTxtInputNoTlp() {
        return txtInputNoTlp.getText();
    }

    public String getTxtNIM() {
        return txtNIM.getText();
    }

    public void addListener(ActionListener e){
        btnMenuUtamaMhs.addActionListener(e);
        btnUpdteDataMhs.addActionListener(e);
    }
    
    public void showMessage(Component c, String s){
            JOptionPane.showMessageDialog(c,s);
    };
    
    

}
