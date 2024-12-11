package org.example.lc2;

import java.util.Scanner;

public class DokiDoki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String folder = "stand";
        String m = "monika";
        String n = "natsuki";
        String s = "sayori";
        String y = "yuri";


        String inputa1 = in.next();
        String inputa2 = in.next();
        in.nextLine();

        String inputb1 = in.next();
        String inputb2 = in.next();
        in.nextLine();


        switch (inputa1) {
            case "cd":
                if (inputa2.equals(folder)) {
<<<<<<< HEAD
                    System.out.println(m);
                    System.out.println(n);
                    System.out.println(s);
                    System.out.println(y);
=======
                    System.out.println(m + ".chr");
                    System.out.println(n + ".chr");
                    System.out.println(s + ".chr");
                    System.out.println(y + ".chr");
>>>>>>> cff29a878e895a7b5caea20fe7b9b17177cf6dae
                    System.out.println("---");

                    switch (inputb1) {
                        case "cd":
                            if (inputb2.endsWith(".chr")) {
                                System.err.println("Error, bukan merupakan folder");
                                System.exit(0);
                            }
                            break;
                        case "cat":
                            if (inputb2.equals(m + ".chr")) {
                                System.out.println(m + "_ready");
                                in.close();
                            } else if (inputb2.equals(n + ".chr")) {
                                System.out.println(n + "_ready");
                                in.close();
                            } else if (inputb2.equals(s + ".chr")) {
                                System.out.println(s + "_ready");
                                in.close();
                            } else if (inputb2.equals(y + ".chr")) {
                                System.out.println(y + "_ready");
                                in.close();
                            } else{
                                System.err.println("Error, file tidak ditemukan");
                            }
                            break;
                        case "rm":
<<<<<<< HEAD
                            if (inputb2.equals(m)) {
                                System.out.println(n);
                                System.out.println(s);
                                System.out.println(y);
                                in.close();
                            } else if (inputb2.equals(n)) {
                                System.out.println(m);
                                System.out.println(s);
                                System.out.println(y);
                                in.close();
                            } else if (inputb2.equals(s)) {
                                System.out.println(m);
                                System.out.println(n);
                                System.out.println(y);
                                in.close();
                            } else if (inputb2.equals(y)) {
                                System.out.println(m);
                                System.out.println(n);
                                System.out.println(s);
=======
                            if (inputb2.equals(m + ".chr")) {
                                System.out.println(n + ".chr");
                                System.out.println(s + ".chr");
                                System.out.println(y + ".chr");
                                in.close();
                            } else if (inputb2.equals(n + ".chr")) {
                                System.out.println(m + ".chr");
                                System.out.println(s + ".chr");
                                System.out.println(y + ".chr");
                                in.close();
                            } else if (inputb2.equals(s + ".chr")) {
                                System.out.println(m + ".chr");
                                System.out.println(n + ".chr");
                                System.out.println(y + ".chr");
                                in.close();
                            } else if (inputb2.equals(y + ".chr")) {
                                System.out.println(m + ".chr");
                                System.out.println(n + ".chr");
                                System.out.println(s + ".chr");
>>>>>>> cff29a878e895a7b5caea20fe7b9b17177cf6dae
                                in.close();
                            } else if (inputb2.equals(folder)) {
                                System.err.println("Error, bukan merupakan file");
                                System.exit(0);
                            } else {
                                System.err.println("Error, file tidak ditemukan");
                                System.exit(0);
                            }
                            break;
                        default:
                            System.err.println("Error, command tidak terdaftar");
                            System.exit(0);
                            break;
                    }
                } else if (inputa2.endsWith(".chr")) {
                    System.err.println("Error, bukan merupakan folder");
                    System.exit(0);
                } else {
                    System.err.println("Error, folder tidak ditemukan");
                    System.exit(0);
                }
                break;
            case "cat", "rm":
                if (inputa2.equals(folder)) {
                    System.err.println("Error, bukan merupakan file");
                    System.exit(0);
                } else {
                    System.err.println("Error, file tidak ditemukan");
                    System.exit(0);
                }
                break;
            default:
                System.err.println("Error, command tidak terdaftar");
                System.exit(0);
                break;
        }
        in.close();
    }
}
