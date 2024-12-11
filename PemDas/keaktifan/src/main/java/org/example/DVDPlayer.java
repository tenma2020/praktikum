package org.example;

import java.util.Scanner;

public class DVDPlayer {
    static int banyakFrame;
    static int panjangKotak;
    static int lebarKotak;
    static int posAwalX;
    static int posAwalY;
    static String[][] kotak;

    public static void printKotak(String[][] kotak) {

        System.out.print("#");
        for (int i = 0; i < kotak[i].length; i++) {
            System.out.print("#");
        }
        System.out.println("#");
        for (int i = 0; i < kotak.length-1; i++) {
            System.out.print("#");
            for (int ii = 0; ii < kotak[i].length-1; ii++) {
                if (kotak[i+2][i+2] == null) {
                    System.out.print(".");
                } else {
                    System.out.println("o");
                }
            }
            System.out.println("#");
        }
        System.out.print("#");
        for (int i = 0; i < kotak[i].length; i++) {
            System.out.print("#");
        }
        System.out.println("#");
    }

    public static void gerakkan(String arah1, String arah2, String[][] kotak, int x, int y) {
        if (arah1.equals("kiri")){
            if (arah2.equals("atas")){
                x -= 1;
                y += 1;
                printKotak(kotak);
            } else if (arah2.equals("bawah")){
                x -= 1;
                y -= 1;
                printKotak(kotak);
            }
        } else if (arah1.equals("kanan")) {
            if (arah2.equals("atas")){
                x+=1;
                y+=1;
                printKotak(kotak);
            } else if (arah2.equals("bawah")){
                x-=1;
                y-=1;
                printKotak(kotak);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String arah1 = in.next();
        String arah2 = in.next();
        in.nextLine();
        banyakFrame = in.nextInt();
        panjangKotak = in.nextInt();
        lebarKotak = in.nextInt();
        kotak = new String[lebarKotak][panjangKotak];
        posAwalX = in.nextInt();
        posAwalY = in.nextInt();

        for (int i = 0; i < banyakFrame-1; i++) {
            gerakkan(arah1, arah2, kotak, posAwalX, posAwalY);

        }


    }
}
