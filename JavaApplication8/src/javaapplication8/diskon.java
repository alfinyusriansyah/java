/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author asus
 */
public class diskon {
    public int hitung (kasir k){
        return (k.getHarga()*10/100*k.getJumlah_barang());
        
    }
}