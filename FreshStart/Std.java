class Student {
    // private String name,usn;
    // private double marks;
    private static int count;
    Student(){
        count++;
        System.out.println(this);
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
        Student b = new Student();
        Student p[] = new Student[4];
        for(int i=0;i<4;i++)
        {
            p[i]= new Student();
        }
        Student.display();
        a.accept();
        b.accept();
        p[0].accept();
        p[1].accept();
        p[2].accept();
        p[3].accept();
    }

}