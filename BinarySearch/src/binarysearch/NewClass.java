/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class NewClass {
    public static double[] Bubbleshort(double w, int x, double y, long z, int v) {
        
        double[] a = {w, y, z, x, v};
        System.out.println("Sebelum di Sorting: ");
        for (int i = 0; i < a.length; i++) {
        if (i > 0){
            System.out.print(" , " + a[i]);
        }
        else{
            System.out.print(a[i]);
        }
    }
        for (int i = 0; i < a.length; i++) { //sorting
            for (int j =0; j < a.length - 1; j++) {
                if(a[j] >= a[j+1]){
                    double m = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = m;
                }
            }
        }
        return a;
    }
    
    
    static int binarySearch(double[] angka, double cari, int i, int j){
        int tengah;
        while (i <= j) {
            tengah = (i + j) / 2;
            if (cari == angka[tengah]){
                return tengah;
            } else if (cari < angka[tengah]){
                j = tengah - 1;
            } else {
                i = tengah + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int v = 2;
        double w = 2.231;
        int x = 6432;
        double y = 4.3;
        long z = 2131872;
        
        double a[] = Bubbleshort(w, x, y, z, v); //hasil pengurutan masuk kedouble a / array double a
        System.out.println("\n Hasil Sorting: ");
        for (int i = 0; i < a.length; i++){
            if (i > 0) {
                System.out.print(" , " + a[i]);
            }
            else{
                System.out.print(a[i]);
            }
        }
        System.out.println("\n Masukkan pencarian anda dari data diatas: ");
        double q = sc.nextDouble();
        int b = binarySearch(a, q, 0, a.length - 1);
        if (b == -1){
            System.out.println("Data Tidak ditemukan!");
        }else{
            System.out.println("Data Ditemukan pada index ke = " + b);
        }
    }
}
