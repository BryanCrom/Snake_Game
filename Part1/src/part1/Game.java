/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

import java.awt.Color;
import javax.swing.JFrame;

public class Game 
{
     public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Snake user = new Snake();
        Fruit fruit = new Fruit();
        Bomb bomb1 = new Bomb();
        Bomb bomb2 = new Bomb();
        Bomb bomb3 = new Bomb();
        Bomb bomb4 = new Bomb();
        Bomb bomb5 = new Bomb();
        Bomb bomb6 = new Bomb();
        Bomb bomb7 = new Bomb();
        Bomb bomb8 = new Bomb();
        Bomb bomb9 = new Bomb();
        Bomb bomb10 = new Bomb();
        
        SnakeGame panel = new SnakeGame(user, fruit, bomb1, bomb2, bomb3, bomb4, bomb5, bomb6, bomb7, bomb8, bomb9, bomb10);
        
        frame.getContentPane().add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
