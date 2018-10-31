import java.io.*;
import java.lang.*;
class StringManipulation
{
	 public static void main(String args[]) throws IOException
	 	{
                    String s1,s2;
    	            BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter first string:");
                    s1=ob.readLine();
                    System.out.println("Enter second string:");
                    s2=ob.readLine();
                    System.out.println("STRING MANIPULATION OPERATIONS");
                    System.out.println("---------------------------");
                    System.out.println("First string is: "+s1);
                    System.out.println("Second string is: "+s2);
                    System.out.println("After converting first string to uppercase: "+s1.toUpperCase()); 
                    System.out.println("After converting second string to lowercase: "+s2.toLowerCase());
                    char ch=s1.charAt(0);
                    System.out.println("First string character at position is: "+ch);
                    if(s1.compareTo(s2)==0)
			{
 			    System.out.println(s1+"Equals"+s2+"-> "+s1.equals(s2));
 			}
                     else
			{
                          System.out.println(s1+" Not Equals "+s2+"-> "+s1.equals(s2));
                        }
                       
		     String s4=s1.concat(s2);
                     System.out.println("After concatenating s1 and s2: "+s4);
	             String s3=s1.replace('B','S');
                     System.out.println("After replacing character 'B' into 'S' in first string is: "+s3);
                     s1=s1.trim();
                     System.out.println("After Trim: "+s1);
                     System.out.println("String Buffer\n----------------");
                     StringBuffer sb=new StringBuffer(s1);
                     System.out.println("Buffer: "+sb);
                     System.out.println("The character at position 1 is: "+sb.charAt(1));
                     sb.append("best").append("!").toString();
                     System.out.println("After appending: "+sb);
                     sb.insert(5,"is");
                     System.out.println("After inserting: "+sb);
                     sb.reverse();
                     System.out.println("After reversing: "+sb);
                     sb.replace(5,7,"iii");
                     System.out.println("After Replacing: "+sb);
                 }
}

