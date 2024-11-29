package com.example;

public class Employee {
    protected static String name;
    protected static String id;
    int currentIndex = 0;

    public void setId(String id) {
        Employee.id = id;
    }

    public void setName(String name) {
        Employee.name = name;
    }

    public static String getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public Employee(String name, String id){
        Employee.name = name;
        Employee.id = id;
    }

    public void addCustomer(Customer customer){
        for(int i = 0; i < Library.getCustomerList().length; i++){
            if(Library.customerList[i] == customer){
                continue;
            }else{
                Library.customerList[i] = customer;
            }
        }
    }

    public void addBook(Book book){
        for(int i = 0; i < Library.getBookList().length; i++){
            if (Library.bookList[i] == book) {
                Library.bookList[i].setAmount(+1);                
            }else{
                Library.bookList[i] = book;
            }
        }
    }

    public void showEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
