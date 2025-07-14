//wap to binary search names stored in linked list
//name array contains strings that have 2 words, separated by single space
//bunry search is supposed to be perfoemed on the second word in the name

import java.util.*;

class TComp implements Comparator<String> {
    public int compare(String a, String b)
    {
    try
    {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // Find index of beginning of last name.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) // last names match, check entire name
        return aStr.compareTo(bStr);
        else
        return k;
    }
    catch(IndexOutOfBoundsException e){
        return -11;
    }
    }
}
public class May19_01 {
    public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<>();
        // a.add("Prajwal Gupta");
        // // a.add("Frakriti Sharma");
        // a.add("Mayanwar Model");
        Collections.addAll(a, "a a","b b","c c","d d");
        /*int i=*/Collections.binarySearch(a, "e",new TComp());
        // Collections.fill(a, "k k");
        System.out.println(a);
        System.out.println((Collections.emptySet()).getClass());
    }
} 
