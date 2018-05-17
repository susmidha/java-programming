import java.util.*;
import java.lang.*;
import java.io.*;
import java .util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.print("enter the character");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b&&a>c)
		System.out.print("a is largest"+a);
		else if(b>c&&b>a)
		System.out.println("b is largest"+b);
		else
		System.out.println("c is largest"+c);
	}
}
