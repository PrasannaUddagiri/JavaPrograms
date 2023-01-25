class Landline
  {
    void dial()
    {
      System.out.println("dialing");
    }
  }
    class CellPhone extends Landline
      {
       void chat()
    {
      System.out.println("chatting");
    }
         
  }
class SmartPhone extends CellPhone
  {
     void videocall()
    {
      System.out.println("videocalling");
    }
  }
class TestInheritance
  {
    public static void main(String args[])
    {
   SmartPhone obj=new SmartPhone();
    obj.dial();
    obj.chat();
    obj.videocall();
  }
  }