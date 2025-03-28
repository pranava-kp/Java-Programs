
class Top_G{
    int cal(int a1,int a2)
        {return a1+a2;}
}
class Parent extends Top_G
{
    int a=100;
    // static int b=200;
    
}
public class Mar28_01 extends Parent{
    static int b=400;
    public static void main(String[] args) {
        Mar28_01 m=new Mar28_01();
        System.out.println(m.a);
        System.out.println(b);
        int res=m.cal(10, 20);
        System.out.println(res);
    }
}
