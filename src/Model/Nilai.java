/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author UKI
 */
public class Nilai {
    private double uts;
    private double uas;
    private double tugas;
    private String indeks;

    public Nilai(double uts, double uas, double tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double getTugas() {
        return tugas;
    }

    public double getUas() {
        return uas;
    }

    public double getUts() {
        return uts;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public void hitungIndeks(double tugas, double uas, double uts) {
        
        double total = 0.2*tugas + 0.4*uts + 0.4*uas;
        if (total>=80) {
            this.indeks = "A";
        }
        else if (total<=79 && total>=75) {
            this.indeks = "AB";
        }
        else if (total<=74 && total>=65) {
            this.indeks = "B";
        }
        else if (total<=64 && total>=55){
            this.indeks = "BC";
        }
        else if (total<=54 && total>=45){
            this.indeks = "C";
        }
        else if (total<=44 && total>= 20){
            this.indeks = "D";
        }
        else{
            this.indeks = "E";
        }
    }
}
