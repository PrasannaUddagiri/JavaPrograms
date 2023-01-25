import java.io.*;
class SampleFile
{
  public static void main(String args[])
  {
    File f=new File("files/sample.txt");
    System.out.println(f.delete());
       
  }
}