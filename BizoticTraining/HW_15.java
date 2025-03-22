//WAP to print the words in reverse order in the given string
import java.util.Scanner;

public class HW_15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String ar[] =s.split(" ");
        for(int i=ar.length-1;i>=0;i--)
            System.out.println(ar[i]);
    }
}
