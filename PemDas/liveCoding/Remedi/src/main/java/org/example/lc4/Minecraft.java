package org.example.lc4;

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

        while (!namaBlock.equals("stop")) {
            for (int i = 0; i < panjangX; i++) {
                for (int ii = 0; ii < panjangY; ii++) {
                    for (int iii = 0; iii < panjangZ; iii++) {
                        namaBlock = in.next();
                        x = in.nextInt();
                        y = in.nextInt();
                        z = in.nextInt();
                        in.nextLine();
                        for (String s : block) {
                            if (namaBlock.equals(s)) {
                                matrix3d[x][y][z] = namaBlock;
                            } else if (namaBlock.equals("stop")) {
                                for (int iv = 0; iv < panjangX; iv++) {
                                    for (int v = 0; v < panjangY; v++) {
                                        for (int vi = 0; vi < panjangZ; vi++) {
                                            if (!matrix3d[iv][v][iv].isBlank()) {
                                                System.out.printf("Block: %d %d %d is %s", iv, v, vi, matrix3d[iv][v][iv]);
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.err.println("input error");
                            }
                        }

                    }
                }
            }
        }
    }
}
