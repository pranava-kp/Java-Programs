class complex
{
    private int r,i;
    public void assign(int r, int i)
    { this.r = r; this.i=i; }
    @Override //called as annotation
    public String toString()
    {
        // System.out.println(a);
        String t=String.valueOf(r);
        t = t +" +i " + i;
        return t;
    }
}
public class Feb282
{
    public static void main(String[] args)
    {
        complex c = new complex();
        c.assign(10,20);
        System.out.println(c);
    }
}