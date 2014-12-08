//Ariana Hewitt
//CSE 002
//Lab 4
//Dec. 7, 2014
//This lab session will demonstrate how you can use selection statements
import java.util.Scanner;
public class BigMacAgain{
     //main method required for every Java program
     public static void main (String [] args) {
          Scanner myScanner;
          myScanner= new Scanner ( System.in );//construct the instance of scanner
          //by typing the above command, which tells Scanner that I am creating an instance
          //that will take input from STDIN
          if (!myScanner.hasNextInt()){//checking to make sure number entered is an integer
          System.out.println("Input is not an integer");
          return;
          }
          System.out.println("Enter the number of Big Macs(an integer > 0): ");
          int nBigMacs = myScanner.nextInt();
          
//this statement shows the acceptance of the user input
          //proportion
          double cost$;
          int dollars,   //whole dollar amount of cost 
               dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
          cost$ = nBigMacs*2.22;
//get the whole amount, dropping decimal fraction
          dollars=(int)cost$;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
          dimes=(int)(cost$*10)%10;
          pennies=(int)(cost$*100)%10;
          
          System.out.println("You ordered "+nBigMacs+" for a cost of"+
                            nBigMacs+"x$2.22 = $"+dollars+"."+dimes+pennies);

          System.out.println("Do you want to order fries?(Y/y/N/n)");
          String answer= myScanner.next();
          if (answer.equals("Y") || answer.equals("y")){
               System.out.println("You ordered fries for a cost of $2.15");
               double total= cost$+2.15;
               int total$=(int)total;
               dimes=(int)(total*10)%10;
               pennies=(int)(total*100)%10;
               System.out.println("The total cost of the meal is: $"+total$+"."+dimes+pennies);
          }
          else if(answer.equals("N") || answer.equals("n")){
              System.out.println("The total cost of the meal is: $"+dollars+"."+dimes+pennies);
          }  
          else{
               return;
          }
          


          
     
     }//end main method
}//end class