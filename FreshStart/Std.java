class Student {
    private String name,usn;
    private double marks;
    private static int count;
    public Student(){
        count++;
        System.out.println("\n"+this);
        System.out.println("ZPC Called\nObj : "+count);
            
    }
    public static void display()
    {
        System.out.println(count);
    }
    public void accept()
    {
        System.out.println("in accept");
    }
}
public class Std{
    public static void main(String[] args) {
        Student a = new Student();
        // System.out.println("main"+a);
        Student b = new Student();
        // System.out.println("main"+b);
        Student p[] = new Student[4];
        for(int i=0;i<4;i++)
        {
            p[i]= new Student();
            System.out.println("for"+p[i]);
        }
        Student.display();
        a.accept();
        b.accept();
        p[0].accept();
        p[1].accept();
        p[2].accept();
        p[3].accept();
        // Student.display();
    }

}