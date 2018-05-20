import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int start,end;
		int count,j,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit");
		start=scan.nextInt();
		end=scan.nextInt();
		for(i=start;i<end;i++)
		{
			count=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("prime number"+i);
			}
		}
		
	}
}
