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
 *
 * @author Dizzay
 */
public class KaryawanManager {
    
    private final Connection koneksiDatabase;

    public KaryawanManager() {
        this.koneksiDatabase = Koneksi.koneksiDB();
    }
    
    public List<KaryawanModel> tampilSemua(){
        String namaTable = "biodata_karyawan";
        String query = "SELECT * FROM "+namaTable;
        KaryawanModel model;
        List<KaryawanModel> list = new ArrayList<>();
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            while(hasilQuery.next()){
                model = new KaryawanModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNama(hasilQuery.getString("nama_karyawan"));
                model.setNik(hasilQuery.getString("nik"));
                model.setkodepos(hasilQuery.getString("kodepos"));
                model.setAlamat(hasilQuery.getString("alamat"));
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
        String query = "SELECT * FROM "+namaTable+" WHERE id = "+id;
        KaryawanModel model = null;
        try {
            Statement preparedStatement = koneksiDatabase.createStatement();
            ResultSet hasilQuery = preparedStatement.executeQuery(query);
            
            while(hasilQuery.next()){
                model = new KaryawanModel();
                model.setId(hasilQuery.getInt("id"));
                model.setNama(hasilQuery.getString("nama_karyawan"));
                model.setNik(hasilQuery.getString("nik"));
                model.setkodepos(hasilQuery.getString("kodepos"));
                model.setAlamat(hasilQuery.getString("alamat"));
            }            
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    
    public boolean insert(String nama_karyawan, String nik, String kodepos, String alamat) {
        String namaTable = "biodata_karyawan";
        String query = "INSERT INTO "+namaTable+" (`nama_karyawan`, `nik`, `kodepos`, `alamat`) VALUES ('"+nama_karyawan+"', '"+nik+"','"+kodepos+"', '"+alamat+"');";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean update(String nama_karyawan, String nik, String kodepos, String alamat, int id) {
        String namaTable = "biodata_karyawan";
        String query = "UPDATE "+namaTable+" SET `nama_karyawan`='"+nama_karyawan+"', `nik`='"+nik+"', `kodepos`='"+kodepos+"', `alamat`='"+alamat+"'  WHERE  `id`="+id+";";
        
        try {
            PreparedStatement preparedStatement = koneksiDatabase.prepareStatement(query);
            preparedStatement.execute();   
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean delete(String id) {
        String namaTable = "biodata_karyawan";
        String query = "DELETE FROM "+namaTable+" WHERE id = "+id;
        
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
