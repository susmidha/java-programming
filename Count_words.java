import java.util.*;

public class Num_of_lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String s1[]=s.split(" ");

int count=0;
for(int i=0;i<s1.length;i++) {

	count++;
}
System.out.println(count);

	}
	}


