package com.Rafli.PBO.Pertemuan4.Tugas;

import com.Rafli.PBO.Pertemuan4.Manajer;

public class main {
    public static void main(String[] args) {
        Manager mj = new Manager();
        Kasir kr = new Kasir();
        Pelayan pn = new Pelayan();

        mj.jabatan = "Manager";
        mj.nama_karyawan = "Rafli";
        mj.id_karyawan = 21102021;
        mj.gaji_karyawan = "Rp. 2.000.000,00";

        kr.jabatan = "Kasir";
        kr.nama_karyawan = "Bayu";
        kr.id_karyawan = 123456;
        kr.gaji_karyawan = "Rp. 1.500.000,00";

        pn.jabatan = "Pelayan";
        pn.nama_karyawan = "Pratama";
        pn.id_karyawan = 98765;
        pn.gaji_karyawan = "Rp. 1.000.000,00";

        mj.showInfo();
        mj.data("Manajer memiliki tugas untuk memanageri seluruh tempat tersebut");
        mj.jam();
        mj.jam("Pagi");

        kr.showInfo();
        kr.data("Kasir melakukan tugas untuk transaksi kepada pelanggan atau konsumen");

        pn.showInfo();
        pn.data("Pelayan memiliki tugas untuk melayani pelanggan");
    }
}
