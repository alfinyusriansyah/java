
package reg;

import java.util.regex.*;  



public class Reg {
 
    public static void main(String[] args) {
     String kalimat1 = "hatiku sungguh senang sekali ";
     String kalimat2 = "Pukul yang sangat keras";
     String kalimat3 = "Kalau berjalan hati - hati";
     
     boolean istemu= kalimat1.toLowerCase().contains("hati");
     boolean istemu1= kalimat2.toLowerCase().contains("hati");
     boolean istemu2= kalimat3.toLowerCase().contains("hati");
     
     
        System.out.println(istemu);
        System.out.println(istemu1);
        System.out.println(istemu2);
    }
    
}
