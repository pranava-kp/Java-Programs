class Test {
    static int a;
    
    

    public static void main(String[] args) {
        System.out.println("Main method executed!");
        System.out.println("Value of a: " + a);
    }
    static {
        System.out.println("Static block executed!");
        a = 100;
    }
}
