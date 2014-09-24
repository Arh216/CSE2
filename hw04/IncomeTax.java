//Ariana Hewitt
//HW 4
//Program 1
//September 23, 2014
//Writing a program to calculate income taxes
import java.util.Scanner;
public class IncomeTax {
  //main method required for every Java program
  public static void main(String[]args) { 
   Scanner myScanner;
   myScanner= new Scanner( System.in );// create scanner

// income
    System.out.println("Enter an int giving the number of thousands: ");
     myScanner = new Scanner(System.in);//Create scanner
     if (!myScanner.hasNextInt()){//checking to make sure number entered is an integer
          System.out.println("Input is not an integer");
          return;
     }
     int Salary;
     Salary= myScanner.nextInt();

    //Income Tax
     //5% <20
     if(Salary <20){
          double tax= (Salary*0.05*1000);
          System.out.println("The tax rate of $" +Salary+ 
                             ",000 is 5.0%, and the tax is $"
                            +tax);
     }
     //7.0%
     else if(Salary >=20 
                  && Salary<40){
           double tax= (Salary*0.07*1000);
          System.out.println("The tax rate of $" +Salary+ 
                             ",000 is 7.0%, and the tax is $"
                            +tax);
     }
     //12.0%
     else if(Salary >=40 
                  && Salary<78){
           double tax= (Salary*0.12*1000);
          System.out.println("The tax rate of $" +Salary+ 
                             ",000 is 12.0%, and the tax is $"
                            +tax);
     }
     //14.0%
      else if(Salary >=78 ){
            double tax= (Salary*0.14*1000);
          System.out.println("The tax rate of $" +Salary+ 
                             ",000 is 14.0%, and the tax is $"
                            +tax);
     }
      else{
          System.out.println("Number not recognized");
      }
       

  }//end of main method
}//end of class