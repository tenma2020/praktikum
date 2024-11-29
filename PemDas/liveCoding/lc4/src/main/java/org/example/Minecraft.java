package org.example;

import java.util.Scanner;

public class Minecraft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] block = {"air", "dirt", "grass", "wood", "stone"};
        int x, y, z;
        String namaBlock = "0";
        int panjangX = in.nextInt();
        int panjangY = in.nextInt();
        int panjangZ = in.nextInt();
        in.nextLine();
        String[][][] matrix3d = new String[panjangX][panjangY][panjangZ];
        while (namaBlock.equals("stop")) {
            for(int i = 0; i < panjangX; i++) {
                for(int j = 0; j < panjangY; j++) {
                    for(int k = 0; k < panjangZ; k++) {
                        namaBlock = in.next();
                        x = in.nextInt();
                        y = in.nextInt();
                        z = in.nextInt();
                        in.nextLine();
                        if(namaBlock.equals(block)) {
                            matrix3d[i][j][k] = namaBlock;
                        } else if (namaBlock.equals("stop")) {

                        } else {

                        }
                        {}
                }
            }
        }
        }
        }
    }
