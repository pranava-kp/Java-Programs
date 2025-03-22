public class Mar21_02 {
    int i=10;
    public static void main(String[] args) {
        Mar21_02 Mar21_02 = new Mar21_02();
        int res=Mar21_02.add(10,20);
        System.out.println(Mar21_02.i);
        System.out.println(res);
    }
    public int add(int a,int b)
    {
        Mar21_02 m = new Mar21_02();
        return a+b+m.i;
    }
}