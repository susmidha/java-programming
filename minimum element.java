import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of input");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		if((x<y)&&(x<z))
		{
			System.out.print(x);
		}
		else if((y<x)&&(y<z))
		{
			System.out.print(y);
		}
		else
		{
			System.out.print(z);
		}
		
	}
}
