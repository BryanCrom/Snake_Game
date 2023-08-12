/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class SnakeGame extends JPanel implements KeyListener
{  
    Snake snake;
    Fruit fruit;
    Bomb bomb1, bomb2, bomb3, bomb4, bomb5, bomb6, bomb7, bomb8, bomb9, bomb10;
    public SnakeGame(Snake snake, Fruit fruit, Bomb bomb1, Bomb bomb2, Bomb bomb3, Bomb bomb4, Bomb bomb5, Bomb bomb6, Bomb bomb7, Bomb bomb8, Bomb bomb9, Bomb bomb10)
    {
        this.addKeyListener((KeyListener) this);       
        this.setFocusable(true);
        this.snake = snake;
        this.fruit = fruit;
        this.bomb1 = bomb1;
        this.bomb2 = bomb2;
        this.bomb3 = bomb3;
        this.bomb4 = bomb4;
        this.bomb5 = bomb5;
        this.bomb6 = bomb6;
        this.bomb7 = bomb7;
        this.bomb8 = bomb8;
        this.bomb9 = bomb9;
        this.bomb10 = bomb10;
    }
    
    public void paint(Graphics g)
    {
        paintComponent(g);
        setBackground(Color.black);
        
        for(int i = 0; i < this.snake.body.size; i++)
        {
            g.setColor(Color.white);
            g.drawString(Character.toString((char) this.snake.body.getNode(i).data), (this.snake.getPosX(i)), this.snake.getPosY(i));
            
        }
        
        g.drawString(Character.toString(this.fruit.getLetter()),this.fruit.getPosX(),this.fruit.getPosY());
        g.drawString(Integer.toString(this.bomb1.getValue()), this.bomb1.getPosX(), this.bomb1.getPosY());
        g.drawString(Integer.toString(this.bomb2.getValue()), this.bomb2.getPosX(), this.bomb2.getPosY());
        g.drawString(Integer.toString(this.bomb3.getValue()), this.bomb3.getPosX(), this.bomb3.getPosY());
        g.drawString(Integer.toString(this.bomb4.getValue()), this.bomb4.getPosX(), this.bomb4.getPosY());
        g.drawString(Integer.toString(this.bomb5.getValue()), this.bomb5.getPosX(), this.bomb5.getPosY());
        g.drawString(Integer.toString(this.bomb6.getValue()), this.bomb6.getPosX(), this.bomb6.getPosY());
        g.drawString(Integer.toString(this.bomb7.getValue()), this.bomb7.getPosX(), this.bomb7.getPosY());
        g.drawString(Integer.toString(this.bomb8.getValue()), this.bomb8.getPosX(), this.bomb8.getPosY());
        g.drawString(Integer.toString(this.bomb9.getValue()), this.bomb9.getPosX(), this.bomb9.getPosY());
        g.drawString(Integer.toString(this.bomb10.getValue()), this.bomb10.getPosX(), this.bomb10.getPosY());
        
        if(this.snake.body.size == 0)
            g.drawString("GAME OVER", 100, 100);
        repaint();

    }
    
    @Override
    public void keyTyped(KeyEvent e) 
    {

    }
    
    public void collision()
    {
        if(this.snake.getPosX(0) == this.fruit.getPosX() && this.snake.getPosY(0) == this.fruit.getPosY())
        {
            this.snake.grow(this.fruit);
            this.fruit.setPosX();
            this.fruit.setPosY();
            this.fruit.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb1.getPosX() && this.snake.getPosY(0) == this.bomb1.getPosY())
        {
            this.snake.shrink(this.bomb1);
            this.bomb1.setPosX();
            this.bomb1.setPosY();
            this.bomb1.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb2.getPosX() && this.snake.getPosY(0) == this.bomb2.getPosY())
        {
            this.snake.shrink(this.bomb2);
            this.bomb2.setPosX();
            this.bomb2.setPosY();
            this.bomb2.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb3.getPosX() && this.snake.getPosY(0) == this.bomb3.getPosY())
        {
            this.snake.shrink(this.bomb3);
            this.bomb3.setPosX();
            this.bomb3.setPosY();
            this.bomb3.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb4.getPosX() && this.snake.getPosY(0) == this.bomb4.getPosY())
        {
            this.snake.shrink(this.bomb4);
            this.bomb4.setPosX();
            this.bomb4.setPosY();
            this.bomb4.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb5.getPosX() && this.snake.getPosY(0) == this.bomb5.getPosY())
        {
            this.snake.shrink(this.bomb5);
            this.bomb5.setPosX();
            this.bomb5.setPosY();
            this.bomb5.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb6.getPosX() && this.snake.getPosY(0) == this.bomb6.getPosY())
        {
            this.snake.shrink(this.bomb6);
            this.bomb6.setPosX();
            this.bomb6.setPosY();
            this.bomb6.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb7.getPosX() && this.snake.getPosY(0) == this.bomb7.getPosY())
        {
            this.snake.shrink(this.bomb7);
            this.bomb7.setPosX();
            this.bomb7.setPosY();
            this.bomb7.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb8.getPosX() && this.snake.getPosY(0) == this.bomb8.getPosY())
        {
            this.snake.shrink(this.bomb8);
            this.bomb8.setPosX();
            this.bomb8.setPosY();
            this.bomb8.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb9.getPosX() && this.snake.getPosY(0) == this.bomb9.getPosY())
        {
            this.snake.shrink(this.bomb9);
            this.bomb9.setPosX();
            this.bomb9.setPosY();
            this.bomb9.setValue();
        }
        
        else if(this.snake.getPosX(0) == this.bomb10.getPosX() && this.snake.getPosY(0) == this.bomb10.getPosY())
        {
            this.snake.shrink(this.bomb10);
            this.bomb10.setPosX();
            this.bomb10.setPosY();
            this.bomb10.setValue();
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {   
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            this.snake.moveUp();
            collision();
            repaint();
            
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.snake.moveDown();
            collision();
            repaint();
          
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.snake.moveLeft();
            collision();
            repaint();
        
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.snake.moveRight();
            collision();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
