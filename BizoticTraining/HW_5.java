//WAP to print second highest and second smallest element in a an array.
//Condition is array must be traversed only once. 
public class HW_5
{
    public static void main(String args[])
    {
        int a[]={5,7,9,3,6,11,13,21,20};
        int big, big2, small, small2;
        big=(a[0]>a[1])?a[0]:a[1];
        big2=(a[0]>a[1])?a[1]:a[0];
        
        small=(a[0]<a[1])?a[0]:a[1];
        small2=(a[0]<a[1])?a[1]:a[0];

        for(int i=2;i<a.length;i++){
            if(a[i]>big)
            {
                big2=big;
                big=a[i];
            }
            else if(a[i]>big2)
                big2=a[i];
            if(a[i]<small)
            {
                small2=small;
                small=a[i];
            }
            else if(a[i]<small2)
                small2=a[i];
        }
        System.out.println("Second biggest is "+big2);
        System.out.println("Second smallest is "+small2);
    }
}