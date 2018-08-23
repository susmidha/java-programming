import java.util.ArrayList;
import java.util.Scanner;

public class Phone_Ass3 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String num=scan.nextLine();
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> al1=new ArrayList<Integer>();

for(int i=0;i<num.length();i++) {
	al.add(Integer.parseInt(Character.toString(num.charAt(i))));
}
//9677531106
int sum=al.get(0);
int a=0,b=0,c=0;
for(int i=1;i<al.size();i++) {
	
	if(sum%2!=0) {
		sum+=al.get(i);
		if(sum%2==0) {
			System.out.println(sum);
			sum=al.get(i+1);
			i=i+1;
		}
		if(sum%2!=0&&i==al.size()-1) {
			System.out.println(sum);
		}
		
	}
	if(sum%2==0) {
		
		sum+=al.get(i);
		if(sum%2!=0) {
			System.out.println(sum);
			sum=al.get(i+1);
			i=i+1;
		}
		if(sum%2==0&&i==al.size()-1) {
			System.out.println(sum);
		}
	}
}

	}

}
