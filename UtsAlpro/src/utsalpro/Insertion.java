/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsalpro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Insertion {
 public void insernNumber () {
   Scanner in = new Scanner(System.in);
 
   
   System.out.print("Banyak data : ");
   int N = in.nextInt();
   int data[] = new int[N];
   
   for(int i=0; i<N; i++){
      System.out.print("data ke-"+(i+1)+" : ");
      data[i] = in.nextInt();
   }
   //prose isertion sort
   for(int i=1; i<data.length; i++){
      int key = data[i];
      int j=i;
      while(j >0 && data[j-1]>key){
          data[j]=data[j-1];
          j--;
      }
      data[j]=key;
   }
   //hasil pengurutan
   System.out.print("Data yang telah urut : ");
   for(int i=0; i<data.length; i++){
       System.out.print(data[i]+" ");
   }
   System.out.println();
   
    }  
 
 public void insertKarakter () throws IOException
    {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in)); // menginput nama dari keyboard menggunakan BufferedReader
        int a; // // mendeklarasikan variable bernama a yang tipe datanya integer
        System.out.print("Jumlah nama yang ingin di Inputkan: "); //menginput nama dari keyboard menggunakan BufferedReader
        a = Integer.parseInt(kata.readLine()); // mengkonversi variabel a yang bertipe data string menjadi Integer
        String[] Array; // array yang tipe datanya string
        Array=new String[a];
        String temp; // mendeklarasikan variabel temp yang tipe datanya String
        Scanner input=new Scanner(System.in); //menginstansiasi class scanner menjadi variabel yang bernama input
        for(int i=0;i<a;i++) //
        {
            System.out.print("Nama " +(i+1)+" adalah: ");
            Array[i]=input.next();
        }
        for(int x=1;x<a;x++)
        {
            for(int y=0;y<x;y++)
            {
            if(Array[y].compareTo(Array[y+1])>0)
            //membandingkan dan mengurutkan abjad
            {
            temp=Array[y];//
            Array[y]=Array[y+1];//
            Array[y+1]=temp; //
            }
            }
        }
        // output mengurutkan nama
            System.out.println("");
            System.out.println("Nama berdasarkan urutannya "); // menampilkan hasil nama yang telah terurut
        for(int i=0;i<a;i++){
        System.out.println((i+1)+". "+ Array[i]);
        }
        // output jumlah siswa, absen 2 teratas dan absen 2 terbawah
        System.out.println("Jumlah siswa : " + a);
        System.out.println("Absen 2 teratas : " + Array[1]); // menampilkan hasil nama 2 teratas
        System.out.println("Absen 2 terbawah : " + Array[a-2]); // menampilkan hasil nama 2 terbawah
      
}

}
