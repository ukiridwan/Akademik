/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Toms
 */
public class Mahasiswa {
    private String namaMhs;
    private String nim;
    private String token;
    private String kelas;
    private String alamatMhs;
    private String telpMhs;
    private String passMhs;

    public Mahasiswa(String namaMhs, String nim, String kelas, String alamatMhs, String telpMhs, String passMhs, String token) {
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.kelas = kelas;
        this.alamatMhs = alamatMhs;
        this.telpMhs = telpMhs;
        this.passMhs = passMhs;
        this.token = token;
    }
    
    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamatMhs() {
        return alamatMhs;
    }

    public void setAlamatMhs(String alamatMhs) {
        this.alamatMhs = alamatMhs;
    }

    public String getTelpMhs() {
        return telpMhs;
    }

    public void setTelpMhs(String telpMhs) {
        this.telpMhs = telpMhs;
    }

    public String getPassMhs() {
        return passMhs;
    }

    public void setPassMhs(String passMhs) {
        this.passMhs = passMhs;
    }   
}
