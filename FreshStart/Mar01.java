class complex
{
    private int r,i;
    public void assign(int r, int i)
    { this.r = r; this.i=i; }

    @Override
    public String toString()
    {
        String t=String.valueOf(r);
        t = t +" +i " + i;
        return t;
    }
}
class student
{
    private int marks;
    public String name;
    public void assign(String n, int m)
    { name=n; marks=m; }

    @Override
    public String toString()
    {
        String t="Student name: "+name+"\n";
        t = t + "Marks: " + marks;
        return t;
    }
}
public class Mar01
{
    public static void main(String[] args)
    {
        complex c = new complex();
        c.assign(10,20);
        System.out.println(c);
        student s = new student();
        s.assign("abc",123);
        System.out.println(s);
        System.out.println("\n*****Calling from Object reference");
        Object obj = c; //Run time type identification
        (obj).assign(10,25);
        System.out.println("Complex value: " + obj);
        // obj = s;
        // System.out.println("Student value: " + obj);
    }
}