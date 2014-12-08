//Ariana Hewitt
//Lab 7
//The objective of this lab is to give you 
//practice with writing while, for, and do-while loops. 
import java.util.Scanner;
public class LoopTheLoop{ 
     public static void main(String arg[]){ 
          Scanner myScanner;
          myScanner = new Scanner (System.in);
          int nStars=10; 
          //first diamond
          
          //top of diamond
          for(int i= 0; i< 10; i+=1){
               for (int j=0; j<9-i;j++)//spaces
                    System.out.print(" ");
               System.out.print(" /");//left border
              for (int j=0; j<i; j++)//rows-spaces
                    System.out.print("**");
              System.out.print("\\ ");//right border
               
               System.out.print("\n");//make it vertical
          }//end of for loop
          
          //bottom of diamond
          for(int i= 9; i> 0; i-=1){
               for (int j=0; j<9-i;j++)
                    System.out.print(" ");
               System.out.print(" \\");//left border
              for (int j=0; j<i; j++)
                    System.out.print("**");
              System.out.print("/ ");//right border
               
               System.out.print("\n");//make it vertical
          }//end of for loop
          
          
//Second diamond
          //top of diamond
          int i=0;
          while(i< 10){
               int j=0;
               while (j<9-i){
               System.out.print(" ");
               j++;
               }
               System.out.print(" /");
               int k =0;
               while (k<i){
               System.out.print("##");
               k++;
               }
                System.out.print("\\ ");//right border
               i+=1;
               System.out.print("\n");//make it vertical
          }//end of while loop
          
//bottom of diamond
          while(i>0){
               int j=0;
               while (j<9-i){
               System.out.print(" ");
               j++;
               }
               System.out.print(" \\");
               int k =0;
               while (k<i){
               System.out.print("##");
               k++;
               }
                System.out.print("/ ");//right border
               i-=1;
               System.out.print("\n");//make it vertical
          }//end of while loop
                    

              
        
     }//end of method
}//end of class
