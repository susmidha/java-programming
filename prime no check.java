import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int start;
		int j,i;
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit");
		start=scan.nextInt();
		i=start;
		
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("yes");
			}
			else
			{
				
				System.out.println("no");
				
			}
		}
		
	}
