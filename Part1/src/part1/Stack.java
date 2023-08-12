/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Stack<E>
{
    private LinkedList<E> stack;
    
    public Stack()
    {
        this.stack = new LinkedList<>();
    }
    
    public void push(E data)
    {
        this.stack.add(data);
    }
    
    public E pop()
    {
        E show = (E)this.stack.tail.data;
        this.stack.removeFromTail();
        return show;
    }
    
    public int getSize()
    {
        return this.stack.size;
    }
    
    public void printStack()
    {
        this.stack.printLinkedList();
    }
}
