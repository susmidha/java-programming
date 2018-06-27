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
		int in1=scan.nextInt();
		int in2=scan.nextInt();
		int in3=scan.nextInt();
		
		int s,r,s1=0,r1=0 ,r2=0 ,r3=0 ,r4=0 ,r5=0;
		s=in1;
		r=in2;
		for(int i=1;i<=in3;i++){
			for(int j=1;j<=i;j++){
				if(i==1&&j==1){
				 r1=s;
				}
				if((i==2&&j==1)||(i==2&&j==2)){
					r2+=(s+r);
					
				}
				if((i==3&&j==1)||(i==3&&j==2)||(i==3&&j==3)){
				 r3+=(s+(r*2));
				 
				}
				if((i==4&&j==1)||(i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)){
				 r4+=(s+(r*3));
				 
				}
				if((i==5&&j==1)||(i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4)||(i==5&&j==5)){
				r5+=(s+(r*4));
			
				}
				
			
			}
		
		}
			s1=r1+r2+r3+r4+r5;
			System.out.println(s1);	
			 
	}
}
