import java.io.*;
class SampleFile2
{
  public static void main(String args[])
  {
    File f=new File("files");
    if(f.mkdir())
    {
      System.out.println("created");
    }
    else
      System.out.println("not created");
  }
}