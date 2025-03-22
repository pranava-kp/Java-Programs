// WAP to check the given word can be a palindrome after interchanging the characters

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HW_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char ch:s.toCharArray())
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        int freq[]=new int[freqMap.size()];
        int j=0;
        for(int value : freqMap.values())
            freq[j++]=value;
        boolean stat=true;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]%2==1 && stat==false)    
            {
                System.out.println("Palindroime not possible");
                System.exit(1);
            }
            if(freq[i]%2==1)
                stat=false;
        }
        System.out.println("Palindrome possible");
    }
}
