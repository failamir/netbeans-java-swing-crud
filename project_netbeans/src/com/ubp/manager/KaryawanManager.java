/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubp.manager;

import com.ubp.config.Koneksi;
import com.ubp.model.KaryawanModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manager class for handling CRUD operations for Karyawan.
 * 
 */
public class KaryawanManager {
    
    private final Connection koneksiDatabase;

    public KaryawanManager() {
        this.koneksiDatabase = Koneksi.koneksiDB();
    }
    
    public List<KaryawanModel> tampilSemua(){
        String namaTable = "biodata_karyawan";
        String query = "SELECT * FROM " + namaTable;
        KaryawanModel model;
        List<KaryawanModel> list = new ArrayList<>();
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            while(hasilQuery.next()){
                model = new KaryawanModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNik(hasilQuery.getString("nik"));
                model.setNamaKaryawan(hasilQuery.getString("nama_karyawan"));
                model.setJenisKelamin(hasilQuery.getString("jenis_kelamin"));
                model.setTempatLahir(hasilQuery.getString("tempat_lahir"));
                model.setTanggalLahir(hasilQuery.getString("tanggal_lahir"));
                model.setPendidikan(hasilQuery.getString("pendidikan"));
                model.setDepartemen(hasilQuery.getString("departemen"));
                model.setJabatan(hasilQuery.getString("jabatan"));
                model.setNoTelepon(hasilQuery.getString("no_telepon"));
                model.setStatus(hasilQuery.getString("status"));
                model.setAlamat(hasilQuery.getString("alamat"));
                model.setKodepos(hasilQuery.getString("kodepos"));
                list.add(model);
            }            
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public KaryawanModel byId(int id){
        String namaTable = "biodata_karyawan";
        String query = "SELECT * FROM " + namaTable + " WHERE id = " + id;
        KaryawanModel model = null;
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            if(hasilQuery.next()){
                model = new KaryawanModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNik(hasilQuery.getString("nik"));
                model.setNamaKaryawan(hasilQuery.getString("nama_karyawan"));
                model.setJenisKelamin(hasilQuery.getString("jenis_kelamin"));
                model.setTempatLahir(hasilQuery.getString("tempat_lahir"));
                model.setTanggalLahir(hasilQuery.getString("tanggal_lahir"));
                model.setPendidikan(hasilQuery.getString("pendidikan"));
                model.setDepartemen(hasilQuery.getString("departemen"));
                model.setJabatan(hasilQuery.getString("jabatan"));
                model.setNoTelepon(hasilQuery.getString("no_telepon"));
                model.setStatus(hasilQuery.getString("status"));
                model.setAlamat(hasilQuery.getString("alamat"));
                model.setKodepos(hasilQuery.getString("kodepos"));
            }            
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    
    public boolean insert(KaryawanModel model) {
        String namaTable = "biodata_karyawan";
        String query = "INSERT INTO " + namaTable + " (nik, nama_karyawan, jenis_kelamin, tempat_lahir, tanggal_lahir, pendidikan, departemen, jabatan, no_telepon, status, alamat, kodepos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.setString(1, model.getNik());
            preparedStatement.setString(2, model.getNamaKaryawan());
            preparedStatement.setString(3, model.getJenisKelamin());
            preparedStatement.setString(4, model.getTempatLahir());
            preparedStatement.setString(5, model.getTanggalLahir());
            preparedStatement.setString(6, model.getPendidikan());
            preparedStatement.setString(7, model.getDepartemen());
            preparedStatement.setString(8, model.getJabatan());
            preparedStatement.setString(9, model.getNoTelepon());
            preparedStatement.setString(10, model.getStatus());
            preparedStatement.setString(11, model.getAlamat());
            preparedStatement.setString(12, model.getKodepos());
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean update(KaryawanModel model) {
        String namaTable = "biodata_karyawan";
        String query = "UPDATE " + namaTable + " SET nik = ?, nama_karyawan = ?, jenis_kelamin = ?, tempat_lahir = ?, tanggal_lahir = ?, pendidikan = ?, departemen = ?, jabatan = ?, no_telepon = ?, status = ?, alamat = ?, kodepos = ? WHERE id = ?";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.setString(1, model.getNik());
            preparedStatement.setString(2, model.getNamaKaryawan());
            preparedStatement.setString(3, model.getJenisKelamin());
            preparedStatement.setString(4, model.getTempatLahir());
            preparedStatement.setString(5, model.getTanggalLahir());
            preparedStatement.setString(6, model.getPendidikan());
            preparedStatement.setString(7, model.getDepartemen());
            preparedStatement.setString(8, model.getJabatan());
            preparedStatement.setString(9, model.getNoTelepon());
            preparedStatement.setString(10, model.getStatus());
            preparedStatement.setString(11, model.getAlamat());
            preparedStatement.setString(12, model.getKodepos());
            preparedStatement.setInt(13, model.getId());
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean delete(int id) {
        String namaTable = "biodata_karyawan";
        String query = "DELETE FROM " + namaTable + " WHERE id = " + id;
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
