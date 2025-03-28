import java.util.ArrayList;
import java.util.Iterator;
class complex {
    private int r, i;
    public complex(int a, int b) {
        r = a;
        i = b;
    }
    @Override
    public String toString()
    {
        String t=String.valueOf(r);
        t = t + " +i " + i;
        return t;
    }
}
public class Mar25_02 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C"); al.add("C++"); al.add("JAVA");
        System.out.println("Size of array list is "+al.size());
        al.set(0, "C# .net");
        System.out.println("***Contents of ArrayList***");
        System.out.println(al);
        System.out.println("***For-each loop***");
        for(String s : al)
            System.out.println(s);
        System.out.println("***For loop***");
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));
        System.out.println("***Iterator***");
        Iterator<String> it = al.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        ArrayList<complex> cl=new ArrayList<complex>();
        complex c1=new complex(10,20);
        complex c2=new complex(20,30);
        complex c3=new complex(30,40);
        // cl.add(c1);
        // cl.add(c2);
        // c1.add(c3);
        System.out.println("complex\n"+cl+"\n"+cl.size());
    }
}