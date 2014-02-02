/*******************************************
* Project #2: User I/O and Selections
* File: CalculateCylinder.java
* Section 14493
* Programmer: Sevil Turner
* Date: Sep 23 2013
* Description: This assignment is meant to 
* ask a user to input values for radius and 
* length and after calculating those values 
* using the formulas for area and volume, 
* displays the results of Area and Volume.
********************************************/

import java.util.Scanner;

public class CalculateCylinder {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
   	
		//Asks a user to input the radius and length
		System.out.print("Enter the radius and length of a cylinder: ");
   		double radius = input.nextDouble();
			double length = input.nextDouble();
	
			//Calculate the area. PI = 3.14159 
			double area = radius * radius * 3.14159;
			//Calculate the volume 
			double volume = area * length;
				   
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	
	}
}
	
		

	
	
	