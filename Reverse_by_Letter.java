import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String str=scan.nextLine();
		String  rev="";
		for(int i=str.length()-1;i>=0;i--)
		
			rev=rev+str.charAt(i);
            System.out.println(rev);
		
	}
}
