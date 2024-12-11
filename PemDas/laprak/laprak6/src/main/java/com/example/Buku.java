package com.example;

public class Buku {
    private static String judul;
    private static String penulis;
    private static int jumlah;

    public void setJumlah(int jumlah) {
        Buku.jumlah = jumlah;
    }

    public static void setJudul(String judul) {
        Buku.judul = judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getPenulis() {
        return penulis;
    }

    public static String getJudul() {
        return judul;
    }

    public Buku(String judul, String penulis, int jumlah) {
        Buku.judul = judul;
        Buku.penulis = penulis;
        Buku.jumlah = jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
