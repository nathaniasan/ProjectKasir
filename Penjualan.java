/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.util.ArrayList;

/**
 *
 * @author WANGSA
 */
class Produk{
    private String nama_produk;
    private double harga;
    private int jumlah;
    private double diskon;

    Produk( String nama_produk){
        this.nama_produk = nama_produk;
    }
    public Produk(String nama_produk, double harga, int jumlah, double diskon) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public Produk(String nama_produk2, double harga2, int jumlah2) {
    }
    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
    
    private double hargaDiskon(){
        return 0;
    }
}


public class Penjualan  implements ProductCounter{ 
    private ArrayList<Produk> listProduk;
    private int jumlahProduk;
    private int stok;

    public Penjualan(int stok) {
        this.stok = stok;
    }

    public Penjualan (ArrayList<Produk> listProduk, int jumlahProduk, int stok) {
        this.listProduk = listProduk;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }

    public ArrayList<Produk> getListProduk() {
        return listProduk;
    }

    public void setListProduk(ArrayList<Produk> listProduk) {
        this.listProduk = listProduk;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int jumlahProduk) {
        this.jumlahProduk = jumlahProduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int hitungJumlahProduk() {
        return this.getJumlahProduk();
    }

    @Override
    public int hitungHargaProduk() {
        return (int) 0.0;
    }
    
    
}
