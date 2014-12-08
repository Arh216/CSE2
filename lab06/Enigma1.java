/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double percent=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+percent+"%");
   //print out the proportion remaining for select percentages
   //double x = Scanner.nextDouble();
   double proportion = (100 - percent)/100;
   System.out.println("The proportion remaining is "+proportion);
//   if(1-percent/100==0.93){  //when the user enters 7
//      System.out.println("The proportion remaining is "+0.93);
//   }
//   else if(1-percent/100==0.59){//when the user enters 41
//      System.out.println("The proportion remaining is "+0.59);
//   }
//   else if(1-percent/100==0.86){//when the user enters 14
//      System.out.println("The proportion remaining is "+0.86);
//   }
//   else if(1-percent/100==0.67){//when the user enters 33
//      System.out.println("The proportion remaining is "+0.67);
//   }
//   else if(1-percent/100==0.4){//when the user enters 60
//      System.out.println("The proportion remaining is "+0.40);
//   }
//   else{
//        return;
//   }
  }
  
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * Does not print out amount remaining
 * Percent is not defined
 * I took at the variable x
 * I took out the if statements
 * Made it just one simple calculation.
 * Instead of subtracting 1, subtract the percent from 100 to get the proportion remaining
 * 
 * 
 */
