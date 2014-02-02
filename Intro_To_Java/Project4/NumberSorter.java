/*************************************************
* Project #4: Array and Sorting Programs
* File: NumberSorter.java
* Section 14493
* Programmer: Sevil Turner
* Date: Nov 3 2013
* Description: This program is meant display how 
* many arrays in the numbers.text file, sort all 
* those numbers from low to high and then display 
* the average of those numbers into the dataout.txt
**************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

   public class NumberSorter {
      public static void main(String[] args) throws FileNotFoundException {
         File numbers = new File ("numbers.txt");//reads the numbers from the numbers.txt file
         Scanner input = new Scanner(numbers);
         
         PrintWriter output = new PrintWriter("dataout.txt");//prints out the data in the dataout.txt file
         
         // Read all numbers and mark corresponding element covered 
         int numberOfSlot = input.nextInt();
         int[] numberArray = new int [numberOfSlot];
         
         for (int count = 0; count < numberOfSlot; count++) {   
         int data = input.nextInt();     
         numberArray[count] = data;
         }        
         sort(numberArray);//calling the Sort method
         
         double newAverage = Average(numberArray);//calling the Average method         
         output.println("The number of slots in an Array is " + numberOfSlot);
         
         printArray(numberArray,output);//calling the printArray method         
         output.println("The calculated average of the numbers in the array is " + newAverage);            
         output.close();    
         }
      
      
      //Method named sort, takes numberArray as a parameter and sorts the array from low to high 
      //Copied this whole Method from a book [Listing 6.8(SelectionSort.java) p.250]  
      public static void sort(int[] numberArray) {
      
             for (int count = 0; count < numberArray.length - 1; count++) {
               // Find the minimum in the list[count..numberArray.length-1]
               int currentMin = numberArray[count];
               int currentMinIndex = count;
         
             for (int j = count + 1; j < numberArray.length; j++) {
               if (currentMin > numberArray[j]) {
                 currentMin = numberArray[j];
                 currentMinIndex = j;
               }
                }   
               // Swap list[i] with list[currentMinIndex] if necessary;
               if (currentMinIndex != count) {
                 numberArray[currentMinIndex] = numberArray[count];
                 numberArray[count] = currentMin;
                  }
            } 
      }
      
      //Method named Average, computes the average of the numbers in the array (not including the count) 
      public static double Average(int[] numberArray) {
            int count = numberArray.length;
            double sum = 0;
               
             for (int i = 0; i < numberArray.length; i++) {
               int data = numberArray[i];
               sum = sum + data;
             }          
            double newAverage = sum / count;//formula for getting an average of the numbers
            return newAverage;
      } 
       
      //Open a file named dataout.txt and write sorted list of number in the Array (one per line) 
      public static void printArray (int[] numberArray, PrintWriter output) {                
            
            for (int i = 0; i <numberArray.length; i++) {
            int data = numberArray[i];
            output.println(data); 
            }
      }
}