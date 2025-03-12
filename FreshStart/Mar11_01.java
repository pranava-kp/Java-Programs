class complex
{
    private int r,i;
    public void assign(int r, int i)
    { this.r = r; this.i=i; }
    @Override
    public String toString()
    {
        String t=String.valueOf(r);
        t =i+"+i";
        return t;
    }
}
public class Mar11_01
{
    public static void main(String[] args)
    {
        complex c = new complex();
        c.assign(10,20);
        System.out.println(c);
    }
}