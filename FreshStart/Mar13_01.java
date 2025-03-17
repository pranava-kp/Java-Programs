class Complex{
    int r,i;
    Complex(int x,int y)
    {
        r=x;
        i=y;
    }
    @Override
    public String toString()
    {
        String t=String.valueOf(r);
        t = t +" +i " + i;
        return t;
    }
}
class Mar13_01 {
    public static void main(String args[])
    {
        StringBuffer s=new StringBuffer(40);
        s.append("complex: ");
        Complex c=new Complex(10,20);
        System.out.println(s.insert(s.length(),c));
    }
}
