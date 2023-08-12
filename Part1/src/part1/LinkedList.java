/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class LinkedList<E>
{
    public Node head;
    public Node tail;
    public Node current;
    public int size;
    
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
    }
    
    public void add(E data)
    {
        if(head == null)
        {
            Node newNode = new Node();
            newNode.data = (Comparable) data;
            this.head = newNode;
            this.current = this.head;
            this.tail = this.head;
            this.size++;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = (Comparable) data;
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }
    
    public void addInOrder(E data)
    {
        if(this.head == null)
        {
            add(data);
        }
        else if(this.tail.data == (Comparable)'@')
        {
            add(data);
        }
        else if(this.head.data.compareTo(data) > 0)
        {
            Node newNode = new Node();
            newNode.data = (Comparable) data;
            newNode.next = this.head;
            this.head = newNode;
            this.current = this.head;
            this.size++;
        }
        else if(this.current.next.data.compareTo(data) > 0)
        {
            Node newNode = new Node();
            newNode.data = (Comparable) data;
            newNode.next = this.current.next;
            this.current.next = newNode;
            this.current = this.head;
            this.size++;
        }
        else if(this.current.next == this.tail)
        {
            Node newNode = new Node();
            newNode.data = (Comparable) data;
            this.tail.next = newNode;
            this.tail = newNode;
            this.current = this.head;
            this.size++;
        }
        else
        {
            this.current = this.current.next;
            addInOrder(data);
        }
    }
    
    public boolean contains(Node node)
    {   
        if(this.current == null || node == null)
        {
            this.current = this.head;
            return false;
        }
        else if(node.equals(this.current))
        {
            this.current = this.head;
            return true;
        }
        else 
        {
            this.current = this.current.next;
            boolean contains = contains(node);
            return contains;
        }
    }
    
    public void remove(Node node)
    {
        if(current != null)
        {
            if(this.head.equals(node))
            {
                removeFromHead();
            }
            else if(this.tail.equals(node))
            {
                removeFromTail();
            }
            else if(this.current.next.equals(node))
            {
                this.current.next = this.current.next.next;
                this.current = this.head;
                this.size--;
            }
            else
            {
                this.current = this.current.next;
                remove(node);
                this.current = this.head;
            }
        }
    }
    
    public void removeFromHead()
    {
        this.head = this.head.next;
        this.current = this.head;
        this.size--;
    }
    
    public void removeFromTail()
    {
        if(this.current == this.tail)
        {
            this.tail = null;
            this.size--;
        }
        else if(this.current.next == this.tail)
        {
            this.tail = this.current;
            this.current.next = null;
            this.current = this.head;
            this.size--;
        }
        else
        {
            this.current = this.current.next;
            removeFromTail();
        }
    }
    
    public void printLinkedList()
    {
        if(this.current.next != null)
        {
            System.out.println(this.current.data);
            this.current = this.current.next;
            printLinkedList();
        }
        else
        {
            System.out.println(this.current.data);
            this.current = this.head;
        }
    }
    
    public Node getNode(int index)
    {
        if(index == 0)
        {
            Node node = this.current;
            this.current = this.head;
            return node;
        }
        else
        {
            this.current = this.current.next;
            index--;
            Node node = getNode(index);
            return node;
            
        }
    }
}
