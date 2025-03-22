class Cartesian2d{
    int x,y;
    Cartesian2d() //Default Constructor
    {
        x=0;
        y=0;
    }
    Cartesian2d(int a,int b) //Parameterised Constructor
    {
        x=a;
        y=b;
    }
    @Override
    public String toString()
    {
        return "("+x+","+y+")";
    }
}
class Cartesian3d extends Cartesian2d
{
    int z;
    Cartesian3d()
    {
        x=0;
        y=0;
        z=0;
    }
    Cartesian3d(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public String toString()
    {
        return("("+x+","+y+","+z+")");
    }
}
public class OverR {
    public static void main(String[] args) {
        Cartesian3d ob1=new Cartesian3d(2, 5, 7);
        System.out.println(ob1);
    }
}