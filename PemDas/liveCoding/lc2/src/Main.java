import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a1, b1, c1, d1, e1, gpa, totalNilai;
        int a2, b2, c2, d2, e2, sksFee, totalSKS, r, s;
        String q;

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();

        String[] inputs1 = input1.split(" ");
        a1 = Float.parseFloat(inputs1[0]);
        a2 = Integer.parseInt(inputs1[1]);
        String[] inputs2 = input2.split(" ");
        b1 = Float.parseFloat(inputs2[0]);
        b2 = Integer.parseInt(inputs2[1]);
        String[] inputs3 = input3.split(" ");
        c1 = Float.parseFloat(inputs3[0]);
        c2 = Integer.parseInt(inputs3[1]);
        String[] inputs4 = input4.split(" ");
        d1 = Float.parseFloat(inputs4[0]);
        d2 = Integer.parseInt(inputs4[1]);
        String[] inputs5 = input5.split(" ");
        e1 = Float.parseFloat(inputs5[0]);
        e2 = Integer.parseInt(inputs5[1]);

        totalNilai = a1 * a2 + b1 *b2 + c1 *c2 + d1 *d2 + e1 *e2;
        totalSKS = a2 + b2 + c2 + d2 + e2;
        gpa = (totalNilai/totalSKS);
        if(gpa > 4.0){
            System.out.println("IPK Tidak Valid!");
        }
        else if(gpa > 3.5 && gpa <= 4.0){
            q = "mendapatkan Beasiswa Unggulan Plus";
            if (totalSKS > 20){
                sksFee = 200000;
                r = sksFee * totalSKS;
                s = r - (r * 70/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            } else if (totalSKS <= 20){
                sksFee = 250000;
                r = sksFee * totalSKS;
                s = r - (r * 70/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            }
        } else if (3.0 <= gpa && gpa <= 3.49) {
            q = "mendapatkan Beasiswa Pendidikan Bersama";
            if (totalSKS > 20){
                sksFee = 200000;
                r = sksFee * totalSKS;
                s = r - (r * 50/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            } else if (totalSKS <= 20){
                sksFee = 250000;
                r = sksFee * totalSKS;
                s = r - (r * 50/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            }

        } else if (2.5 <= gpa && gpa <= 2.99) {
            q = "mendapatkan Beasiswa Pelajar Teladan";
            if (totalSKS > 20){
                sksFee = 200000;
                r = sksFee * totalSKS;
                s = r - (r * 30/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            } else if (totalSKS <= 20){
                sksFee = 250000;
                r = sksFee * totalSKS;
                s = r - (r * 30/100);
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            }
        } else {
            q = "tidak mendapatkan beasiswa";
            if (totalSKS > 20){
                sksFee = 200000;
                r = sksFee * totalSKS;
                s = r;
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            } else if (totalSKS <= 20){
                sksFee = 250000;
                r = sksFee * totalSKS;
                s = r;
                System.out.printf("IPK Anda: %.2f\n", gpa);
                System.out.printf("Anda %s\n", q);
                System.out.printf("Biaya pendidikan awal: %d\n", r);
                System.out.printf("Biaya pendidikan akhir: %d\n", s);
            }

        }
    }
}