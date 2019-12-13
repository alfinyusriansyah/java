/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

public class ClassLink {
    public long dData;
    public ClassLink next;

    public ClassLink(long d){
        dData = d;
    }
    
    public void displayLink(){
        System.out.print(dData +" ");
    }
   
}

