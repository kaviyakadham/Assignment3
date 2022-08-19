import java.util.Scanner;
import java.util.Arrays;
public class Anagram 
{
  
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1:");
        String str1=sc.next();

        System.out.println("enter String2:");
        String str2=sc.next();

        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        char []c1=str1.toCharArray();
        char []c2=str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if( Arrays.equals(c1,c2))
        {
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("String are not anagram");
        }
       
      


    }
       
    
    
}
