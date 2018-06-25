
import java.util.Scanner;

public class String_Reverse {
	public  static String toChange(String r) {
	
	String result="";
		for(int i=0;i<r.length();i++) {
			char cchar=r.charAt(i);
			if(Character.isUpperCase(cchar)&&i== r.length()-1) {
				char rchar=Character.toLowerCase(cchar);
				
				result=result+rchar;
			}
			else if(Character.isLowerCase(cchar)&& i==0) {
				char rchar=Character.toUpperCase(cchar);
				result+=rchar;
		}
			else {
				result+=cchar;
			}
			
		
		
		}

	 return  result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     String s=scan.nextLine();
     String[] str=s.trim().split("\\s+");
     String s1=str[0];
     String s2=str[1];
     String r1="";
     String r2="";
     for(int i=s1.length()-1;i>=0;i--) {
    	 r1=r1+s1.charAt(i);
     }
     for(int j=s2.length()-1;j>=0;j--) {
    	 r2=r2+s2.charAt(j);
     }
    
    String res1= String_Reverse.toChange(r1);
    String res2= String_Reverse.toChange(r2);
    System.out.println(res1 +res2);

     
     
	}
	

}

