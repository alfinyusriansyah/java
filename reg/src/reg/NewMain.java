/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg;

import java.util.regex.*;

/**
 *
 * @author asus
 */
public class NewMain {

   
    public static void main(String[] args) {
        String kuc =  "hatiku senang sekali";
        String kuc2 = " pukulan yang sangat keras";
        String kuc3 = " kalau berjalan hati - hati";
        Pattern o = Pattern.compile(".*Hati.*",Pattern.CASE_INSENSITIVE);
//        String gog = ".*[Hh]ati.*";
        
       Matcher u1 = o.matcher(kuc); // mencari
       Matcher u2= o.matcher(kuc2);
       Matcher u3 = o.matcher(kuc3);
        
         boolean kondisi1 = u1.find(); // pengamilan nila true dan false
        boolean kondisi2 = u2.find();
        boolean kondisi3 = u3.find();
        
        System.out.println("maka :" +kondisi1);
        System.out.println("maka :" +kondisi2);
        System.out.println("maka :" +kondisi2);
    }
    
}


/** System.out.println("kondis 1 :" + kondisi1);
        System.out.println("kondis 2 :" + kondisi2);
        System.out.println("kondis 3 :" + kondisi3); 
**/