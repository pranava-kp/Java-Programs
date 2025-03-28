import java.util.ArrayList;
import java.util.Arrays;
class complex
{
    private int r,i;
    public void assign(int a, int b) { r=a; i=b; }
    public void complex() { }
    @Override
    public String toString()
    {
        String t=String.valueOf(r);
        t = t + " +i " + i;
        System.out.println("this");
        return t;
    }
}
public class Mar27_02 {
    public static void main(String[] args) {
        ArrayList<complex> al = new ArrayList<>();
        complex c[] = new complex[3];
        (c[0] = new complex()).assign(1, 2);
        (c[1] = new complex()).assign(3, 4);
        (c[2] = new complex()).assign(5, 6);
        al.add(c[0]); al.add(c[1]); al.add(c[2]);
        System.out.println("Size of array list is "+al.size());
        // complex b[] = al.toArray(new complex[al.size()]);
        complex b[] = al.toArray(new complex[0]);
        /*If ArrayList 'al' has more elements than the array
        size(0 here),Java creates a new array of the required
        size and populates it.
        13If ArrayList 'al' had fewer or equal elements than the
        provided array's size, Java would use that array
        directly.
        */
        System.out.println(Arrays.toString(b));
    }
}