import java.util.Scanner;

public class Python1B 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt(),n1=0,n2=1,current;
        System.out.println(n1+"\n"+n2);
        for(int i=0;i<n-2;i++)
        {
            current=n1+n2;
            System.out.println(current);
            n1=n2;
            n2=current;
        }
        sc.close();
    }
}
