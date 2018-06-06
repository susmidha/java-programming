import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 interface Bank{
      public void account_details(int accno,String name,int bal);
      public void credit_details(int amt);
      public void debit_details(int amt);
}
class IOB implements Bank{
	String name;
	int accno,bal;
        public void account_details(int accno,String name,int bal){
		this.accno=accno;
		this.name=name;
		this.bal=bal;
		
	}
	void display(){
		System.out.println("ACCOUNT DETAILS");
		System.out.println("accno:"+accno);
			System.out.println("name:"+name);
				System.out.println("Bal:"+bal);
	}
	
 public void credit_details(int amt){
		bal=bal+amt;
		System.out.println("credit _amt:"+bal);
	}
	public void debit_details(int amt){
		bal=bal-amt;
		System.out.println("debit_amt:"+bal);
	}
}
class Ideone
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int accno=scan.nextInt();
		String name=scan.next();
		int bal=scan.nextInt();
		IOB iob=new IOB();
		iob.account_details(accno,name,bal);
		iob.display();
		System.out.println("enter the credit amt:");
		int amt=scan.nextInt();
		iob.credit_details(amt);
		System.out.println("enter the debit amt:");
		int amt2=scan.nextInt();
		iob.debit_details(amt2);
		
		
	}
}
