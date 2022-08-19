import java.util.Scanner;
public class sort1 {
    public static void main(String[]args)
    {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String:");
        String str=sc.next();
        
        String str1=" ";
        
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]<ch[j])
                {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        
        
        for(int k=0;k<ch.length;k++)
        {
           str1=str1+ch[k];
        }
        System.out.println(str1);
    }
}
