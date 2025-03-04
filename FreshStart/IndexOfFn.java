class IndexOfFn {
    public static void main(String[] args) {
        String m="";
        String s=args[args.length-1];
        for(int i=0;i<args.length-1;i++)
            m=m+args[i]+" ";
        // System.out.println("Main string is \n"+m);
        // System.out.println("Substring is \n"+s);
        int count = 0;
        while(m.indexOf(s)>=0)
        {
            count++;
            m=m.substring(m.indexOf(s)+s.length(), m.length());
            // System.out.println("M is "+m);
        }
        System.out.println("Count is "+ count);
    }
}