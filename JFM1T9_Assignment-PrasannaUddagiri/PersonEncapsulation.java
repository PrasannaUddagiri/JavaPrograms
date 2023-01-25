/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/
import java.util.*;
class Person
  {
    int age;
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
  }
 class PersonEncapsulation
  { 
 public static void main(String args[])
    { 
      Person obj=new Person();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age : ");
      int age=sc.nextInt();
      System.out.println("your age : "+age);
    }
  }
      
//declare age 

//create setters and getters
    
 



//main method

//create Scanner object

//take input from user

// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 

// Output age  

//}   

//} 

//Kindly read the question carefully, You have to declare variable as private to achieve encapsulation.
