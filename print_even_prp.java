import java.util.*;;


public class Print_even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0,i=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int t[]=new int[5];
		String s=Integer.toString(n);
		for( i=0;i<s.length();i++){
			t[i]=Integer.parseInt(Character.toString(s.charAt(i)));
		}
		for(int j=0;j<s.length();j++){
		
			if(t[j]%2!=0){
				rem=t[j]+rem;
				if((rem%2)==0){
					
					System.out.println(rem); 
			}
	
				
			}
			
			
			else{
				rem=rem+t[j];
				if((rem%2)!=0){
					
					System.out.println(rem);
				}
			}
			
			
		
			
		}
		}
		
		

		}
	


