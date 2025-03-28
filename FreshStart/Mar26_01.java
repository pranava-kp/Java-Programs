import java.util.Arrays;
import java.util.*;
public class Mar26_01 {
public static void main(String[] args){
    Integer a[] = { 1, 2 };
    List<Integer> l = Arrays.asList(a);
    System.out.println(l);
    System.out.println(l.getClass());
    /* An instance of List cannot be created. Arrays.asList( )
    will return an ArrayList<Integer> instance type which
    will be pointed by the reference ‘l’. */
    try{l.add(3);}
    catch(UnsupportedOperationException e)
    {
        System.out.println("\n\n"+e);//generates java.lang.UnsupportedOperationException
    }
    l.set(0, 100);
    System.out.println(l);
    ((ArrayList)l).add(3); // generates ClassCastException
}
}