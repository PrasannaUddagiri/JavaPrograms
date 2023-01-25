import java.util.*;
class BasicSalary
  {
    public static void main(String args[])
    {
      int bs,hra,da,gross;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter bs value : ");
      bs=sc.nextInt();
      if(bs<=10000)
      {
        hra=(bs*20)/100;
        da=(bs*80)/100;
        gross=bs+hra+da;
        System.out.println("gross value is : "+gross);
      }
      
    }
  }

