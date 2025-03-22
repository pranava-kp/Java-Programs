public class Mar17_01 {
    public static void main(String args[])
    {
        String k=2+2+"four";
        int l=k.length();
        System.out.println(k.charAt(l-1));
        String s = "This is a demo of the getChars method.";
        int start = 10, end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
        String e="The quick brown fox jumps over the lazy dog";
        for(int i=0;i<e.length();i++)
        {
            System.out.print(e.charAt(i)+" ");
            if(i>=10)
                System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<e.length();i++)
        {
            System.out.print(i+" ");
        };
        System.out.println();
        System.out.println("E indices:"+e.lastIndexOf('e',1)+e.lastIndexOf('e',2)+e.lastIndexOf('e',3));
        System.out.println(e.substring(0, 2));
        int i=9;
        String km=i+"I";
        System.out.println(km);
    }
}
