import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan =new Scanner(System.in);
		int n =scan.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++)
			num[i]=scan.nextInt();
		int max=Integer.MIN_VALUE;
		for (int a=0;a<n;a++)
		{
			int sum=0;
			for(int b=a;b<n;b++){
				sum=sum+num[b];
				if(sum>max)
				max=sum;
			}
		}
		System.out.println(max);
		
	
	}
}
