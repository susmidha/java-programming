import java.io.*;
import java.util.*;
class Account{
	int accno;
	String acc_Type;
	String acc_Name;
	int date;
	int branch_Code;
	int acc_Bal;
	int count=0;

	public void account_Details(int accno,String acc_Type,String acc_Name,int date,int branch_Code,int acc_Bal){
	this.accno= accno;
	this.acc_Type= acc_Type;
	this.acc_Name=acc_Name;
	this.date=date;
	this.branch_Code=branch_Code;
	this.acc_Bal=acc_Bal;
	}
	public void credit_Details(int amt){
		acc_Bal=acc_Bal+amt;
		System.out.println("Balance is"+acc_Bal);
	}
	public void deposit_Details(int amt){
		acc_Bal=acc_Bal-amt;
		System.out.println("Balance is"+acc_Bal);
	}
	
}
class Transcation extends Account{
	
	
	
}


public class Bank_Project {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
