package com.Rafli.PBO.Pertemuan4.Tugas2;

public class BukuFiksi extends Buku {
    protected String genre;

    public BukuFiksi(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
