interface Shape
  {
  abstract public void areaCalculation();
  }
class Rectangle implements Shape
  {
    public void areaCalculation()
    {
      int l=34,b=13;
      int r=l*b;
      System.out.println("the area of rectangle is : "+r);
     }
  }
class Square implements Shape
  {
    public void areaCalculation()
    {
      int a=34;
      int s=a*a;
      System.out.println("the area of square is : "+s);
    }
  }
class Circle implements Shape
  {
    public void areaCalculation()
    {
      double r=45;
      double c=3.14*r*r;
      System.out.println("the area of circle is : "+c);
    }
  }
class InterfaceEx1
  {
    public static void main(String args[])
    {
      Shape r=new Rectangle();
      Shape s=new Square();
      Shape c=new Circle();
      r.areaCalculation();
      s.areaCalculation();
      c.areaCalculation();
    }
  }
 