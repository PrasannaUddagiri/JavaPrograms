import java.util.*;
class PrimeArray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the size : ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elements : ");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("the prime elements are : ");
    for( int i=0;i<=arr.length;i++)
      {
    int count=0;
    for(int j=1;j<=arr[i];j++)
      {
        if(arr[i]%j==0)
        {
          count++;
        }
      }
        if(count==2)
     {
      System.out.println(arr[i]);
    }
}
}
}