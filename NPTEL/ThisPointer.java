class Ob {
    void A()
    {
        System.out.println("Inside A : "+this.toString());
        Ob ob1 =new Ob();
        ob1.B();
        C();
    }
    void B()
    {
        System.out.println("Inside B : "+this.toString());
    }
    void C()
    {
        System.out.println("Inside C : "+this.toString());
    }
}
class ThisPointer
{
    public static void main(String[] args) {
        
        Ob obj=new Ob();
        obj.A();
        obj.B();
    }
}
