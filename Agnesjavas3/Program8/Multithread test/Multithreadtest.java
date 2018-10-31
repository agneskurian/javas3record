import java.io.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("From Thread A:i="+i);
		System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		System.out.println("From Thread B:j="+j);
		System.out.println("Exit from B");
	}
}
class Multithreadtest
{
	public static void main(String args[])
	{
		A oba=new A();
		B obb=new B();
		oba.start();
		obb.start();
	}
}

