import LolXD.Circle;
public class Exp
{
    public static void main(String[] args) {
        System.out.println("This is within class");
        Circle c=new Circle(3);
        System.out.println("Object says "+c.area());
        System.out.println("Class says "+Circle.Area());
        

    }
}