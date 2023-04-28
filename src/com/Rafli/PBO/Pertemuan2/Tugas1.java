package com.Rafli.PBO.Pertemuan2;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user_21 = "rafli";
        String pass_21 = "2021";

        System.out.println("Masukan Username : ");
        String user = input.nextLine();
        System.out.println("Masukan Password : ");
        String pass = input.nextLine();

        if (user.equalsIgnoreCase(user_21) && pass.equalsIgnoreCase(pass_21)) {
            System.out.println("Login berhasil silahkan masuk");
        } else if (user != (user_21) && pass.equalsIgnoreCase(pass_21)) {
            System.out.println("Username anda salah");
        } else if (user.equalsIgnoreCase(user_21) && pass != (pass_21)) {
            System.out.println("Password anda salah");
        } else {
            System.out.println("Silahkan login dengan username dan password yang sah!");
        }
    }
}
