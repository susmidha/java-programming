import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rem,rev=0,org;
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		org=n;
		while(n!=0)
		{
		rem=n%10;
	             rev=rev*10+rem;
		n=n/10;
		}
		if(rev==org)
		{
                         	System.out.print("its palindrom");
		}
		else
		{
			System.out.print("its not palindrom");
		}
		}
	}
