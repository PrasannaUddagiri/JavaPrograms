/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
//import java.util.scanner;

//public class HighestNumber {
  import java.util.*;
  class HighestNumber
  {
    public static void main(String args[])
    {
      int num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number1 : ");
      num1=sc.nextInt();
      System.out.println("enter the number2 : ");
      num2=sc.nextInt();
      System.out.println("enter the number3 : ");
      num3=sc.nextInt();
      if((num1>num2)&&(num1>num3))
       {
          System.out.println(num1 + " is the largest number.");
       }
        else if((num2>num3)&&(num2>num1))
       {
         System.out.println(num2 + " is the largest number.");
       }
         else 
       {
         System.out.println(num3 + " is the largest number.");
       }
    }
  }

     
//Add main method

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 
//}