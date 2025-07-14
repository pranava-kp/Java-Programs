import java.util.*;

class May14_01 {
    public static void main(String args[]) {
        // Create a hash map.
        LinkedHashMap<String, Double> hm = new LinkedHashMap<String, Double>(10, 0.5f);
        // Put elements to the map
        hm.put("Gyan", 3434.34);
        hm.put("Raj", 123.22);
        hm.put("Kumar", 1378.00);
        hm.put("Ram", 99.22);

        System.out.println("LinkedHashSet :" + hm);

        Set<String> k = hm.keySet();

        System.out.println("Key data: " + k);

        Collection<Double> v = hm.values();
        System.out.println("Value data:" + v);

        // Deposit 1000 into John Doe's account.
        double balance = hm.get("Gyan");
        hm.put("Gyan", balance + 1000);

        System.out.println("Gyan's new balance: " + hm.get("Gyan"));
        System.out.println(v.getClass());
    }
}
