import java.util.Scanner;
public class ElectriictyBIllC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units=0;
        String name;
        double total=0;
        System.out.println("Enter the name of the customer");
        name=sc.next();
        System.out.println("Enter the number of units used");
        units=sc.nextInt();
        if(units>=0 && units<=200)
        total=units*0.8;
        else if(units >=201 && units<=300)
            total=(200*.8)+(units-200)*.9;
        else if(units>300)
            total=(200*.8)+(100*.9)+(units-300);
        else
        {
        System.out.println("Invalid input");
        total=-100;
        }
        total=total+100;
        if(total>400)
            total+=total*.15;
        if(total>=100)
        {
            System.out.println("Name : "+name);
            System.out.println("Units used : "+units);
            System.out.println("Bill amount : "+total);
        }
        sc.close();        
    }
}    
    
    