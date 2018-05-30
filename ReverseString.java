
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
		int a;
		String rev="";
		
		String s=scan.nextLine();
		System.out.println(s);
		a=s.length();
		for(int i=a-1;i>=0;i--)
		{
		 rev = rev + s.charAt(i);
		}
			System.out.println(rev);
	}
}
