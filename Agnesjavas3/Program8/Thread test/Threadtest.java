import java.io.*;
import java.lang.*;
class Example implements Runnable
{
	Thread t;
	public Example(String threadname)
	{
		t=new Thread(this,threadname);
	}
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class Threadtest
{
	public static void main(String args[])
	{
		Example ob=new Example("First");
		ob.t.start();
		System.out.println("this is:"+Thread.currentThread());
	}
}

