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
		int x1=scan.nextInt();
		int y1=scan.nextInt();
			int x2=scan.nextInt();
			int y2=scan.nextInt();
				int x3=scan.nextInt();
				int y3=scan.nextInt();
	if(x1==x2&&x1==x3){
		System.out.println("yes");
	}
          else if(y1==y2&&y1==y3){
			System.out.println("yes");
	}
	else{
		System.out.println("no");	
	}
				
	}
}
