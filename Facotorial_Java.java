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
		int s=1;
		for(int i=a;i>0;i--){
		s=s*i;
	
		}
			System.out.println(s);
	}
}
