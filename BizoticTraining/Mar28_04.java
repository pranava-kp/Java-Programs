import java.util.Scanner;

public class Mar28_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        try{
            int v=Integer.parseInt(val);
            System.out.println("Deposit successful of ₹"+v);
        }
        catch(InvalidException E)
        {
            System.out.println("Deposit unsuccessful");
        }
        finally
        {
            System.out.println("This is executed no matter what");
        }
    }
}
class InvalidException extends NumberFormatException
{
    public InvalidException()
    {
        System.out.println("invalid lol");
    }
}
