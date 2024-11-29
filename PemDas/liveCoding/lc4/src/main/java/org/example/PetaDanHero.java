package org.example;

import java.util.Scanner;

public class PetaDanHero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        in.nextLine();
        int amountHero = in.nextInt();
        in.nextLine();
        if(row < 0 || column < 0){
            System.out.println("Input tidak sesuai!");
        }
        String[][] matrix = new String[row][column];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = ".";
            }
        }
        for(int i = 0; i < amountHero; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            String hero = in.next();
            in.nextLine();
            matrix[a][b] = hero;
        }

        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }

    }
}
