import java.time.Year;
import java.util.Scanner;

public class Python2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year,age;
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the year of birth");
        year=sc.nextInt();
        age=Year.now().getValue()-year;
        if(age>=60)
        System.out.println(name+" aged "+age+" is a senior citizen");
        else
        System.out.println(name+" aged "+age+" is not a senior citizen");
        sc.close();
        
    }
}
