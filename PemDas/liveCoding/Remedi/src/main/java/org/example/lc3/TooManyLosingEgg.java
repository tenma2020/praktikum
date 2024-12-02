package org.example.lc3;

import java.util.Scanner;

public class TooManyLosingEgg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kualitasTelur;
        int jumlahTelur = in.nextInt();
        int jumlahTelurBerkualitas = 0;

        for (int i = 0; i < jumlahTelur; i++) {
            kualitasTelur = in.nextInt();
            if (kualitasTelur > 5 && kualitasTelur < 11) {
                jumlahTelurBerkualitas++;
            }
        }
        System.out.println(jumlahTelurBerkualitas);
    }
}
