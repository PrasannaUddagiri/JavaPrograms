class PolymorEx
  {
    void sum(int x,int y)
    {
      int z=x+y;
      System.out.println("the sum is "+(z));
    }
    void sum(int x,int y,int z)
    {
      int w=x+y+z;
      System.out.println("the sum is "+(w));
    }
    public static void main(String args[])
    {
      PolymorEx obj=new PolymorEx();
      obj.sum(10,20);
      obj.sum(10,20,30);
    }
  }