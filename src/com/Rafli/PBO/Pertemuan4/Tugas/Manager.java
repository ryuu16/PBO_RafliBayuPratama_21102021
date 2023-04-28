package com.Rafli.PBO.Pertemuan4.Tugas;

public class Manager extends Karyawan{
    public void data(String tugas) {
        System.out.println(" Tugas : " + tugas);
    }
    public void extraInfo() {

        System.out.println(" Jadwal Kerja");
    }
    public void jam(String shift){

        System.out.println(" Jadwal shift : " + shift);
    }
    public void jam() {

        System.out.println(" Masukan jadwal shift : ");
    }
}
