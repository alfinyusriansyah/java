
package linkedlist;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Awet-PC
 */
public class kegiatan1 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);
        ArrayList<String> kol = new ArrayList<String>();
        hashSet <String> ho = new hashSet <String> ();
         String[] arr = new String[10]; 
        arr = kol.toArray(arr); 
        
        System.out.println("masukkan indeks 1: ");
        int go = sc.nextInt();
        
        System.out.println("masukkan indeks 2 : ");
        int ck = sc.nextInt();
        
        
        kol.add("Lola");
        kol.add("Lola");
        kol.add("Gracia");
        kol.add("Kyla");
        kol.add("Gio");
        System.out.println("Awal element (E e) : "+kol);
        System.out.println("===========");
        
        kol.add(go,"reza");
        kol.add(ck, "randy");
        System.out.println("Penambahan element (int index, E element) : "+kol );
        System.out.println("===========");
        
        
        
        
         System.out.println("masukkan indeks : ");
        int gg = sc.nextInt();
        
        System.out.println("masukkan indeks  : ");
        int cc = sc.nextInt();
        
        kol.remove(gg);
        System.out.println("Penghapusan (index) " +gg  +kol);
        kol.remove(cc);
        System.out.println("Penghapusan (index) " +cc +kol);
        
        
        System.out.println("===========");
        
        System.out.println("Mencari   indeks " +kol.indexOf("reza"));
        System.out.println("Mencari Gracia : "+kol.indexOf("Gracia"));
    }
}
