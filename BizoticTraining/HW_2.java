//WAP to to reverse the elements in a given array, without using memory 
class HW_2
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        for(int i=0;i<(a.length)/2;i++)
        {
            a[i]=a[i]+a[a.length-i-1];
            a[a.length-i-1]=a[i]-a[a.length-i-1];
            a[i]=a[i]-a[a.length-i-1];
        }
        // if(a.length%2==0)
        // {
        //     a[a.length/2]=a[a.length/2]+a[1+(a.length/2)];
        //     a[1+(a.length/2)]=a[a.length/2]-a[1+(a.length/2)];
        //     a[a.length/2]=a[a.length/2]-a[1+(a.length/2)];
        // }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}