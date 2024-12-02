package org.example.lc2;

import java.util.Scanner;

public class DokiDoki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String folder = "stand";
        String monika = "monika.chr";
        String natsuki = "natsuki.chr";
        String sayori = "sayori.chr";
        String yuri = "yuri.chr";


        String inputa1 = in.next();
        String inputa2 = in.next();
        in.nextLine();

        String inputb1 = in.next();
        String inputb2 = in.next();
        in.nextLine();


        switch (inputa1) {
            case "cd":
                if (inputa2.equals(folder)) {
                    System.out.println(monika);
                    System.out.println(natsuki);
                    System.out.println(sayori);
                    System.out.println(yuri);
                    System.out.println("---");

                    switch (inputb1) {
                        case "cd":
                            if (inputb2.endsWith(".chr")) {
                                System.err.println("Error, bukan merupakan folder");
                                in.close();
                            }
                        case "cat":

                                if (inputb2.equals(monika)) {
                                    System.out.println(monika.substring(0, monika.length() - 4) + "_ready");
                                    in.close();
                                } else if (inputb2.equals(natsuki)) {
                                    System.out.println(natsuki.substring(0, natsuki.length() - 4) + "_ready");
                                    in.close();
                                } else if (inputb2.equals(sayori)) {
                                    System.out.println(sayori.substring(0, sayori.length() - 4) + "_ready");
                                    in.close();
                                } else if (inputb2.equals(yuri)) {
                                    System.out.println(yuri.substring(0, yuri.length() - 4) + "_ready");
                                    in.close();
                                }
                        case "rm":
                                if (inputb2.equals(monika)) {
                                    System.out.println(natsuki);
                                    System.out.println(sayori);
                                    System.out.println(yuri);
                                    in.close();
                                } else if (inputb2.equals(natsuki)) {
                                    System.out.println(monika);
                                    System.out.println(sayori);
                                    System.out.println(yuri);
                                    in.close();
                                } else if (inputb2.equals(sayori)) {
                                    System.out.println(monika);
                                    System.out.println(natsuki);
                                    System.out.println(yuri);
                                    in.close();
                                } else if (inputb2.equals(yuri)) {
                                    System.out.println(monika);
                                    System.out.println(natsuki);
                                    System.out.println(sayori);
                                    in.close();
                                } else if (inputb2.equals(folder)) {
                                System.err.println("Error, bukan merupakan file");
                                in.close();
                            } else {
                                System.err.println("Error, file tidak ditemukan");
                                in.close();
                            }
                        default:
                            System.err.println("Error, command tidak terdaftar");
                    }
                } else if (inputa2.endsWith(".chr")) {
                    System.err.println("Error, bukan merupakan folder");
                    in.close();
                } else {
                    System.err.println("Error, folder tidak ditemukan");
                    in.close();
                }
            case "cat":
                if (inputa2.equals(folder)) {
                    System.err.println("Error, bukan merupakan file");
                    in.close();
                } else {
                    System.err.println("Error, file tidak ditemukan");
                    in.close();
                }
            case "rm":
                if (inputa2.equals(folder)) {
                    System.err.println("Error, bukan merupakan file");
                    in.close();
                } else {
                    System.err.println("Error, file tidak ditemukan");
                    in.close();
                }
            default:
                System.err.println("Error, command tidak terdaftar");
        }
    }
}
