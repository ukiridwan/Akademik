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
public class Indeks {
    private int idIndeks;
    private int idMatkul;
    private int nim;
    private String indeksNilai;

    public Indeks(int idIndeks, int idMatkul, int nim, String indeksNilai) {
        this.idIndeks = idIndeks;
        this.idMatkul = idMatkul;
        this.nim = nim;
        this.indeksNilai = indeksNilai;
    }

    public int getIdIndeks() {
        return idIndeks;
    }

    public void setIdIndeks(int idIndeks) {
        this.idIndeks = idIndeks;
    }

    public int getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(int idMatkul) {
        this.idMatkul = idMatkul;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getIndeksNilai() {
        return indeksNilai;
    }

    public void setIndeksNilai(String indeksNilai) {
        this.indeksNilai = indeksNilai;
    }
    
    
}
