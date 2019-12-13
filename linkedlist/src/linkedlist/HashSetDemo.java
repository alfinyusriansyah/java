/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
         Scanner sc = new Scanner (System.in);
        HashSet<String> hashSet = new HashSet<String>(); 
  
        // Use add() method to add 
        // elements into the HashSet 
        hashSet.add("Welcome"); 
        hashSet.add("To"); 
        hashSet.add("Geeks"); 
        hashSet.add("For"); 
        hashSet.add("Geeks"); 
  
        // Displaying the HashSet 
        System.out.println("The HashSet: " + hashSet); 
        
        System.out.println("penambahan element :");
        System.out.println("");
        System.out.println("masukkan indeks 1: ");
        int go = sc.nextInt();
        System.out.println("masukkan indeks 2 : ");
        int ck = sc.nextInt();
        
        hashSet.add(go,"herer");
        
        
        hashSet.remove(1);
        hashSet.remove(3);
        System.out.println(" setelah di hapus : " + hashSet);
  
        // Creating the array and using toArray() 
        String[] arr = new String[5]; 
        arr = hashSet.toArray(arr); 
  
        // Displaying arr 
        System.out.println("The arr[] is:"); 
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 
    } 
} 
