import java.io.*;
import java.util.Scanner;
class outer
{
	int x,y;
	outer(int a,int b)
	{
		x=a;
		y=b;
	}
	void read()
	{
		inner inr=new inner();
		inr.add();
	}
	class inner
	{
		int s;
		void add()
		{
			s=x+y;
			System.out.println("Sum of two number is:"+s);
		}
	}
}
class nestedinner
{
	public static void main(String args[])throws IOException
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		outer otr=new outer(a,b);
		otr.read();
	}
}


