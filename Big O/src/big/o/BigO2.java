/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.o;

/**
 *
 * @author asus
 */
public class BigO2 {
    
    public static void main(String[] args) {
        int n =10;
        int count = 0;
      System.out.println("- KEGIATAN 2 SAYANG -");

        //GENAP NOTASI O((n^2)/2)
        //GANJIL NOTASI O(n(n+1)/2)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j*=2) {
                System.out.print("\t" + "|" + i + "\t" + "- ");
                System.out.println(" \t" + j + "|" + "\t");
                count++;
            }
        }
        System.out.println("total = " +count);
}
}

// ini merupakan notasi O(n.k),
//Untuk data sebesar N, banyaknya operasi yang dijalankan yaitu N*N, 
//karena for yang terluar ngeloop sebanyak N kali loop dalam yang ngeloop N kali.
// kesimpulanya , 1 = 200,  100 = 20000
// perulangan