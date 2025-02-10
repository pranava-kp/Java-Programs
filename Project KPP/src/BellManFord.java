import java.util.*;
public class BellManFord
{
    static int n, dest;
    static double[] prevDistVect, distVect;
    static double[][] adj;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        n = sc.nextInt();
        adj = new double[n][n];
        System.out.println("Enter Adjacency Matrix");
        for (int i = 0; i< n; i++)
            for (int j = 0; j < n; j++)
                adj[i][j] = sc.nextDouble();
        System.out.println("Enter destination vertex");
        dest = sc.nextInt();
        distVect = new double[n];
        for (int i = 0; i< n; i++)
            distVect[i] = Double.POSITIVE_INFINITY;
        distVect[dest - 1] = 0;
        bellmanFord();
        System.out.println("Distance Vector");
        for (int i = 0; i< n; i++)
        {
            if (i == dest - 1)
                continue;
            System.out.println("Distance from " + (i + 1) + " is " + distVect[i]);
        }
        System.out.println();
        sc.close();
    }
    static void bellmanFord()
    {
        for (int i = 0; i< n - 1; i++)
        {
            prevDistVect = distVect.clone();
            for (int j = 0; j < n; j++)
            {
                double min = Double.POSITIVE_INFINITY;
                for (int k = 0; k < n; k++)
                    if (min >adj[j][k] + prevDistVect[k])
                        min = adj[j][k] + prevDistVect[k];
                distVect[j] = min;
            }
        }
    }
}