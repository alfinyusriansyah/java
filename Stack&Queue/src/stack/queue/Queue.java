/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.queue;

class item //atau node/simpul
{

    public int data; // data item
    public item next; // next node link in list
    public item prev; // previous node link in list

    public item(int id) // constructor
    {
        data = id; // initialize data
    } // set to null)

    public void displayLink() // display ourself
    {
        System.out.print("{" + data + "} ");
    }
} // end class Link

class QueueLinkList {

    private item front; // ref to first link on list
    private item rear; // ref to last link on list

    public QueueLinkList() // constructor
    {
        front = rear = null; // no items on list yet
    }

    public boolean isEmpty() // true if list is empty
    {
        return (front == null);
    }

    public void enqueue(int id) //node baru selalu di top
    { // make new link
        item newitem = new item(id);
        if (front == null) // the first node created
        {
            front = rear = newitem; // first --> newLink
        } else {
            rear.next = newitem;	//next dr top (awal) diarahkan ke node baru
            newitem.prev = rear;	//prev dr node baru diarahkan ke tail (awal)
            rear = newitem;		//top (baru) diarahkan ke node baru
            newitem.next = null;
        }
    }

    public item dequeue() // delete first item
    {
        item temp = null;
        if (front == null) // queue is empty
        {
            System.out.println("Queue is empty");
        } else if (front == rear) // queue is only one data
        {
            temp = front;
            front = rear = null;
        } else // queue has more than one data
        {
            temp = front; // save reference to link
            front = front.next; // delete it: first-->old next
            front.prev = null;
        }
        return temp;
    }

    public void display() {
        item current = front; // start from the first data
        if (current == null) {
            System.out.println("The Queue is empty");
        } else {
            while (current != null) // until end of list,
            {
                current.displayLink(); // print data
                current = current.next; // move to next link
            }
        }
        System.out.println("");
    }
} // end class LinkList

class QueueLinkListApp {

    public static void main(String[] args) {
        QueueLinkList theQueue = new QueueLinkList(); // make new list
        System.out.println("Inserting queue's items...");
        theQueue.enqueue(22); // insert four items
        theQueue.display(); // display list
        theQueue.enqueue(44);
        theQueue.display(); // display list
        theQueue.enqueue(66);
        theQueue.display(); // display list
        theQueue.enqueue(88);
        theQueue.display(); // display list
        System.out.println("Display Queue :");
        theQueue.display(); // display list
        System.out.println("Delete Queue from Front...");
        while (!theQueue.isEmpty()) // until it's empty,
        {
            item aLink = theQueue.dequeue(); // delete link
            System.out.print("Deleted "); // display it
            aLink.displayLink();
            System.out.println("");
            theQueue.display(); // display list
            System.out.println("");
        }
    } // end main()
} // end class LinkListApp
