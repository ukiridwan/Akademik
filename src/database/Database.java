/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.Admin;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Registrasi;
import Model.MataKuliah;
import Model.Indeks;
import Model.Jadwal;
import Model.Absensi;
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
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();
    }
    
    //Mahasiswa
    public void saveMhs(Mahasiswa mhs) throws SQLException{
        String query = "INSERT INTO mahasiswa(nim, namaMhs, kelas, alamatMhs, telpMhs, passMhs) VALUES ('"
                        +mhs.getNim()+"','"+mhs.getNamaMhs()+"','"+mhs.getKelas()+"','"+mhs.getAlamatMhs()+"','"
                        +mhs.getTelpMhs()+"','"+mhs.getPassMhs()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Mahasiswa getMhs(int nim) throws SQLException{
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE nim = '"+nim+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            mhs = new Mahasiswa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
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
            listnim.add(rs.getString(1));
        }
        return listnim.toArray(new String[0]);
    }
    
    public void delMhs(int nim) throws SQLException{
        String query = "DELETE FROM mahasiswa where nim='"+nim+"'";
        st.execute(query);
    }
    
    public ArrayList<Mahasiswa> getAllMhs() throws SQLException{
        ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
        
        String query = "SELECT * FROM mahasiswa";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Mahasiswa mhs = new Mahasiswa(rs.getInt("nim"), rs.getString("namaMhs"), rs.getString("kelas"), rs.getString("alamatMhs"), rs.getString("telpMhs"), rs.getString("passMhs"));
              dataMhs.add(mhs);
        }
        return dataMhs;  
    }
    
    //Dosen
    public void saveDosen(Dosen dosen) throws SQLException{
        String query = "INSERT INTO dosen(nik, namaDosen, alamatDosen, telpDosen, passDosen) VALUES ('"
                        +dosen.getNik()+"','"+dosen.getNamaDosen()+"','"+dosen.getAlamatDosen()+"','"
                        +dosen.getTelpDosen()+"','"+dosen.getPassDosen()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Dosen getDosen(int nik) throws SQLException{
        Dosen dosen = null;
        String query = "SELECT * FROM dosen WHERE nik = '"+nik+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            dosen = new Dosen(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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
    
    public void delDosen(int nik) throws SQLException{
        String query = "DELETE FROM dosen where nik='"+nik+"'";
        st.execute(query);
    }
    
    public ArrayList<Dosen> getAllDosen() throws SQLException{
        ArrayList<Dosen> dataDosen = new ArrayList<>();
        
        String query = "SELECT * FROM dosen";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Dosen dosen = new Dosen(rs.getInt("nik"), rs.getString("namaDosen"), rs.getString("alamatDosen"), rs.getString("telpDosen"), rs.getString("passDosen"));
              dataDosen.add(dosen);
        }
        return dataDosen;  
    }
    
    //Admin
    public void saveAdmin(Admin admin) throws SQLException{
        String query = "INSERT INTO admin(nip, namaAdmin, alamatAdmin, telpAdmin, passAdmin) VALUES ('"
                        +admin.getNip()+"','"+admin.getNamaAdmin()+"','"+admin.getAlamatAdmin()+"','"
                        +admin.getTelpAdmin()+"','"+admin.getPassAdmin()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public Admin getAdmin(int nip) throws SQLException{
        Admin admin = null;
        String query = "SELECT * FROM admin WHERE nip = '"+nip+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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
    
    public void delAdmin(int nip) throws SQLException{
        String query = "DELETE FROM admin where nip='"+nip+"'";
        st.execute(query);
    }
    
    public ArrayList<Admin> getAllAdmin() throws SQLException{
        ArrayList<Admin> dataAdmin = new ArrayList<>();
        
        String query = "SELECT * FROM admin";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Admin admin = new Admin(rs.getInt("nik"), rs.getString("namaAdmin"), rs.getString("alamatAdmin"), rs.getString("telpAdmin"), rs.getString("passAdmin"));
              dataAdmin.add(admin);
        }
        return dataAdmin;  
    }

    //Registrasi
    public void saveToken(Registrasi regist) throws SQLException{
        String query = "INSERT INTO registrasi(idRegist, nip, nim, token) VALUES (NULL,'','"+regist.getNim()+"','"
                        +regist.getToken()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public void updateRegistNip(Registrasi regist) throws SQLException{
        String query = "UPDATE registrasi SET nip ='"
                        +regist.getNip()+"' WHERE idRegist ='"
                        +regist.getIdRegist()+"'";
        st.executeUpdate(query);
    }
    
    public void delRegist(int idRegist) throws SQLException{
        String query = "DELETE FROM registrasi where idRegist='"+idRegist+"'";
        st.execute(query);
    }
    
    public ArrayList<Registrasi> getAllRegist() throws SQLException{
        ArrayList<Registrasi> dataRegist = new ArrayList<>();
        
        String query = "SELECT * FROM registrasi";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Registrasi regist = new Registrasi(rs.getInt("idRegist"), rs.getInt("nip"), rs.getInt("nim"), rs.getString("token"));
              dataRegist.add(regist);
        }
        return dataRegist;  
    }
    
    //Mata Kuliah
    public void saveMatkul(MataKuliah matkul) throws SQLException{
        String query = "INSERT INTO matakuliah(idMatkul, namaMatkul, sks) VALUES (NULL,'"+matkul.getNamaMatkul()+"','"+matkul.getSks()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public void updateMatkul(MataKuliah matkul) throws SQLException{
        String query = "UPDATE matakuliah SET namaMatkul ='"
                        +matkul.getNamaMatkul()+"', sks ='"+matkul.getSks()+"' WHERE idMatkul ='"
                        +matkul.getIdMatkul()+"'";
        st.executeUpdate(query);
    }
    
    public void delMatkul(int idMatkul) throws SQLException{
        String query = "DELETE FROM matakuliah where idMatkul='"+idMatkul+"'";
        st.execute(query);
    }
    
    public ArrayList<MataKuliah> getAllMatkul() throws SQLException{
        ArrayList<MataKuliah> dataMatkul = new ArrayList<>();
        
        String query = "SELECT * FROM matakuliah";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              MataKuliah matkul = new MataKuliah(rs.getInt("idMatkul"), rs.getString("namaMatkul"), rs.getInt("sks"));
              dataMatkul.add(matkul);
        }
        return dataMatkul;  
    }
    
    //Indeks
    public void saveIndeks(Indeks indeks) throws SQLException{
        String query = "INSERT INTO indeks(idIndeks, idMatkul, nim, indeksnilai) VALUES (NULL,'"+indeks.getIdMatkul()+"','"+indeks.getNim()+"','"+indeks.getIndeksNilai()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public void updateIndeks(Indeks indeks) throws SQLException{
        String query = "UPDATE indeks SET indeksnilai ='"
                        +indeks.getIndeksNilai()+"' WHERE idIndeks ='"
                        +indeks.getIdIndeks()+"'";
        st.executeUpdate(query);
    }
    
    public void delIndeks(int idIndeks) throws SQLException{
        String query = "DELETE FROM indeks where idIndeks='"+idIndeks+"'";
        st.execute(query);
    }
    
    public ArrayList<Indeks> getAllIndeks(int nim) throws SQLException{
        ArrayList<Indeks> dataIndeks = new ArrayList<>();
        
        String query = "SELECT * FROM indeks WHERE nim ='"+nim+"'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Indeks indeks = new Indeks(rs.getInt("idIndeks"), rs.getInt("idMatkul"), rs.getInt("nim"), rs.getString("indeksnilai"));
              dataIndeks.add(indeks);
        }
        return dataIndeks;  
    }
    
    //Jadwal
    public void saveJadwal(Jadwal jadwal) throws SQLException{
        String query = "INSERT INTO jadwal(idJadwal, idMatkul, nik, ruang) VALUES (NULL,'"+jadwal.getIdMatkul()+"','"+jadwal.getNik()+"','"+jadwal.getRuang()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public void updateJadwal(Jadwal jadwal) throws SQLException{
        String query = "UPDATE jadwal SET nik ='"
                        +jadwal.getNik()+"', ruang ='"+jadwal.getRuang()+"' WHERE idJadwal ='"
                        +jadwal.getIdJadwal()+"'";
        st.executeUpdate(query);
    }
    
    public void delJadwal(int idJadwal) throws SQLException{
        String query = "DELETE FROM jadwal where idJadwal='"+idJadwal+"'";
        st.execute(query);
    }
    
    public ArrayList<Jadwal> getAllJadwal() throws SQLException{
        ArrayList<Jadwal> dataJadwal = new ArrayList<>();
        
        String query = "SELECT * FROM jadwal";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Jadwal jadwal = new Jadwal(rs.getInt("idJadwal"), rs.getInt("idMatkul"), rs.getInt("nik"), rs.getString("ruang"));
              dataJadwal.add(jadwal);
        }
        return dataJadwal;  
    }
    
    //Absensi
    public void saveAbsensi(Absensi absensi) throws SQLException{
        String query = "INSERT INTO absensi(idAbsensi, idJadwal, nim, absen) VALUES (NULL,'"+absensi.getIdJadwal()+"','"+absensi.getNim()+"','"+absensi.getAbsen()+"')";
        st.execute(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = st.getGeneratedKeys();
    }
    
    public void updateAbsensi(Absensi absensi) throws SQLException{
        String query = "UPDATE absensi SET absen ='"
                        +absensi.getAbsen()+"' WHERE idAbsensi ='"
                        +absensi.getIdAbsensi()+"'";
        st.executeUpdate(query);
    }
    
    public void delAbsensi(int idAbsensi) throws SQLException{
        String query = "DELETE FROM absensi where idAbsensi='"+idAbsensi+"'";
        st.execute(query);
    }
    
    public ArrayList<Absensi> getAllAbsensi() throws SQLException{
        ArrayList<Absensi> dataAbsensi = new ArrayList<>();
        
        String query = "SELECT * FROM absensi";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
              Absensi absensi = new Absensi(rs.getInt("idAbsensi"), rs.getInt("idJadwal"), rs.getInt("nim"), rs.getString("absen"));
              dataAbsensi.add(absensi);
        }
        return dataAbsensi;  
    }
}