import java.io.*;
class FOS{
    public static void main(String args[])
    {
        try{
            FileOutputStream fout=new FileOutputStream("/home/pranavakp/Desktop/fout.txt");
            fout.write(65);
            fout.write(97);
            fout.write(((int)'K'));
            fout.close();
            System.out.println("Filewriting is over.");
        }
        catch(Exception e)
        {
            System.out.println("error"+e.getMessage());
        }
        
    }
}