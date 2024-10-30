package com.example;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] dataTrain = {
                { "Jenis", "Harga", "Diskon", "AC", "Colokkan" },
                { "Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada" },
                { "Bisnis", "100000", "5", "Ada", "Tidak Ada" },
                { "Eksekutif", "2000000", "7", "Ada", "Tidak Ada" },
                { "Pariwisata", "3000000", "10", "Ada", "Ada" }
        };
        System.out.println(dataTrain.length);
        while (true) {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.println("Masukkan nilai: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < dataTrain.length; i++) {
                        if (i != 0) {
                            System.out.printf("%s %s%10s %s %s %s%s %s %s %s %s\n", '|', dataTrain[i][0], '|',
                                    dataTrain[i][1], '|', dataTrain[i][2], '%', '|',
                                    dataTrain[i][3], '|', dataTrain[i][4], '|');
                        } else {
                            System.out.printf("%s %s %s %s %s %s %s %s %s %s %s\n", '|', dataTrain[i][0], '|',
                                    dataTrain[i][1], '|', dataTrain[i][2], '|',
                                    dataTrain[i][3], '|', dataTrain[i][4], '|');
                            System.out.println();
                        }

                    }
                    System.out.println();
                    break;
                case 2:

                break;

                default:
                    break;
            }
        }
    }
}
