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
		String day=scan.nextLine();
	switch(day){
		case "sunday":
			System.out.println("yes");
			break;
	            case "saturday":
	            	System.out.println("yes");
			break;
	            default:
			System.out.println("no");
			break;	
	}
	}
}
