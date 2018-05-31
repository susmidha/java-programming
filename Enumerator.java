import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Ideone
{
	enum State{
			TamilNadu,Kerala,AndraPradesh,Karnadaka
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		State s;
		s=State.TamilNadu;
		System.out.println("it contains:"+s);
		s=State.Kerala;
		if(s==s.Kerala){
		System.out.println("it contains:"+s);	
		}
		switch(s){
			case TamilNadu:
				System.out.println("it contains:"+s);
				break;
			
				case Kerala:
				System.out.println("it contains:"+s);
				break;
				case AndraPradesh:
				System.out.println("it contains:"+s);
				break;
				case Karnadaka:
				System.out.println("it contains:"+s);
				break;
				default:
				System.out.println("it contains null");
				break;
		}
		
	}
	
}
