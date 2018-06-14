import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of element");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			System.out.println(arr[i]);
		}
		System.out.println("enter the k value");
		int k=scan.nextInt();
		for(int a=0;a<n;a++ ){
			for(int b=a+1;b<n;b++){
				if(arr[a]>arr[b]){
					int temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;

                                              }
			}
		}
	System.out.println("the largest"+arr[n-k]);
		
			}
}
