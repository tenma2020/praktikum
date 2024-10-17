package org.example;

import java.util.Scanner;

public class tooManyLosingEgg {
    static int kualitasTelur;
    static int jumlahTelur;
    static int jumlahTelurBerkualitas = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        jumlahTelur = in.nextInt();
        for (int i = 0; i < jumlahTelur; i++) {
            kualitasTelur = in.nextInt();
            if(kualitasTelur >= 6){
                jumlahTelurBerkualitas++;
            }

        }
        System.out.println(jumlahTelurBerkualitas);
    }
}