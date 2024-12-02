package com.example;

public class Main {
    public static void main(String[] args) {
        Employee librarEmployee = new Employee("Aryaya", "1234567890");
        Library lib = new Library(librarEmployee);

        Book book1 = new Book("Intro Java", "Liang", 2);
        Book book2 = new Book("Intro C++", "Stroustrup", 2);

        librarEmployee.addBook(new Book("Intro Python", "Guido", 3));
        librarEmployee.addBook(new Book("Intro Golang", "Google", 3));

        Customer customer1 = new Customer("Wawan", "010");
        Customer customer2 = new Customer("Gugun", "011");
        librarEmployee.addCustomer(customer1);
        librarEmployee.addCustomer(customer2);

        librarEmployee.addCustomer(new Customer("Yayan", "012"));
        librarEmployee.addCustomer(new Customer("Dadan", "013"));

        Library.Borrow("Wawan", "Intro Java");

        Library.showLibraryInfo();
    }
}