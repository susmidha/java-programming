import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
