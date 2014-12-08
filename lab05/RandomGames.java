//Ariana Hewitt
//Lab 5
//Write a program that uses Math.random() 
//and uses switch statements

import java.util.Scanner;
import java.util.Random;

public class RandomGames {
     public static void main(String[] args){
          //Random rand=new Random(System.currentTimeMillis());
          Scanner myScanner;
          myScanner= new Scanner ( System.in );
          //Generate a random number to be guessed
          System.out.println("Enter 1 Roulette, 2 for Craps, or 3 for Pick a card");
          int game= myScanner.nextInt();
    
//Print Game
     switch (game) {
          case 1: //Roulette
               int num = (int)(Math.random()*37);
          System.out.println("R: "+num);
          break;
          case 2: //Craps
          System.out.println("Craps option is yet to be implemented");
          break;
          case 3: //Pick a card
          System.out.println("Picking a card not implemented yet");
          break;
          default:
               System.out.println("Not an option");
     }//End of Switch statements

          
          
     }//end of main method
}//end of class