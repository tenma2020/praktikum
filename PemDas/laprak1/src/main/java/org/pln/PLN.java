package org.pln;

import java.util.Scanner;

public class PLN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, district;
        float firstKwh, lastKwh, usageKwh, price, fee, tax;
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.println("Masukkan nama:");
        name = in.nextLine();
        System.out.println("Kelurahan:");
        district = in.nextLine();
        System.out.println("Masukkan posisi awal Kwh Meter:");
        firstKwh = in.nextFloat();
        System.out.println("Masukkan posisi akhir Kwh Meter:");
        lastKwh = in.nextFloat();
        usageKwh = lastKwh - firstKwh;
        System.out.println("Masukkan biaya beban saat ini:");
        fee = in.nextFloat();
        price = fee * usageKwh;
        System.out.println("Masukkan PPJ (dalam persen)");
        tax = in.nextFloat();
        System.out.println();
        System.out.println("==============PLN Java==============");
        System.out.println("Nama: " + name);
        System.out.println("Kelurahan: " + district);
        System.out.printf("%s%.0f%s\n", "Pemakaian bulan ini: ", (lastKwh - firstKwh), " Kwh Meter");
        System.out.printf("%s%.0f%s\n","Tarif Listrik: Rp ", price, ",-");
        System.out.printf("%s%.0f%s%.0f%s\n", "PPJ ",tax,"%: Rp ",(price*(tax/100)),",-");
        System.out.printf("%s%.0f%s\n", "Total Bayar: Rp ",(price + (price*(tax/100))),",-");
        System.out.println("====================================");

    }
}
