import java.util.Scanner;


public class Prime_Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count;
		int s1=0;
		for(int i=2;i<100;i++){
             count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
	                break;
					
				}
					
			}
			if(count==0){
				s1++;
				if(s1==n)
				System.out.println(i);
				
			}
			
			
		}
	
		

	}

}
