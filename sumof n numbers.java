import java.util.*;
import java.lang.*;
import java.io.*;
import java .util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int n,i;
		int s=0;
		Scanner scan =new Scanner(System.in);
		System.out.print("enter your rane:");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
		s=s+i;
		}
		System.out.print(s);
	       }
		
	}
