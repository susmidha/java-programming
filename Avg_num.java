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
		int n=scan.nextInt();
		int a[]=new int[n];
		int r=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			r=r+a[i];
		}
		System.out.println(r/n);
	}
}
