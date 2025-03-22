public class Mar18_01 {
    public static void main(String args[])
    {
        StringBuffer s=new StringBuffer("Hello");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                s.setCharAt(i,(char)(((int)s.charAt(i))+32));
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                s.setCharAt(i,(char)(((int)s.charAt(i))-32));
        }
        System.out.println(s);
    }
}
