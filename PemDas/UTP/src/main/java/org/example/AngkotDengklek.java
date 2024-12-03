package org.example;

import java.util.Scanner;

public class AngkotDengklek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int s = in.nextInt();
        int tp = in.nextInt();
        String[] jp = new String[tp];
        float rp = 0;
        float mn = 0;
        float br = 0;
        int bs = 20;
        int dw = 0;
        int an = 0;

        if (tp <= 100) {

            for (int j = 0; j < tp; j++) {
                jp[j] = in.nextLine();
                if (jp[j].equals("dewasa")) {
                    rp += 12000;
                    mn += 12000;
                    dw++;
                } else if (jp[j].equals("anak kecil")) {
                    rp += 8000;
                    mn += 8000;
                    an++;
                }
            }

            for (int i = m; i <= s; i++) {
                bs -= 2;
                if (bs == 0 && (i >= 0 && i <= 11)) {
                    mn -= (10000 * 20);
                    br += (10000 * 20);
                    bs = 20;
                } else if (bs == 0 && (i >= 12 && i <= 17)) {
                    mn -= (12000 * 20);
                    br += (12000 * 20);
                    bs = 20;
                } else if (bs == 0 && (i >= 17 && i <= 23)) {
                    mn -= (11000 * 20);
                    br += (11000 * 20);
                    bs = 20;
                }
            }

            System.out.printf("Durasi operasi %14s %d jam\n", ':', (s - m));
            System.out.printf("Jumlah penumpang dewasa %5s %d orang\n", ':', dw);
            System.out.printf("Jumlah penumpang anak kecil %s %d orang\n", ':', an);
            System.out.printf("Total pendapatan %12s Rp%.2f,-\n", ':', rp);
            System.out.printf("Pengeluaran bensin %10s Rp%.2f,-\n", ':', br);
            System.out.printf("Pak Dengklek mengalami kerugian sebesar Rp%.2f,-\n", (rp - mn));
        } else {
            System.err.println("Kapasitas penuh!");
            System.exit(0);
        }


    }
}