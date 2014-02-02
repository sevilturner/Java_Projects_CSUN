/*************************************************
* Project #2: User I/O and Selections
* File: CalculateGrade.java
* Section 14493
* Programmer: Sevil Turner
* Date: Sep 23 2013
* Description: This assignment is meant to ask a 
* user to input a score and after displays a grade.
**************************************************/

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		
		//Asks a user to input a score
		System.out.print("Enter a single numeric score: ");
   		double score = input.nextDouble();
         
         char grade = ' ';
		
            //If score is greater than or equal to 90.0 AND score is less than or equal to 100.0, grade is an 'A'.
   			if (score >= 90.0 && score <= 100.0) {
               grade = 'A';
   			}		
   
   			//If score is greater than or equal to 80.0 AND score is less than 90.0, grade is a 'B'.	
   			else if (score >= 80.0 && score < 90.0) {
   				grade = 'B';
   			}
   			
   			//If score is greater than or equal to 70.0 AND score is less than 80.0, grade is a 'C'.	
   			else if (score >= 70.0 && score < 80.0) {  
   				grade = 'C';
   			}
   						
   			//If score is greater than or equal to 60.0 AND score is less than 70.0, grade is a 'D'.
   			else if (score >= 60.0 && score < 70.0) {
   				grade = 'D';
   			}
   				
   			//If score is less than 60.0 AND score is greater than or equal to 0, grade is an 'F'.
   			else if (score < 60.0 && score >= 0) {
   				grade = 'F';
   			}
            
            //If score is negative number or greater than 100.0 
            if (grade != ' ') {
               System.out.println("A score of " + score + " is a grade of " + grade);
            }				 
            
            //Then display the message for a user to try again.
            else {
   				System.out.println("Error! Number is out of range, please try again.");
   			} 	
            				
	}
}

