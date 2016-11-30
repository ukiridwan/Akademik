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
    private String nik;
    private String namaDosen;
    private String alamatDosen;
    private int telpDosen;
    private String passDosen;

    public Dosen() {
    }

    public Dosen(String namaDosen, String nik, String alamatDosen, int telpDosen, String passDosen) {
        this.namaDosen = namaDosen;
        this.nik = nik;
        this.alamatDosen = alamatDosen;
        this.telpDosen = telpDosen;
        this.passDosen = passDosen;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
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

    public int getTelpDosen() {
        return telpDosen;
    }

    public void setTelpDosen(int telpDosen) {
        this.telpDosen = telpDosen;
    }

    public String getPassDosen() {
        return passDosen;
    }

    public void setPassDosen(String passDosen) {
        this.passDosen = passDosen;
    }
}
