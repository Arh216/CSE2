//Ariana Hewitt
//September 23, 2014
//Homework 4
//Program 4
//Write a program that has the user enter the seconds that have passed 
//and then displays time in conventional form
import java.util.Scanner;
public class TimePadding {
     public static void main(String[] args) {
     Scanner myScanner;
     

     //Prompt user to enter seconds
     System.out.println("Enter the time in seconds");
     myScanner = new Scanner(System.in);//Create scanner
     if (!myScanner.hasNextInt()){//checking to make sure number entered is an integer
          System.out.println("Input is not an integer");
          return;
     }
     int seconds, hour, minutes, secs;
     seconds= myScanner.nextInt();//seconds entered
     hour= seconds/3600;
     seconds = seconds - (hour*3600);
     minutes = seconds/60;
     secs= seconds-minutes*60;
     
//Print format
     //minutes and seconds
     if(minutes<10
             && secs<10){
          System.out.println("The time is "+hour+":0"+minutes+":0"+secs);
     }
     else if (minutes <10
                   && secs>=10){
          System.out.println("The time is "+hour+":0"+minutes+":"+secs);
     }
     else if (minutes >=10
                   && secs<10){
          System.out.println("The time is "+hour+":"+minutes+":0"+secs);
     }
     else{
     System.out.println("The time is "+hour+":"+minutes+":"+secs);
     }

}//end of class
}