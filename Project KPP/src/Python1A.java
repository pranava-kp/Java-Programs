import java.util.Scanner;
public class Python1A 
{
    public static void main(String pranava[])
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3;
        float total,percentage;
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter USN");
        String USN=sc.nextLine();
        System.out.println("Enter maths marks");
        m1=sc.nextInt();
        System.out.println("Enter python marks");
        m2=sc.nextInt();
        System.out.println("Enter English marks");
        m3=sc.nextInt();
        total=m1+m2+m3;
        percentage=total/3;
        System.out.println("Name: "+name );
        System.out.println("USN: "+USN );
        System.out.println("Total marks: "+(int)total );
        System.out.println("Percentage: "+String.format("%.2f", percentage)+"%");
        sc.close();
    }
}
