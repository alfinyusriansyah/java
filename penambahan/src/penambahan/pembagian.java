/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penambahan;

import java.util.Scanner;

public class pembagian {

    public void rumusbagi() {
        Scanner scan = new Scanner(System.in);
        int[][] MatriksX = new int[2][2];
        // int temp;

//Proses memasukkan elemen-elemen matriksnya
        System.out.println("\nMasukkan elemen matriks : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Elemen [" + (i + 1) + "," + (j + 1) + "] = ");
                MatriksX[i][j] = Integer.parseInt(scan.nextLine());
            }
        }

//Proses menampilkan Matriks
        System.out.println("\nBerikut tampilan matriksnya : \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(MatriksX[i][j] + "\t");
            }
            System.out.println(" ");
        }

//Proses perhitungan Determinan Matriks
        float dtrm;
        dtrm = (MatriksX[0][0] * MatriksX[1][1]) - (MatriksX[1][0] * MatriksX[0][1]);

//Proses menampilkan Determinan Matriks
        System.out.println("\nMaka, Determinan = " + dtrm);

//Proses membentuk Invers Adjoin
        System.out.println("\nInvers Matriks : \n");

        MatriksX[0][0] = MatriksX[1][1];
        MatriksX[1][1] = MatriksX[0][0];
        MatriksX[0][1] = MatriksX[0][1] * -1;
        MatriksX[1][0] = MatriksX[1][0] * -1;

//Proses perhitungan Invers
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(MatriksX[i][j] / dtrm + "\t");
            }
        }
    }
}
