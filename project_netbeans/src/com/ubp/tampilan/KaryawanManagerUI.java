/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubp.tampilan;

import com.ubp.manager.KaryawanManager;
import com.ubp.model.KaryawanModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * User interface for managing Karyawan.
 * 
 */
public class KaryawanManagerUI extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanManagerUI
     */
    DefaultTableModel tableModel;
    KaryawanManager karyawanManager;
    boolean sedangDiEdit = false;

    public KaryawanManagerUI() {
        initComponents();
        karyawanManager = new KaryawanManager();
        tampilDataTable();
    }
    
    private void tampilDataTable(){
        String[] kolom = {"ID", "NIK", "Nama", "Jenis Kelamin", "Tempat Lahir", "Tanggal Lahir", "Pendidikan", "Departemen", "Jabatan", "No Telepon", "Status", "Alamat", "Kodepos"};
        tableModel = new DefaultTableModel(null, kolom);
        for(KaryawanModel model : karyawanManager.tampilSemua()){
            String[] row = new String[kolom.length];
            row[0] = String.valueOf(model.getId());
            row[1] = model.getNik();
            row[2] = model.getNamaKaryawan();
            row[3] = model.getJenisKelamin();
            row[4] = model.getTempatLahir();
            row[5] = model.getTanggalLahir();
            row[6] = model.getPendidikan();
            row[7] = model.getDepartemen();
            row[8] = model.getJabatan();
            row[9] = model.getNoTelepon();
            row[10] = model.getStatus();
            row[11] = model.getAlamat();
            row[12] = model.getKodepos();
            tableModel.addRow(row);
        }
        tbl_main.setModel(tableModel);
        tbl_main.clearSelection();
    }
    
    private void refresh(){
        tampilDataTable();
        clearData();
        sedangDiEdit = false;
    }
    
    private void clearData(){
        tf_nik.setText("");
        tf_nama.setText("");
        tf_jenis_kelamin.setText("");
        tf_tempat_lahir.setText("");
        tf_tanggal_lahir.setText("");
        tf_pendidikan.setText("");
        tf_departemen.setText("");
        tf_jabatan.setText("");
        tf_no_telepon.setText("");
        tf_status.setText("");
        tf_alamat.setText("");
        tf_kodepos.setText("");
    }

    // Initialize form components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_jenis_kelamin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_tempat_lahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_tanggal_lahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_pendidikan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_departemen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_jabatan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_no_telepon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_status = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_kodepos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_main = new javax.swing.JTable();
        bt_simpan = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Karyawan Manager");

        jLabel2.setText("NIK");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Tempat Lahir");

        jLabel6.setText("Tanggal Lahir");

        jLabel7.setText("Pendidikan");

        jLabel8.setText("Departemen");

        jLabel9.setText("Jabatan");

        jLabel10.setText("No Telepon");

        jLabel11.setText("Status");

        jLabel12.setText("Alamat");

        jLabel13.setText("Kodepos");

        tbl_main.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_main);

        bt_simpan.setText("Simpan");
        bt_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_simpanMouseClicked(evt);
            }
        });

        bt_delete.setText("Delete");
        bt_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deleteMouseClicked(evt);
            }
        });

        bt_refresh.setText("Refresh");
        bt_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tf_nik)
                    .addComponent(jLabel3)
                    .addComponent(tf_nama)
                    .addComponent(jLabel4)
                    .addComponent(tf_jenis_kelamin)
                    .addComponent(jLabel5)
                    .addComponent(tf_tempat_lahir)
                    .addComponent(jLabel6)
                    .addComponent(tf_tanggal_lahir)
                    .addComponent(jLabel7)
                    .addComponent(tf_pendidikan)
                    .addComponent(jLabel8)
                    .addComponent(tf_departemen)
                    .addComponent(jLabel9)
                    .addComponent(tf_jabatan)
                    .addComponent(jLabel10)
                    .addComponent(tf_no_telepon)
                    .addComponent(jLabel11)
                    .addComponent(tf_status)
                    .addComponent(jLabel12)
                    .addComponent(tf_alamat)
                    .addComponent(jLabel13)
                    .addComponent(tf_kodepos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bt_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tempat_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_pendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_departemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_no_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_kodepos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_simpan)
                            .addComponent(bt_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_refresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void bt_simpanMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String nik = tf_nik.getText();
        String nama_karyawan = tf_nama.getText();
        String jenis_kelamin = tf_jenis_kelamin.getText();
        String tempat_lahir = tf_tempat_lahir.getText();
        String tanggal_lahir = tf_tanggal_lahir.getText();
        String pendidikan = tf_pendidikan.getText();
        String departemen = tf_departemen.getText();
        String jabatan = tf_jabatan.getText();
        String no_telepon = tf_no_telepon.getText();
        String status = tf_status.getText();
        String alamat = tf_alamat.getText();
        String kodepos = tf_kodepos.getText();

        if(!nik.isEmpty() && !nama_karyawan.isEmpty() && !alamat.isEmpty()){
            KaryawanModel model = new KaryawanModel();
            model.setNik(nik);
            model.setNamaKaryawan(nama_karyawan);
            model.setJenisKelamin(jenis_kelamin);
            model.setTempatLahir(tempat_lahir);
            model.setTanggalLahir(tanggal_lahir);
            model.setPendidikan(pendidikan);
            model.setDepartemen(departemen);
            model.setJabatan(jabatan);
            model.setNoTelepon(no_telepon);
            model.setStatus(status);
            model.setAlamat(alamat);
            model.setKodepos(kodepos);

            if(sedangDiEdit){
                int id = Integer.valueOf((String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0));
                model.setId(id);
                karyawanManager.update(model);
            }else{
                karyawanManager.insert(model);
            }
            refresh();
        }else {
            JOptionPane.showMessageDialog(null, "Tidak boleh ada yang kosong !");
        }
    }

    private void bt_deleteMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if(sedangDiEdit){
            int id = Integer.valueOf((String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0));
            karyawanManager.delete(id);
            refresh();
        }
    }

    private void bt_refreshMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        refresh();
    }

    private void tbl_mainMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        sedangDiEdit = true;
        int id = Integer.valueOf((String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0));
        KaryawanModel model = karyawanManager.byId(id);
        tf_nik.setText(model.getNik());
        tf_nama.setText(model.getNamaKaryawan());
        tf_jenis_kelamin.setText(model.getJenisKelamin());
        tf_tempat_lahir.setText(model.getTempatLahir());
        tf_tanggal_lahir.setText(model.getTanggalLahir());
        tf_pendidikan.setText(model.getPendidikan());
        tf_departemen.setText(model.getDepartemen());
        tf_jabatan.setText(model.getJabatan());
        tf_no_telepon.setText(model.getNoTelepon());
        tf_status.setText(model.getStatus());
        tf_alamat.setText(model.getAlamat());
        tf_kodepos.setText(model.getKodepos());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_main;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_departemen;
    private javax.swing.JTextField tf_jabatan;
    private javax.swing.JTextField tf_jenis_kelamin;
    private javax.swing.JTextField tf_kodepos;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nik;
    private javax.swing.JTextField tf_no_telepon;
    private javax.swing.JTextField tf_pendidikan;
    private javax.swing.JTextField tf_status;
    private javax.swing.JTextField tf_tanggal_lahir;
    private javax.swing.JTextField tf_tempat_lahir;
    // End of variables declaration
}
