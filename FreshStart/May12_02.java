import java.util.*;

class May12_02 {
    public static void main(String args[]) {
        // Create a hash map.
        TreeMap<String, Double> hm = new TreeMap<String, Double>();
        // Put elements to the map
        hm.put("Gyan", 3434.34);
        hm.put("Raj", 123.22);
        hm.put("Kumar", 1378.00);
        hm.put("Ram", 99.22);

        System.out.println(hm);
        // Deposit 1000 into John Doe's account.
        double balance = hm.get("Gyan");
        hm.put("Gyan", balance + 1000);

        System.out.println("Gyan's new balance: " + hm.get("Gyan"));
        System.out.println(hm.descendingKeySet());
        System.out.println(hm.descendingMap());
        System.out.println(hm.ceilingEntry("H"));
        System.out.println(hm.ceilingKey("H"));

        System.out.println(hm.floorEntry("Z"));

        System.out.println(hm.headMap("Raj",false));

        System.out.println(hm.subMap("Gyan", true, "Raj", true));
    }
}