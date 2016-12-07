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
public class Dosen {
    private int nik;
    private String namaDosen;
    private String alamatDosen;
    private String telpDosen;
    private String passDosen;

    public Dosen() {
    }

    public Dosen(int nik, String namaDosen, String alamatDosen, String telpDosen, String passDosen) {
        this.nik = nik;
        this.namaDosen = namaDosen;
        this.alamatDosen = alamatDosen;
        this.telpDosen = telpDosen;
        this.passDosen = passDosen;
    }

    public Dosen(int nik) {
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getAlamatDosen() {
        return alamatDosen;
    }

    public void setAlamatDosen(String alamatDosen) {
        this.alamatDosen = alamatDosen;
    }

    public String getTelpDosen() {
        return telpDosen;
    }

    public void setTelpDosen(String telpDosen) {
        this.telpDosen = telpDosen;
    }

    public String getPassDosen() {
        return passDosen;
    }

    public void setPassDosen(String passDosen) {
        this.passDosen = passDosen;
    }
}
