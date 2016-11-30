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
    private ArrayList<Registrasi> dataRegist;
    private ArrayList<MataKuliah> dataMatkul;
    private Database con;
    private int index = -1;

    public Aplikasi() {
        this.dataAdmin = new ArrayList<>();
        this.dataDosen = new ArrayList<>();
        this.dataMhs = new ArrayList<>();
        this.dataNilai = new ArrayList<>();
        this.dataRegist = new ArrayList<>();
        this.dataMatkul = new ArrayList<>();
        this.con = new Database();
        try{
            con.connect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    //Mahasiswa
    public int createMhs(int nim, String namaMhs, String kelas, String alamatMhs, String telpMhs, String passMhs){
        Mahasiswa mhs = new Mahasiswa(nim, namaMhs, kelas, alamatMhs, telpMhs, passMhs);
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
    
    public Mahasiswa getMhs(int nim) throws SQLException{
        Mahasiswa mhs = con.getMhs(nim);
        return mhs;
    }
    
    public String[] getListNimMhs() throws SQLException{
        return con.getListNimMhs();
    }
    
    public void delMhs(int nim) throws SQLException{
        con.delMhs(nim);
    }
    
    public ArrayList<Mahasiswa> getAllMhs() throws SQLException{
        return con.getAllMhs();
    }
    
    //Dosen
    public int createDosen(int nik, String namaDosen, String alamatDosen, String telpDosen, String passDosen){
        Dosen dosen = new Dosen(nik, namaDosen, alamatDosen, telpDosen, passDosen);
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
    
    public Dosen getDosen(int nik) throws SQLException{
        Dosen dosen = con.getDosen(nik);
        return dosen;
    }
    
    public String[] getListNikDosen() throws SQLException{
        return con.getListNikDosen();
    }
    
    public void delDosen(int nik) throws SQLException{
        con.delDosen(nik);
    }
    
    public ArrayList<Dosen> getAllDosen() throws SQLException{
        return con.getAllDosen();
    }
    
    //Admin
    public int createAdmin(int nip, String namaAdmin, String alamatAdmin, String telpAdmin, String passAdmin){
        Admin admin = new Admin(nip, namaAdmin, alamatAdmin, telpAdmin, passAdmin);
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
    
    public Admin getAdmin(int nip) throws SQLException{
        Admin admin = con.getAdmin(nip);
        return admin;
    }
    
    public String[] getListNipAdmin() throws SQLException{
        return con.getListNipAdmin();
    }
    
    public void delAdmin(int nip) throws SQLException{
        con.delAdmin(nip);
    }
    
    public ArrayList<Admin> getAllAdmin() throws SQLException{
        return con.getAllAdmin();
    }
    
    //Registrasi
    public int inputToken(int nim, String token){
        Registrasi regist = new Registrasi(nim, token);
        try{
            dataRegist.add(regist);
            con.saveToken(regist);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return regist.getIdRegist();
    }
    
    public void updateRegistNip(Registrasi regist){
        try{
            con.updateRegistNip(regist);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void delRegist(int idRegist) throws SQLException{
        con.delRegist(idRegist);
    }
    
    public ArrayList<Registrasi> getAllRegist() throws SQLException{
        return con.getAllRegist();
    }
    
    
    //Mata Kuliah
    public int createMatkul(String namaMatkul, int sks){
        MataKuliah matkul = new MataKuliah(namaMatkul, sks);
        try{
            dataMatkul.add(matkul);
            con.saveMatkul(matkul);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return matkul.getIdMatkul();
    }
    
    public void updateMatkul(MataKuliah matkul){
        try{
            con.updateMatkul(matkul);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void delMatkul(int idMatkul) throws SQLException{
        con.delRegist(idMatkul);
    }
    
    public ArrayList<MataKuliah> getAllMatkul() throws SQLException{
        return con.getAllMatkul();
    }
}
