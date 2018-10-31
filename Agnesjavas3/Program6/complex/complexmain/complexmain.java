import java.io.*;
import complexpack.*;
public class complexmain
{
        public static void main(String args[])throws IOException
        {
                int r,r1,i,i1;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter first complex number");
                r=Integer.parseInt(br.readLine());
                i=Integer.parseInt(br.readLine());
                complex ob1=new complex(r,i);
                System.out.println("Enter second complex number");
                r1=Integer.parseInt(br.readLine());
                i1=Integer.parseInt(br.readLine());
                complex ob2=new complex(r1,i1);
                complex ob3=new complex();
                ob3.addcomplex(ob1,ob2);
                System.out.println("Addition of complex numbers:");
                ob3.display();
        }
}

