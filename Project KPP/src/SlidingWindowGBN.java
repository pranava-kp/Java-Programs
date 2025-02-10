import java.util.Scanner;
public class SlidingWindowGBN
{
	public static void main(String args[])
	{
		int n,err,packets;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the window size");
		n=sc.nextInt();
		System.out.println("Enter total number of packets to be sent");
		packets=sc.nextInt();
		System.out.println("What is the frequency of packet error?");
		err=sc.nextInt();
		sc.close();
		int total= GBN(n,packets,err);
		System.out.println("\nTotal number of packets transmitted is "+total);
	}

	static int GBN(int n,int packets,int err)
	{
		int j,i=1,k=0,p=1,temp=0,prev=0,total=0;
		int arr[]=new int[100];
		while(p<=packets)
		{
			if(i%err!=0) //case of error-less transmission
			{
				arr[k++]=p++;
				i++;
				total++;
			}
			else //whenever error occurs
			{
				temp=0; //current window repeat count
				while(temp<n)
				{
					prev=arr[k-1]; //frame number of last sent frame
					if(prev<packets)
					{
						arr[k++]=prev+1;
						total++;
						i++;
					}
					temp++;
				}
			}
		}
		for(j=0;j<total;j++ )
			System.out.print(arr[j]+", ");
		return total; //total packets transmitted
	}
}