/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Shape.java
* Section 14493
* Programmer: Sevil Turner
* Date: Dec 2 2013
* Description: This program allows me to implement a 
* classic inheritance hierarchy and implement a 
* polymorphism. 
**************************************************/
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class Shape {

   public abstract void display();    
   public abstract double area();
   public abstract void display(Graphics g);
   
   private int x;
   private int y;
   
   protected final static int X_MAX_SIZE = 800;
   protected final static int Y_MAX_SIZE = 600;

   protected int getX() {
      return x;
   }   
   
   protected int getY() {
      return y;
   }
   
   protected void setX(int newX){
      if (newX < 0 || newX > 800) {
      System.out.println("The X value are out of range");
         x = 0;
      }
      else {
         x = newX;
      }
   }
   
   protected void setY(int newY){
      if (newY < 0 || newY > 600){
         System.out.println("The Y value are out of range");
         y = 0;
      }
      else {
         y = newY;
      }
   }
   
   Shape(){
      setX(0);
      setY(0);      
   }
   
   Shape(int newX, int newY) {
      setX(newX);
      setY(newY);
   }
   
   

}
       
