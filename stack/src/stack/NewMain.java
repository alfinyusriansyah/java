/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author asus
 */
public class NewMain {

   
    public static void main(String[] args) {
       
        Stack cek = new Stack ();
        System.out.println("nilai");
        cek.push("ss");
        cek.push("jojo");
        cek.push("kok");
        
        
        
        cek.tampil();
        System.out.println("----------");
        cek.kosong();
       
      cek.pop();
        System.out.println("hasill:");
        cek.tampil();
        System.out.println("peek :");
        System.out.println(cek.peek());
    
                }
    
}
