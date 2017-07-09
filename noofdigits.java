/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,length;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number");
		a = s.nextInt();
		length = String.valueOf(a).length();
		System.out.println(length);

	}
}