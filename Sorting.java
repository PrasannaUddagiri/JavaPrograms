class Sorting
  {
    public static void main(String args[])
    {
      int a[]={25,36,78,45,23,65,12};
      int temp=0;
     System.out.println("the elements before sorting : ");
      for(int i=0;i<a.length;i++)
        {
         System.out.print(a[i]+ " ");
        }
      for(int i=0;i<a.length;i++)
        {
         for(int j=i+1;j<a.length;j++)
            {
             if(a[i]>a[j])
             {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
             }
            }
           }
      System.out.println();
      System.out.println("the elements after sorting : ");
      for(int i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }
      }
  }
       