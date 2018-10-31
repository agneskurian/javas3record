package complexpack;
import java.io.*;
public class complex
{
	int real,imag;
	public complex()
	{
		real=0;
		imag=0;
	}
	public complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	public void addcomplex(complex ob1,complex ob2)
	{
		real=ob1.real+ob2.real;
		imag=ob1.imag+ob2.imag;
	}
	public void display()
	{
		System.out.println(real+"+"+imag+"i");
	}
}

