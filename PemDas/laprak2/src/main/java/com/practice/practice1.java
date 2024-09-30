package com.practice;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String shape;
        int a, b, r, choice;
        System.out.println("Menu");
        System.out.printf("%s\n", "1. menghitung luas dan keliling persegi panjang");
        System.out.printf("%s\n", "2. menghitung luas dan keliling lingkaran");
        System.out.printf("%s\n", "3. menghitung luas dan keliling segitiga");

        System.out.println("Pilihan anda: ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                shape = "persegi panjang";
                System.out.println("Masukkan a");
                a = in.nextInt();
                System.out.println("Masukkan b");
                b = in.nextInt();
                System.out.println();
                System.out.printf("Keliling %s %s %d cm\n", shape, ":", ((a + b)*2));
                System.out.printf("Luas %s %s %d cm\n", shape, ":", a*b);
                break;
                case 2:
                shape = "lingkaran";
                    System.out.println("Masukkan r");
                r = in.nextInt();
                System.out.println();
                System.out.printf("Keliling %s %s %fcm\n", shape, ":", (Math.PI*(r*2)));
                System.out.printf("Luas %s %s %fcm\n", shape, ":", (Math.PI*(r*r)));
                break;
                case 3:
                shape = "segitiga";
                System.out.println("Masukkan a");
                a = in.nextInt();
                System.out.println("Masukkan b");
                b = in.nextInt();
                System.out.println("Masukkan r");
                r = in.nextInt();

                System.out.println();
                System.out.printf("Keliling %s %s %dcm\n", shape, ":", a+b+r);
                System.out.printf("Keliling %s %s %dcm\n", shape, ":", a*r);
                break;
            default:
                System.out.println("Masukkan tidak ditemukan");

        }
    }
}
