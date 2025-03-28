import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Mar27_01 {
    public static void main(String args[])
    {
        List<Integer> ar=new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println("Items are "+ar);
        Integer a[]=ar.toArray(new Integer[0]);
        System.out.println(Arrays.toString(a));
    }
}