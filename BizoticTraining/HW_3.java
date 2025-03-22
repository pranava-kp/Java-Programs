//WAP to print the largest element in an array
import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        int n,big=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        big=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int n1=sc.nextInt();
            if(n1>big)
                big=n1;
        }
        System.out.println("Biggest number is "+big);           
    }
}