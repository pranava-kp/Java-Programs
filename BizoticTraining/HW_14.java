//WAP to print number of strings available in the given statement
import java.util.Scanner;

public class HW_14 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        while(s.indexOf("  ")!=-1)
            s=s.replace("  ", " ");
        int count=s.split(" ").length;
        // s=s.replaceAll("\\s+", " ");
        System.out.println("Count is "+count);
    }
}
