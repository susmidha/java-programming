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
		String s=scan.nextLine();
		switch(s){
			
					case "i":
				System.out.println(1);
				break;
					case "ii":
				System.out.println(2);
				break;
					case "iii":
				System.out.println(3);
				break;
					case "iv":
				System.out.println(4);
				break;
					case "v":
				System.out.println(5);
				break;
				default:
				System.out.println("enter valid number");
				break;
				
		}
	}
}
