//WAP to print array length without using inbuilt functions
import java.util.Scanner;

public class HW_1 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String ar[]=s1.split(" ");
    int count=0;
    try {
        for(int i=0;;i++)
            if(ar[i] instanceof String)
                count++;
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Count is "+count);
    }
 }   
}
