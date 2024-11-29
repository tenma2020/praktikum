package com.example;

public class Book {
    private static String title;
    private String author;
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        Book.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public String getAuthor() {
        return author;
    }

    public static String getTitle() {
        return title;
    }

    public Book(String title, String author, int amount){
        Book.title = title;
        this.author = author;
        this.amount = amount;
    }

    public void showBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
