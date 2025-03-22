// WAP to find a trace of matrix [SUM of diagonal elements]
import java.util.Scanner;

public class HW_11 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int trace=0;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==j)
                    trace+=a[i][j];
            }
        System.out.println("Trace of the matrix is "+trace);
    }
}
