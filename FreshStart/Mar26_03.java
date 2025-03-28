import java.util.*;
public class Mar26_03 {
    public static void main(String[] args)
    {
        TreeSet<Integer> i = new TreeSet<Integer>();
        Integer a=null;
        i.add(1); 
        try{
        i.add(a);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(i);
    }
}