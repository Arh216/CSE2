//Ariana Hewitt
//October 21, 2014
//Homework 7
//The objective of this homework is to give you 
//practice with writing while, for, and do-while loops. 

import java.util.Scanner;

public class NumberStack{ 
     public static void main(String arg[]){ 
          
           Scanner myScanner;
           myScanner=new Scanner(System.in);
          
          //Prompt the user to enter an integer
          System.out.println("Enter an integer between 1-9: ");
          int numb =myScanner.nextInt();
          
          if (!myScanner.hasNextInt()){//checking to make sure number is between 1 and 9
          System.out.println("Input is not an integer");
          return;
          }
          
          //for loop
          // Below for loop loops from 1 to the user given input means its going to iterate x times.  
          for(int i= 1; i<= numb; i++){ 
               for (int j=0; j<numb-i;j++)//spaces
                    System.out.print(" ");
               
              for (int j=1; j<=i; j++)//rows-spaces
                    System.out.print(i+" ");
             
               
               System.out.print("\n");//make it vertical
          }//end of for loop
          
        
          
          
//While loop
          
          int i=1;
          while(i<= numb){
               int j=0;
               while (j<numb-i){
               System.out.print(" ");
               j++;
               }
              //System.out.print(" /");
               int k =1;
               while (k<=i){
               System.out.print(i+" ");
               k++;
               }
               i+=1;
               System.out.print("\n");//make it vertical
          }//end of while loop
          
//do while
//          int j= 0;
//          do{//spaces do while loop
//               System.out.print(" ");
//               j++;
//               i+=1;
//               System.out.print(" /");//left border
//          }//end of do while
//          while (i<10 && j<9-i);//spaces
//          do{//do while for $$
//               System.out.print("$$");
//               j++;
//              System.out.print("\\ ");//right border
//              System.out.print("\n");//make it vertical
//          }//end of do while 
//              while (j<i);
//              
        
     }//end of method
}//end of class
