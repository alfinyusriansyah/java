/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

   
    public static void main(String[] args) {
        String kuc = "hatiku senang sekali";
        String kuc2 = " pukulan yang sangat keras";
        String kuc3 = " kalau berjalan hati - hati";
        String gog = ".*ati.*";
        
        
        Pattern kor = Pattern.compile("[Hh]ati");
        Matcher kok1 = kor.matcher(kuc);
        Matcher kok2 = kor.matcher(kuc2);
                
        boolean kondisi1 = kok1.find();
        boolean kondisi2 = kok2.find();
       
        
        System.out.println("maka :" +kondisi1);
        System.out.println("maka :" +kondisi2);
    }
    
}
