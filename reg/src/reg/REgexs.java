
package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REgexs {
    
    public static void main(String[] args) {
    
    String Regex = "kucing";
    String input = "kucing itu bercuit," + "semua kucing bercuit";
    String Replace = "burung";
    Pattern p = Pattern.compile(Regex); // regex = kucing/ pola
        
        System.out.println("SEBELUM REPLACE : " + input);
        
        Matcher m = p.matcher(input); //mendefinisikan  regex kucing yang akan di replace
        input = m.replaceAll(Replace); // replace 
        System.out.println("SETELAH REPACE : " +input);
  }      
}       
        