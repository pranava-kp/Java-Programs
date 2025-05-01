import java.util.*;

class TheComparator implements Comparator<student>
{
    public int compare(student p, student q)

    //Arranging objects based on ‘usn’ value
    {
        int v=p.get_usn().compareTo(q.get_usn());
        if (v > 0)
            return -1;
        if (v < 0)
            return 1;
        return 0;
    }
}

class student /*implements Comparable<student>*/
{

    private String name,usn; int marks;
    public student(String a, String b, int c)
    { name=a; usn=b; marks=c;}
    public String toString()
    {
        return name+" "+usn+" "+marks;
    }
    public String get_usn()
    { return usn; }
    public int get_marks()
    { return marks; }
    // @Override
    // public int compareTo(student b)
    // //Arranging objects on ‘name’ value order
    // {
    //     System.out.println("compare to called");
    //     return b.name.compareTo(name);
    // }
    // public int compareTo(student b)
    // //Arranging objects on descending ‘name’ value order
    // {
    //     System.out.println("compare to called");
    //     int v=name.compareTo(b.name);
    //     if (v>0)
    //         return -1;
    //     if (v<0)
    //         return 1;
    //     return 0;
    // } 
}
class Apr12_03 {
    public static void main(String args[])
    {

        PriorityQueue<student> pq = new PriorityQueue<>(new TheComparator());
        pq.add(new student("a","1",1));
        pq.add(new student("a","1",1)); //DUPLICATION is allowed
        pq.add(new student("b","2",2));
        pq.add(new student("c","3",3));
        System.out.println(pq);

        // Printing the top element of PriorityQueue
        System.out.println("peek "+pq.peek());
        // Printing the top element and deleting it ​
        System.out.println("poll "+pq.poll());
        System.out.println(pq);
        System.out.println(pq.comparator()); //understand .comparator() function
    }
}