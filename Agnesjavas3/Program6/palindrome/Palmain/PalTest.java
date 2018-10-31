import palpack.Palindrome;
import java.io.*;
class PalTest
{
	public static void main(String args[])throws IOException
	{
		StringBuffer sb=new StringBuffer(args[0]);
		Palindrome p=new Palindrome();
		p.pal(sb);
	}	
}



