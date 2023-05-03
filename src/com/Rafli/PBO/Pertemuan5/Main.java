package com.Rafli.PBO.Pertemuan5;

public class Main {
    public static void main(String[] args) {

        //membuat array kosong
        Barang[] keranjang = new Barang[10];

        //membuat array dengan isi
        Barang[] etalase = {
                new Barang("Indomie", 3000),
                new Barang("Pulpen", 3000),
                new Barang("Pensil", 2500),
                new Barang("Spidol", 5000),
                new Barang("Penghapus", 4000)
        };

        //menampilkan jumlah data dalam array
        System.out.println("Jumlah Barang Yang Ada Di Etalase : "+etalase.length);

        //menampilkan data yang di ada di dalam array
        System.out.println("Daftar Barang Yang Ada Di Dalam Etalase : ");

        //perulangan for each untuk menampiilkan data yang ada
        int i = 1;
        for (Barang b : etalase){
            System.out.println("Barang ke-"+i);
            b.showInfo();
            i++;
        }

        for (int j = 0; j< etalase.length; j++ ) {
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }
    }
}
