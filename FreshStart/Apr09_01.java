import java.util.*;
import java.util.HashSet;
import java.util.Objects;
class Student {
    private String name,usn;
    private int marks;
    public Student(String n, String u, int m)
    { name = n; usn = u; marks = m; }
    @Override
    public boolean equals(Object obj)
    {
        System.out.println("equals() called");
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student p = (Student)obj;
        return name == p.name && usn == p.usn && marks == p.marks;
    }
    
    @Override
    public int hashCode() {
        System.out.print("hashCode() called; ");
        int i= Objects.hash(name, usn, marks);
        return i;
    }

@Override
public String toString()
{
    return "Name: "+name+" USN: "+usn+" Marks: "+marks;
}
}
public class Apr09_01
{
    public static void main(String[] args)
    {
        LinkedHashSet<Student> hs = new LinkedHashSet<>();
        Student p1 = new Student("abc","25",25);
        Student p2 = new Student("def","26",26);
        Student p3 = new Student("ghi","30",30);
        hs.add(p1); hs.add(p2);
        hs.add(p3);
        System.out.println(hs);
        Student s[]={new Student("abc","25",25),
        new Student("def","26",26)};
        System.out.println("**** retailAll() called on student[]****");
        hs.retainAll(Arrays.asList(s));
        System.out.println(hs);
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("ghi","30",30));
        System.out.println("**** retailAll() called on student[]*ykrhffffffffyhO*IYYSAhnrinsiRioooooooooooooooooooo***");
        hs.retainAll(al);
        System.out.println(hs);
    }
}