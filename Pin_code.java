import java.io.*;
	import  java.util.*;

	// Read only region start
	class Pin_Code
	{

		public static void main(String args[]){
			// Read only region end
			// Write code here...
			Scanner sc=new Scanner(System.in);
			int input1=sc.nextInt();
			int input2=sc.nextInt();
			int input3=sc.nextInt();
			int t1[]=new int[3];
			int t2[]=new int[3];
			int t3[]=new int[3];
			int x=0,y=0,z=0,z2=0,i,j,k,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
			int x1=0,y1=0,z1=0,i1=0;
			if((input1>=100&&input1<=999)||(input2>=100&&input2<=999)||(input3>=100&&input3<=999)) {
			String s1=Integer.toString(input1);
			String s2=Integer.toString(input2);
			String s3=Integer.toString(input3);
				for( i=0;i<s1.length();i++){
					t1[i]=Integer.parseInt(Character.toString(s1.charAt(i)));
					 a=t1[0];
					 b=t1[1];
					 c=t1[2];
				}
				for( j=0;j<s2.length();j++){
					t2[j]=Integer.parseInt(Character.toString(s2.charAt(j)));
					d=t2[0];
					 e=t2[1];
					 f=t2[2];
				}
				for(k=0;k<s3.length();k++){
					t3[k]=Integer.parseInt(Character.toString(s3.charAt(k)));
					 g=t3[0];
					 h=t3[1];
					 i1=t3[2];
				}
				if(c<f&&c<i1){
					 x=c;
				}
				else if(f<c&&f<i1){
					x=f;
				}
				else{
					x=i1;
				}
				if(b<e&&b<h){
				y=b;
			}
				else if(e<b&&e<h){
				y=e;
			}
				else{
					y=h;
				}
				if(a<d&&a<g){
				z=a;
			}
				else if(d<a&&d<g){
				z=d;
			}
				else{
					z=g;
				}
			
			if(c<f&&c<i){
					 x=c;
				}
				else if(f<c&&f<i){
					x=f;
				}
				else{
					x=i;
				}
				if(b<e&&b<h){
				y=b;
			}
				else if(e<b&&e<h){
				y=e;
			}
				else{
					y=h;
				}
				if(a<d&&a<g){
				z=a;
			}
				else if(d<a&&d<g){
				z=d;
			}
				else{
					z=g;
				}
			
		    if(c>f&&c>i1){
					 x1=c;
				}
				else if(f>c&&f>i1){
					x1=f;
				}
				else{
					x1=i1;
				}
		    System.out.println(x1);
				if(b>e&&b>h){
				y1=b;
			}
				else if(e>b&&e>h){
				y1=e;
			}
				else{
					y1=h;
				}
				System.out.println(y1);
				if(a>d&&a>g){
				z1=a;
			}
				else if(d>a&&d>g){
				z1=d;
			}
				else{
					z1=g;
				}
				System.out.println(z1);
				if(x1>y1&&x1>z1){
					z2=x1;
				}
					else if(y1>x1&&y1>z){
					z2=y1;
				}
					else{
						z2=z1;
					}
				
				System.out.println(z2+""+z+""+y+""+x);
			}
			
		}
	
	}
	
			

		


