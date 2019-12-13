/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursi.fibonannci;


import java.util.Scanner;

public class Kegiatan1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret Fibonacci : ");
        int n = scan.nextInt();
        long fib[] = new long[n];

        try {
            fib[0] = 0;
            fib[1] = 1;
         
            for (int i = 2; i < n; i++) {
                 fib[i] = fib[i - 1] + fib[i - 2];

            }
            for (int i = 0; i < n; i++) {
                System.out.println("Nilai "+i+"  adalah "+fib[i]);
            }
            
        } catch (ArrayIndexOutOfBoundsException a) {
            
            if (n < 1) {
                System.out.println("Mulai dari 1");
            } else if (n < 2) {
                System.out.println("Angka ke 1 = 0");

            }
        }

    }

}
