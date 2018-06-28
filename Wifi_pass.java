import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String name=scan.nextLine();
String  res="";
int rem=0,rem1=0,sum=0, rem2=0;
int t[]=new int[3];
int room=scan.nextInt();
int r=room;
char str='\u0000';
char str2='\u0000';
char a[]={'!','@','#','%','&','/','(',')','?','+'};
for(int i=name.length()-1;i>=0;i--){
res=res+name.charAt(i);
}
for(int j=0;j<res.length()-1;j++){
	str=res.charAt(0);
}
rem=room%10;
while(room!=0){
	rem1=room%10;
	sum=sum+rem1;
	room=room/10;
	
}
String s=Integer.toString(r);
for(int k=0;k<s.length();k++){
 t[k]=Integer.parseInt(Character.toString(s.charAt(k)));

}
int c=t[1];


for(int l=0;l<10;l++){
if(l==c)
{
 
 str2=a[l];
}
}


System.out.println(str2+""+sum+""+rem+""+str);
	}

	
}

	
