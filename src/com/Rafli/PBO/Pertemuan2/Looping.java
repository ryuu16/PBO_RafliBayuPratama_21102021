package com.Rafli.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {

        //looping do
        for (int i=0; i<10; i++) {
            System.out.println("Looping... ("+i+")");
        }
        System.out.println("Looping for selesai!");

        //loopping while
        int j=1;
        while(j<=100) {
            System.out.println("Looping while... ("+j+")");
            j+=10;
        }
        System.out.println("Looping while selesai!");

        //looping do while
        int k=10;
        do {
            System.out.println("Loopping do while... ("+k+")");
            k --;
        }
        while (k>0);
        System.out.println("Looping do while selesai!");
    }
}
