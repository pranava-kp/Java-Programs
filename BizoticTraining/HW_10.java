// WAP to print the 2D array values in the spiral format
import java.util.Scanner;

public class HW_10 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int fr=0,fc=0,lr=m-1,lc=n-1;
        while (fr <= lr && fc <= lc) {
            for (int i = fc; i <= lc; i++)
                System.out.println(a[fr][i]);
            fr++;
            for (int i = fr; i <= lr; i++)
                System.out.println(a[i][lc]);
            lc--;
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--)
                    System.out.println(a[lr][i]);
                lr--;
            }
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--)
                    System.out.println(a[i][fc]);
                fc++;
            }
        }
    }
}
