class ClassA
{
	void printvalue()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i+" ");
					Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
		
		}
	}
}
class Threadsync implements Runnable
{
	ClassA ob1;
	Thread t;
	Threadsync(ClassA c)
	{
		this.ob1=c;
		t=new Thread(this);
	}
	public void run()
	{
		synchronized(ob1)
		{
			ob1.printvalue();
		}
	}
	public static void main(String args[])
	{
		ClassA ca=new ClassA();
		Threadsync one=new Threadsync(ca);
		one.t.start();
		Threadsync two=new Threadsync(ca);
		two.t.start();
		Threadsync three=new Threadsync(ca);
		three.t.start();
	}
}

