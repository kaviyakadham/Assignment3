public class ReverseString1
{
    
    public static void main(String[]args)
    {
       String s1="Think Twice";
       String s2=" ";

       String a[]=s1.split(" ");

       for(int i=0;i<a.length;i++)
       {
        String s3=a[i].toString()+" ";
        for(int j=s3.length()-1;j>=0;j--)
        {
           s2=s2+(char)(s3.charAt(j)+32);
        }
       }
       System.out.print(s2);

    }
}
