class Complex
{
    private int r,i;
    public Complex()
    {
        r=i=0;
    }
    public void assign(int r, int i)
    { 
        this.r = r; this.i=i; 
        System.out.println(this);
        System.out.println(this.getClass());
    }

    // @Override
    // public String toString()
    // {
    //     String t=String.valueOf(r);
    //     t = t +" +i " + i;
    //     return t;
    // }
}
class Student
{
    private int marks;
    public String name;
    Student()
    {
        marks=0;
    }
    public void assign(String n, int m)
    { 
        name=n; marks=m;
        System.out.println(this);
    }

    // @Override
    // public String toString()
    // {
    //     String t="Student name: "+name+"\n";
    //     t = t + "Marks: " + marks;
    //     return t;
    // }
}
public class Mar01
{
    public static void main(String[] args)
    {
        complex c = new complex();
        c.assign(10,20);
        System.out.println(c.toString());
        // // System.out.println(c);
        // student s = new student();
        // s.assign("abc",123);
        // // System.out.println(s);
        // System.out.println("\n*****Calling from Object reference");
        // Object obj = c; //Run time type identification
        // (obj).assign(10,25);
        // System.out.println("Complex value: " + obj.getClass());
        // // obj = s;
        // // System.out.println("Student value: " + obj);
    }
}