/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

public class MainQueue {

    
    public static void main(String[] args) {
        LinkQueue coba = new LinkQueue();
        coba.enqueue(10);
        coba.enqueue(40);
        coba.displayQueue();
        coba.size();
        coba.enqueue(30);
        coba.enqueue(5);
        coba.displayQueue();
        coba.dequeue();
        coba.displayQueue(); 
        coba.peek();
        coba.size();
    }
    
}
