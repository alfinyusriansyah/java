
package javaapplication50;

import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
    
        InsertionHuruf a = new InsertionHuruf();
        InsertionSortAngka b = new InsertionSortAngka();
        Scanner in = new Scanner(System.in);
        
         System.out.print("pilihan ? " +
                "\n1. Huruf" +
                "\n2. Angks" +
                "\n>>>>> ");

        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                a.mainHuruf();
                break;
            case 2:
                b.mainAngka();
                break;
            default:
                System.out.println("tidak ada !!!");
        }
        
        
    }
    
}