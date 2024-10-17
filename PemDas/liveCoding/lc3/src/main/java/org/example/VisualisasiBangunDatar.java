package org.example;

import java.util.Scanner;

public class VisualisasiBangunDatar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String shape = in.next();
        if (shape.equalsIgnoreCase("segitiga")){
            for (int i = 0; i <= size; i++) {

                for (int j = 0; j <= size; j++) {
                    System.out.print("");
                }
            }
        } else if (shape.equalsIgnoreCase("persegi")) {

        } else if (shape.equalsIgnoreCase("jajarGenjang")) {

        }
    }
}
