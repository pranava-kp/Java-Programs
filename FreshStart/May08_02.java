import java.util.*;

class May08_02
{
    enum color {
        Red, Green, Blue, Violet, Pink, Black, White
    };

    public static void main(String args[])
    {

        EnumSet<color> c = EnumSet.of(color.Red, color.Green);
        System.out.println("of(E v1, E v2) " + c);
        EnumSet<color> d = EnumSet.allOf(color.class);
        System.out.println("d:" + d);
        EnumSet<color> g = EnumSet.complementOf(c);
        System.out.println("g:" + g);
        EnumSet<color> h = EnumSet.copyOf(c);
        System.out.println("h:" + h);
        color[] a = { color.Violet/*/, */,color.Pink, color.Red };
        // using varargs ‘a’
        EnumSet<color> j = EnumSet.of(color.Green, a);
        System.out.println("of(E v, E ... varargs)" + j);
    }
}