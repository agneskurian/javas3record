import java.io.*;
import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("large="+a);
			}
			else
			{
				System.out.println("large="+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("large="+b);
			}
			else
			{
				System.out.println("large="+c);
			}
		}
	}
}
