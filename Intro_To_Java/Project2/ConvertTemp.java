/*******************************************
* Project #2: User I/O and Selections
* File: ConvertTemp.java
* Section 14493
* Programmer: Sevil Turner
* Date: Sep 23 2013
* Description: This assignment is meant to 
* ask a user to input a value in Celsius 
* and display the result in Fahrenheit.
*******************************************/

import java.util.Scanner;

public class ConvertTemp {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		
		//Asks a user to input the value in Celsius
		System.out.print("Enter a degree in Celsius: ");
   		double celsius = input.nextDouble();
	
			//Convert Celsius to Fahrenheit
			double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
	   
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	
	}
}

	