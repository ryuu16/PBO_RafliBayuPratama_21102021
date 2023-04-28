package com.Rafli.PBO.Pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGemsMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<GemsMarket> paketList = new ArrayList<GemsMarket>();


        GemsMarket fireworks = new GemsMarket ("Paket 1 : Paket FireWorks", "380 Gems + 80 Gems", 120000);
        GemsMarket bomb = new GemsMarket ("Paket 2 : Paket Bomb", "980 Gems + 380 Gems", 240000);
        GemsMarket dynamite = new GemsMarket ("paket 3 : Paket Dynamite", "1980 Gems + 980 Gems", 480000);

        //menambahkan paket layanan diatas ke dalam list
        paketList.add(fireworks);
        paketList.add(bomb);
        paketList.add(dynamite);

        //menampilkan daftar paket
        System.out.println("DAFTAR PAKET GEMSMARKET");
        for (int i = 0; i < paketList.size(); i++) {
            System.out.println((i+1) + ". " + paketList.get(i).toString());
        }

        ArrayList<GemsMarket> paketTerpilih = new ArrayList<>();
        boolean lanjutPilih = true;
        while (lanjutPilih) {
            System.out.print("Pilih paket yang diinginkan (pilih angka 0 untuk melihat total biaya): ");
            int paketIndex = input.nextInt() - 1;
            if (paketIndex >= 0 && paketIndex < paketList.size()) {
                paketTerpilih.add(paketList.get(paketIndex));
            } else if (paketIndex == -1) {
                lanjutPilih = false;
            } else {
                System.out.println("Pilihan tidak tersedia, silahkan pilih ulang!");
            }
        }

        System.out.println("\nPaket yang dipilih : ");
        for (int i = 0; i < paketTerpilih.size(); i++) {
            System.out.println((i+1) + ". " + paketTerpilih.get(i).toString());
        }

        // untuk menghitung total biaya
        int totalBiaya = 0;
        for (int i = 0; i < paketTerpilih.size(); i++) {
            totalBiaya += paketTerpilih.get(i).getBiaya();
        }
        System.out.println("Total biaya Rp" + totalBiaya);
    }
}
