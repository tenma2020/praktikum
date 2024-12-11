package com.example;

public class Library {
    private static Pegawai employee;
    protected static Pelanggan[] customerList = new Pelanggan[20];
    protected static Book[] bookList = new Book[100];

    public static Book[] getBookList() {
        return bookList;
    }

    public static Pegawai getEmployee() {
        return employee;
    }

    public static Pelanggan[] getCustomerList() {
        return customerList;
    }

    public void setBookList(Book[] bookList) {
        Library.bookList = bookList;
    }

    public void setCustomerList(Pelanggan[] customerList) {
        Library.customerList = customerList;
    }

    public void setEmployee(Pegawai employee) {
        Library.employee = employee;
    }

    public Library(Pegawai employee) {

    }

    public static void Borrow(String nameCustomer, String bookTitle) {
        for (int i = 0; i < customerList.length; i++) {
            if (nameCustomer.equalsIgnoreCase(Pelanggan.getNama())) {
                for (int j = 0; j < bookList.length; j++) {
                    if (bookTitle.equalsIgnoreCase(Book.getTitle())) {
                        if (Pelanggan.getListBukuPinjam()[i] != null && i < 3) {
                            Pelanggan.getListBukuPinjam()[i].setTitle(bookTitle);
                        } else {
                            System.err.println("Jumlah peminjaman telah mencapai maksimal!");
                        }
                    }
                }
                Pelanggan.getListBukuPinjam()[i].setTitle(bookTitle);
            }
        }

    }

    public static void showLibraryInfo() {
        System.out.println("Nama pegawai: " + Pegawai.nama);

        System.out.printf("%s %s %s %s %s", "No.", "|", "Title", "|", "Amount");
        for (int i = 0; i < bookList.length; i++) {
            System.out.printf("%d %s %d %s %d %s %d", (i + 1), "|", Book.getTitle(), "|", bookList[i].getAuthor(), "|",
                    bookList[i].getAmount());
        }

    }

}
