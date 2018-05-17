import java.util.*;
import java.lang.*;
import java.io.*;
import java .util.Scanner;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
		Scanner scan =new Scanner(System.in);
		System.out.print("enter the year:");
		a=scan.nextInt();
		if(a%4==0)
		System.out.print("leapyear!"+a);
		else
		System.out.println("not a leapyear!"+a);
	}
}
