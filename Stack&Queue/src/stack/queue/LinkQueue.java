/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

public class LinkQueue {
    private FirstLastList theList;
    
    public LinkQueue(){
        theList = new FirstLastList();
    }
    public boolean isEmpty(){
        return theList.isEmpty(); 
    }
    public void enqueue(long j){
        theList.insertLast(j);
    }
    public long dequeue(){
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.print("Qeueu (Head-->Tail):");
        theList.displayList();
    }
    public void peek(){
        System.out.println(""+theList.peek());
    }
     public void size(){
        System.out.println(""+theList.size());
    }
}
