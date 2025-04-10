import java.util.*;
class Student {
    private String name,usn; private int marks;
    public Student(String n, String u, int m)
    { name = n; usn = u; marks = m; }
    @Override
    public boolean equals(Object obj)
    {
        System.out.println("equals() called");
        //if invoking instance and "obj" are pointing to same object
        if (this == obj)
        return true;
        //If 'obj' is not pointing to an object of the same type as the
        //type of the invoking object
        if (obj == null || getClass() != obj.getClass())
        return false;
        Student p = (Student) obj;
        return name.equals(p.name) && usn.equals(p.usn) && marks == p.marks;
    }
    @Override
    public int hashCode() {
        // System.out.print("hashCode() called; ");
        // Generates a hash code for a sequence of input values.
        int i= Objects.hash(name, usn, marks);
        return i;
    }
    @Override
    public String toString()
    { return name+" "+usn+" "+marks; }
}
public class Apr07_02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student p1[]=new Student[100];
        char ch='A';
        int v=20;
        for(int i=0;i<100;i++)
            p1[i]=new Student(String.valueOf(ch++),"25",v++);
        for(int i=0;i<100;i++)
            hs.add(p1[i]);
        System.out.println("\n");
        // boolean b = hs.add(new Student("abc","25",25));
        // if (b==true)
        // System.out.println("No duplication..value inserted");
        // else
        // System.out.println("Duplication..value CANNOT be inserted");
        System.out.println(hs);
    }
}