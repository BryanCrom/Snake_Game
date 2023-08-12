/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class DataAnalysis<E>
{
    private E[] data;
    private Queue<E> queue;
    private Stack<E> stack;
    private int tail;
    private int head;
    
    public DataAnalysis(E[] data)
    {
        this.data = data;
        this.queue = new Queue();
        this.stack = new Stack();
        this.tail = (data.length - 1);
        this.head = 0;
        
    }
    
    public boolean isSymmetrical()
    {
        switch (this.data.length %2) {
            case 0:
                if(this.data[this.head].equals(this.data[this.tail]) && (this.head + 1) != this.tail)
                {
                    this.head++;
                    this.tail--;
                    boolean palindrome = isSymmetrical();
                    return palindrome;
                }
                else return this.data[this.head].equals(this.data[this.tail]) && (this.head + 1) == this.tail;
            case 1:
                if(this.data[this.head].equals(this.data[this.tail]) && this.head != this.tail)
                {
                    this.head++;
                    this.tail--;
                    boolean palindrome = isSymmetrical();
                    return palindrome;
                }
                else return this.data[this.head].equals(this.data[this.tail]) && this.head == this.tail;
            default:
                return false;
        }
    }
}
