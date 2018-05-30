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
		int a=scan.nextInt();
	int s=0,r;
		while(a!=0){
		           r=a%10;
		 s=s*10+r;
			a=a/10;
			
		}
		System.out.println(s);
	
		
	}
}
