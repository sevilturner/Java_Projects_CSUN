/*
* Project #1: Palindromic Prime Exercises
* File: Exercise1.java
* Programmer: Sevil Turner
* Date: Jan 31 2014
* Description: n/a
*
*/

public class PalindromicPrime {
  public static void main(String[] args) {
   
  int palindromePrimes = 0;
  int numbersPerLine = 10;
  
     for (int count = 2; palindromePrimes <= 100; count ++){

      if (isPrime(count)) {
   
         if (isPalindrome(count)){
         System.out.print(" " + count);
         palindromePrimes ++;
         
            if (palindromePrimes % numbersPerLine == 0){
            System.out.println();
            }
         }
      }
    }
  
  }
  
  public static boolean isPrime(int number){
   int divisorNumber = 2;
      while (divisorNumber <= number / 2){
         if (number % divisorNumber == 0){
         return false;
         }
         divisorNumber ++;
      }
   return true;
  }

  public static boolean isPalindrome(int number){
   int palindromePrimes = number;
   int reversePalindrome = 0;
   
   int count = 0;
   while (palindromePrimes != 0) {
      int remainder = palindromePrimes % 10;
      reversePalindrome = reversePalindrome * 10 + remainder;
      palindromePrimes = palindromePrimes / 10;

      }
      
      if (number == reversePalindrome) {
         return true;
         }
  return false;
  }

}
