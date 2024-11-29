package org.example;

import java.util.Scanner;

public class KaprekarNumber {
    static int[] numbers;

    static int hitungDigit(int n) {
        int pow = (int) Math.pow(n, 2);
        String numStr = String.valueOf(pow);
        return numStr.length();
    }

    static boolean checkKarpekarNumber(int n) {
        int pow = (int) Math.pow(n, 2);
        String numStr = String.valueOf(pow);
        if(hitungDigit(n) > 1){
            String s1 = numStr.substring(0, numStr.length()  - hitungDigit(n));
            String s2 = numStr.substring(numStr.length() - hitungDigit(n));

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);
            return (num1 + num2) == pow;
        } else {
            return n == pow;
        }
    }

    static void printKarpekarNumber(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("Program Error");
                System.exit(0);
            }
        }
        for (int number : numbers) {
            if (checkKarpekarNumber(number)) {
                System.out.printf("%d adalah bilangan Kaperkar\n", number);
            } else {
                System.out.printf("%d bukan bilangan Kaperkar\n", number);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int input;
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            hitungDigit(input = in.nextInt());
            numbers[i] = input;
        }
        printKarpekarNumber(numbers);


    }
}
