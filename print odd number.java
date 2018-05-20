import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner scan=new Scanner (System.in);
		int x=scan.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			if(!(i%2==0))
			{
				System .out.print(i);	
			}
			
		}
	}
}
