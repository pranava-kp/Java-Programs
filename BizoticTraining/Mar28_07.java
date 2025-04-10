import java.util.*;
import java.util.Scanner;

public class Mar28_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        s.replace(".", " ");
        String arr[]=s.split(" ");
        Map<String,Integer> count= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            // if(count.containsKey(arr[i].toLowerCase()))
                count.put(arr[i].toLowerCase(),count.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(count);

    }
}