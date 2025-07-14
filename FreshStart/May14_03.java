import java.util.*;
enum days {
    Sun, Mon, Tue, Wed, Thur
};
class May14_03 {
    public static void main(String[] args)
    {
        
        EnumMap<days, Integer> p = new EnumMap<days, Integer>(days.class);

        p.put(days.Sun, 1);
        p.put(days.Mon, 2);
        p.put(days.Tue, 3);

        System.out.println(p);
        p.put(days.Sun, 0);

        System.out.println(p);
    }
}