/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Rectangle.java
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

public class Rectangle extends Shape {
   
   private int width;
   private int height;
   
   int getWidth(){
      return width;
   }
   int getHeight(){
      return height;
   }
   
   void setWidth(int newWidth){
      width = newWidth;
   }
   void setHeight(int newHeight){
      height = newHeight;
   }
   
   Rectangle() {
      setWidth(0);
      setHeight(0);
   }
   
   Rectangle(int x, int y, int height, int width) {
      super(x,y);
      setWidth(width);
      setHeight(height);
   }
   
   public void display() {
      System.out.println("\nRectangle: X is " + super.getX() + ". Y is " + super.getY() + ". Height is " + height + ". Width is " + width + ".");
   }
   
   //Display with Graphics value
   public void display(Graphics g){
   g.drawRect(getX(), getY(), width, height);
   }
   
   public double area() {
      return width * height;
      
   }

}
   
