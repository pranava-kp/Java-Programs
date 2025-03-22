class Mar12_02 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer(6);
        sb.append("Hello");
        System.out.println("Hello");
        sb.delete(1,3);
        System.out.println(sb);
        // System.out.println("buffer = " + sb);
        // System.out.println("length = " + sb.length());
        // System.out.println("capacity = " + sb.capacity());
        // sb.ensureCapacity(10);
        // System.out.println("buffer = " + sb);
        // System.out.println("length = " + sb.length());
        // System.out.println("capacity = " + sb.capacity());
    } }