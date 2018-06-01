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
		case "Sunday":
			System.out.println("yes");
			break;
	        case "Saturday":
	            	System.out.println("yes");
			break;
		 case "Monday":
	            System.out.println("no");
			break;
	         case "Tueday":
	            	System.out.println("no");
			break;
			 
		case "Wednesday":
	            	System.out.println("no");
			break;
			
		case "Thursday":
			System.out.println("no");
			break;
			
		case "Friday":
	            	System.out.println("no");
			break;
	            default:
			System.out.println("no");
			break;	
	}
	}
}
