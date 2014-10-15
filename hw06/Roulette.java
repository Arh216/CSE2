//Ariana Hewitt
//HW 6
//October 14, 2014
//Write a program that uses Math.random() (which returns a random  
//number between 0.0 and 1.0, including 0.0 but not 1.0) to simulate 100 
//visits by my  friend to the casino. We will build the program, which 
//should be main() in the class Roulette, incrementally

import java.util.Scanner;
import java.util.Random;

public class Roulette {
     public static void main(String[] args){
          Random rand=new Random(System.currentTimeMillis());
          Scanner myScanner;
          //Generate a random number to be guessed
          int number;
          int counter =100;
          
          myScanner = new Scanner(System.in);//create scanner
          System.out.println("Input a number between 1 and 38");
          
          if (!myScanner.hasNextInt()){//checking to make sure number is between 1 and 38
          System.out.println("Input is not an integer");
          return;
          }//end of if statement
          int guess= myScanner.nextInt();
          int win= 0;

          while (counter>0) {
               number=(int)(38*rand.nextDouble())+1; 
               if (guess == number) {
                    win++;
               }
               counter--;
          
          }//end of loop
          double winnings= win*36; 
          System.out.println("You win: $" +winnings);
          
          
     }//end of main method
}//end of class