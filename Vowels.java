import java.util.Scanner;
public class Vowels {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.next();

        str=str.toLowerCase();

        char ch[]=str.toCharArray();
        int count_vowels=0;
        int count_consonants=0;
        for(int i=0;i<ch.length;i++)
        {
           
            if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
               count_vowels++;
            }
            else if(ch[i]>='a' && ch[i]<='z')
            {
               count_consonants++;
            }
            
        }
        System.out.println("Total no of vowels in string are:"+count_vowels);
        System.out.println("Total no of consonants in string are:"+count_consonants);
    }
}

