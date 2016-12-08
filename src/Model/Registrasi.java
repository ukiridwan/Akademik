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
public class Registrasi {
    private int idRegist;
    private int nim;
    private String token;
    private String status;

    public Registrasi(int idRegist, int nim, String token, String status) {
        this.idRegist = idRegist;
        this.nim = nim;
        this.token = token;
        this.status = status;
    }

    public Registrasi(int nim, String token) {
        this.nim = nim;
        this.token = token;
    }

    public Registrasi(int nim) {
        this.nim = nim;
    }

    public int getIdRegist() {
        return idRegist;
    }

    public void setIdRegist(int idRegist) {
        this.idRegist = idRegist;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
