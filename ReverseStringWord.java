public class ReverseStringWord
{
    public static void main(String[] args) {
        String s="hello world";
        String str[]=s.split(" ");
        String revstr="";
        for(int i=0;i<str.length;i++)
        {
            String s1=str[i]; 
            String s2="";
            for(int j=s1.length()-1;j>=0;j--)
            {
                s2=s2+s1.charAt(j);
            }
            revstr=revstr+s2+" ";
        }
        System.out.println("the reverse string is:"+revstr);
    }
}