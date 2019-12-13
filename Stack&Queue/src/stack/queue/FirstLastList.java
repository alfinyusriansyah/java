/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

public class FirstLastList {
    private ClassLink first;
    private ClassLink last;
    private int size1;
    
    public FirstLastList(){
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertLast(long dd){
        ClassLink newLink = new ClassLink(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
        size1++;
    }
    public long deleteFirst(){
        long temp = first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        size1--;
        return temp;
    }
    public void displayList(){
        ClassLink current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    public long peek(){
        return first.dData;
    }
    public int size(){
        return size1;
        
    }
}

