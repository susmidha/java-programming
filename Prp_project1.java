
import java.util.*;
class Account{
	int accno;
	String acc_Type;
	String acc_Name;
	String date;
	int branch_Code;
	int acc_Bal;
	int count;

	public void account_Details(int accno,String acc_Type,String acc_Name,String date,int branch_Code,int acc_Bal,int count){
	this.accno= accno;
	this.acc_Type= acc_Type;
	this.acc_Name=acc_Name;
	this.date=date;
	this.branch_Code=branch_Code;
	this.acc_Bal=acc_Bal;
	this.count=count;
	}
	public void credit_Details(int amt){
		count++;
		acc_Bal=acc_Bal+amt;
		System.out.println("Balance is: "+acc_Bal);
		System.out.println("no of transaction: "+count);
		 if(count>=3) {
          	 System.out.println("no of transaction exceeds the limit:");
          	 acc_Bal=acc_Bal-50;
          	 System.out.println("remaining bal:"+acc_Bal); 
           }
		 if(acc_Type=="SB") {
			 System.out.println("maximum limit is reached:");
			 acc_Bal=acc_Bal-100;
			 System.out.println("Remaining bal: "+acc_Bal); 
		 }
		 else if((acc_Type=="CB")&&(amt>=100000)) {
			 System.out.println("maximum limit is reached:");
			 acc_Bal=acc_Bal-100;
			 System.out.println("Remaining bal: "+acc_Bal); 
		 }
		 else {
			 System.out.println("Invalid details");
			 
		 }
		 }
	public void withdraw_Details(int amt){
		count++;
		acc_Bal=acc_Bal-amt;
		System.out.println("Balance is"+acc_Bal);
		System.out.println("no of transaction"+count);
		 if(count>=3) {
          	 System.out.println("no of transaction exceeds the limit:");
          	 acc_Bal=acc_Bal-50;
          	 System.out.println("remaining bal:"+acc_Bal);
           }
		
	}
	
}
class Transaction extends Account{
	public void display() {
		System.out.println("ACCOUNT DETAILS");
		System.out.println("Account number:"+accno);
		System.out.println("Account Type:"+acc_Type);
		System.out.println("Account holder:"+acc_Name);
		System.out.println("Date of Opening:"+date);
		System.out.println("Branch_Code:"+branch_Code);
		System.out.println("Account_Bal:"+acc_Bal);
		
	}
	public void Fine() {
	if(acc_Type=="SB") {
		 System.out.println("maximum limit is reached:");
		 acc_Bal=acc_Bal-100;
		 System.out.println("Remaining bal: "+acc_Bal); 
	 }
	 else  {
		 System.out.println("maximum limit is reached:");
		  
	 }
	 

	}
	
}


public class Bank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("Banking Management System");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your account number:");
		int accno=scan.nextInt();
		System.out.println("Enter your account type:");
		String acc_Type=scan.next();
		System.out.println("enter the name of account holder");
		String acc_Name=scan.next();
		System.out.println("Enter the date of opening");
		String date=scan.next();
		System.out.println("Enter the branch code");
		int branch_code=scan.nextInt();
		System.out.println("Balence Amount");
		int acc_Bal=scan.nextInt();
          Transaction t = new Transaction();
          
                   t. account_Details(accno, acc_Type, acc_Name, date, branch_code,acc_Bal,count);
                   int ch=1;
             while(ch>=1) {
                   System.out.println("1.deposit 2.withdraw 3.Show details ");
                    ch=scan.nextInt();
     
                   switch(ch) {
                   case 1:
                	   System.out.println("Enter the amount Deposit");
                       int amt=scan.nextInt();
                       t.credit_Details(amt);
                        break;
                   case 2:
                	   System.out.println("Enter the withdraw Amount and acc_Type");
                       int amt1=scan.nextInt();
                       System.out.println("Enter the acc_Type");
                       String ac_Type=scan.next();
                       t.withdraw_Details(amt1);
                       break;
                   case 3:
                	   t.display();
                	   break;
                   case 4:
                	   t.Fine();
                	   break;
                	   
                   default:
                		   System.out.println("invalid selection");              	   
                   }
                   continue;
             }
             
             }
                   }
             

