/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.*;

/**
 *
 * @author Toms
 */
public class Admin {
    private String nip;
    private String namaAdmin;
    private String alamatAdmin;;
    private int telpAdmin;
    private String passAdmin;

    public Admin() {
    }

    public Admin(String namaAdmin, String nip, String alamatAdmin, int telpAdmin, String passAdmin) {
        this.namaAdmin = namaAdmin;
        this.nip = nip;
        this.alamatAdmin = alamatAdmin;
        this.telpAdmin = telpAdmin;
        this.passAdmin = passAdmin;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getAlamatAdmin() {
        return alamatAdmin;
    }

    public void setAlamatAdmin(String alamatAdmin) {
        this.alamatAdmin = alamatAdmin;
    }

    public int getTelpAdmin() {
        return telpAdmin;
    }

    public void setTelpAdmin(int telpAdmin) {
        this.telpAdmin = telpAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }
    
    
}
