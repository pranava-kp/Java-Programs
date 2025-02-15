import java.lang.Thread;

class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<=14;i++)
            System.out.println("Thread 1 executing "+i);
        System.out.println("Thread 1 completed");
    }    
}

class Thread2 extends Thread{
    public void run(){
        for(int j=0;j<=19;j++)
            System.out.println("Thread 2 executing "+(-j));
        System.out.println("Thread 2 completed");
    }    
}

class Thread3 extends Thread{
    public void run(){
        for(int k=0;k<=29;k++)
            System.out.println("Thread 3 executing "+(-k*2)+"0");
        System.out.println("Thread 3 completed");
    }    
}

public class MultiThreadExtends
{
    public static void main()
    {
        Thread1 T1=new Thread1();
        Thread2 T2=new Thread2();
        Thread3 T3=new Thread3();
        T1.start(); 
        T2.start();
        T3.start();
        System.out.println("Threading ends here");
    }
}