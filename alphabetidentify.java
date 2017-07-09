/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{ 

	public static void main (String[] args) throws java.lang.Exception
	{ int x1;
		Scanner s=new Scanner(System.in);
x1=s.nextInt();
if (((x1>='a')&&(x1<='z'))||((x1>='A')&&(x1<='Z')))
{ System.out.print("it is an alphabet"); }
else
{ System.out.print("it is not an alphabet"); }

	}
}