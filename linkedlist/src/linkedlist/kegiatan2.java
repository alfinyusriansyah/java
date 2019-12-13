/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.Scanner;
/**
 *
 * @author asus
 */

public class kegiatan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SortList sList = new SortList();
        System.out.println("masukkan angka");
         int go = sc.nextInt();
         int gr = sc.nextInt();
         int gh = sc.nextInt();
        sList.addNode(go);
        sList.addNode(gr);
        sList.addNode(gh);        
        System.out.println("nilai sebelumnya ");
        sList.display();
        
        System.out.println("masukan angka :");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        sList.addNode(a);
        sList.addNode(b);
         System.out.println("maka nila sesudahnya adalah :");
        sList.sortList();//void
        System.out.println("======");
        sList.display();
                                                              
    }
}


