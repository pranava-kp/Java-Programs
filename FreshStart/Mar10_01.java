// Using trim() to process commands.
import java.io.*;
import java.util.Scanner;
class Mar10_01
{
    public static void main(String args[]) throws IOException
    {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(s+s.length());
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(s+s.length());
        // String str;
        // System.out.println("Enter 'stop' to quit.");
        // System.out.println("Enter State: ");
        // do
        // {
        //     str = br.readLine();
        //     str = str.trim(); // remove whitespace
        //     if(str.equals("Illinois"))
        //         System.out.println("Capital is Springfield.");

        //     else if(str.equals("Missouri"))
        //         System.out.println("Capital is Jefferson City.");

        //     else if(str.equals("California"))
        //         System.out.println("Capital is Sacramento.");

        //     else if(str.equals("Washington"))
        //         System.out.println("Capital is Olympia.");

        // } while(!str.equals("stop"));
    } 
}