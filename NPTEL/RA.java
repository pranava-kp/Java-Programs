import java.io.IOException;
import java.io.RandomAccessFile;

public class RA {
    public static void main(String[] args) {
        RandomAccessFile f=null;
        try{
            f =new RandomAccessFile("/home/pranavakp/Desktop/fout.txt","rw");
            f.setLength(0);
            f.writeChar('X');
            f.writeInt(555);
            f.writeDouble(3.1415);
            f.seek(0);
            System.out.println(""+f.readChar()+f.readInt()+f.readDouble());
            f.seek(2);
            System.out.println("OP2 : "+f.readInt());
            System.out.println("size is "+f.length());
            f.seek(f.length());
            f.writeBoolean(false);
            f.seek(14);
            System.out.println(f.readBoolean());
            f.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
