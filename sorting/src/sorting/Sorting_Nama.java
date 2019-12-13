/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author asus
 */
import java.util.Scanner;//import class library dari Scanner
import java.io.BufferedReader;//import class library BufferedReader
import java.io.InputStreamReader;//import class library InputStreamReader
public class Sorting_Nama {//nama class Sorting_Nama
    
    
    public static void main(String[] args) throws Exception{ //
        BufferedReader nama = new BufferedReader(new InputStreamReader(System.in));//instansiasi BufferedReader ke InputStreamReader 
        int a;//variabel a dengn tipe dta integer
        System.out.print("Jumlah Nama Yang Ingin di Masukan: ");
        a = Integer.parseInt(nama.readLine());//variabel "a" di ubah  tipe data dari int menjadi String
        String[] data;//variabel String dengan nama data
        data=new String[a];// //deklarasi variabel array untuk menyimpan data 
        String temp;
        Scanner input=new Scanner(System.in); //Instansiasi Class  Library untuk menggunakan inputan dari user
        
        for(int i=0;i<a;i++)//pengulangan untuk memasukan data yang telah diinputkan untuk di masukkan ke dalam array
        {
            System.out.print("Nama orang ke-" +(i+1)+" adalah: ");
            data[i]=input.next();//data String yang diinputkan kedalam array
        }

        for(int b=1;b<a;b++)//pengulangan dalam proses pengurutan berdasarkan huruf depan
        { 
            for(int c=0;c<b;c++)
            { 
                if(data[c].compareTo(data[c+1])>0)
                { 
                    temp=data[c];
                    data[c]=data[c+1];
                    data[c+1]=temp;
                } 
            } 
        }
        System.out.println("");
        System.out.println("Daftar Urutan : ");
        for(int i=0;i<a;i++)//pengulangan Nomor di depan nama
        {
            System.out.println((i+1)+". "+ data[i]);
        }
        
    }
}

