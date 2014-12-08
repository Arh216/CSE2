//Ariana Hewitt
//Lab 13
//Ragged Arrays
public class Ragged{
  public static void main(String [] arg){
       int[][] raggedArray = new int[5][]; 
       raggedArray[0] = new int[5]; 
       raggedArray[1] = new int[8]; 
       raggedArray[2] = new int[11]; 
       raggedArray[3] = new int[14]; 
       raggedArray[4] = new int[17];
       //Assign random values
       for (int row = 0; row < raggedArray.length; row++) { 
            for (int column = 0; column < raggedArray[row].length; column++) { 
                 raggedArray[row][column] = (int)(Math.random() * 39); 
            } 
       }
       //Print array
       for (int row = 0; row < raggedArray.length; row++) { 
            for (int column = 0; column < raggedArray[row].length; column++) { 
                 System.out.print(raggedArray[row][column] + " "); 
            }        
            System.out.println();      
       }
  }
}



