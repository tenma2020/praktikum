package org.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan operator pertama: ");
        double firstValue = in.nextDouble();
        System.out.println("Masukkan operator kedua: ");
        double secondValue = in.nextInt();
        System.out.println();
        System.out.printf("%s%.0f\n","Hasil Penjumlahan: ", (firstValue + secondValue));
        System.out.printf("%s%.0f\n","Hasil Pengurangan: ", (firstValue - secondValue));
        System.out.printf("%s%.0f\n","Hasil Perkalian: ", (firstValue * secondValue));
        System.out.printf("%s%.1f\n","Hasil Pembagian: ", (firstValue / secondValue));
    }
}
