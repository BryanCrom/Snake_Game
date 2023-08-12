/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Queue<E>
{
    private LinkedList<E> queue;
    
    public Queue()
    {
        this.queue = new LinkedList<>();
    }
    
    public void enqueue(E data)
    {
        queue.add(data);
    }
    
    public E dequeue()
    {
        E removed = (E) this.queue.head.data;
        this.queue.removeFromHead();
        return removed;
    }
    
    public int getSize()
    {
        return this.queue.size;
    }
    
    public void printQueue()
    {
        this.queue.printLinkedList();
    }
}
