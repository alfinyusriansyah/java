/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajal;
import java.util.HashMap;
public class Ex_HashMapDemo {
 
       public static void main(String[] args) {
 
       HashMap<Integer, String> cul = new HashMap<Integer, String>();
       //menambahkan data ke hashmap
       cul.put(101, "Gado-Gado");
       cul.put(102, "Sate Iwak");
       cul.put(103, "Ragit");
       cul.put(104, "Daging balado");
 
       //menampilkan hashmap
       System.out.println("Hashmap \t\t\t : " + cul.entrySet());
       System.out.println("Ukuran Hashmap \t\t\t : " + cul.size());
 
       //mengecek data di hashmap
       System.out.println("Ada Sate Iwak? \t\t\t : " + cul.containsKey(102));
 
       //men-delete data di hashmap
       System.out.println("Removed \t\t\t : " + cul.remove(104));
 
       System.out.println("Hashmap \t\t\t : " + cul.entrySet());
       System.out.println("Ukuran Hashmap \t\t\t : " + cul.size());
 
       //menghapus semua data
       cul.clear();
       System.out.println("Seluruh items HashMap dihapus \t : " + cul);
 
     }//main
}//class
