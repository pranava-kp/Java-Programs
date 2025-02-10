import java.util.*;
class CRC
{
    static String Xor(String a, String b) 
    { 
        String result=""; 
        int n=b.length(); 
        for (int i = 1; i < n; i++)
        { 
            if (a.charAt(i)==b.charAt(i)) 
                result+="0"; 
            else
                result+="1"; 
        } 
        return result; 
    }
    static String Mod2Div(String dividend, String divisor) 
    {  
        int pick = divisor.length(); 
        String tmp = dividend.substring(0, pick); 
        int n = dividend.length(); 
        while (pick < n)
        { 
            if (tmp.charAt(0) == '1') 
                tmp = Xor(divisor, tmp) + dividend.charAt(pick); 
            else
                tmp = Xor(new String(new char[pick]).replace("\0", "0"),tmp) + dividend.charAt(pick); 
            pick += 1; 
        } 
        if (tmp.charAt(0) == '1') 
            tmp = Xor(divisor, tmp); 
        else
            tmp = Xor(new String(new char[pick]).replace("\0", "0"),tmp); 
        return tmp; 
    }
	public static void main(String args[])
	{
		String mx="",mx1,gx,remainder="";
		System.out.println("Enter M(x)");
		Scanner sc=new Scanner(System.in);
		mx=sc.nextLine();
        System.out.println("Enter G(x)");
		gx=sc.nextLine();
        int G=Integer.parseInt(gx,2);
        int degreeG=gx.length();
        String zer="0";
        String Tx = mx + zer.repeat(degreeG - 1);
        if(G!=0)
            remainder = Mod2Div(Tx, gx);
        String cx=mx+remainder;
        System.out.println("Code word is "+cx);
        System.out.println("Enter what reciever has received");
        mx1=sc.nextLine();
        if(mx1.equals(cx))
            System.out.println("Message received Successfully");
        else
            System.out.println("CRC Failed");
        sc.close();
	 }
}