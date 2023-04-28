package com.Rafli.PBO.Pertemuan4.Tugas;

public class Karyawan {
    String nama_karyawan;
    String gaji_karyawan;
    int id_karyawan;
    String jabatan;

    public void showInfo() {
        System.out.println(" Jabatan : " + jabatan);
        System.out.println(" Nama : " + nama_karyawan);
        System.out.println(" Jumlah Gaji : " + gaji_karyawan);
        System.out.println(" No Identitas : " + id_karyawan);
    }
}
