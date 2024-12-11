package com.example;

public class Employee {
    protected static String name;
    protected static String id;

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
            if(Library.getCustomerList()[i] == customer){
                continue;
            }else{
                Library.getCustomerList()[i] = customer;
            }
        }
    }

    public void addBook(Book book){
        for(int i = 0; i < Library.getBookList().length; i++){
            if (Library.getBookList()[i] == book) {
                Library.getBookList()[i].setAmount(+book.getAmount());                
            }else{
                Library.getBookList()[i] = book;
            }
        }
    }

    public void showEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
