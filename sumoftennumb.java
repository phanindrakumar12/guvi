/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
     int x1,i;
Scanner s1=new Scanner(System.in);

x1=s1.nextInt();
int add[] = new int[x1];
System.out.print("enter number of numbers");
for(i=0;i<x1;i++)
{
Scanner st=new Scanner(System.in);
add[i]=st.nextInt();
}
 

System.out.print("the sum of the numbers are");

for(i=0;i<x1;i++);
{add[i+1]=add[i]+add[i+1];
}

System.out.print(add[x1-1]);
	}
}

