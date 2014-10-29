//Ariana Hewitt
//Hw8
//October 28, 2014
//overloading methods
import java.util.Scanner;  

public class HW8{  
     
     public static void main(String [] arg){  
          Scanner scan=new Scanner(System.in);  
          char input;  
          System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
          input=getInput(scan,"Cc");
          System.out.println("You entered '"+input+"'");
          System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
          input=getInput(scan,"yYnN",5); //give up after 5 attempts
          if(input!=' '){
               System.out.println("You entered '"+input+"'");
          }
          input=getInput(scan,"Choose a digit.","0123456789");
          System.out.println("You entered '"+input+"'");
     }  

     
     public static char getInput(Scanner scan) {// just takes scanner. only calls a char
          while (!scan.hasNextChar()) {
               System.out.println("You must enter an int");
               scan.next();
          }
          return scan.nextChar();
     }//end of method
     
     public static int getInt(Scanner scan, int bound, boolean bool) {//
          while (!scan.hasNextInt()) {//makes sure it is an int until int is entered
               System.out.println("You must enter an int");
               scan.next();
          }
          int val = scan.nextInt();//int stored here
          if (bool) {
               if (val < bound) {
                    System.out.println("You did not enter an int greater than or equal to " + bound);
                    return getInt(scan, bound, bool);//try again
               }
               else {
                    return val;//back to main method and return the value entered
               }
          }
          else {
               if (val > bound) {
                    System.out.println("You did not enter an int less than or equal to " + bound);
                    return getInt(scan, bound, bool);//try again
               }
               else {
                    return val;//back to main method and return the value entered
               }
          }
     }//end of method
     
     public static int getInt(Scanner scan, int bound1, int bound2) {
          while (!scan.hasNextInt()) {
               System.out.println("You must enter an int");
               scan.next();
          }
          int val = scan.nextInt();
          if (bound1 < bound2) {
               if (val >= bound1 && val <= bound2) {
                    return val;//back to main method and return the value entered
               }
               else {
                    System.out.println("You did not enter an int in [" + bound1 + ", " + bound2 + "]");
                    return getInt(scan, bound1, bound2);//try again
               }
          }
          else {
               if (val <= bound1 && val >= bound2) {
                    return val;//back to main method and return value entered
               }
               else {
                    System.out.println("You did not enter an int in [" + bound2 + ", " + bound1 + "]");
                    return getInt(scan, bound1, bound2);//try again
               }
          }
     }//end of method
}  //end of class