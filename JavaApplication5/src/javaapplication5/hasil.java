
package javaapplication5;


public class hasil {

   
    public static void main(String[] args) {
        String str = "programmer";
        char array[]= new char[15];
         
        str.getChars(1,5, array, 2);
        System.out.println("masukkan kalimat:"+str.charAt());
        System.out.println(array[3]);
        System.out.println(str.indexOf('p'));
    }
    
}
