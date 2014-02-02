/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Circle.java
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

public class Circle extends Shape {

   private int radius;

   int getRadius(){
      return radius;
   }
   
   void setRadius(int newRadius){
      radius = newRadius;
   }
   
   Circle() {
      setRadius(0);
   }
   
   Circle (int x, int y, int radius){ 
      super(x,y);
      setRadius(radius);  
   }
   //Display method
   public void display() {
      System.out.println("\nCircle: X is " + super.getX() + ". Y is " + super.getY() + ". Radius is " + radius + ".");
   }
   //Display with Graphics value
   public void display(Graphics g){
   g.drawOval(getX(), getY(), 2 * getRadius(), 2 * getRadius());
   }
   
   //Area method
   public double area() {      
      return radius * radius * Math.PI;
   }
}


   