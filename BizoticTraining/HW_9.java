// WAP to print product of two matrices
import java.util.Scanner;

public class HW_9 {
    public static void main(String[] args) {
        int p,q,r,s;
        Scanner sc=new Scanner (System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        int a[][]=new int[p][q];
        int b[][],c[][];
        for(int i=0;i<p;i++)
            for(int j=0;j<q;j++)
                a[i][j]=sc.nextInt();
        r=sc.nextInt();
        s=sc.nextInt();
        if(q!=r){
            System.out.println("Matrix multiplication not possible for given array size");
            System.exit(1);
        }
        else
        {
            b=new int[q][r];
            c=new int[p][s];
            for(int i=0;i<r;i++)
                for(int j=0;j<s;j++)
                    b[i][j]=sc.nextInt();
            for(int i=0;i<p;i++)
                for(int j=0;j<s;j++)
                    for(int k=0;k<q;k++)
                        c[i][j]+=a[i][k]*b[k][j];
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<s;j++)
                    System.out.print(c[i][j]+" ");
                System.out.println();
            }
        }
    }
}