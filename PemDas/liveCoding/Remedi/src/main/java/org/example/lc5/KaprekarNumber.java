package org.example.lc5;
import java.util.Scanner;

public class KaperkarNumber {
    static int hitungDigit(int n) {
        int hitung = 0;
        while (n > 0) {
            hitung++;
            n /= 10;
        }
        return hitung;
    }

    static boolean checkKarpekarNumber(int n) {
        if (n == 1)
            return true;

        int totalDigit = hitungDigit(n);

        int div = (int) Math.pow(10, totalDigit);
        int kiri = (int) Math.sqrt(n) / div;
        int kanan = (int) Math.sqrt(n) % div;
        return (kiri + kanan) == n;
    }

    static void printKarpekarNumber(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (checkKarpekarNumber(number)) {
                ++count;
                System.out.printf("%d adalah bilangan Kaperkar ke-%d\n", number, count);
            }else{
                System.out.printf("%d bukan bilangan Kaperkar\n", number);
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers;
        int number = input.nextInt();
        numbers = new int[number];

        for (int i = 0; i < number; i++) {
            numbers[i] = input.nextInt();
        }

        printKarpekarNumber(numbers);



    }
}