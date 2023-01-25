/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/
 class Teacher
  {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void work()
    {
      System.out.println("Math Teacher : IIT" );
      System.out.println("English Teacher : IIT" );
      System.out.println("Music Teacher : IIT" );
    }
    }
  public class CollegePrincipal extends Teacher
{
  public static void main(String args[])
  {
    CollegePrincipal obj =new CollegePrincipal();
    obj.work();
  }
}

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class



//Add the main method here and create all different types of Teacher objects and print there college name designation.

//Kindly check the code you have to take child classes and read the question carefully
