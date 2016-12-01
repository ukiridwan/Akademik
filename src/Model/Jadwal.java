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
public class Jadwal {
    private int idJadwal;
    private int idMatkul;
    private int nik;
    private String ruang;

    public Jadwal(int idJadwal, int idMatkul, int nik, String ruang) {
        this.idJadwal = idJadwal;
        this.idMatkul = idMatkul;
        this.nik = nik;
        this.ruang = ruang;
    }

    public Jadwal(int idMatkul, int nik, String ruang) {
        this.idMatkul = idMatkul;
        this.nik = nik;
        this.ruang = ruang;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public int getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(int idMatkul) {
        this.idMatkul = idMatkul;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }
    
    
}
