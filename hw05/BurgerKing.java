//Ariana Hewitt
//September 30, 2014
//Homework 5
//Program 1
//Write a program that asks user to enter a choice of burger, soda or fries. 
//Then asks for details
import java.util.Scanner;
public class BurgerKing {
     public static void main(String[] args) {
     
     Scanner myScanner = new Scanner(System.in);//Create scanner
     //Prompt user to enter choice
     System.out.println("Enter a letter to indicate a choice of " 
                             + "Burger (B or b), "
                             + "Soda (S or s), "
                             + "Fries (F or f)");

     String choice = myScanner.nextLine();
     
     if (choice.length()>1) {
          System.out.println("Single character expected");
     }
     if(!choice.equals("B") || !choice.equals("b") || !choice.equals("S") || !choice.equals("s") || !choice.equals("F") || !choice.equals("f")) {
          System.out.println("You did not enter any of B, b, S, s, F, or f");
     }
     
//Ask what user wants on food
     if (choice.equals("B") || choice.equals("b")){
          System.out.println("Enter A for all of the toppings. "
                                  +"Enter C for cheese. "
                                  +"Enter N for no toppings");
          String toppings = myScanner.nextLine();
          if (toppings.equals("a") || toppings.equals("A")){
              System.out.println("You ordered a burger with all of the toppings");
          }
              else if (toppings.equals("c") || toppings.equals("C")){
                    System.out.println("You ordered a burger with cheese");
              }
              else if (toppings.equals("N") || toppings.equals("n")){
                    System.out.println("You ordered a burger with none of the toppings");
              }
              else {
                   System.out.println("Not an option");
              }
          }
     if (choice.equals("S") || choice.equals("s")){
          System.out.println("Enter C for Coke. "
                                  +"Enter S for Sprite. "
                                  +"Enter M for Mountain Dew. "
                                  +"Enter P for Pepsi");
          String soda = myScanner.nextLine();
          if (soda.equals("C") || soda.equals("c")){
                    System.out.println("You ordered a Coke");
          }
          else if (soda.equals("S") || soda.equals("s")){
               System.out.println("You ordered a Sprite");
          }
          else if (soda.equals("M") || soda.equals("m")){
               System.out.println("You ordered a Mountain Dew");
          }
          else if (soda.equals("P") || soda.equals("p")){
               System.out.println("You ordered a Pepsi");
          }
          else {
               System.out.println("Not an option");
     }
                  
     if (choice.equals("F") || choice.equals("f")){ //Fries
           System.out.println("Enter S for small fries. "
                                  +"Enter L for large fries.");
           String size = myScanner.nextLine();
           if (size.equals("S") || size.equals("s")){
                System.out.println("You ordered small fries");
           }
           if (size.equals("L") || size.equals("l")){ //large
                System.out.println("You ordered large fries");
           }//end of fries size
           else {
                System.out.println("Not an option");
           }
     }//End of if statements
     }
     }
}//end of class