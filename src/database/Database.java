/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.Admin;
import Model.Dosen;
import Model.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author UKI
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/akademik", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;
    
    public void connect() throws SQLException {
            con = DriverManager.getConnection(server, dbuser, dbuser);
            st = con.createStatement();
    }
    
    //Mahasiswa
    public void saveMhs(Mahasiswa mhs) throws SQLException{
        String query = "INSERT INTO mahasiswa(namaMhs, nim, kelas, alamatMhs, telpMhs, passMhs, token) VALUES ('"
                        +mhs.getNamaMhs()+"','"+mhs.getNim()+"','"+mhs.getKelas()+"','"+mhs.getAlamatMhs()+"','"
                        +mhs.getTelpMhs()+"','"+mhs.getPassMhs()+"','"+mhs.getToken()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Mahasiswa getMhs(String nim) throws SQLException{
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE nim = '"+nim+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            mhs = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
        }
        return mhs;
    }
    
    public void updateMhs(Mahasiswa mhs) throws SQLException{
        String query = "UPDATE mahasiswa SET alamatMhs ='"
                        +mhs.getAlamatMhs()+"', telpMhs='"
                        +mhs.getTelpMhs()+"', passMhs='"
                        +mhs.getPassMhs()+"' WHERE nim ='"
                        +mhs.getNim()+"'";
        st.executeUpdate(query);
    }
    
    public String[] getListNimMhs() throws SQLException{
        ArrayList<String> listnim = new ArrayList<>();
        String query = "SELECT nim FROM mahasiswa";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listnim.add(rs.getString(2));
        }
        return listnim.toArray(new String[0]);
    }
    
    public void delMhs(String nim) throws SQLException{
        String query = "DELETE FROM mahasiswa where nim='"+nim+"'";
        st.execute(query);
    }
    
    public ArrayList<Mahasiswa> getAllMhs() throws SQLException{
        ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
        
        String query = "SELECT * FROM mahasiswa";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Mahasiswa mhs = new Mahasiswa(rs.getString("namaMhs"), rs.getString("nim"), rs.getString("kelas"), rs.getString("alamatMhs"), rs.getInt("telpMhs"), rs.getString("passMhs"));
              dataMhs.add(mhs);
        }
        return dataMhs;  
    }
    
    //Dosen
    public void saveDosen(Dosen dosen) throws SQLException{
        String query = "INSERT INTO dosen(namaDosen, nik, alamatDosen, telpDosen, passDosen) VALUES ('"
                        +dosen.getNamaDosen()+"','"+dosen.getNik()+"','"+dosen.getAlamatDosen()+"','"
                        +dosen.getTelpDosen()+"','"+dosen.getPassDosen()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Dosen getDosen(String nik) throws SQLException{
        Dosen dosen = null;
        String query = "SELECT * FROM dosen WHERE nik = '"+nik+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            dosen = new Dosen(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
        }
        return dosen;
    }
    
    public void updateDosen(Dosen dosen) throws SQLException{
        String query = "UPDATE dosen SET alamatDosen ='"
                        +dosen.getAlamatDosen()+"', telpDosen='"
                        +dosen.getTelpDosen()+"', passDosen='"
                        +dosen.getPassDosen()+"' WHERE nik ='"
                        +dosen.getNik()+"'";
        st.executeUpdate(query);
    }
    
    public String[] getListNikDosen() throws SQLException{
        ArrayList<String> listnik = new ArrayList<>();
        String query = "SELECT nik FROM dosen";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listnik.add(rs.getString(2));
        }
        return listnik.toArray(new String[0]);
    }
    
    public void delDosen(String nik) throws SQLException{
        String query = "DELETE FROM dosen where nik='"+nik+"'";
        st.execute(query);
    }
    
    public ArrayList<Dosen> getAllDosen() throws SQLException{
        ArrayList<Dosen> dataDosen = new ArrayList<>();
        
        String query = "SELECT * FROM dosen";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Dosen dosen = new Dosen(rs.getString("namaDosen"), rs.getString("nik"), rs.getString("alamatDosen"), rs.getInt("telpDosen"), rs.getString("passDosen"));
              dataDosen.add(dosen);
        }
        return dataDosen;  
    }
    
    //Admin
        public void saveAdmin(Admin admin) throws SQLException{
        String query = "INSERT INTO admin(namaAdmin, nip, alamatAdmin, telpAdmin, passAdmin) VALUES ('"
                        +admin.getNamaAdmin()+"','"+admin.getNip()+"','"+admin.getAlamatAdmin()+"','"
                        +admin.getTelpAdmin()+"','"+admin.getPassAdmin()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Admin getAdmin(String nip) throws SQLException{
        Admin admin = null;
        String query = "SELECT * FROM admin WHERE nip = '"+nip+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            admin = new Admin(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
        }
        return admin;
    }
    
    public void updateAdmin(Admin admin) throws SQLException{
        String query = "UPDATE admin SET alamatAdmin ='"
                        +admin.getAlamatAdmin()+"', telpAdmin='"
                        +admin.getTelpAdmin()+"', passAdmin='"
                        +admin.getPassAdmin()+"' WHERE nik ='"
                        +admin.getNip()+"'";
        st.executeUpdate(query);
    }
    
    public String[] getListNipAdmin() throws SQLException{
        ArrayList<String> listnip = new ArrayList<>();
        String query = "SELECT nip FROM admin";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            listnip.add(rs.getString(2));
        }
        return listnip.toArray(new String[0]);
    }
    
    public void delAdmin(String nip) throws SQLException{
        String query = "DELETE FROM admin where nip='"+nip+"'";
        st.execute(query);
    }
    
    public ArrayList<Admin> getAllAdmin() throws SQLException{
        ArrayList<Admin> dataAdmin = new ArrayList<>();
        
        String query = "SELECT * FROM admin";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Admin admin = new Admin(rs.getString("namaAdmin"), rs.getString("nip"), rs.getString("alamatAdmin"), rs.getInt("telpAdmin"), rs.getString("passAdmin"));
              dataAdmin.add(admin);
        }
        return dataAdmin;  
    }
}
