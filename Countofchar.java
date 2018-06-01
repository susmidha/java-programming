
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class GFG
{
	// Method that return count of the given
	// character in the string
	public static int count(String s, char c)
	{
		int res = 0;

		for (int i=0; i<s.length(); i++)
		{
			// checking character in string
			if (s.charAt(i) == c)
			res++;
		} 
		return res;
	}
	
	// Driver method
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str= scan.next();
		char c = '1';
		System.out.println(count(str, c));
	}
}
