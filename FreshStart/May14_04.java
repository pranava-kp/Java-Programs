import java.util.Comparator;
import java.util.TreeSet;

class May14_04 {
	public static void main(String [] args)
	{
        TreeSet<Integer> i = new TreeSet<>(Comparator.reverseOrder());
		
		i.add(0);
        i.add(1);
        i.add(2);
        i.add(3);
		System.out.println(i);
	}
}