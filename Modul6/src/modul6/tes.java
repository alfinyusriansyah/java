
/**
   tes.java
    Purpose: Calculates the area of a circle and the volume     of a sphere. 
 * @author Alfin yusrian.
 * @version 2.0
 */
package modul6;



import java.util.Scanner;// library


public class tes {
        
    public static void main(String []arg){
        Scanner bos = new Scanner (System.in); // obejek inputan
        double r_alf; // tipe data variable
        double KONSTANT_PI = 3.14159; // konstanta PI
        double volume_of_sphere; //Tipe data variabel
        double area_of_circle ;//Tipe data variabel
        
     try{
        
        System.out.println("Enter a radius to use for both a circle");
        System.out.println("and a sphere (in inches):");
        r_alf = bos.nextDouble();
        System.out.println(" Radius =" + r_alf+"inches");
       
        volume_of_sphere = 4/3*KONSTANT_PI*Math.pow(r_alf, 3); // rumus volume bola
        area_of_circle = KONSTANT_PI*Math.pow(r_alf, 2);// rumus luas lingkaran
        
        System.out.println("Volume of sphere = " +   area_of_circle + "square inches");
        System.out.println("Area of circle = " + volume_of_sphere +"cubic inches");
     }
     
     catch (java.util.InputMismatchException e){
         System.out.println("throw in " + e);
     }
    }
    
}


    
    