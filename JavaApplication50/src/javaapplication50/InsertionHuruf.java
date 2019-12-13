
package javaapplication50;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class InsertionHuruf {
 
	
    void mainHuruf() 
    {    
       
         Scanner in = new Scanner(System.in);
   System.out.print("Banyak data : ");
    int N = in.nextInt();

  String arr[]= new String[N];
   
   for(int i=0; i<N; i++){
      System.out.print("data ke-"+(i+1)+" : ");
      arr[i] = in.next();
         
          
    }
   System.out.println("sebelum sorting");  
        
        printArray(arr);
            
        insertionSort(arr);//sorting array using insertion sort    
           
        System.out.println("sesudah sorting");  
        
        printArray(arr);
    }
    
    
 public static void insertionSort(String arr[]) 
	{  
            
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Iterasi ke- "+(i));
            String key = arr[i];  
            int j = i-1;  
            
            while ( arr [j].compareTo(arr[i])<0) 
            {  
            System.out.println("bandingkan "+ key  + " dan " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("penukaran element: array baru setelah di tukar");
            printArray(arr);
        }  
    }
 static void printArray(String[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
 
 
}
