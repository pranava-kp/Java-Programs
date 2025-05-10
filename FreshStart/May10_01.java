import java.util.*;

class May10_01 
{ public static void main(String args[]) 
    { // Create a hash map. 
        HashMap<String, Double> hm = new HashMap<String, Double>(); 
        HashMap<String, Double> hm1 = new HashMap<String, Double>(); 
        // Put elements to the map 
        hm.put("Gyan", 3434.34); 
        hm.put("Raj", 123.22);
        hm.put("Kumar", 1378.00); 
        hm.put("Ram", 99.22);

        hm1.put("Raj", 123.22);
        hm1.put("Kumar", 1378.00); 
        hm1.put("Ram", 99.22);
        hm1.put("Gyan", 3434.34); 

        System.out.println(hm); // Deposit 1000 into John Doe's account. 
        // double balance = hm.get("Gyan"); 
        // hm.put("Gyan", balance + 1000); 
        System.out.println("Gyan's new balance: " + hm.get("Gyan"));
        System.out.println(hm.size());
        HashSet<Map.Entry<String,Double>> hs=new HashSet<>(hm.entrySet());
        System.out.println(hs);

     
        System.out.println(hm1.equals(hm));
    }
}