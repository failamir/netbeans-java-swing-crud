/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubp.model;

/**
 *
 * @author Dizzay
 */
public class KaryawanModel {
    
    private int id;
    private String nama_karyawan;
    private String nik;
    private String kodepos;
    private String alamat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama_karyawan;
    }

    public void setNama(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getkodepos() {
        return kodepos;
    }

    public void setkodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    
}
