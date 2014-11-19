//Ariana Hewitt
//11/18/14
//Homework 10
//Program 1
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//end of listArray
  
  public static Boolean hasDups(int num[]){
       String out="{";
    for(int j=0;j<num.length;j++){
         for (int i=j+1; i<num.length; i++){
              if (num[i] == num[j]){
                   return true;
              }
              else{
                   return false;
              }
         }
    }
    return true;
  }//end of hasDups
         
public static Boolean exactlyOneDup(int num[]){
       String out="{";
       int count = 0;//up count each time it finds a duplicate
    for(int j=0;j<num.length;j++){
         for (int i=j+1; i<num.length; i++){
              if (num[i] == num[j]){
                   return true;
              }
              else{
                   return false;
              }
         }
    }
    return true;
}//end of exactlyOneDup
}

