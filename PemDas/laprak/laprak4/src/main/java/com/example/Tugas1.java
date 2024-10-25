package com.example;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int[] temp = new int[10];               
        while (true) {
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            int choice = in.nextInt();
            System.out.println();

            switch (choice) {
                case 1:                   
                    for(int i = 1; i < temp.length; i++){
                        System.out.println("Masukkan nilai ke-" + i);
                        int val = in.nextInt();
                        temp[i] = val;                        
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("[");
                    for(int i = 0; i < temp.length; i++){
                        if(i != (temp.length - 1)){
                            System.out.print(temp[i] + ", ");
                        } else{
                            System.out.print(temp[i]);
                        }
                    }
                    System.out.println("]");
                    System.out.println();
                    break;
                case 3:
                float avg = 0;                
                    for(int i = 0; i < temp.length; i++){
                        avg += temp[i];
                    }
                    System.out.println(avg/temp.length);
                    System.out.println();
                    break;
                case 4:
                    int sum = 0;
                    for(int i = 0; i < temp.length; i++){
                        sum += temp[i];
                    }
                    System.out.println(sum);
                    System.out.println();
                    break;
                case 5:
                    int max = temp[0];
                    for(int i = 1; i < temp.length; i++){
                        if(temp[i] > max){
                            max = temp[i];
                        }
                    }
                    System.out.println(max);
                    System.out.println();
                    break;
                case 6:
                    int min = temp[0];
                    for(int i = 1; i < temp.length; i++){
                        if(temp[i] < min){
                            max = temp[i];
                        }
                    }
                    System.out.println(min);
                    System.out.println();
                    break;
                case 7:
                System.out.println("Thank You!");     
                               
                    break;
                default:
                System.err.println("Input Error! Try Again.");
                System.out.println();
                    break;
            }            
        }
    }
}
