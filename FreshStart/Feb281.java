class Feb281 {
    public static void main(String args[]) {
    String s = "This is a demo of the getChars method.";
    int start = 10, end = 14;
    char buf[] = new char[50];
    buf[0]='K';
    buf[1]='P';
    buf[2]='P';
    // buf="PranavaKP";
    s.getChars(start, end, buf, 10);
    System.out.println(buf);
    }
}   