import java.util.Scanner;

import java.lang.*;
public class Password {

	/**
	 * @param args
	 */
	public static String toToggle(String s){
		String res="";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(c[i])){
				String r=Character.toString(c[i]).toLowerCase();
				res=res+r;
			}
			else if(Character.isLowerCase(c[i])&&i==s.length()-1){
				String r=Character.toString(c[i]).toUpperCase();
				res=res+r;
			}
			else{
				res=res+c[i];
			}
		}
		return res;
		
	}
	public static int toSum(int reg){
		String s=Integer.toString(reg);
		int t[]=new int[7];
		int re=0;
		int sum=0;
		for(int i=0;i<s.length();i++){
			t[i]=Integer.parseInt(Character.toString(s.charAt(i)));
			int a=t[s.length()-1];
			int b=t[s.length()-2];
			int c=t[s.length()-3];
			 re=a+b+c;
		}
		while(re!=0){
			int rem=re%10;
			sum=sum+rem;
			re=re/10;
		}
		return sum;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int reg=scan.nextInt();
		
		String ss=s1.substring(0,3);
		System.out.println(ss);
		String result1=Password.toToggle(ss);
		System.out.println(result1);
		int result2=Password.toSum(reg);
		System.out.println(result2);
		char sym[]={'!' ,'@' ,'#', '$', '%' ,'^' ,'*' ,',' ,'(',')'};
		char s='\n';
		for(int i=1;i<10;i++){
			if(i==result2){
				s=sym[i];
			}
	 
		}
		System.out.println(result1+s+result2);
	}

}
