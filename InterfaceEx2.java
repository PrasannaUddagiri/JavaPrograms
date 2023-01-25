//import java.lang;
interface Number
  {
  abstract public void calculate( );
  }
class Square implements Number
  {
    public void calculate()
    {
      int n=15;
      int s=n*n;
      System.out.println("the square of number is : "+s);
     }
  }
class Cube implements Number
  {
    public void calculate()
    {
      int n=12;
      int c=n*n*n;
      System.out.println("the cube of number is : "+c);
    }
  }
class SquareRoot implements Number
  {
    public void calculate()
    {
      int n=25;
      double sr=Math.sqrt(n);
      System.out.println("the squareroot of number is : "+sr);
    }
  }
class InterfaceEx2
  {
    public static void main(String args[])
    {
      Number s=new Square();
      Number c=new Cube();
      Number sr=new SquareRoot();
      s.calculate();
      c.calculate();
      sr.calculate();
    }
  }