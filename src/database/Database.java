/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.Dosen;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            con = DriverManager.getConnection(server, dbuser, dbpass);
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
            mhs = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7));
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
}
