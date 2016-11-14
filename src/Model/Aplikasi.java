/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import database.Database;
import java.sql.SQLException;
import java.util.ArrayList;

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
        try{
            con.connect();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    //Mahasiswa
    public String createMahasiswa(String namaMhs, String nim, String kelas, String alamatMhs, int telpMhs, String passMhs, String token){
        Mahasiswa mhs = new Mahasiswa(namaMhs, nim, kelas, alamatMhs, telpMhs, passMhs, token);
        try{
            dataMhs.add(mhs);
            con.saveMahasiswa(mhs);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return mhs.getNim();
    }
    
    public void updateMahasiswa(Mahasiswa mhs){
        try{
            con.updateMahasiswa(mhs);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Mahasiswa getMahasiswa(String nim) throws SQLException{
        Mahasiswa mhs = con.getMahasiswa(nim);
        return mhs;
    }
    
    public String[] getListNimMhs() throws SQLException{
        return con.getListNimMhs();
    }
    
    public void delMhs(String nim) throws SQLException{
        con.delMahasiswa(nim);
    }
    
//    public ArrayList<Mahasiswa> getAllMahasiswa() throws SQLException{
//        return con.get
//    }
}
