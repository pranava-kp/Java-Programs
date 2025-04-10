import java.util.*;
import java.util.Scanner;

class Mar28_05
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list1=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            if(val>min)
            {
                list1.add(val);
                min=val;
            }
            // else
            //     break;

        }
        System.out.println(list1);
    }
}