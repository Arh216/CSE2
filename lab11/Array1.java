//Ariana Hewitt
//Lab 11
//Arrays

import java.util.Scanner;  
public class Array1{  
     public static void main(String [] arg){  
          int[] myList = new int[10];// array can hold ten values
          //Enter 10 ints
          Scanner myScanner = new Scanner (System.in);
          System.out.print("Enter " + myList.length + " values: "); 
          for (int i = 0; i < myList.length; i++){          
               myList[i] = myScanner.nextInt();
          }// 10 ints will be entered seperately, hit enter after each int entered
          //Finding largest element
          int max = myList[0]; 
          for (int i = 1; i < myList.length; i++) { 
               if (myList[i] > max){ 
                    max = myList[i];
               }
          }
          System.out.println("The largest entry is: " +max); 
          //Finding smallest element
          int small = myList[0]; 
          for (int i = 1; i < myList.length; i++) { 
               if (myList[i] < small){ 
                    small = myList[i];
               }
          }
          System.out.println("The smallest entry is: " +small); 
          //Sum all elements of array
          int total = 0; 
          for (int i = 0; i < myList.length; i++) {          
               total += myList[i];        
          }
          System.out.println("The sum of the elements in the array is: " +total);
         //copy array
          int[] myList2 = new int[myList.length]; 
          for (int i = 0, j=myList.length-1; i < myList.length; i++, j--) {     
               myList2[i] = myList[j]; 
          }
          for (int b =0; b< myList.length; b++){
               System.out.println(myList2[b] + "\t" +myList[b]);
          }
     }
}