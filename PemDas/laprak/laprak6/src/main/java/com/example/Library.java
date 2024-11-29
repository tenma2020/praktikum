package com.example;

public class Library {
    private Employee employee;
    protected static Customer[] customerList = new Customer[20];
    protected static Book[] bookList = new Book[100];

    public static Book[] getBookList() {
        return bookList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public static Customer[] getCustomerList() {
        return customerList;
    }

    public void setBookList(Book[] bookList) {
        Library.bookList = bookList;
    }

    public void setCustomerList(Customer[] customerList) {
        Library.customerList = customerList;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Library(Employee employee) {

    }


    public static void Borrow(String nameCustomer, String bookTitle) {        
        for(int i = 0; i < customerList.length; i++){
            if (nameCustomer == Customer.getName()) {
                for(int j = 0; j < bookList.length; j++){
                    if (bookTitle == Book.getTitle()){
                        if (Customer.borrowedBooks[i] != null && i <= 2) {
                            Customer.borrowedBooks[i].setTitle(bookTitle);                            
                        }else{
                            System.err.println("Jumlah peminjaman telah mencapai maksimal!");
                        }
                    }else{
                        System.err.println("Buku tidak ada dalam koleksi.");
                    }
                }
                Customer.borrowedBooks[i].setTitle(bookTitle);                
            }else{
                continue;
            }            
        }

    }

    public static void showLibraryInfo() {
        System.out.println("Nama pegawai: " + Employee.name);
        
        System.out.printf("%s %s %s %s %s", "No.", "|", "Title", "|", "Amount");
        for(int i = 0; i < bookList.length; i++){
            System.out.printf("%d %s %d %s %d %s %d", (i+1), "|", bookList[i].getTitle(), "|", bookList[i].getAuthor(), "|", bookList[i].getAmount());
        }
        
    }

}
