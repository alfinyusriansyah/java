
package javaapplication13;


public class kasir {

   
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


