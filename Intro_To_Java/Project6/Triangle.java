/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Triangle.java
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

public class Triangle extends Shape {
   
   private int base;
   private int height;
   
   int getBase(){
      return base;
   }
   
   int getHeight(){
      return height;
   }
   
   void setBase(int newBase){
      base = newBase;
   }
   void setHeight(int newHeight){
      height = newHeight;  
   }

   Triangle() {
      setBase(0);
      setHeight(0);
   }
   Triangle(int x, int y, int base, int height) {
      super(x,y);
      setBase(base);
      setHeight(height);
   
   }
   
   public void display() {
      System.out.println("\nTriangle: X is " + super.getX() + ". Y is " + super.getY() + ". Height is " + height + ". Base is " + base + ".");
   }
   
   //Display with Graphics value
   public void display(Graphics g){
   Polygon polygon = new Polygon();
   polygon.addPoint(getX(), getY());
   polygon.addPoint(getX(), getY() + getBase());
   polygon.addPoint(getY() + getHeight(),getX());
   g.drawPolygon(polygon);
   }
   
   public double area() {
      return base * height * 0.5;
      
   }
}
