class InnerClass
{
    int data=20;
    class Inner
    {
        void display()
        {
            System.out.println("the value of data is : "+data);
        }
    }
    public static void main(String args[])
    {
        InnerClass obj=new InnerClass();
        //OuterClassReference.new MemberInnerClassConstructor();  
        InnerClass.Inner in=obj.new Inner();
        in.display();
    }
}