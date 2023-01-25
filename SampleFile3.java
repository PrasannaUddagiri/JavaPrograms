import java.io.*;
class SampleFile
{
  public static void main(String args[])
  {
    File f=new File("files");
    String files[]=f.list();
    for(int i=0;i<files.length;i++)
      {
        System.out.println(files[i]);
      }
  }
}