import java.util.*;

//Compare the last word in two strings.
class TComp implements Comparator<String> {
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // Find index of beginning of last name.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // last names match, check entire name
            return aStr.compareTo(bStr);
        else
            return k;
    }
}

class May14_06 {
    public static void main(String args[]) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
        tm.put("Kumar kishore", new Double(3434.34));
        tm.put("Raja ram", new Double(123.22));
        tm.put("Kartik arun", new Double(1378.00));
        tm.put("Raja", new Double(99.22));
        tm.put("Sai supreeth", new Double(-19.08));
        System.out.println(tm);
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " +
                tm.get("John Doe"));
    }
}
