//Ariana Hewitt
//September 23, 2014
//Homework 4
//Program 3
//Write a program that has the user enter six digits 
//to determine semester and year of course
import java.util.Scanner;
public class CourseNumber {
     public static void main(String[] args) {
     Scanner myScanner;
     

     //Prompt user to enter six integers of course
     System.out.println("Enter the six digit number of a course");
     myScanner = new Scanner(System.in);//Create scanner
     if (!myScanner.hasNextInt()){//checking to make sure number entered is an integer
          System.out.println("Input is not an integer");
          return;
     }
     int course;
     course= myScanner.nextInt();
     int courseSemester =course%100;
     int courseYear= course - courseSemester;
     
//Print Course Year
     //Spring
     if(courseSemester ==10){
          System.out.println("The course was offered in the spring of " +courseYear);
     }
     //Summer 1
     else if(courseSemester ==20){
          System.out.println("The course was offered in the first summer session of " +courseYear);
     }
     //Summer 2
     else if(courseSemester ==30){
          System.out.println("The course was offered in the second summer session of " +courseYear);
     }
     //Fall
      else if(courseSemester ==40){
          System.out.println("The course was offered in the fall of " +courseYear);
     }
      else{
          System.out.println("Not a legitimate semester");
      }
}//end of class
}