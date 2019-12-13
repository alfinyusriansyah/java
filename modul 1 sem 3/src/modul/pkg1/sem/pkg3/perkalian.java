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
public class perkalian {
    public void kali (){
     Scanner inputan= new Scanner (System.in);
        int A[][]=new int[2][2];
        int B[][]=new int[2][2];
        int C[][]=new int[2][2];
         
        System.out.println("======MATRIKS PERKALIAN======");
        System.out.println("Masukkan Nilai Matriks A");
        System.out.println("==============================");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                A[i][j]=inputan.nextInt();
            }
        }
      
        System.out.println("\nMasukkan Nilai Matriks B");
        System.out.println("==========================");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                B[i][j]=inputan.nextInt();
            }
        }
      
        System.out.println();
        System.out.println("Perkalian Matriks A dan B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int total = 0;
                for (int k = 0; k < 2; k++) {
                    total = total + A[i][k] * B[k][j];
                }
                C[i][j] = total;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print (C[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

