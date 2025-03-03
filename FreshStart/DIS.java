import java.io.DataInputStream;

public class DIS {
    public static void main(String[] args) {
        DataInputStream dis= new DataInputStream(System.in);
        System.out.println("Enter the principal");
        System.out.flush();
        Float p=(float)0;
        try
        {
        p=Float.valueOf(dis.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Within catch");
        }
        finally
        {
            System.out.println("Entered principal is "+p);
        }
    }
}
