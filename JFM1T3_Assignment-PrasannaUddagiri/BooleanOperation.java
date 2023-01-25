//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.*;
class BooleanOperation
  {
    public static void main(String args[])
    {
      boolean b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 'b' value : ");
      b=sc.nextBoolean();
      System.out.println("the value is : " +(!b));
    }
  }
//public class BooleanOperation {

//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 

//}