/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

public class Snake
{
    private int[] posX;
    private int[] posY;
    LinkedList<Character> body;
    
    public Snake()
    {
        this.posX = new int[100];
        this.posY = new int[100];
        this.posX[0] = 10;
        this.posY[0] = 10;
        this.body = new LinkedList<>();
        this.body.add((Character)(Comparable)'@');
    }
    
    public void grow(Fruit fruit)
    {
        this.body.addInOrder((Character)(Comparable)fruit.getLetter());
    }
    
    public void shrink(Bomb bomb)
    {
        if(this.body.size == 1)
        {
            this.body.head = null;
            this.body.size--;
        }
        else if(bomb.getValue() > this.body.size)
        {
            this.body.removeFromTail();
        }
        else
        {
            this.body.remove(this.body.getNode(bomb.getValue()));
        }

    }
    
    public void moveUp()
    {
        
        for(int i = this.body.size;i>0;i--)
        {
            this.posX[i] = this.posX[i-1];
            this.posY[i] = this.posY[i-1];
        }
        this.posY[0] = this.posY[0] - 10;
    }
    
    public void moveDown()
    {
        for(int i = this.body.size;i >0;i--)
        {
            this.posX[i] = this.posX[i-1];
            this.posY[i] = this.posY[i-1];
        }
        this.posY[0] = this.posY[0] + 10;
    }
        
    public void moveLeft()
    {
        
        for(int i = this.body.size;i>0;i--)
        {
            this.posX[i] = this.posX[i-1];
            this.posY[i] = this.posY[i-1];
        }
        this.posX[0] = this.posX[0] - 10;
    }

    public void moveRight()
    {
        
        for(int i = this.body.size;i>0;i--)
        {
            this.posX[i] = this.posX[i-1];
            this.posY[i] = this.posY[i-1];
        }
        this.posX[0] = this.posX[0] + 10;
    }
    
    public int getPosX(int i)
    {
        return this.posX[i];
    }
    
    public int getPosY(int i)
    {
        return this.posY[i];
    }
}
