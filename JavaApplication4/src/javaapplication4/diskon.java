
package javaapplication4;

public class diskon {
    int hitung (kasir k){
    int hargaSekarang = k.getHarga();
    int jumlah = k.getJumlahBarang();
        
        return (hargaSekarang*10/100)*jumlah;
    
    }
    
}
