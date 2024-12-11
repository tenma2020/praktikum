package com.example;

import java.util.Objects;

public class Perpustakaan {
    private static Pegawai pegawai;
    protected static Pelanggan[] listPelanggan = new Pelanggan[20];
    protected static Buku[] listBuku = new Buku[100];
    protected static int totalBuku = 0;

    public static Buku[] getListBuku() {
        return listBuku;
    }

    public static Pelanggan[] getListPelanggan() {
        return listPelanggan;
    }

    public static int getTotalBuku() {return totalBuku;}

    public static void setTotalBuku(int totalBuku) {Perpustakaan.totalBuku = totalBuku;}

    public Perpustakaan(Pegawai pegawai) {Perpustakaan.pegawai = pegawai;}

    public static void pinjam(String namaPelanggan, String judulBuku) {
        for (Buku buku : listBuku) {
            if (Objects.equals(Buku.getJudul(), judulBuku) && buku.getJumlah() != 0) {
                for (Pelanggan pelanggan : listPelanggan) {
                    if (Objects.equals(Pelanggan.getNama(), namaPelanggan)) {
                        pelanggan.tambahBuku(buku);
                    }
                }
            } else if (Objects.equals(Buku.getJudul(), judulBuku)) {
                if (buku.getJumlah() == 0) {
                    System.err.println("Buku sedang dipinjam atau habis");
                }
            }
        }

    }

    public static void tampilkanInfoPerpustakaan() {
        System.out.println("Nama pegawai: " + Pegawai.nama);

        System.out.printf("%s %s %s %s %s\n", "No.", "|", "Title", "|", "Amount");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.printf("%d %s %s %s %s %s %d\n", (i + 1), "|", listBuku[i].getJudul(), "|", listBuku[i].getPenulis(), "|",
                    listBuku[i].getJumlah());
        }

    }

}
