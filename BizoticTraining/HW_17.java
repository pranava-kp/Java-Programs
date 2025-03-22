// WAP to take a string as an input from the user.
//Consider the given input string as password, check either the password is valid or not.
//Conditions are : It should contain atleast 1 capital letter, one lowercase letter,
//one digit, 1 special character, and the length should be minimum 10 characters 

import java.util.Scanner;

public class HW_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean len,UC,LC,SC,NC;
        len=UC=LC=SC=NC=false;
        String pwd=sc.nextLine();
        len=pwd.length()>=10;
        for(int i=0;!(len && UC && LC && SC && NC) && (i<pwd.length());i++)
            if(pwd.charAt(i)>='a' && pwd.charAt(i)<='z')
                LC=true;
            else if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z')
                UC=true;
            else if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9')   
                NC=true;
            else
                SC=true;
        if(len && UC && LC && SC && NC)
            System.out.println("Password valid");
        else
            System.out.println("Password invalid");
        
    }
}