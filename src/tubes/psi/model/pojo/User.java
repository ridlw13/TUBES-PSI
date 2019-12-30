/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.psi.model.pojo;

import java.util.Date;

/**
 *
 * @author A412FL
 */
public class User extends Time {
    private String id;
    private String nama;
    private String billing;
    private String pc;
    private String harga;
    private String tanggal;
    private String jam_mulai;
    private String jam_berhenti;
    
    public User(){
        
    }
    public User(String id){
        this.id = id;
    }
    
    public User(String id, String nama, String billing, String pc, String harga, String tanggal, String jam_mulai, String jam_berhenti){
        
        this.nama = nama;
        this.billing = billing;
        this.id = id;
        this.harga = harga;
        this.pc = pc;
        this.tanggal = tanggal;
        this.jam_berhenti = jam_berhenti;
        this.jam_mulai = jam_mulai;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
   
    
    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam_mulai() {
        return jam_mulai;
    }

    public void setJam_mulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }

    public String getJam_berhenti() {
        return jam_berhenti;
    }


    public void setJam_berhenti(String jam_berhenti) {
        this.jam_berhenti = jam_berhenti;
    }
    
}
