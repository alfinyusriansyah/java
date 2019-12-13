
package utsalpro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class UrutanNama {
    public static void main(String[] args) throws Exception
           
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