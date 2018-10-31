package palpack;
public class Palindrome
{
	public void pal(StringBuffer s1)
	{
		StringBuffer s=new StringBuffer();
		String s2=s1.toString();
		s=s1.reverse();
		String s3;
		s3=s.toString();
		if(s2.equals(s3))
			System.out.println("It is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}


