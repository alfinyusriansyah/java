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
public class Stack {
    
    String[] stack= new String [10] ;
    int top;
    
    public void push(String nilai){
        
    stack[top]= nilai;
    top++;
    }
    
    public boolean kosong (){
    
    if(top==0){
    return true;
    }
    else {
    return false;
    }
    
    }
    
   public String pop(){
   String data;
   top--;
   data = stack[top];
   stack [top]= null;
   System.out.println("penghapusan : ");
   System.out.println(data);
   return data;
   
    }
    public String peek(){
   String data;
   data = stack[top-1];
   return data;
    }
    
    public void tampil(){
    
    for (String n : stack){
    
        System.out.println(""+n);
    }
    
    }
    
}
