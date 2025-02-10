import java.util.*;
public class Sep28
{
    public static void main(String args[])
    {
        String a[]=new String[5];
        System.out.println("Enter 5 elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            a[i]=sc.nextLine();
        System.out.println("5 elements are");
        for(int i=0;i<5;i++)
            System.out.println(a[i]);
            sc.close();
    }
}