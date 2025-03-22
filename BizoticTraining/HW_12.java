//WAP to write a string in reverse foramt without using inbuilt functions
import java.util.Scanner;
public class HW_12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        StringBuffer a=new StringBuffer(s);
        for(int i=0;i<(a.length())/2;i++)
        {
            a.setCharAt(i, (char)((int)a.charAt(i)+(int)a.charAt(a.length()-i-1)));
            a.setCharAt(a.length()-1-i, (char)((int)a.charAt(i)-(int)a.charAt(a.length()-i-1)));
            a.setCharAt(i, (char)((int)a.charAt(i)-(int)a.charAt(a.length()-i-1)));
        }
        String s1=new String(a);
        System.out.println(s1);
    }
}
