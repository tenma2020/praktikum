package com.example;

public class Scenario {
    public static void main(String[] args) {        
        Employee admin1 = new Employee("Cecilia", "23021201");

        admin1.addCustomer(new Customer("Hayasaka", "99001110009"));
        admin1.addCustomer(new Customer("Miyuki", "99001110008"));
        admin1.addCustomer(new Customer("Kei", "9900111100077"));

        admin1.addBook(new Book("Heavens", "Tiancan", 3));
        admin1.addBook(new Book("Kaguya-sama", "Akasaka", 3));
        admin1.addBook(new Book("Solo Leveling", "Chugone", 1));

        Library.Borrow("Hayasaka", "Overlord");
        Library.Borrow("Miyuki", "Solo Leveling");
        Library.Borrow("Kei", "Solo Leveling");
        Library.Borrow("Hayasaka", "Kaguya-sama");

        admin1.addBook(new Book("", null, 0));



       
    }
}
