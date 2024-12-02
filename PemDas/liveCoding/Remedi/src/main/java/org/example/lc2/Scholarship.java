package org.example.Laprak2;
import java.util.*;

public class Scholarship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a1, b1, c1, d1, e1, totalNilai, p;
        int a2, b2, c2, d2, e2, r, s, totalSKS;
        String q;


        a1 = in.nextFloat();
        a2 = in.nextInt();
        in.nextLine();

        b1 = in.nextFloat();
        b2 = in.nextInt();
        in.nextLine();

        c1 = in.nextFloat();
        c2 = in.nextInt();
        in.nextLine();

        d1 = in.nextFloat();
        d2 = in.nextInt();
        in.nextLine();

        e1 = in.nextFloat();
        e2 = in.nextInt();
        in.nextLine();

        totalNilai = a1 + b1 + c1 + d1 + e1;
        totalSKS = a2 + b2 + c2 + d2 + e2;

        p = totalNilai / totalSKS;
        System.out.println(totalNilai);
        System.out.println(totalSKS);
        System.out.println(p);


        if (p >= 2.5 && p <= 4.0){
            if (totalSKS > 20){
                r = 200000;
            } else{
                r = 250000;
            }
            if (p >= 3.5 && p <= 4.0){
                s = (int) (r - ( r * 0.7));
                q = "Beasiswa Unggulan Plus";
                System.out.printf("IPK anda: %.2f", p);
                System.out.printf("Anda mendapatkan  %s", q);
                System.out.printf("Biaya pendidikan awal: Rp %d", r);
                System.out.printf("Biaya pendidikan akhir: Rp %d", s);
            } else if (p >= 3.0 && p <= 3.49){
                s = (int) (r - (r * 0.5));
                q = "Beasiswa Pendidikan Bersama";
                System.out.printf("IPK anda: %.2f", p);
                System.out.printf("Anda mendapatkan  %s", q);
                System.out.printf("Biaya pendidikan awal: Rp %d", r);
                System.out.printf("Biaya pendidikan akhir: Rp %d", s);
            } else if (p >= 2.5 && p <= 2.99){
                s = (int) (r - (r * 0.3));
                q = "Beasiswa Pelajar Teladan";
                System.out.printf("IPK anda: %.2f", p);
                System.out.printf("Anda mendapatkan  %s", q);
                System.out.printf("Biaya pendidikan awal: Rp %d", r);
                System.out.printf("Biaya pendidikan akhir: Rp %d", s);
            }
        } else if (p < 2.5){
            q = "beasiswa";
            System.out.println("Anda tidak mendapatkan " + q );
        } else if(p > 4 || p < 0){
            System.err.println("IPK Tidak Valid!");
        }



    }
}
