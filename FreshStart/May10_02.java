import java.util.HashMap;
import java.util.TreeSet;
class HumanBeing
{}
class Person extends HumanBeing
{}
class Student extends Person
{}
class Employee extends Person
{}
public class May10_02 {
  public static void main(String[] args) {
    HashMap<HumanBeing, Integer> a=new HashMap<>();
    a.put(new Person(), 1);
    a.put(new Person(), 2);
    HashMap<Student, Integer> b=new HashMap<>();
    b.put(new Student(), 1);
    b.put(new Student(), 2);
    System.out.println("A : "+a);
    System.out.println("B : "+b);
    a.putAll(b);
    System.out.println("A : "+a);
    System.out.println("B : "+b);
    TreeSet<Integer> ts=new TreeSet<>(a.values());
    System.out.println(ts);
  }  
}
