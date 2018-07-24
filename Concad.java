import java.util.*;

public class Concad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,sum=0,sum1=0,sum3=0;
		String ss=" " ;
		String ss1=" ";
		String ss4=" ";
		String ss5=" ";
		ArrayList<String>al=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++) {
			sum1=0;
			sum=0;
			n=sp[i].length();
			///System.out.println(n);
			if(n%2==0) {
				for(int j=0;j<n/2;j++) {
					sum+=j+n-(j+1);
					
				}
				 ss4=Integer.toString(sum);
				 al.add(ss4);
			}
			else {
				for(int j=0;j<n/2;j++) {
					
					sum1+=j+n-(j+1);
				}
				 ss=Integer.toString(sum1);       
				sum3=n/2;
		        ss1=Integer.toString(sum3);
				al.add(ss+ss1);
				System.out.println(al);
			}
		}
		for(int i=0;i<al.size();i++) {
			ss5=ss5+al.get(i);
		}
		
		System.out.println(ss5);
		
	}

}
