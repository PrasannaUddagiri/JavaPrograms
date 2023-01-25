import java.util.*;
class OperationsUsingSwitch
{
  public static void main(String args[])
  {
    int option,num1,num2,num3;
    Scanner sc=new Scanner(System.in);
    System.out.println("*****calculator*****");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("enter a option");
    option=sc.nextInt();
    System.out.println("enter num1 and num2 values :");
    num1=sc.nextInt();
    num2=sc.nextInt();
    switch(option)
      {
        case 1:
          num3=num1+num2;
          System.out.println("Addition is : "+num3);
          break;
          case 2:
          num3=num1-num2;
          System.out.println("Subtraction is : "+num3);
          break;
          case 3:
          num3=num1*num2;
          System.out.println("Multiplication is : "+num3);
          break;
          case 4:
          num3=num1/num2;
          System.out.println("Division is : "+num3);
          break;
        default:
          System.out.println("invalid option");
      }
  }
}