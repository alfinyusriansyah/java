
package coba;

import java.util.Scanner;
import java.lang.Math; // library
import java.lang.*;



public class coba {
    
     static double pitagoras(double a, double b){
        double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        return c;
    }
     
    public static void main(String []arg){
        Scanner bos = new Scanner (System.in);
        double a;
        double b ;
        
        System.out.println("masukkan nilai:");
        a = bos.nextDouble();
        System.out.println("masukkan nilai:");
        b = bos.nextDouble();
        
        
        double c = pitagoras(a, b);
        
        System.out.println("hasil pembulatanya: " +Math.round(a));
        System.out.println("hasil pembulatanya: " +Math.round(b));
        System.out.println("hasil pitagoras dari nilai "+a+ " dan  "+b+ " adalah : "  + c);
        
    }
    
}


    
    