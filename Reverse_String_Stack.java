import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your string");
		String str=scan.nextLine();
		Stack s=new Stack();
		for(int i=0;i<str.length();i++){
			s.push(str.charAt(i));
		}
		String rev="";
		while(!s.isEmpty()){
			rev=rev+s.pop();
		}
		if(str.equals(rev)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
