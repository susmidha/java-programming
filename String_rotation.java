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
		String  s1=scan.nextLine();
		String s2=scan.nextLine();
		String s3="";
		int n1=s1.length();
		int n2=s2.length();
		if(n1!=n2){
			System.out.println("its not a  totated verson");
		}
		else{
			s3=s1+s1;
			if(s3.contains(s2)){
				System.out.println("yes");
			}
			else{
	                        	System.out.println("npo");	
			}
		}
	}
}
