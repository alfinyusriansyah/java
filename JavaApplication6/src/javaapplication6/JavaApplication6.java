package javaapplication6;

import java.util.Scanner;

class kasir {
    int harga;
    int jumlah_barang;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }
    public void total() {
    diskon d = new diskon();
    int HargaTotal = jumlah_barang*harga - d.hitung(this);
    System.out.println("harga total"+jumlah_barang+" = "+HargaTotal);
}
}
class diskon{
    public int hitung (kasir k){
        return (k.getHarga()*10/100*k.getJumlah_barang());
        
    }
}

public class JavaApplication6 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       kasir k = new kasir();
       diskon d = new diskon();
       
       System.out.print("Input :");
       k.setHarga(in.nextInt());
       System.out.print("Jumlah : ");
       k.setJumlah_barang(in.nextInt());
       System.out.println("Diskon : "+d.hitung(k));
       k.total();
       
    }
}
