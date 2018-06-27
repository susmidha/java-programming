import java.util.Scanner;


public class Sequence_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={2,3,4,1,2,3,4,5,6,7,1};
     int  count1=1;
     int count=0,c=0,c2=0;
      
      for(int i=1;i<a.length;i++){
    	if(a[i]>a[i-1]){
    		 c=count1++;
    
    	}
    	else{
    		c=c>count?c:count;
    		i=i+1;
    		
    	}
    	
      }
      System.out.println(c);
	}

}
