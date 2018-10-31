import java.io.*;
class sum
{
	public static void main(String args[])throws IOException
	{
		int s,n,m;
		float a,b,c;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter two numbers:");
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		s=n+m;
		System.out.println("Sum of " +n+" and "+m+" is:"+s);
		System.out.println("\nEnter two floating value is:");
		a=Float.valueOf(br.readLine());
		b=Float.valueOf(br.readLine());
		c=a+b;
		System.out.println("\nSum of two floating point value is:"+c);
	}
}

