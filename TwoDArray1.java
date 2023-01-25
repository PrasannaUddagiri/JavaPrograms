class TwoDArray1
  {
    public static void main(String args[])
    {
      float arr[][]=new float[2][3];
      arr[0][0]=23.9f;
      arr[0][1]=45.12f;
      arr[0][2]=12.45f;
      arr[1][0]=56.2f;
      arr[1][1]=45.3f;
      arr[1][2]=34.5f;
      System.out.println("elements in array are : ");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();
         }
  }
  }