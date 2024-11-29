package com.example;

public class Customer {
    private static String name;
    private static String customerNumber;
    static Book[] borrowedBooks = new Book[3];

    public void setBorrowedBooks(Book[] borrowedBooks) {
        Customer.borrowedBooks = borrowedBooks;
    }

    public void setCustomerNumber(String customerNumber) {
        Customer.customerNumber = customerNumber;
    }

    public void setName(String name) {
        Customer.name = name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public static String getName() {
        return name;
    }

    public Customer(String name, String customerNumber){
        Customer.name = name;
        Customer.customerNumber = customerNumber;        
    }    

    public void addBorrowedBook(Book borrowBook){
        for(int i = 0; i < borrowedBooks.length; i++){
            if(borrowedBooks[borrowedBooks.length] != null){
                borrowedBooks[i] = borrowBook;
            }
        }
    }

    public void showCustomerInfo(){

    }
}
