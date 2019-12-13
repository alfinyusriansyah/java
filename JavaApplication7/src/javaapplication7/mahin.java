/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;



public class mahin extends diskon {
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
   kasir k = new kasir();
   diskon d = new diskon();
   
   System.out.println("input:");
   k.setHarga(in.nextInt());
   System.out.println("jumlah:");
   k.setjumlah_barang(in.nextInt());
   System.out.println("Diskon :"+d.hitung(k));
   k.total();
    }
    
}
