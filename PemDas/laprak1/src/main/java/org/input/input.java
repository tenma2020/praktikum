package org.input;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.print("Maka hasil: " + hasil);
        System.out.println();
        System.out.println("Masukkan Nama: ");
        String nama = input.next();
        System.out.println("Masukkan NIM:");
        String nim = input.next();
        System.out.println("Nama anda: " + nama);
        System.out.println("NIM anda: " + nim);

    }
}
