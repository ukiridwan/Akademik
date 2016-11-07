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
}
