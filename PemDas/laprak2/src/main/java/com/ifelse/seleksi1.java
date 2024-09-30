package com.ifelse;
import java.util.*;

public class seleksi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = in.nextInt();
        if(nilai>60)
        System.out.println("Anda Lulus");
        else if(nilai >= 60)
        System.out.println("Anda lulus");
        else{
            System.out.println("Anda gagal");
        }
        in.close();
    }
    
}
