package com.example;
import java.util.Scanner;

public class ConstAss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "filkom";
        String val = (s =="filkom")?"Brawijaya": "null";
        System.out.println("Masukkan nama anda: ");
        String n1 = in.nextLine();
        System.out.println("Masukkan nim anda: ");
        String n2 = in.nextLine();
        if(n1 == "Jabbar"){
            if (n2 == "235150207111056"){
                System.out.println(n1);
                System.out.println(n2);
                in.close();
            } else {
                System.out.println("input nim salah!");
                in.close();
            }
        } else {
            System.out.println("input nama salah!");
        }
        System.out.println(s + " " + val);




    }
}