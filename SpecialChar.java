import java.util.Scanner;
public class SpecialChar {
    public static void main(String[]args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        str=sc.next();
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]=='$' || ch[i]=='%' || ch[i]=='^' || ch[i]=='&' || ch[i]=='*'|| ch[i]=='(' || ch[i]==')' ||ch[i]=='_' || ch[i]=='+'
            || ch[i]=='}' || ch[i]=='{' || ch[i]=='|' || ch[i]==':' || ch[i]=='?' || ch[i]=='>' ||ch[i]=='<' ||ch[i]=='.'||ch[i]==',')
            {
                count++;
            }


        }
        System.out.println("total no of special characters"+count);
    }
}
