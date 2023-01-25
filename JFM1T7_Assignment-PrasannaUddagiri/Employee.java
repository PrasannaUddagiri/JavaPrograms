/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

//import java.util.Scanner;

//public class Employee {
  import java.util.*;
public class Employee
  {
   String empname;
    int salary;
    int id;
   public  void getInput()
    {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the name of employee");
  empname=sc.next();
  System.out.println("enter the salary");
  salary=sc.nextInt();
  System.out.println("enter the id");
  id=sc.nextInt();
   }
  public void display()
    {
  System.out.println("Employee id="+id+"\n "+"Employee name="+empname+"\n Employee salary="+salary+"\n");
    }
  public static void main(String[]args)
  {
    Employee obj[]=new Employee[3];
    for(int i=0;i<obj.length;i++)
      {
        obj[i]=new Employee();
        obj[i].getInput();
        obj[i].display();
      }
    
  }
  }

 


//}

//Declare the variables

//Create a method getInput() 

//public  void getInput(){

//create Scanner object

//take input from user

//}

//create display method
//public void display(){

//Print Employee details

//}

//Create a Employee constructor with the two employees

//check for loop to print two employee details

//}