import java.util.*;
interface base1
{ }
class swap1 implements base1 {
    @Override
    public String toString()
    { return "in swap1 " ; }
}
class comp extends swap1{}
class Apr12_01 {
    public static void main(String [] args)
    {
        ArrayList<swap1> ar = new ArrayList<>(Arrays.asList(new swap1(), new comp()));
        System.out.println(ar);
    }
}