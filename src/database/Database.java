/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
    public void saveMahasiswa(Mahasiswa mhs) throws SQLException{
        String query = "INSERT INTO mahasiswa(namaMhs, nim, kelas, alamatMhs, telpMhs, passMhs, token) VALUES ('"
                        +mhs.getNamaMhs()+"','"+mhs.getNim()+"','"+mhs.getKelas()+"','"+mhs.getAlamatMhs()+"','"
                        +mhs.getTelpMhs()+"','"+mhs.getPassMhs()+"','"+mhs.getToken()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Mahasiswa getMahasiswa(String nim) throws SQLException{
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE nim = '"+nim+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            mhs = new Mahasiswa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7));
        }
        return mhs;
    }
    
    public void updateMahasiswa(Mahasiswa mhs) throws SQLException{
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
    
    public void delMahasiswa(String nim) throws SQLException{
        
    }
}
