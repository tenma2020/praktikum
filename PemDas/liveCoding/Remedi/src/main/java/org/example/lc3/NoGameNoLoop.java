package org.example.lc3;

import java.util.Scanner;

public class NoGameNoLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Game dimulai!");
        int platformSize = in.nextInt();
        int startPosition = in.nextInt();
        int finishPosition = in.nextInt();
        int coinPosition = in.nextInt();
        int position = startPosition;
        boolean coinGet = false;
        String move;
        do {
            for (int i = 0; i < platformSize; i++) {
                if (i != position) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            move = in.next();
            if (move.equals("left")) {
                position--;

            } else if (move.equals("right")) {
                position++;
            } else {

                System.out.println("input error!");
            }
            if (position == coinPosition) {
                coinGet = true;
            }
            if (position == finishPosition) {
                System.out.println("Game finish!");
                if (coinGet) {
                    System.out.println("Koin didapatkan!");
                }
            }
            if (position >= platformSize) {
                position--;
            } else if (position < 0) {
                position++;
            }
        } while (position != finishPosition);
    }
}