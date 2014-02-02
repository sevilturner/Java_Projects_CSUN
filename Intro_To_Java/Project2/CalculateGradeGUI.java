/*************************************************
* Project #2: User I/O and Selections
* File: CalculateGradeGUI.java
* Section 14493
* Programmer: Sevil Turner
* Date: Sep 23 2013
* Description: This assignment is meant to ask a 
* user to type a score in an Input dialog 
* and display a grade in a Message dialog.
**************************************************/

import javax.swing.JOptionPane;

public class CalculateGradeGUI {

	public static void main(String[] args) {
		
		String scoreString = JOptionPane.showInputDialog(
         "Enter a single numeric score, e.g., 99.9: ");
   	
         double score = 
            Double.parseDouble(scoreString);
           
         char grade = ' ';
		        
   			if (score >= 90.0 && score <= 100.0) {
               grade = 'A';
   			}		
   
   			else if (score >= 80.0 && score < 90.0) {
   				grade = 'B';
   			}
   			
   			else if (score >= 70.0 && score < 80.0) {  
   				grade = 'C';
   			}
   
   			else if (score >= 60.0 && score < 70.0) {
   				grade = 'D';
   			}
   
   			else if (score < 60.0 && score >= 0) {
   				grade = 'F';
   			}
   
            if (grade != ' ') {
               String output = "A score of " + score + " is a grade of " + grade;
                  JOptionPane.showMessageDialog(null, output);
            }				 
   
            else {
   				String output = "Error! Number is out of range, please try again.";
                  JOptionPane.showMessageDialog(null, output);
   			} 	
            				
	}
}
