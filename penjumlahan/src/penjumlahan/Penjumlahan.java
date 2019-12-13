
package penjumlahan;

import java.util.Scanner;


public class Penjumlahan {

  
public class penjumlahan {

    public void rumustambah() {
        int jmlbaris, jmlkolom;
        Scanner scan = new Scanner(System.in);

        System.out.print("Jumlah baris : ");
        jmlbaris = scan.nextInt();
        System.out.print("Jumlah kolom : ");
        jmlkolom = scan.nextInt();
        int mA[][] = new int[jmlbaris][jmlkolom];
        int mB[][] = new int[jmlbaris][jmlkolom];
        int hasil[][] = new int[jmlbaris][jmlkolom];

        System.out.println("Matriks A");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] : ");
                mA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matriks B");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] : ");
                mB[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        
//Penjumlahan
        
        System.out.println("Penjumlahan Matriks A dan B :");
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
  
//Perkalian        

        System.out.println("\nPerkalian Matriks A dan B : ");
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

//Pengurangan        

        System.out.println("\nPengurangan Matriks A dan B : ");
        for (int i = 0; i < jmlbaris; i++) {
            for (int j = 0; j < jmlkolom; j++) {
                hasil[i][j] = mA[i][j] - mB[i][j];
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
