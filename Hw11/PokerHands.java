//Ariana Hewitt
//CSE 2
//Nov. 29, 2014
//HW 11
//Write a program that prompts the user to enter a five card poker hand, 
//prints out the hand, and then prints out the rank of the hand, 
//e.g. “Straight.” Below is a sample run of the expected output.
import java.util.Scanner;
public class PokerHands{
     public static void main(String[] args) {  
          int[] deck = new int[52]; 
          String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};  
          String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
// Initialize the cards 
          for (int i = 0; i < deck.length; i++)
               deck[i] = i; 
// Shuffle the cards
          for (int i = 0; i < deck.length; i++) {  
// Generate an index randomly  
               int index = (int)(Math.random() * deck.length);  
          int temp = deck[i];  
          deck[i] = deck[index]; 
          deck[index] = temp;  
     } 
// Display the first four cards 
     for (int i = 0; i < 4; i++) { 
          String suit = suits[deck[i] / 13];  
          String rank = ranks[deck[i] % 13]; 
          System.out.println("Card number " + deck[i] + ": "  
                                  + rank + " of " + suit); 
     }
}
//create array deck array of strings array of strings initialize deck shuffle deck suit of a card rank of a card Card number
     public static void showOneHand(int hand[]){  
          String suit[]={"Clubs: ", "Diamonds: ", "Hearts:   ",              "Spades:   "};  
          String face[]={        "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",    "4 ","3 ","2 "};  
          String out="";  
          for(int s=0;s<4;s++){    
               out+=suit[s];    
               for(int rank=0;rank<13;rank++)      
                    for(int card=0;card<5;card++)       
                    if(hand[card]/13==s && hand[card]%13==rank)        
                    out+=face[rank];    out+='\n';  
          }  
          System.out.println(out);   
     } 
}