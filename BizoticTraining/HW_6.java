//WAP to print the sum of the array elements
import java.util.Scanner;

public class HW_6 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        System.out.println(sum);
    }
}
