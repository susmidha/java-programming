import java.util.*;

public class Descending_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
TreeSet<Integer> t=new TreeSet<Integer>();
TreeSet<Integer> t2=new TreeSet<Integer>();
int n=sc.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	t.add(arr[i]);
}
t2=(TreeSet)t.descendingSet();
Iterator itr=t2.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()+"");
}



	}

}
