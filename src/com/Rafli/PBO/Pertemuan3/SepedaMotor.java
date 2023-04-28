package com.Rafli.PBO.Pertemuan3;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class SepedaMotor {
    //Atribut
    private String  merk;
    private String tipe;
    private int harga;

    //construktor
    public SepedaMotor(){}

    //constraktor baru berparameter
    public SepedaMotor(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    //method getter dan setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    //metod
    public void showInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
