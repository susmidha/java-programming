
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]=new int[50];
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of input");
		int n=scan.nextInt();
	            for(i=0;i<n;i++)
	            {
	            	arr[i]=scan.nextInt();
	            }
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("ascending order");
		for(i=0;i<=n-1;i++)
	{
		System.out.print(arr[i]);
	}	
	}
}
