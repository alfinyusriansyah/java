/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsalpro;
import java.io.IOException;
import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Insertion ob = new Insertion();
        String ulang ="y" ;
        while (ulang.equals("y")){
        System.out.println("----- MENU ----");
        System.out.println("1. Number ");
        System.out.println("2. karakter");
        System.out.print(" pilih : ");
        int N = in.nextInt();

        switch (N){
            case 1 :
                ob.insernNumber();
                System.out.println("apakah anda ingin balik ke menu insertion ? y/n ");
               ulang = in.next();
                break;
            case 2:
                ob.insertKarakter();
                System.out.println("apakah anda ingin balik ke menu insertion ? y/n ");
               ulang = in.next();
                break;
    
        }
        }
        
        
       
    }
    
}