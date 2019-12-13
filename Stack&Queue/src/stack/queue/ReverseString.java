/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

import java.util.Scanner;
import java.util.Stack;
 

 
public class ReverseString {
 
    public static void main(String[] args) {
 
          
          Scanner in = new Scanner(System.in);
          System.out.println("masukan nama:");
 
          String str = in.nextLine();
 
         
          Stack stack = new Stack<>();
 
        
          for(int i = 0; i < str.length(); i++) {
               stack.push(str.charAt(i));
          }
        System.out.println("");
          System.out.println("hasil setelah pembalikan");
          System.out.println("");
 
         
          while(!stack.empty()) {
              System.out.print(stack.pop());
          }
      }
}
