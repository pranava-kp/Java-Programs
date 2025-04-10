import java.util.*;

public class Mar28_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> hmp= new HashMap<>();
        for(int i=1;i<=26;i++)
            hmp.put((char)(i+64),i);
        String s=sc.next().toUpperCase();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(s.length()-i-1);
            sum+=hmp.get(ch)*(int)(Math.pow(26, i));
        }
        System.out.println(sum);
    }
}
