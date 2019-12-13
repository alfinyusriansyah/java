/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class InsertionSortAngka {
 
	
    void mainAngka()
    {    
         Scanner in = new Scanner(System.in);
   System.out.print("Banyak data : ");
   int N = in.nextInt();
   int [] myArray = new int[N];
   
   for(int i=0; i<N; i++){
      System.out.print("data ke-"+(i+1)+" : ");
      myArray[i] = in.nextInt();
         
          
    }
   System.out.println("sebelum sorting");  
        
        printArray(myArray);
            
        insertionSort(myArray);//sorting array using insertion sort    
           
        System.out.println("setelah sorting");  
        
        printArray(myArray);
    }
    
    
 public static void insertionSort(int arr[]) 
	{  
            
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Iterasi ke- "+(i));
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("bandingkan "+ key  + " dan " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("penukaran Elements: array baru setelah di tukar");
            printArray(arr);
        }  
    }
 static void printArray(int[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
 
 
  }

