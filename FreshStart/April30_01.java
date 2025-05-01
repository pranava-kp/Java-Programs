import java.util.*;
public class April30_01 {
    public static void main(String[] args) {
        ArrayList<Integer> AL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> AL2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        AL1.set(2, 35);
        AL2.set(2, 35);
        System.out.println(AL1.equals(AL2));
        System.out.println(AL1.get(2)-AL2.get(2));
    }
}
