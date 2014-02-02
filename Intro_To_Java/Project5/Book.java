//Book (String title, double price, int numberOfPages)
import java.util.Scanner;

public class Book {
   public static void main(String[] args){   
      Scanner input = new Scanner(System.in);
   
         System.out.print("Please enter a title of a book: ");
         String title = input.next();
         
         System.out.print("Please enter a price for the book: ");  
         double price = input.nextDouble();
         
         System.out.print("Please enter a number of pages in the book: ");  
         int numberOfPages = input.nextInt();
      
   //creating a Book object
   Book myBook = new Book(title, price, numberOfPages); //type is = Book, object var name is = myBook, using constructor I passed initial values
      System.out.print(myBook.toString());//called a method toString on the instance of myBook
   }
   
   private String title;
   private double price;
   private int numberOfPages;
   
      Book() {//method
      }
      
      Book(String newTitle, double newPrice, int newNumberOfPages) {//method   
            setTitle(newTitle);
            setPrice(newPrice);
            setNumberOfPages(newNumberOfPages);
      }
   //Title Method
   //min: 3 characters
   //max: 50 characters
   String getTitle() {//method
      return title;
   }   
   void setTitle(String newTitle) {//method
      
      if (newTitle.length() < 3) {
      System.out.println("\nTitle can not be less than 3 characters.");
      }
      else if (newTitle.length() > 50) {
      System.out.println("\nTitle can not be greater than 50 characters.");
      }
      else {
      title = newTitle;
         }
   }
   
   //Price Method
   //min: $0.00
   //max: $100.00
   double getPrice() {//method
      return price;
   }
   
   void setPrice(double newPrice) {//method   
      if (newPrice < 0) {
      System.out.println("\nPrice can not be less than a zero.");
      }
      else if (newPrice > 100) {
      System.out.println("\nPrice can not be greater than 100.");
      }
      else {
      price = newPrice;
         }
   }

   //NumberOfPages Method
   //min: 1 page
   //max: 1000 pages
   int getNumberOfPages() {//method
      return numberOfPages;
   }
   void setNumberOfPages(int newNumberOfPages) {//method
   
      if (newNumberOfPages < 1){
      System.out.println("\nBook can not be less than 1 page.");
      }
      else if (newNumberOfPages > 1000) {
      System.out.println("\nBook can not be greater than 1000 pages.");
      }
      else {
      numberOfPages = newNumberOfPages;
         }
   }
   
   //toString Method
   public String toString() {
      return "\nTitle of the book is " + title + "\nPrice of the book is " + price + "\nNumber of pages in the book is " + numberOfPages;
   }
   
}

//Pilates ( int numberOfStudents, String name, double difficultyLevel)