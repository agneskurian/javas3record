import java.io.*;
class sample
{
        int l,b,h;

        void area(int l,int b)
        {
                int area1=l*b;
                System.out.println("Area of triangle="+area1);
        }
        void area(int l,int b,int h)
        {
                int area2=l*b*h;
                System.out.println("Area of rectangle="+area2);

        }
}
class overloading
{
        public static void main(String args[])throws IOException
        {
                int l,b,h;

                System.out.println("Enter l,b,h");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                l=Integer.parseInt(br.readLine());
                b=Integer.parseInt(br.readLine());
                h=Integer.parseInt(br.readLine());
                sample ob=new sample();
                ob.area(l,b);
                ob.area(l,b,h);
        }
}

