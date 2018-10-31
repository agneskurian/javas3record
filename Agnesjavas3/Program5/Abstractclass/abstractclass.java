import java.io.*;
abstract class shape
{
	float l,b;
	shape()
	{
		l=10;
		b=20;
	}
	shape(float x,float y)
	{
		l=x;
		b=y;
	}
	abstract public float area();
}
class rectangle extends shape
{
	rectangle()
	{
		super();
	}
	rectangle(float x,float y)
	{
		super(x,y);
	}
	public float area()
	{
		float a=l*b;
		return a;
	}
}
class triangle extends shape
{
	triangle()
	{
		super();
	}
	triangle(float x,float y)
	{
		super(x,y);
	}
	public float area()
	{
		float a=(l*b)/2;
		return a;
	}
}
class abstractclass
{
	public static void main(String args[])throws IOException
	{
		float x,y,a1,a2,area1,area2;
		BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
		rectangle rect=new rectangle();
		a1=rect.area();
		System.out.println("Area of rectangle using default constructor: "+a1);
		triangle tri=new triangle();
		a2=tri.area();
		System.out.println("Area of triangle using default constructor: "+a2);

		System.out.println("Enter the length:");
		x=Float.parseFloat(br.readLine());
		System.out.println("Enter the breadth:");
		y=Float.parseFloat(br.readLine());
		rectangle r=new rectangle(x,y);
		area1=r.area();
		System.out.println("Area of rectangle: "+area1);
		triangle t=new triangle(x,y);
		area2=t.area();
		System.out.println("Area of Triangle: "+area2);
	}
}
