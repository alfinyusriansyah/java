/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penambahan;



import java.util.Scanner;

public class Main {

    public void pilih() {
        Scanner scan = new Scanner(System.in);
        int pilih;
        penambahan jml = new penambahan();
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
                jml.rumustambah();
                break;
            case 2:
                krg.rumuskurang();
                break;
            case 3:
                kali.rumuskali();
                break;
            case 4:
                bagi.rumusbagi();
                break;
        }
    }

    public static void main(String[] args) {
        Main in = new Main();
        in.pilih();
    }

}

