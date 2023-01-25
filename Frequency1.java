class Frequency1
  {
    public static void main(String args[])
    {
      int a[]={2,1,2,3,1};
      int count;
      int n=a.length;
      boolean visited[]=new boolean[n];
      for(int i=0;i<n;i++)
        {
          visited[i]=false;
        }
     // System.out.println("the array elements are : ");
      for(int i=0;i<n;i++)
        {
          count=1;
          if(visited[i]==true)
            continue;
          for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
          System.out.println("the frequency of "+a[i]+ " ---------> "+count);
        }
    }
  }