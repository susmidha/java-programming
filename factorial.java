import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int f=1;
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		for(int i=num1;i>0;i--)
		{
		 f=f*i;	
			
		}
		System.out.print(f);
	}
}
