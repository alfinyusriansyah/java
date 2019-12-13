
package javaapplication13;

 import java.util.Scanner;
public class drive {

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


   
    

