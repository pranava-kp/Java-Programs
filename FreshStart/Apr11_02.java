import java.util.*;
class student implements Comparable<student>
{
    private String name,usn;
    int marks;
    public student(String a, String b, int c)
    { name=a; usn=b; marks=c; }
    public String toString()
    { return name+" "+usn+" "+marks; }
    public int compareTo(student b) //Arranging objects on ‘name’ value order
    {   System.out.println("CompareTo() called "+b.name+" "+this.name);
        return name.compareTo(b.name); }
    public String get_usn()
    { return usn; }
    public int get_marks()
    { return marks; }
}
class TheComparator implements Comparator<student>
{ public int compare(student p, student q) //Arranging objects based on ‘usn’ value
    { 
        // System.out.println("Compare function called implicitly");
        int v=p.get_usn().compareTo(q.get_usn());
        if (v > 0)
            return -1;
        if (v < 0)
            return 1;
        return 0; }
}
class TheComparator1 implements Comparator<student>
{ public int compare(student p,student q) //Arranging objects based on ‘marks’ value
    {
        // System.out.println("Compare1 function called implicitly");
        if (p.get_marks() > q.get_marks())
            return -1;
        if (p.get_marks() < q.get_marks())
            return 1;
        return 0;
    }
}
class Apr11_02
{
    public static void main(String [] args)
    {
        TreeSet<student> a = new TreeSet<>();
        System.out.println("First add call");
        a.add(new student("az","1",1));
        System.out.println("Second add call");
        a.add(new student("ap","3",3));
        System.out.println("Third add call");
        a.add(new student("ab","2",2));
        // a.add(new student("ab","2",2));
        System.out.println("Ascending Sort - NAME\n"+a);
        a.add(new student("aa","0",0));
        System.out.println("Ascending Sort - NAME\n"+a);
        TreeSet<student> b = new TreeSet<>(new TheComparator());
        b.add(new student("bu","1RN9",1));
        b.add(new student("be","1RN2",2));
        b.add(new student("bz","1RN3",3));
        System.out.println("Descending Sort - USN\n"+b);
        TreeSet<student> c=new TreeSet<>(new TheComparator1());
        c.add(new student("cg","3",3));
        c.add(new student("cc","1",400));
        c.add(new student("cb","2",2000));
        System.out.println("Descending Sort - MARKS\n"+c);
    }
}