/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;


public class Hewan {
 
    private String nama = "anjing " ;
    private int jumlah =2 ;
   
 public Hewan(String nama)
 {
 this.nama=nama;
 }  
 public Hewan (int jumlah)
 {
 
 this.jumlah=jumlah;
 }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

   
    public void setNama(String hio) {
        this.nama = hio;
    }

    
    public int getJumlah() {
        return jumlah;
    }

    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

  
    
      
       }
       

