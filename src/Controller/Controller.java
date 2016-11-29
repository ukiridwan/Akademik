/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import Model.*;
import View.*;
import database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UKI
 */
public class Controller extends MouseAdapter implements ActionListener, FocusListener{

    private Aplikasi model;
    private Login_Mahasiswa lm;
    private Login_Dosen ld;
    private Login_Admin la;
    private MenuUtama_Mahasiswa menumhs;
    private EditData_Mahasiswa editmhs;
    private Jadwal jadwaldsn;
    private Lihat_Jadwal_Kelas jadwalmhs; 
    private Registrasi regismhs;
    private Database db;
    private Statement st;
    private String query;
    private ResultSet rs;
    private Mahasiswa mhs;
    private String tmpNim;
    private String tmpPw;
    private String tmpKelas;
    
    public Controller(Aplikasi model) {
        this.model = model;
        lm = new Login_Mahasiswa();
        la = new Login_Admin();
        ld = new Login_Dosen();
        jadwalmhs = new Lihat_Jadwal_Kelas();
        regismhs = new Registrasi();
        menumhs = new MenuUtama_Mahasiswa();
        editmhs = new EditData_Mahasiswa();
        lm.setVisible(true);
        lm.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //login mahasiswa
        if(source.equals(lm.getBtnLoginMhs())){
            String user = lm.getTxtUnameMhs();
            String pw = lm.getTxtPassMhs();
            tmpNim = user;
            tmpPw = pw;
            try {
                mhs = model.getMahasiswa(user);
                tmpKelas = mhs.getKelas();
                if(user.equals(mhs.getNim()) && pw.equals(mhs.getPassMhs())){
                    lm.showMessage(null, "Login Berhasil");
                    menumhs.setVisible(true);
                    lm.dispose();
                }else{
                    lm.showMessage(null, "Username atau password salah!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //menu utama mahasiswa
        else if(source.equals(menumhs.getBtnEditDataMhs())){
            editmhs.setVisible(true);
            menumhs.dispose();
        }else if(source.equals(menumhs.getBtnJadwalMhs())){
            jadwalmhs.setVisible(true);
            menumhs.dispose();
        }else if(source.equals(menumhs.getBtnRegistrasiMhs())){
            regismhs.setVisible(true);
            menumhs.dispose();
        }else if(source.equals(menumhs.getBtnLogOutMhs())){
            lm.setVisible(true);
            menumhs.dispose();
        }
        //update data mhs
        else if(source.equals(editmhs.getBtnMenuUtama())){
            menumhs.setVisible(true);
            editmhs.dispose();
        }
        else if(source.equals(editmhs.getBtnUpdteDataMhs())){
            String nama = editmhs.getTxtInputNama();
            String alamat = editmhs.getTxtAlamat();
            String telp = editmhs.getTxtInputNoTlp();
            String nim = tmpNim;
            editmhs.setTxtNIM(nim);
            mhs = new Mahasiswa(nama, nim, tmpKelas, alamat, telp, tmpPw, null);
            editmhs.showMessage(null, "Edit Berhasil");
        }
        //lihat jadwal mhs
        else if(source.equals(jadwalmhs.getBtnMenuUtamaMhs())){
            menumhs.setVisible(true);
            jadwalmhs.dispose();
        }
        //registrasi mahasiswa
        else if(source.equals(regismhs.getBtnInputMatKul())){
            
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
