/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,r;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter 3 numbers");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		if (a>b &&a>c)
		 r=a;
		else if (b>a && b>c)
		 r=b;
		else 
		 r=c;
		System.out.println("The largest of the three numbers is:" + r);
	}
}