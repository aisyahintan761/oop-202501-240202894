package main.java.com.upb.agripos.model;

public class Produk {
    // Atribut private
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk inisialisasi produk
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter untuk kode
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk harga
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter dan Setter untuk stok
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Override toString untuk menampilkan informasi produk
    @Override
    public String toString() {
        return "Produk [Kode=" + kode + ", Nama=" + nama + ", Harga=" + harga + ", Stok=" + stok + "]";
    }
}
