/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursi.fibonannci;

import java.util.Scanner;


public class Kegiatan2 {

    private static int faktorial(int parameter) {
        System.out.println("parameter = " + parameter + "!");
        
        //kondisi
        if (parameter == 0) {
            return 1;
        }else if(parameter >= 1){
        //fungsi rekursif
        return parameter * faktorial(parameter - 1);
        }else{
         return parameter * faktorial(parameter + 1);   
        }

   }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        int nilai = scan.nextInt();
        int hasil = faktorial(nilai);

        System.out.print("\nHasil faktorial = " + hasil);
        System.out.println("\n");
    }

}
