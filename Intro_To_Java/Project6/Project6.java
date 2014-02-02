/*************************************************
* Project #6: Polymorphism and Inheritance
* File: Project6.java
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

  public class Project6 extends JFrame {//* Step1 (Phase4) 
  
  private Shape[] thearray = new Shape[100];  // 100 Shapes, circle's, tri's and rects
 
  public static void main (String [] args) {
    Project6 tpo = new Project6();
    tpo.run();
  }  // end of main

  public void run () {
   
    int count = 0;
    
    // ------------------------   Fill the array section ----------------------
 
    thearray[count++] = new Circle(20, 20, 20);
    thearray[count++] = new Triangle(70, 70, 20, 30);
    thearray[count++] = new Rectangle(160, 160, 30, 50);
    thearray[count++] = new Square(100, 100, 50, 50);
 
    // ------------------------------  array fill done ------------------------
 
    //---------------------------  loop through the array  --------------------
 
    for (int i = 0; i < count; i ++ ) {    // loop through all objects in the array
       thearray[i].display();              // don't care what kind of object, display it
    }  // end for loop
    
 
    int offset = 0;
    double totalarea = 0.0;
    while (thearray[offset] != null) {          // loop through all objects in the array
      totalarea = totalarea + thearray[offset].area();   // get area for this object
      offset++;
    } // end while loop
    System.out.println("\nThe total area for " + offset + " Shape objects is " + totalarea);
 
  }// end of run
  

    //Step 2 (phase4) - Project6 constructor will have to set up the GUI window
     Project6() {//*      
       JFrame frame = new JFrame(); // Create a frame
       MyPanel panel = new MyPanel();
       frame.add(panel); // Add the panel to the frame
   
       frame.setTitle("Show My GUI");
       frame.setSize(250, 250);
       frame.setLocation(100, 100);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
     }

		  
    // Step 4 (phase4) - This class should be pasted into your Project6 class. *******
	 public class MyPanel extends JPanel {
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	
	        for(Shape s : thearray) {
	            if(s != null) {
	                s.display(g);
	            }
	        }
	
	        repaint();
	    }
	}

}// end of class Project6int base

 