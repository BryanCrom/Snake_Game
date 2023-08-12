/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Node<E extends Comparable<E>> implements Comparable<Node <E>>
{
    public E data;
    public Node<E> next;
    
    public Node()
    {
        this.data = null;
        this.next = null;
    }
    
    public boolean equals(Node<E> node)
    {
        return node.data == this.data;
    }
    
    @Override
    public int compareTo(Node<E> node)
    {
        return this.data.compareTo(node.data);
    }
}
