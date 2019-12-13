/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.ArrayList;
 
public class main {

    
    public static void main(String[] args) {
      
        ArrayList<Cell> totItem= new ArrayList<> (); // 
        Cell <tahun,mobil> Item1= new Cell <> (); // kelas generik yang memiliki parameter thaun dan mobil
        Cell <tahun,mobil> Item2= new Cell <> ();
        Cell <tahun,mobil> Item3= new Cell <> ();
        
        tahun tahun1 = new tahun (); //list
        tahun1.setYear(2010);
        mobil mobil1 = new mobil();
        mobil1.setCar("ertiga");
        Item1.setItem(tahun1,mobil1);
        totItem.add(Item1);
        
        tahun tahun2 = new tahun();
        tahun2.setYear(2016);
        mobil mobil2= new mobil ();
        mobil2.setCar("Xpander");
        Item2.setItem(tahun2, mobil2);
        totItem.add(Item2);
        
        tahun tahun3 = new tahun();
        tahun3.setYear(2019);
        mobil mobil3= new mobil ();
        mobil3.setCar("mobilio");
        Item3.setItem(tahun3, mobil3);
        totItem.add(Item3);
        
        for (Cell<tahun,mobil> Cell : totItem){
        tahun tahun0 = Cell.getK();
        mobil mobil0 = Cell.getV();
        
            System.out.println("tahun :" + tahun0.getYear());
            System.out.println("mobil : " + mobil0.getCar());
            
        
        
        }
        
       totItem.size();
            System.out.println("total " + totItem.size()); 
        
    }
    
}
