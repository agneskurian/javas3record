import java.io.*;
import java.lang.*;
class MyException extends Exception
{
	private int detail;
	MyException(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return"MyException["+detail+"]";
	}
}
class ExceptionMain
{
	static void check(int a)throws MyException
	{
		System.out.println("Called check("+a+")");
		if(a<10)
		{
			System.out.println("Number "+a+" is less than  10");
		}
		else
		{
			if(a>10)
			{
				System.out.println("Number "+a+" is Greater than  10");
			}
			else
				throw new MyException(a);
		}
	}
	public static void main(String args[])
	{
		int x;
		x=Integer.parseInt(args[0]);
		System.out.println("Raise Exception,If Given Number is Equal to 10");
		System.out.println(" Number is "+x); 
		try
		{
			check(x);
		}
		catch(MyException e)
		{
			System.out.println("Equal to 10 "+e);
		}

	}
}


