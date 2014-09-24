//Ariana Hewitt
//September 23, 2014
//Homework 4
//Program 2
//Write a program that prompts the user to enter an integer 
//for the month and then displays the number of days in the month.
import java.util.Scanner;
public class Month {
     public static void main(String[] args) {
     Scanner myScanner;
     

     //Prompt user to enter an integer for a month
     System.out.println("Enter an integer for a month. (ie January is 1)");
     myScanner = new Scanner(System.in);//Create scanner
     if (!myScanner.hasNextInt()){//checking to make sure number entered is an integer
          System.out.println("Input is not an integer");
          return;
     }
     int month;
     month= myScanner.nextInt();
     
//Print number of days
     switch (month) {
          case 1: //January
          System.out.println("The month has 31 days");
          break;
          case 2: //February
          System.out.println("Enter an int giving the year: ");
          //leap year calculations
          int year = myScanner.nextInt();
          if (year%4!=0 && year%100!=0){ //leap years are divisible by 4
               //but not divisible by 100
               System.out.println("The month has 29 days");
          }
          else
               System.out.println("The month has 28 days");
      
          break;
          case 3: //March
          System.out.println("The month has 31 days");
          break;
          case 4: //April
          System.out.println("The month has 30 days");
          break;
          case 5: //May
          System.out.println("The month has 31 days");
          break;
          case 6: //June
          System.out.println("The month has 30 days");
          break;
          case 7: //July
          System.out.println("The month has 31 days");
          break;
          case 8: //August
          System.out.println("The month has 31 days");
          break;
          case 9: //September
          System.out.println("The month has 30 days");
          break;
          case 10: //October
          System.out.println("The month has 31 days");
          break;
          case 11: //November
          System.out.println("The month has 30 days");
          break;
          case 12: //December
          System.out.println("The month has 31 days");
          break;
          default:
               System.out.println("Not a month");
     }//End of Switch statements
    
     }
}//end of class