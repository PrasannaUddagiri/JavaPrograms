/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/
import java.util.*;
class Operations
  {
    public static void main(String args[])
    {
     int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number : ");
     a=sc.nextInt();
     System.out.println("enter second number : ");
     b=sc.nextInt();
     System.out.println("difference of 2 numbers is : "+(a-b));
      System.out.println("product of 2 numbers is : "+(a*b));
     System.out.println("division of 2 numbers is : "+(a/b));
      System.out.println("increment 0f 'a' is : "+(a++));
      System.out.println("decrement of 'b' is : "+(--b));
      System.out.println("remainder of 2 numbers is " +(a%b));
     }
  }

//import statements for java program to read inputs using Scanner class
//import java.util.Scanner;

//public class Operations {

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

//}