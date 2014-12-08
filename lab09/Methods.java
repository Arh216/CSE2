//Ariana Hewitt
//Lab 9
//Practice Writing Methods
import java.util.Scanner; 
public class Methods{   
     public static void main(String [] arg){  
          Scanner scan=new Scanner(System.in);  
          int a,b,c;  
          System.out.println("Enter three ints");  
          a=getInt(scan);  
          b=getInt(scan);  
          c=getInt(scan);  
          System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));  
          System.out.println("The larger of "+a+", "+b+", and "+c+                     
                             " is "+larger(a,larger(b,c)));  
          System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+                     
                             ", and "+c+" are in ascending order");   
     }
     public static int getInt(Scanner scan){
           while (!scan.hasNextInt()) {
               System.out.println("You must enter an int");
               scan.next();
          }
          return scan.nextInt();
     }
      public static int larger(int a, int b){
           int max;
           if (a > b){
                max = a;
           }
           else{
                max = b;
           }
           return max;
      }
      public static boolean ascending(int a, int b, int c){
           int first;
           if (a > b && a > c){
                first = a;
           }
           else if(b > c){
                int second = b;
           }
           
           return true;
      }
      }
     
