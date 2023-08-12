/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

import java.util.Random;

public class Fruit 
{
    private int posX;
    private int posY;
    private char letter;
    
    public Fruit()
    {
        this.posX = (new Random().nextInt(100)) * 10;
        this.posY = (new Random().nextInt(100)) * 10;
        this.letter = (char) (new Random().nextInt(26) + 'a');
    }
    
    public Character getLetter()
    {
        return (Character)(Comparable)this.letter;
    }
    
    public int getPosX()
    {
        return this.posX;
    }
    
    public int getPosY()
    {
        return this.posY;
    }
    
    public void setPosX()
    {
        this.posX = (new Random().nextInt(100)) * 10;
    }
    
    public void setPosY()
    {
        this.posY = (new Random().nextInt(100)) * 10;
    }
    
    public void setValue()
    {
        this.letter = (char) (new Random().nextInt(26) + 'a');
    }
}
