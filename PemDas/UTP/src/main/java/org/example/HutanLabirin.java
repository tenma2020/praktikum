package org.example;

import java.util.Scanner;

public class HutanLabirin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = 0;
        int x = in.nextInt();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            if(x % 2 != 0){
                x *= 10;
            }else{
                x/= 2;
            }
            l++;
            if(x > 1000 && l < n){
                System.out.printf("Berhasil keluar setelah langkah ke-%d", l);
            } else if(l == n){
                System.out.printf("Terjebak setelah %d langkah", n);
            }
        }
    }
}
