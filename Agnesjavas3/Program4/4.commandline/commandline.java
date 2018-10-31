//import java.util.Scanner;
import java.io.*;
class commandline
{
	public static void main(String args[])throws IOException
	{	
		int temp,n,sum=0;
		n=Integer.parseInt(args[0]);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[20];
		System.out.println("Command line arguments:");
		System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
			a[i]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i] > a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Assending order");
			for(int i=0;i<n-1;i++)
			{
				System.out.println(a[i]+"");
			}
				System.out.println(a[n-1]);
				for(int i=0;i<n;i++)
        			{
                			sum=sum+a[i];
        			}
				System.out.println("Sum of array is="+sum);
       	}
}	
