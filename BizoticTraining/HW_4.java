//WAP to print the smallest element in an array
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        int n,small=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        small=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int n1=sc.nextInt();
            if(n1<small)
                small=n1;
        }
        System.out.println("Smallest number is "+small);           
    }
}