
package modul;

import java.util.Scanner;


public class belajar {   
    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     String str,sr;
     int i;
      
        sr = kek(sc);
        str = kok(sc);
        
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sr.charAt(0))// membandingkan antara indeks dan huruf, (0)== mencari huruf, di mulai dari indeknya , 0,1,2,3 dst..
            {
                System.out.println("ada di indeks:" + (i));
            }       
        }
    }
    private static String kek(Scanner sc) {
        String sr;
        System.out.println("masukan huruf:");
        sr = sc.nextLine();
        return sr;
    }

    private static String kok(Scanner sc) {
        String str;
        System.out.println("masukan nama:");
        str =sc.nextLine();
        return str;
    }
    

   
}
        
 
    
       
        
        
    
    

