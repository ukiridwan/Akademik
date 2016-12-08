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
import java.util.ArrayList;
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
    private MenuUtama_Admin menuadmin;
    private MenuUtama_Dosen menudosen;
    private EditData_Mahasiswa editmhs;
    private MenuJadwal jadwaldsn;
    private Lihat_Jadwal_Kelas jadwalmhs;
    private Lihat_Data_Mahasiswa datamhs;
    private MenuRegistrasi regismhs;
    private Input_NIMToken inputnimtoken;
    private Input_Token inputtoken;
    private Penjadwalan_Kelas pk;
    private Veriv_Token verivtoken;
    private Database db;
    private Statement st;
    private String query;
    private ResultSet rs;
    private Mahasiswa mhs;
    private Admin admin;
    private Dosen dosen;
    private Registrasi regist;
    private int tmpNim;
    private String tmpPw;
    private String tmpKelas;
    private String tmpToken;
    private int tmpNip;
    private int tmpNik;
    
    public Controller(Aplikasi model) {
        this.model = model;
        lm = new Login_Mahasiswa();
        la = new Login_Admin();
        ld = new Login_Dosen();
        jadwalmhs = new Lihat_Jadwal_Kelas();
        datamhs = new Lihat_Data_Mahasiswa();
        regismhs = new MenuRegistrasi();
        menumhs = new MenuUtama_Mahasiswa();
        menuadmin = new MenuUtama_Admin();
        menudosen = new MenuUtama_Dosen();
        editmhs = new EditData_Mahasiswa();
        inputnimtoken = new Input_NIMToken();
        inputtoken = new Input_Token();
        verivtoken = new Veriv_Token();
        lm.setVisible(true);
        lm.addListener(this);
        la.addListener(this);
        ld.addListener(this);
        jadwalmhs.addListener(this);
        datamhs.addListener(this);
        regismhs.addListener(this);
        menumhs.addListener(this);
        menuadmin.addListener(this);
        menudosen.addListener(this);
        editmhs.addListener(this);
        inputnimtoken.addListener(this);
        inputtoken.addListener(this);
        verivtoken.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //login mahasiswa
        if(source.equals(la.getBtnChangeLoginToMhs())){
            lm.setVisible(true);
            la.dispose();
        }else if(source.equals(ld.getBtnChangeLoginToMhs())){
            lm.setVisible(true);
            ld.dispose();
        }else if(source.equals(lm.getBtnLoginMhs())){
            int user = lm.getTxtUnameMhs();
            String pw = lm.getTxtPassMhs();
            tmpNim = user;
            tmpPw = pw;
            try {
                mhs = model.getMhs(user);
                if(user == 0 || pw.isEmpty()){
                    lm.showMessage(null, "Nggak boleh kosong!");
                }else if(user ==(mhs.getNim()) && pw.equals(mhs.getPassMhs())){
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
        }else if(source.equals(menumhs.getBtnInputToken())){
            inputtoken.setVisible(true);
            menumhs.dispose();
            try {
                regist = model.getRegist(tmpNim);
                if(regist.getNim() != 0){
                    String token = regist.getToken();
                    String status = regist.getStatus();
                    inputtoken.setTxtToken(token);
                    inputtoken.setTxtStatus(status);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //update data mhs
        else if(source.equals(editmhs.getBtnMenuUtama())){
            menumhs.setVisible(true);
            editmhs.dispose();
        }
        else if(source.equals(editmhs.getBtnUpdteDataMhs())){
            String pw = editmhs.getTxtInputPw();
            String alamat = editmhs.getTxtAlamat();
            String telp = editmhs.getTxtInputNoTlp();
            
            if(pw.isEmpty() || alamat.isEmpty() || telp.isEmpty()){
                editmhs.showMessage(null, "Tidak boleh kosong!");
            }else{
                try {
                    mhs = model.getMhs(tmpNim);
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                int nim = tmpNim;
                mhs = new Mahasiswa(nim, mhs.getNamaMhs(), mhs.getKelas(), alamat, telp, pw);
                model.updateMhs(mhs);
                editmhs.showMessage(null, "Edit Berhasil");
            }
        }
        //lihat jadwal mhs
        else if(source.equals(jadwalmhs.getBtnMenuUtamaMhs())){
            menumhs.setVisible(true);
            jadwalmhs.dispose();
        }
        //registrasi mahasiswa
        else if(source.equals(regismhs.getBtnInputMatKul())){
            try {
                model.getAllRegist();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //input token
        else if(source.equals(inputtoken.getBtnSubmitToken())){
            tmpToken = inputtoken.getTxtInputToken();
            try {
                regist = model.getRegist(tmpNim);
                if(regist.getNim() != 0){
                    inputtoken.showMessage(null, "Anda sudah pernah input Token!");
                }else{
                    model.inputToken(tmpNim, tmpToken);
                    inputtoken.showMessage(null, "Token berhasil diinputkan");
                    inputtoken.setTxtToken(tmpToken);
                    inputtoken.setTxtStatus("Belum Terverifikasi");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(inputtoken.getBtnMenuUtamaMhs())){
            menumhs.setVisible(true);
            inputtoken.dispose();
        }
        
        //login admin
        else if(source.equals(ld.getBtnChangeLoginToAdmin())){
            la.setVisible(true);
            ld.dispose();
        }else if(source.equals(lm.getBtnChangeLoginToAdmin())){
            la.setVisible(true);
            lm.dispose();
        }else if(source.equals(la.getBtnLoginAdmin())){
            int user = la.getTxtUnameAdmin();
            String pw = la.getTxtPassAdmin();
            tmpNip = user;
            tmpPw = pw;
            try {
                admin = model.getAdmin(user);
                if(user == 0 || pw.isEmpty()){
                    la.showMessage(null, "Nggak boleh kosong!");
                }
                else if(user ==(admin.getNip()) && pw.equals(admin.getPassAdmin())){
                    la.showMessage(null, "Login berhasil");
                    menuadmin.setVisible(true);
                    la.dispose();
                }else{
                    la.showMessage(null, "Username atau password salah!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(menuadmin.getBtnLogOutAdmin())){
            lm.setVisible(true);
            menuadmin.dispose();
        }else if(source.equals(menuadmin.getBtnKnfrmPmbyrnMhs())){
            inputnimtoken.setVisible(true);
            menuadmin.dispose();
        }else if(source.equals(inputnimtoken.getBtnCariNimMhs())){
            tmpNim = inputnimtoken.getTxtInputNIMMhs();
            try {
                mhs = model.getMhs(tmpNim);
                if(mhs.getNim() != 0){
                    inputnimtoken.showMessage(null, "NIM ditemukan");
                    verivtoken.setVisible(true);
                    inputnimtoken.dispose();
                }else{
                    inputnimtoken.showMessage(null, "NIM tidak terdaftar");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(inputnimtoken.getBtnMenuUtamaAdmin())){
            menuadmin.setVisible(true);
            inputnimtoken.dispose();
            
        // Verifikasi Token
        }else if(source.equals(verivtoken.getBtnLihatToken())){
            try {
                regist = model.getRegist(tmpNim);
                if(regist.getNim() != 0){
                    String token = regist.getToken();
                    String status = regist.getStatus();
                    verivtoken.setTxtToken(token);
                    verivtoken.setTxtStatus(status);
                }else{
                    verivtoken.showMessage(null, "Mahasiswa belum input Token");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(verivtoken.getBtnKonfirmasi())){
            try {
                regist = model.getRegist(tmpNim);
                model.updateRegistNip(regist);
                verivtoken.showMessage(null, "Berhasil!");
                regist = model.getRegist(tmpNim);
                String status = regist.getStatus();
                verivtoken.setTxtStatus(status);
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(verivtoken.getBtnKembali())){
            inputnimtoken.setVisible(true);
            verivtoken.dispose();
        }else if(source.equals(menuadmin.getBtnPenjadwalanKls())){
            pk.setVisible(true);
            menuadmin.dispose();
        }
        //login dosen
        else if(source.equals(la.getBtnChangeLoginToDosen())){
            ld.setVisible(true);
            la.dispose();
        }else if(source.equals(lm.getBtnChangeLoginToDosen())){
            ld.setVisible(true);
            lm.dispose();
        }else if(source.equals(ld.getBtnLoginDosen())){
            int user = ld.getTxtUnameDosen();
            String pw = ld.getTxtPassDosen();
            tmpNik = user;
            tmpPw = pw;
            try {
                dosen = model.getDosen(user);
                if(user == 0 || pw.isEmpty()){
                    ld.showMessage(null, "Nggak boleh kosong!");
                }
                else if(user ==(dosen.getNik()) && pw.equals(dosen.getPassDosen())){
                    ld.showMessage(null, "Login Berhasil");
                    menudosen.setVisible(true);
                    ld.dispose();
                }else{
                    ld.showMessage(null, "Username atau password salah!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source.equals(menudosen.getBtnLogOutDosen())){
            lm.setVisible(true);
            menudosen.dispose();
        }else if(source.equals(menudosen.getBtnInputIndeks())){
            
        }else if(source.equals(menudosen.getBtnLihatDataMhs())){
            try {
                datamhs.viewMhs(model.getAllMhs());
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            datamhs.setVisible(true);
            menumhs.dispose();
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
    
    //test
}
