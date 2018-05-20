import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,num=0,rem,org;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit");
		n=scan.nextInt();
		org=n;
		while(n!=0)
		{
			rem=n%10;
			num=num+rem*rem*rem;
			n=n/10;
			
		}
		if(num==org)
		{
			System.out.print("its amstrong\n");
		}
		else
		{
			System.out.print("its not amstrong\n");
		}
	
	
		}
		
	}
