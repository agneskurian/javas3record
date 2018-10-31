import java.io.*;
interface exam
{
	public void percent_call();
}
class student
{
	String name;
	int rollno;
	public int mark1,mark2;
	student(String n,int r,int m1,int m2)
	{
		name=n;
		rollno=r;
		mark1=m1;
		mark2=m2;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("roll no:"+rollno);
		System.out.println("mark1:"+mark1);
		System.out.println("mark2:"+mark2);
	}
}
class result extends student implements exam
{
	float percentage,total;
	result(String n1,int r1,int mk1,int mk2,float t)
	{
		super(n1,r1,mk1,mk2);
		total=t;
	}
	public void percent_call()
	{
		percentage=((mark1+mark2)/total)*100;
	}
	void display()
	{
		super.display();
		System.out.println("Percentage:"+percentage);
	}
}
class inheritance
{
	public static void main(String args[])throws IOException
	{
		DataInputStream ob=new DataInputStream(System.in);
		int roll,mkr1,mkr2,n;
		float tot1,tot2,total;
		String name1;
		System.out.println("percentage of mark using multiple inheritance");
		System.out.println(".................................................");
		System.out.println("Enter the limit:");
		n=Integer.parseInt(ob.readLine());
		result r[]=new result[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the name:");
			name1=ob.readLine();
			System.out.println("Enter the roll number:");
			roll=Integer.parseInt(ob.readLine()); 
			System.out.println("Enter the total mark in subject1:");
			tot1=Integer.parseInt(ob.readLine());
			System.out.println("Enter the mark obtained in subject1:");	
			mkr1=Integer.parseInt(ob.readLine());	
			System.out.println("Enter the total mark in subject2:");
			tot2=Integer.parseInt(ob.readLine());
			System.out.println("Enter the mark obtained in subject2:");    
			mkr2=Integer.parseInt(ob.readLine());
			total=tot1+tot2; 
			r[i]=new result(name1,roll,mkr1,mkr2,total);
			r[i].percent_call();
			System.out.println("STUDENT DETAILS");
			System.out.println("---------------");
			r[i].display();
		}
	}
}
