import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int rem,num=0;
			int count=0;
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		
		for(int i=start;i<=end;i++)
		{
		 	count=i;
			while(count>0)
			{
				rem=count%10;
				num=num+(rem*rem*rem);
				count=count/10;
				
			}
			if(i==num)
			{
				System.out.print(i+"\n");
			}
			num=0;
		}
	}
}
