/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Square.java
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

public class Square extends Rectangle {
      
   void setWidth(int newWidth){
      super.setWidth(newWidth);
      super.setHeight(newWidth);
   }
   void setHeight(int newHeight){
      super.setWidth(newHeight);
      super.setHeight(newHeight);
   }
      
   Square() {
      setWidth(0);
      setHeight(0);
   }
   
   Square(int x, int y, int newHeight, int newWidth) {
      super(x,y, newHeight, newWidth);      
      if (newWidth != newHeight) {
         System.out.println("The width does not match the height.");
      }
      else {
      setWidth(newWidth);
      }
   }
   public void display() {
      System.out.println("\nSquare: X is " + super.getX() + ". Y is " + super.getY() + ". Height is " + super.getHeight() + ". Width is " + super.getWidth() + ".");
   }
   //Display with Graphics value
   public void display(Graphics g){
   g.drawRect(getX(), getY(), getWidth(), getHeight());
   }
   

}

