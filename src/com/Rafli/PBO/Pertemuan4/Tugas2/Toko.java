package com.Rafli.PBO.Pertemuan4.Tugas2;

import java.util.ArrayList;

public class Toko {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak Ada Buku Yang Anda Maksud.");
        } else {
            System.out.println("\nDaftar Buku: ");
            for (Buku buku : daftarBuku) {
                buku.displayInfo();
                System.out.println("---------------------\n");
            }
        }
    }
}
