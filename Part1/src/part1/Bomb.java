/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

import java.util.Random;

public class Bomb 
{
    private int posX;
    private int posY;
    private int value;
    
    public Bomb()
    {
        this.posX = (new Random().nextInt(100)) * 10;
        this.posY = (new Random().nextInt(100)) * 10;
        this.value = new Random().nextInt(9);
    }
    
    public int getValue()
    {
        return (Integer)(Comparable)this.value;
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
        this.value = new Random().nextInt(9);
    }
}
