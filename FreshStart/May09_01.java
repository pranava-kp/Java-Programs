import java.util.*;

class May09_01 {
    public static void main(String args[])
    {
        // Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // Use an iterator to display contents of al.
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Modify objects being iterated.
        ListIterator<String> litr = al.listIterator();
        System.out.println(litr.next());
        System.out.println(litr.previous());
        try {
            System.out.println(litr.previous());
        } catch (Exception e) {
            System.out.println(e);
        }
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Now, display the list backwards.
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
    }
}