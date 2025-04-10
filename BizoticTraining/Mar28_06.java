import java.util.*;

public class Mar28_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.flush();
        Set<String> set1=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            String al=sc.nextLine();
            set1.add(al);
            System.out.println(al);
        }
        int count=0;
        for(String s:set1)
        {
            System.out.println(s);
            count++;
        }
        System.out.println("Count is "+count);
    }
}
