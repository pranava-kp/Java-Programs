class Parent{
    String cal(String s1,int i)
    {
        return s1+i;
    }
    String cal(int i,String s)  
        {return cal(s,i);}
}

public class Mar28_02 extends Parent{
    public static void main(String args[])
    {
        Mar28_02 m=new Mar28_02();
        System.out.println(m.cal("This is ",2));
        System.out.println(m.cal(2,"This aint "));
    }
}
