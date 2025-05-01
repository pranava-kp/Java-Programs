import java.util.*;
class Apr12_02 {

    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(15);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.comparator());
    }
}