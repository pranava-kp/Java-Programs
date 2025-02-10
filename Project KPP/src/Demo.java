import java.util.*;

class Abc {
    String name;
    Integer usn;
    Boolean isAdult;

    Abc(String name, Integer usn, Boolean isAdult) {
        this.name = name;
        this.usn = usn;
        this.isAdult = isAdult;
    }
}

public class Demo
{
    public static void main(String args[])
    {
        ArrayList<Abc> list = new ArrayList<Abc>();
        list.add(new Abc("adarsh", 11, true));
        Abc ref = list.get(0);
        System.out.println(ref.name);
    }
}