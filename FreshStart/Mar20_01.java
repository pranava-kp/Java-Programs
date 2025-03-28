import java.util.Scanner;

public class Mar20_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        String tok[]=s.split(" ");
        for(int i=0;i<tok.length;i++)
        {
            StringBuffer s1=new StringBuffer(tok[i].toLowerCase());
            StringBuffer s2=(new StringBuffer(tok[i].toLowerCase())).reverse();
            if((s1.toString()).equals(s2.toString()))
                count++;
        }
        System.out.println("The number of palindromes are "+count);
    }
}
