package com.example;

import java.util.Scanner;

public class calculateVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, choice;
        do {
            System.out.println("Menu");
            System.out.println("0. Keluar");
            System.out.println("1. Hitung Volume Balok");
            System.out.println("2. Hitung Volume Bola");
            System.out.println("3. Hitung Volume Kerucut");
            System.out.println("4. Hitung Volume Silinder");
            System.out.println("5. Hitung Volume Limas Segitiga");  
            System.out.println();            
            System.out.print("Masukkan pilihan anda: ");
            choice = in.nextInt();    

            switch (choice) {
                case 0:    
                System.out.println("Thank You!");          
                in.close();                      
                    break;
                //Balok
                case 1:
                System.out.print("Masukkan nilai panjang: ");
                a = in.nextInt();
                System.out.print("Masukkan nilai lebar: ");
                b = in.nextInt();
                System.out.print("Masukkan nilai tinggi: ");
                c = in.nextInt();
                System.out.println("Volume balok adalah " + (a*b*c));      
                System.out.println();
                break;  
                //Bola
                case 2:
                System.out.println("Masukkan nilai jari-jari bola: ");
                a = in.nextInt();
                System.out.println("Volume bola adalah: " + ((4/3) * Math.PI * Math.pow(a, 3)));
                System.out.println();
                break;
                //Kerucut
                case 3:
                System.out.print("Masukkan nilai jari-jari alas: ");
                a = in.nextInt();
                System.out.print("Masukkan nilai tinggi kerucut: ");
                b = in.nextInt();
                System.out.println("Volume kerucut adalah: " + ((1/3) * (Math.PI * Math.pow(a, 2)) * b));
                System.out.println();
                break;
                case 4:
                System.out.print("Masukkan nilai jari-jari alas: ");
                a = in.nextInt();
                System.out.print("Masukkan nilai tinggi kerucut: ");
                b = in.nextInt();
                System.out.println("Volume silinder adalah: " + ((Math.PI * Math.pow(a, 2)) * b));
                System.out.println();
                break;
                case 5:
                System.out.print("Masukkan nilai alas pada alas limas: ");
                a = in.nextInt();
                System.out.print("Masukkan nilai tinggi alas: ");
                b = in.nextInt();
                System.out.print("Masukkan nilai tinggi limas: ");
                c = in.nextInt();
                System.out.println("Volume limas segitiga adalah: " + ((1/3) * (((a*b)/2) * c)));
                System.out.println();
                break;
                default:
                System.err.println("Error input!");
                System.out.println();
                    break;
            }  
            
        } while (choice != 0);
    }
}
