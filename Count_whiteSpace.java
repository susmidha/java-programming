import java .util.*;
public class Count_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int count=0;

for(int i=0;i<s.length();i++) {
	if(Character.isWhitespace(s.charAt(i))) {
	
		count++;
	}
	else {
		//count++;
	//System.out.println(count);
	}
}
System.out.println(count);

	}

}
