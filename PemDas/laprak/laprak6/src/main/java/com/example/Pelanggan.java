package com.example;

public class Customer {
    private static String name;
    private static String customerNumber;
    private static Book[] borrowedList = new Book[3];

    public void setBorrowedBooks(Book[] borrowedBooks) {
        Customer.borrowedList = borrowedBooks;
    }

    public void setCustomerNumber(String customerNumber) {
        Customer.customerNumber = customerNumber;
    }

    public void setName(String name) {
        Customer.name = name;
    }

    public static Book[] getBorrowedList() {
        return borrowedList;
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
        for(int i = 0; i < borrowedList.length; i++){
            if(borrowedList[borrowedList.length-1] != null){
                borrowedList[i] = borrowBook;
            }
        }
    }

    public void showCustomerInfo(){

    }
}
