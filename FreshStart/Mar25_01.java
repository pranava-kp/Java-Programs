class swap<T> // T is a TYPE PARAMETER
{
    private T i, j;
    public void assign(T a, T b) {
        i = a;
        j = b;
        System.out.println(i.getClass());
    }
    public void swap1() {
        T t = i;
        System.out.println(t.getClass());
        i = j;
        j = t;
    }
    public void display() { System.out.println("here" + i + " " + j); }
    public T access() { return i; }
    public void modify(T a) { i = a; }
}
class complex {
    private int r, i;
    public void assign(int a, int b) {
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
public class Mar25_01 {
    public static void main(String[] args) {
        System.out.println("****INTEGER VALUE*****");
        swap<Integer> a = new swap<>(); // Integer is a TYPE ARGUMENT
        a.assign(1, 2);
        a.display();

        Integer t = a.access();
        t = t + 10; //T is integer but is unboxed to int by the compiler
        //Has the + operator been overloaded
        a.modify(t);
        a.display();
        a.swap1();
        a.display();
        System.out.println("****COMPLEX VALUE*****");
        complex c = new complex();
        complex c1 = new complex();
        c.assign(1, 1);
        c1.assign(2, 2);
        swap<complex> b = new swap<complex>();
        b.assign(c, c1);

        b.display();
        b.swap1();
        b.display();
    }
}