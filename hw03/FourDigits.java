//Ariana Hewitt
//Program 3
//HW 3
//CSE 002
//September 16, 2014
//Write a program that prompts the user to enter an double and then 
//prints out the first four digits to the right of the decimal point
import java.util.Scanner;

public class FourDigits {
     public static void main (String[] args) {
          Scanner input= new Scanner(System.in);
          System.out.println("Enter a double and I display"+
                             " the four digits to the right"+
                             " of the decimal point:");
          double num= input.nextDouble();
          double multiply = 10000*num; //multiply by 10000      
          int castNum= (int)(multiply); //cast double to integer
          int firstDig= castNum/10000; //separates the first digit from the last digits
          int castNums = castNum % 10000; //cuts the last four digits off of the number

          System.out.println("The four digits are: " +castNums);
     }
     
}//end of class