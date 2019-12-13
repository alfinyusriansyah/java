/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

import java.util.Scanner;

/**
 *
 * @author asus
 */import java.util.Scanner;
public class Matriks {

public class penjumlahan {

    public void rumustambah() {
        int jmlbaris, jmlkolom;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris matriks = ");
        jmlbaris = scan.nextInt();
        System.out.println("Masukkan jumlah kolom matriks = ");
        jmlkolom = scan.nextInt();
        int mA[][] = new int[jmlbaris][jmlkolom];
        int mB[][] = new int[jmlbaris][jmlkolom];
        int hasil[][] = new int[jmlbaris][jmlkolom];

        System.out.println("Matriks A");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                mA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matriks B");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                mB[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Penjumlahan Matriks A dan B");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                hasil[i][j] = mA[i][j] + mB[i][j];
            }
        }
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

    
}
