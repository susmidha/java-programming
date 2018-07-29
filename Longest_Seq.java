import java.util.*;
public class Longest_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		
		      int a[]= {12,51,100,212,15,12,7,3,57,900,312,78,19,100,102,101,99,77,0,-5};
		     int  count1=1;
		     int count=0,c=0,c2=0;
		      ArrayList<Integer> al=new ArrayList<Integer>();
		      TreeSet<Integer> al1=new TreeSet<Integer>();
		      for(int i=1;i<a.length;i++){
		    	if(a[i-1]>a[i]){
		    		 c=++count1;	
		    		 al.add(c);
		    	}
		    	else {
		    		
		    		c=c>c2?c:c2;
		    		c2=c;
		    		
		    		count1=1;
		    	}
		    	
		      }
		      System.out.println(c);
		      for(int i=0;i<al.size();i++) {
		    		al1.add(Collections.frequency(al, al.get(i)));
		    	  }
		      System.out.println(al1.last());
		      
		      
		     
		      }
			}

	
