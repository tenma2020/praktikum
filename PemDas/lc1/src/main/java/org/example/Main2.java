package org.example;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        String customerName = scanner.nextLine();
        String customerId = scanner.nextLine();

        String item1Name = scanner.nextLine();
        int item1Price = scanner.nextInt();
        int item1Quantity = scanner.nextInt();
        int item1Discount = scanner.nextInt();

        scanner.nextLine();

        String item2Name = scanner.nextLine();
        int item2Price = scanner.nextInt();
        int item2Quantity = scanner.nextInt();
        int item2Discount = scanner.nextInt();

        double payment = scanner.nextDouble();

        String item1Desc = String.format("%d x %d - %d%%", item1Quantity, item1Price, item1Discount); //ex: 3 x 4000 - 7%
        String item2Desc = String.format("%d x %d - %d%%", item2Quantity, item2Price, item2Discount); //ex: 2 x 8000 - 9%
        double subTotal1 = item1Price * item1Quantity - (item1Price * item1Quantity * (item1Discount/100));
        double subTotal2 = item2Price * item2Quantity - (item2Price * item2Quantity *(item2Discount/100));
        double subTotal = subTotal1 + subTotal2;
        double total = subTotal - (subTotal * 0.05) + (subTotal * 0.10);

        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n",date);
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.println("------------------------------");
        System.out.println(item1Name);
        System.out.printf("%s%17.2f\n",item1Desc,subTotal1);
        System.out.println(item2Name);
        System.out.printf("%s%17.2f\n",item2Desc,subTotal2);
        System.out.println("------------------------------");
        System.out.printf("Subtotal%22.2f\n", subTotal);
        System.out.printf("Total%25.2f\n", total);
        System.out.printf("Bayar%25.2f\n", payment);
        System.out.printf("Kembali%23.2f\n", (payment - total));
    }
}
