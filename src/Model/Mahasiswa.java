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
    private int nim;
    private String namaMhs;
    private String kelas;
    private String alamatMhs;
    private String telpMhs;
    private String passMhs;

    public Mahasiswa(int nim, String namaMhs, String kelas, String alamatMhs, String telpMhs, String passMhs) {
        this.nim = nim;
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.alamatMhs = alamatMhs;
        this.telpMhs = telpMhs;
        this.passMhs = passMhs;
    }

    public Mahasiswa(int nim) {
        this.nim = nim;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
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
