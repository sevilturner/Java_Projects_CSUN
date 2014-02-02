/*************************************************
* Project #3: Grade Book
* File: GradeBookGUI.java
* Section 14493
* Programmer: Sevil Turner
* Date: Oct 20 2013
* Description: This program is meant to track 
* students grade but asks a user to type a grade
* in a dialog box and displays an output in a 
* dialog box as well.
**************************************************/
import javax.swing.JOptionPane;
	public class GradeBookGUI{
		public static void main(String[] args) {

			double userScore = 0;
         String scoreString;
			char calculateGrade = ' ';
			char averageGrade = ' ';
			double total = 0;
			double average = 0;
         
			int countOfA = 0;
			int countOfB = 0;
			int countOfC = 0;
			int countOfD = 0;
			int countOfF = 0;
	
         //This is a sentinel and will end when a user enters value of -1 for a userScore
			int count = 0;
         while (userScore > -1) { 
         scoreString = JOptionPane.showInputDialog(
         "Enter a single numeric score, e.g., 99.9: ");
         userScore =Double.parseDouble(scoreString);

           
         //If a user enters a value of -1, program exits the loop with a break statement 
         if (userScore == -1) {
         userScore = 0;
         break;
         }
         //If UserScore is -50 or greater than 100, then total and average are not calculated
         if (userScore < 100 && userScore > 0) {
			count++; 
         
         //Calculates the total of userScore values, not counting -1 as a value
         total = total + userScore;
         
         //Selection structure to display a grade based on UserScore value and a counts the grades 
			if (userScore <= 100.0 && userScore >= 90.0) {
			calculateGrade = 'A';
			countOfA ++;
			}
			else if (userScore <= 89.0 && userScore >= 80.0) {
			calculateGrade = 'B';
			countOfB ++;
			}
			else if (userScore <= 79.0 && userScore >= 70.0) {
			calculateGrade = 'C';
			countOfC ++;
			}
			else if (userScore <= 69.0 && userScore >= 60.0) {
			calculateGrade = 'D';
			countOfD ++;
			}
			else if (userScore <= 59.0 && userScore >= 0) {
			calculateGrade = 'F';
			countOfF ++;
			}
		   if (calculateGrade != ' ') {
         String output = "The score " + userScore + " is a " + calculateGrade;
         JOptionPane.showMessageDialog(null, output);
         }	
        }
         else {
         String output = "Error! Number is out of range, please try again.";
         JOptionPane.showMessageDialog(null, output);                  
         }
        }
         //Calculates the average class score and prevents a code from getting NaN error 
            if (count == 0) {
            average = 0;
            }
            else {
            average = total / count;
            }
      
           
      averageGrade = GradeBookGUI.calculateGrade(average);
      
		String outputA = "Total number of A's: " + countOfA;
      JOptionPane.showMessageDialog(null, outputA);
      
		String outputB= "Total number of B's: " + countOfB;
      JOptionPane.showMessageDialog(null, outputB);
      
		String outputC = "Total number of C's: " + countOfC;
      JOptionPane.showMessageDialog(null, outputC);
      
		String outputD = "Total number of D's: " + countOfD;
      JOptionPane.showMessageDialog(null, outputD);
      
		String outputF = "Total number of F's: " + countOfF;
      JOptionPane.showMessageDialog(null, outputF);
			
   	String OutputTotal = String.format("\nTotal number of scores input: %.2f\n", total);
      JOptionPane.showMessageDialog(null, OutputTotal); 
      
      String OutputAverage = String.format("Average class score: %.2f\n", average);
      JOptionPane.showMessageDialog(null, OutputAverage); 
      
      String outputAverageGrade = "Average class grade: " + averageGrade;
      JOptionPane.showMessageDialog(null, outputAverageGrade); 
     }
                  
      //This method takes a score as a parameter and returns a grade 
      public static char calculateGrade(double score) {
            char grade = ' ';
		
    			if (score <= 100.0 && score >= 90.0) {
               grade = 'A';
   			}		
   			else if (score <= 89.0 && score >= 80.0) {
   				grade = 'B';
   			}
   			else if (score <= 79.0 && score >= 70.0) {  
   				grade = 'C';
   			}
   			else if (score <= 69.0 && score >= 60.0) {
   				grade = 'D';
   			}
   			else if (score <= 59.0 && score >= 0) {
   				grade = 'F';
   			}
            return grade;
      }
}
	

