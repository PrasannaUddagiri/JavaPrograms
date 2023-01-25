//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/
import java.util.*;
class Percentage
  {
    public static void main(String args[])
    {
      int tel,eng, hin,mat,sci,soc;
      double total,per;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter tel value : ");
      tel=sc.nextInt();
      System.out.println("enter eng value : ");
      eng=sc.nextInt();
      System.out.println("enter hin value : ");
      hin=sc.nextInt();
      System.out.println("enter mat value : ");
      mat=sc.nextInt();
      System.out.println("enter sci value : ");
      sci=sc.nextInt();
      System.out.println("enter soc value : ");
      soc=sc.nextInt();
     total= tel+eng+hin+mat+sci+soc;
      per=(total/600)*100;
       System.out.println("the percentage is : "+(int)per);
     }
  }

//import statements for java program to read inputs using Scanner class 
//import java.util.Scanner;

//public class Percentage {

//Define the main method

//Declare the variables

//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

//}