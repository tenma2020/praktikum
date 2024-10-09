package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, c1, r1, c2, r2, sK;
        n = in.nextDouble();
        c1 = ((5*(n-32))/9)+5;
        c2 = c1 + 8;
        r1 = (4*c1)/5;
        r2 = (4*c2)/5;
        sK = ((c1 + 375.15)-5) - (c2 + 375.15);
        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celsius : %-1.2f C\n",c1);
        System.out.printf("Satuan Reamur  : %-1.2f R\n",r1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius : %-1.2f C\n",c2);
        System.out.printf("Satuan Reamur  : %-1.2f R\n",r2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu   : %-1.2f K\n", sK);
        System.out.println("==============================");
    }
}
