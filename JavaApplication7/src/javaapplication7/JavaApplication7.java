/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner ;

public class JavaApplication7 {
    private int harga ;
    private int jumlah_barang ;

    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * @return the jumlah_barang
     */
    public int getJumlah_barang() {
        return jumlah_barang;
    }

    /**
     * @param jumlah_barang the jumlah_barang to set
     */
    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }
    public void total (){
        diskon d = new diskon ();
        int HargaTotal = jumlah_barang*harga - d.hitung(this);
        System.out.println("harga total"+jumlah_barang+" = "+HargaTotal);
    }
    
}
