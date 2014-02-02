/**************************************************
* Project #4: Array and Sorting Programs
* File: MultiDimensionalMatrix.java
* Section 14493
* Programmer: Sevil Turner
* Date: Nov 3 2013
* Description: This program is meant to sum all the
* numbers in a column using multidimensional array.
***************************************************/
import java.util.Scanner;

public class MultiDimensionalMatrix {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a 3-by-4 matrix row by row: \n");
      
      double[][] m = new double [3][4];
      int columnIndex = 0;
      
      for (int rowCount = 0; rowCount < 3; rowCount++){//loop for rowCount
         for (int columnCount = 0; columnCount < 4; columnCount++){//loop for columnCount
         
      double userInput = input.nextDouble();   
      m[rowCount][columnCount] = userInput;//assigning data from userInput into rowCount and ColumnCount
         }
      }
      sumColumn(m, columnIndex);//calling the SumColumn method
   
      System.out.println("Sum of the elements at column 0 is " + sumColumn(m, 0));
      System.out.println("Sum of the elements at column 1 is " + sumColumn(m, 1));
      System.out.println("Sum of the elements at column 2 is " + sumColumn(m, 2));
      System.out.println("Sum of the elements at column 3 is " + sumColumn(m, 3));            
      }
   
   //SumColumn Method displays the sum of each column
   public static double sumColumn(double[][] m, int columnIndex){
   
      double sum = 0;
      for (int rowCount = 0; rowCount < 3; rowCount++){
      sum += m[rowCount][columnIndex];//formula for getting a sum
      }
               
      return(sum);
      }
}