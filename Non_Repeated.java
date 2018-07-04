import java.util.*;
public class Non_Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		TreeSet<Integer> t =new TreeSet<Integer>();
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextInt();
			al.add(arr[i]);
		}
		
		for(int j=0;j<al.size();j++) {
			al1.add(Collections.frequency(al, al.get(j)));
		}
		for(int j=0;j<al.size();j++) {
			if(al1.get(j)>1) {
				
				al2.add(al.get(j));
				t.addAll(al2);
			}
		}
		System.out.println(t);
	}

}
