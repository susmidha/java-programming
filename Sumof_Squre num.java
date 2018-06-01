import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	            int rem,sum=0;
		Scanner scan =new Scanner(System.in);
		int  num=scan.nextInt();
		while(num!=0){
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
	         System.out.println(sum);
	}
}
