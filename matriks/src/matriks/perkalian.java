/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;


 

import java.util.Scanner;

public class perkalian {

    public void rumuskali() {
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
                System.out.print("Masukkan isi indeks baris ke " + (i+1) + " kolom ke " + (j+1) + " : ");
                mB[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Perkalian Matriks A dan B");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                int total = 0;
                for (int k = 0; k < jmlbaris; k++) {
                    total = total + mA[i][k] * mB[k][j];
                }
                hasil[i][j] = total;
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
