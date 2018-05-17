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
		
		char ch;
		Scanner scan =new Scanner(System.in);
		System.out.print("enter your character:");
		ch=scan.next().charAt(0);
		if(ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='O'||  ch=='u'){
		System.out.print("vowels");
		}
		else
		{
		System.out.print("consonent");
		}
	      
	       }
		
	}
