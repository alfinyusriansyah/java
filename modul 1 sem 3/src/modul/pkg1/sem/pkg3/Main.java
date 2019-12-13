/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.sem.pkg3;
import java.util.Scanner;
/**
 *
 * @author asus
 */

  

public class Main {

    public void pilih() {
        Scanner scan = new Scanner(System.in);
        int pilih;
        penjumlahan jml = new penjumlahan();
        pengurangan krg = new pengurangan();
        perkalian kali = new perkalian();
        pembagian bagi = new pembagian();

        System.out.println("MENU");
        System.out.println("1. Penjumlahan Matriks");
        System.out.println("2. Pengurangan Matriks");
        System.out.println("3. Perkalian Matriks");
        System.out.println("4. Pembagian Matriks");
        System.out.println("Pilih = ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                jml.tambah();
                break;
            case 2:
                krg.kurang();
                break;
            case 3:
                kali.kali();
                break;
            case 4:
                bagi.bagi();
                break;
        }
        System.out.println("ulang ?");
        switch (pilih){
            case 1 :
                pilih();
            case 2 : 
                break;
        
        }
    }

   
}




