import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str1=s.next();
	            String str2=s.next();
	            int n1=str1.length();
	            int n2=str2.length();
	            if(n1>n2){
	            	System.out.println(str1);
	        
	            }
	            else if(n1<n2){
	            	System.out.println(str2);
	        	
	            }
	            else{
	            		System.out.println(str2);
	            }
		
		
	}
}
