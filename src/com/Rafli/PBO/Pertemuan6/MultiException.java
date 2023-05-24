package com.Rafli.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try {
            System.out.println("Masukan Bilangan : ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukan Pembaginya : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil + "(dibulatkan)" );
        }

        //Multiple Excception
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error. Tidak dapat diproses :(");
//        }

        //Multiple Catch
        catch(ArithmeticException e ) {
            System.out.println("Eror tidak bisa diproses!");
        }

        catch (InputMismatchException e ) {
            System.out.println("Masukan angka saja");

        }

        System.out.println("Proses sudah selesai");
    }
}
