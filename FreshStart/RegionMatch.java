public class RegionMatch {
    public static void main(String args[])
    {
        String s1="Starting to learn Java";
        String s2="lear";
        boolean res=s1.regionMatches(s1.indexOf("lear"), s2, 0, "lear".length());
        System.out.println(res);
    }
}
