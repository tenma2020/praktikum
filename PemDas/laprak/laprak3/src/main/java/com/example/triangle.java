package com.example;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
