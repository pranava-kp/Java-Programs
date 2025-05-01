import java.util.*;
class Apr02_01 {
    public static void main(String args[]) {
    String s[] = {"F","B","D","E","C","Z"};
    //Converting a String array to List form.
    List<String> p = Arrays.asList(s);
    LinkedList<String> LL = new LinkedList<>(p);
    LL.addFirst("A");
    LL.add(1, "A2");
    System.out.println("Original contents of LL : " + LL);
        
    // Remove elements from the linked list.
    LL.remove("F");
    LL.remove(2);
    System.out.println("of LL after deletion: "+ LL);
    //Arrays$ArrayList is converted to LinkedList
    
    // Remove first and last elements.
    LL.removeFirst();
    LL.removeLast();
    System.out.println("LL after deletion : " + LL);
    
    // Get and set a value.
    String val = LL.get(2);
    LL.set(2, val + " Changed");
    System.out.println("LL after change: " + LL);
    }
    }