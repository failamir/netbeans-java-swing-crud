/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubp.model;

/**
 * Model class for Karyawan (Employee).
 * Represents the biodata_karyawan table.
 * 
 */
public class KaryawanModel {

    private int id;
    private String nik;
    private String nama_karyawan;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String pendidikan;
    private String departemen;
    private String jabatan;
    private String no_telepon;
    private String status;
    private String alamat;
    private String kodepos;

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaKaryawan() {
        return nama_karyawan;
    }

    public void setNamaKaryawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTempatLahir() {
        return tempat_lahir;
    }

    public void setTempatLahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTanggalLahir() {
        return tanggal_lahir;
    }

    public void setTanggalLahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNoTelepon() {
        return no_telepon;
    }

    public void setNoTelepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }
}
