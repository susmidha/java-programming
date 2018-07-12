import java .util.*;
public class Count_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int count=0;
String t[]=new String[s.length()];

for(int i=0;i<s.length();i++) {
	if(Character.isWhitespace(s.charAt(i))) {
		count--;
		//System.out.println(count);
	}
	else {
		count++;
		//System.out.println(count);
	}
}
System.out.println(count);

	}

}
import java .util.*;
public class Count_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int count=0;
String t[]=new String[s.length()];

for(int i=0;i<s.length();i++) {
	if(Character.isWhitespace(s.charAt(i))) {
		count--;
		//System.out.println(count);
	}
	else {
		count++;
		//System.out.println(count);
	}
}
System.out.println(count);

	}

}
