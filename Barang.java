/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.util.ArrayList;
//isinya barang, kategori, makanan;


class Makanan extends Produk{
    private int id;
    private int daya_tahan;
    private int stok;


    public Makanan(String nama_produk, double harga, int jumlah) {
        super(nama_produk, harga, jumlah);
    }

    public Makanan(int id, int daya_tahan, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.id = id;
        this.daya_tahan = daya_tahan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(int daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
    public boolean isSpoiled(){
        return true;
    }
}

class Kategori{
    private String nama_kategori;
    


    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    public String getProduk(){
        return null;
    }
}

public class Barang extends Produk {
    private String barcode;
    private String expired;
    private ArrayList <Kategori> kategori;
    private int stok;

    

    public Barang(String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
    }

    public Barang(String barcode, String expired, ArrayList<Kategori> kategori, String nama_produk, double harga, int jumlah, double diskon) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.kategori = kategori;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public ArrayList<Kategori> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<Kategori> kategori) {
        this.kategori = kategori;
    }
    public boolean isExpired(){
        return true;
    }
    public String addKategori(){
        return null;
    }
}
