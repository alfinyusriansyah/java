/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penambahan;

import java.util.Scanner;

public class pengurangan {

    public void rumuskurang() {
        int baris, kolom;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris matriks = ");
       baris = scan.nextInt();
        System.out.println("Masukkan jumlah kolom matriks = ");
        kolom = scan.nextInt();
        System.out.println();
        int mA[][] = new int[baris][kolom];
        int mB[][] = new int[baris][kolom];
        int hasil[][] = new int[baris][kolom];

        System.out.println("Matriks A");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <kolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                mA[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <kolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + (i + 1) + " kolom ke " + (j + 1) + " : ");
                mB[i][j] = scan.nextInt();
            }
        }
        System.out.println("\nPengurangan Matriks A dan B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = mA[i][j] - mB[i][j];
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j <kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

