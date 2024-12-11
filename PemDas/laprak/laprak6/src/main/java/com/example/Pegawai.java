package com.example;

import java.util.Objects;

public class Pegawai {
    protected static String nama;
    protected static String nomorPegawai;

    public Pegawai(String nama, String nomorPegawai) {
        Pegawai.nama = nama;
        Pegawai.nomorPegawai = nomorPegawai;
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        for (int i = 0; i < Perpustakaan.getListPelanggan().length; i++) {
            if (Perpustakaan.getListPelanggan()[i] != pelanggan)
                Perpustakaan.getListPelanggan()[i] = pelanggan;
        }
    }

    public void tambahBuku(Buku book) {
        for (int i = 0; i < Perpustakaan.getListBuku().length; i++) {
            if (Perpustakaan.getListBuku()[i].getJudul().equals(book.getJudul())) {
                Perpustakaan.getListBuku()[i] = book;
                Perpustakaan.setTotalBuku(+book.getJumlah());
            } else {
                Perpustakaan.setTotalBuku(+book.getJumlah());
            }
        }
    }

    public void tampilkanInfoPegawai() {
        System.out.println("Name: " + nama);
        System.out.println("ID: " + nomorPegawai);
    }
}
