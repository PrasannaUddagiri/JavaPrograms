//write a java program to print numbers from 1 to 100 divisible by 2 and 3
import java.util.*;
class Ctest1
  {
    public static void main(String args[])
    {
      System.out.println("Divided by 2 and 3: ");		
		  for (int i=1; i<100; )
        {
			if (i%2==0&&i%3==0) 
      {
			System.out.print(i +", ");	
      }
         i++; 
        }
      
	  }
  }
  