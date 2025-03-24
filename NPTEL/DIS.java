import java.io.*;

public class DIS {
    public static void main(String args[])
    {
        DataInputStream ds=new DataInputStream(System.in);
        String temp;
        System.out.println("Enter principal");
        System.out.flush();
        try{
        temp=ds.readLine();
        float p=Float.valueOf(temp);
        System.out.println(temp);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
