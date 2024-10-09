package org.example;

public class Output4 {
    public static void main(String[] args) {
        double x = 7654.123456789;
        System.out.printf("%d   %3d %8d\n", 1234, -567, 8910);
        System.out.printf("%d   %3d %+8d\n", 1234, -567, 8910);
        System.out.printf("%.2f %15.2f %15.2f\n ", x, x, x);
        System.out.printf("%g %15e %15.3f\n",x,x,x);
    }
}
