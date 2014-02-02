//Student (String name, double gpa, int age)
import java.util.Scanner;

public class Student {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
         System.out.print("Please enter a Name for a student: ");
         String name = input.next();
         
         System.out.print("Please enter GPA for a student: ");  
         double gpa = input.nextDouble();
         
         System.out.print("Please enter an age for a student: ");  
         int age = input.nextInt();
      
   //creating a Student object
   Student myStudent = new Student(name, gpa, age); //type is = Book, object var name is = myBook, using constructor I passed initial values
      System.out.print(myStudent.toString());//called a method toString on the instance of myBook
   }

   private String name;
   private double gpa;
   private int age;
  
      Student() {//method
      }
      
      Student(String newName, double newGpa, int newAge) {
          setName(newName);
          setGpa(newGpa);
          setAge(newAge);   
      }   
   //Name Method
   //min: 2 characters
   //max: 10 characters
   String getName() {//method
      return name;
   }
   void setName(String newName) {//method
   
      if (newName.length() < 3) {
      System.out.println("\nName can not be less than 3 characters.");
      }
      else if (newName.length() > 50) {
      System.out.println("\nName can not be greater than 10 characters.");
      }
      else {
      name = newName;
         }
   }
   
   //GPA Method
   //min: 1 score
   //max: 100 score
      double getGpa() {
      return gpa;
   }
   
   void setGpa(double newGpa) {
      if (newGpa < 1){
      System.out.println("\nThe GPA score can not be less than 1.");
      }
         else if (newGpa > 100){
         System.out.println("\nThe GPA score can not be greater than 100.");
         }
         else {
         gpa = newGpa;
         }
   }

   //Age Method
   //min: 5 age
   //max: 70 age
   int getAge(){
      return age;
   }
   
   void setAge(int newAge){
      if (newAge < 5){
      System.out.println("\nAge can not be less than 5 years old.");
      }
         else if (newAge > 70){
         System.out.println("\nAge can not be greater than 70 years old.");
         }
         else {
         age = newAge;
         }
   }
   
   //toString Method
   public String toString() {
   return "\nAge of the student is " + age + "\nName of the student is " + name + "\nThe GPA of the student is " + gpa;
   }

}