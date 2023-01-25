import java.util.*;
class TwoDAdd
  {
    public static void main(String args[])
    {
      int a[][]={{32,34},{43,23}};
      int b[][]={{45,23},{27,49}};
      int c[][]=new int[2][2];
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              c[i][j]=a[i][j]+b[i][j];
            }
        }
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
             System.out.print(c[i][j]+" "); 
            }
        
        System.out.println(); 
        }
    }
  }