package com.nestedIf;

import java.util.*;;

public class seleksi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai * 2 < 50) {
            nilai += 10;
        }
        if (nilai <= 20) {
            System.out.println("Filkom");
            if (nilai % 2 == 1) {
                System.out.println("UB");
            } else {
                System.out.println("Brawijaya");
            }
        } else {
            System.out.println("PTIIK");
            if (nilai % 2 == 1) {
                System.out.println("UB");
            } else {
                System.out.println("Brawijaya");
            }
        }
        in.close();
    }
}
