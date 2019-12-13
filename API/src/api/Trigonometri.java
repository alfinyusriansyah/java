
package api; // adalah sebuah perantara / alat untuk, ibaratkan kulkas.

import java.util.Scanner;
import java.lang.Math; // library



public class Trigonometri {
    public static void main(String []arg){
        Scanner bos = new Scanner (System.in);
        double sudut;
      
        
        System.out.println("masukkan nilai sudut:");
        sudut = bos.nextDouble();
        
        System.out.println("jadi sin dari sudut tersebut adalah="+Math.sin(Math.toRadians(sudut)));// komponenen dari api
        
        System.out.println("jadi cos dari sudut tersebut adalah="+Math.cos(Math.toRadians(sudut)));//
       
        System.out.println("jadi tan dari sudut tersebut adalah="+Math.tan(Math.toRadians(sudut)));
        
         System.out.println("jadi sin dari sudut tersebut adalah="+Math.asin(Math.toRadians(sudut)));
        
    }
    
}