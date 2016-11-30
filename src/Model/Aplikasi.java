/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import database.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toms
 */
public class Aplikasi {
    private ArrayList<Admin> dataAdmin;
    private ArrayList<Dosen> dataDosen;
    private ArrayList<Mahasiswa> dataMhs;
    private ArrayList<Nilai> dataNilai;
    private Database con;
    private int index = -1;

    public Aplikasi() {
        this.dataAdmin = new ArrayList<>();
        this.dataDosen = new ArrayList<>();
        this.dataMhs = new ArrayList<>();
        this.dataNilai = new ArrayList<>();
        this.con = new Database();
        try{
            con.connect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    //Mahasiswa
    public String createMhs(String namaMhs, String nim, String kelas, String alamatMhs, String telpMhs, String passMhs, String token){
        Mahasiswa mhs = new Mahasiswa(namaMhs, nim, kelas, alamatMhs, telpMhs, passMhs, token);
        try{
            dataMhs.add(mhs);
            con.saveMhs(mhs);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return mhs.getNim();
    }
    
    public void updateMhs(Mahasiswa mhs){
        try{
            con.updateMhs(mhs);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Mahasiswa getMhs(String nim) throws SQLException{
        Mahasiswa mhs = con.getMhs(nim);
        return mhs;
    }
    
    public String[] getListNimMhs() throws SQLException{
        return con.getListNimMhs();
    }
    
    public void delMhs(String nim) throws SQLException{
        con.delMhs(nim);
    }
    
    public ArrayList<Mahasiswa> getAllMhs() throws SQLException{
        return con.getAllMhs();
    }
    
    //Dosen
    public String createDosen(String namaDosen, String nik, String alamatDosen, int telpDosen, String passDosen){
        Dosen dosen = new Dosen(namaDosen, nik, alamatDosen, telpDosen, passDosen);
        try{
            dataDosen.add(dosen);
            con.saveDosen(dosen);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return dosen.getNik();
    }
    
    public void updateDosen(Dosen dosen){
        try{
            con.updateDosen(dosen);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Dosen getDosen(String nik) throws SQLException{
        Dosen dosen = con.getDosen(nik);
        return dosen;
    }
    
    public String[] getListNikDosen() throws SQLException{
        return con.getListNikDosen();
    }
    
    public void delDosen(String nik) throws SQLException{
        con.delDosen(nik);
    }
    
    public ArrayList<Dosen> getAllDosen() throws SQLException{
        return con.getAllDosen();
    }
    
    //Admin
    public String createAdmin(String namaAdmin, String nip, String alamatAdmin, int telpAdmin, String passAdmin){
        Admin admin = new Admin(namaAdmin, nip, alamatAdmin, telpAdmin, passAdmin);
        try{
            dataAdmin.add(admin);
            con.saveAdmin(admin);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return admin.getNip();
    }
    
    public void updateAdmin(Admin admin){
        try{
            con.updateAdmin(admin);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Admin getAdmin(String nip) throws SQLException{
        Admin admin = con.getAdmin(nip);
        return admin;
    }
    
    public String[] getListNipAdmin() throws SQLException{
        return con.getListNipAdmin();
    }
    
    public void delAdmin(String nip) throws SQLException{
        con.delAdmin(nip);
    }
    
    public ArrayList<Admin> getAllAdmin() throws SQLException{
        return con.getAllAdmin();
    }
}
