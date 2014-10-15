//Ariana Hewitt
//Homework 6
//Program 2

import java.util.Scanner;

public class Root {
     public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          
          //Prompt the user to enter a double
          System.out.println("Enter a double: ");
          double x =input.nextDouble();
          
          //Compute square root
          double sqrt= x/2;
          sqrt= (sqrt*sqrt+x)/(2*sqrt);
          sqrt= (sqrt*sqrt+x)/(2*sqrt);
          sqrt= (sqrt*sqrt+x)/(2*sqrt);
          
          //Compute squared value
          double sqr= sqrt*sqrt;
          
          //Display Results
          System.out.println("The square root is roughly: " +sqrt);
          System.out.println("The square of " +sqrt+ " is " +sqr);
         
          
          
     }
}