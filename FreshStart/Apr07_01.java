import java.util.*;
class Apr07_01 {
public static void main(String args[]) {
    HashSet<String> hs = new HashSet<String>(4,0.75f);
    hs.add("A");
    hs.add("D");
    hs.add("B");
    hs.add("E");

    //Redundant values, which cannot be inserted
    hs.add("A");
    hs.add("B");
    System.out.println(hs.size());
    System.out.println(hs);
    }
}