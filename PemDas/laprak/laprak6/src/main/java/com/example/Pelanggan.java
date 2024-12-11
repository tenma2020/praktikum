package com.example;

public class Pelanggan {
    private static String nama;
    private static String nomorPelanggan;
    private static Buku[] listBukuPinjam = new Buku[3];



    public static String getNama() {
        return nama;
    }

    public Pelanggan(String name, String nomorPelanggan){
        Pelanggan.nama = name;
        Pelanggan.nomorPelanggan = nomorPelanggan;
    }

    public void tambahBuku(Buku bukuPinjam){
        for (int i = 0; i < listBukuPinjam.length; i++) {
            if (listBukuPinjam[i] != null){
                listBukuPinjam[i] = bukuPinjam;
            } else {
                System.err.println("Peminjaman mencapai maksimal!");
            }
        }
    }

    public void tampilkanInfoPelanggan(){
        System.out.println("Nama: " + nama);
        System.out.println("Nomor: " + nomorPelanggan);
        System.out.println("Buku yang dipinjam:");
        for (Buku buku : listBukuPinjam) {
            System.out.println(buku.getJudul());
        }
    }
}
