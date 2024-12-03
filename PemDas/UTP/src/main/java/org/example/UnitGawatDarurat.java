package org.example;

import java.util.Scanner;

public class UnitGawatDarurat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = input.next();
        int age1 = input.nextInt();
        int sat1 = input.nextInt();
        input.nextLine();

        String name2 = input.next();
        int age2 = input.nextInt();
        int sat2 = input.nextInt();
        input.nextLine();

        String name3 = input.next();
        int age3 = input.nextInt();
        int sat3 = input.nextInt();
        input.nextLine();

        String[] priority = new String[3];

        if (sat1 < sat2 && sat1 < sat3) {
            priority[0] = name1;
            if (sat2 < sat3) {
                priority[1] = name2;
                priority[2] = name3;
            } else if (sat2 == sat3) {
                if (age2 > age3) {
                    priority[1] = name2;
                    priority[2] = name3;
                } else {
                    priority[1] = name3;
                    priority[2] = name2;
                }
            } else {
                priority[1] = name3;
                priority[2] = name2;
            }
        } else if (sat2 < sat1 && sat2 < sat3) {
            priority[0] = name2;
            if (sat1 < sat3) {
                priority[1] = name1;
                priority[2] = name3;
            } else if (sat1 == sat3) {
                if (age1 > age3) {
                    priority[1] = name1;
                    priority[2] = name3;
                } else {
                    priority[1] = name3;
                    priority[2] = name1;
                }
            } else {
                priority[1] = name1;
                priority[2] = name2;
            }
        } else if (sat3 < sat1 && sat3 < sat2) {
            priority[0] = name3;
            if (sat1 < sat2) {
                priority[1] = name1;
                priority[2] = name2;
            } else if (sat1 == sat2) {
                if (age1 > age2) {
                    priority[1] = name1;
                    priority[2] = name2;
                } else {
                    priority[1] = name2;
                    priority[2] = name1;
                }
            } else {
                priority[1] = name2;
                priority[2] = name1;
            }
        }

        for (int i = 0; i < priority.length; i++) {
            System.out.printf("Prioritas %d: %s\n", i + 1, priority[i]);
        }
    }
}
