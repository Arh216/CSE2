//Ariana Hewitt
//Homework 3
//Program 2
//Write a program that prompts the user to enter a double and then 
//prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed. 
//September 16, 2014

import java.util.Scanner;

public class Root {
     public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          
          //Prompt the user to enter a double
          System.out.println("Enter a double: ");
          double x =input.nextDouble();
          
          //Compute cube root
          double cube= x/3;
          cube= (cube*cube*cube+x)/(3*cube*cube);
          cube= (2*cube*cube*cube+x)/(3*cube*cube);
          
          //Compute cube value
          double cub= cube*cube*cube;
          
          //Display Results
          System.out.println("The cube root is roughly: " +cube);
          System.out.println("The cube of " +cube+ " is " +cub);
         
          
          
     }
}