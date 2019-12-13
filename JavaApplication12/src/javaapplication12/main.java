
package javaapplication12;



    import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       kasir k = new kasir();
       diskon d = new diskon();
       
       System.out.print("Input :");
       k.setHarga(in.nextInt());
       System.out.print("Jumlah : ");
       k.setJumlah_barang(in.nextInt());
        int hargaSekarang = k.getHarga();
        int jumlah = k.getJumlah_barang();
       System.out.println("Diskon : "+(hargaSekarang * 10 / 100) * jumlah);
       k.total();
       
    }
}

