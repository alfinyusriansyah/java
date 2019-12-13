/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;


import java.util.Scanner;


public class Kegiatan1 {
    
    
    public static void main(String[] args) {
         
      Stack tumpukan = new Stack();
      String Kalimat;
      Scanner masukan = new Scanner(System.in);
      
      System.out.print("Masukkan Kalimat : ");
      Kalimat = masukan.nextLine();
      
      
      for(int i=0;i<Kalimat.length();i++)  
        tumpukan.push(new Character(Kalimat.charAt(i)));
      tumpukan.push('b');

      System.out.println();
      System.out.println("Hasil Sebelum : " + Kalimat);
      System.out.print("Hasil Sesudah : ");
      
      while(!tumpukan.empty()){
            Object elemen = tumpukan.pop();
            System.out.print(""+ elemen);
            }
      System.out.println();
      }
    
    
}






