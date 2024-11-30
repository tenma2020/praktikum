package com.example;

public class Scenario {
    public static void main(String[] args) {        
        Employee admin1 = new Employee("Cecilia", "23021201"); //admin

        admin1.addCustomer(new Customer("Hayasaka", "99001110009")); // no.1
        admin1.addCustomer(new Customer("Miyuki", "99001110008")); // no.2
        admin1.addCustomer(new Customer("Kei", "9900111100077")); // no.3

        admin1.addBook(new Book("Heavens", "Tiancan", 3)); //no.4
        admin1.addBook(new Book("Kaguya-sama", "Akasaka", 3)); //no.5
        admin1.addBook(new Book("Solo Leveling", "Chugong", 1)); //no.6

        Library.Borrow("Hayasaka", "Overlord"); //no.7        
        Library.Borrow("Miyuki", "Solo Leveling"); //no.8
        Library.Borrow("Kei", "Solo Leveling"); //no.9
        Library.Borrow("Hayasaka", "Kaguya-sama"); //no.10

        admin1.addBook(new Book("Overlord", "Maruyama", 0)); //no.11

        Library.showLibraryInfo();



       
    }
}
