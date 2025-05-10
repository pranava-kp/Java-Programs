import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.TreeSet;

public class May09_02
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10); a.add(12);
        TreeSet<Integer> b = new TreeSet<Integer>();
        b.add(10); b.add(12);
        if (a instanceof RandomAccess)
            System.out.println("ArrayList supports RandomAccess ");
        if (b instanceof RandomAccess)
            System.out.println(" TreeSet supports RandomAccess ");
        System.out.println("ArrayList Random access "+a.get(1));
    }
}
