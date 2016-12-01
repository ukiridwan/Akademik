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
public class Absensi {
    private int idAbsensi;
    private int idJadwal;
    private int nim;
    private String absen;

    public Absensi(int idAbsensi, int idJadwal, int nim, String absen) {
        this.idAbsensi = idAbsensi;
        this.idJadwal = idJadwal;
        this.nim = nim;
        this.absen = absen;
    }

    public Absensi(int idJadwal, int nim, String absen) {
        this.idJadwal = idJadwal;
        this.nim = nim;
        this.absen = absen;
    }

    public int getIdAbsensi() {
        return idAbsensi;
    }

    public void setIdAbsensi(int idAbsensi) {
        this.idAbsensi = idAbsensi;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }
    
    
}
