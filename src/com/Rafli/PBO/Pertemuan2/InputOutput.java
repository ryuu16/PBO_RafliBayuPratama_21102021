package com.Rafli.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner untuk inputan

        System.out.println("Masukan nama Anda : "); //system in untuk mengambil nilai
        String nama = input.nextLine();//system out untuk mendeklarasikan

        System.out.println("Selamat pagi " + nama + "!");
    }
}
