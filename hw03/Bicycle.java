//Ariana Hewitt
//Program 1
//HW 3
//CSE 002
//September 16, 2014
//Write a program that prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer and the 
//second giving the number of seconds during which the counts occurred, 
//and then an then prints out the distance traveled and the average miles per hour.


import java.util.Scanner;

public class Bicycle {
     public static void main (String[] args) {
          Scanner input= new Scanner(System.in);//used so that user can input digits
          
          //prompt the user to enter two integers
          System.out.println("Enter the number of seconds: ");
          int seconds = input.nextInt(); //where the user inputs digits
          System.out.println("Enter the number counts: ");// times wheels spins
          int counts = input.nextInt();
          
//our intermediate variables and output data. Document!
    //all necessary for calculations of number of rotations
    double wheelDiameter=27.0, 
         PI= 3.14159, 
         feetPerMile=5280,
         inchesPerFoot=12,
         secondsPerMinute=60;

//Run the calculations; store the values.
    double distanceTrip = counts*wheelDiameter*PI;// gives distance in inches
    //for each count, a rotation of the wheel travels 
    //the diameter in inches times PI
    distanceTrip/= inchesPerFoot*feetPerMile; //distance in miles
    double time = seconds/secondsPerMinute; // time of trip in minutes
    double milesPerHour = distanceTrip/(time/60); //MPH calculation
    
          //Display Results
          System.out.printf("The distance was %4.2f", +distanceTrip); 
          System.out.printf(" miles and took " +time+ " minutes.");
          System.out.printf(" The average mph was %4.2f\n", +milesPerHour);
          
          
     }//end of method
}//end of class