import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements in the array");
	    int n1=sc.nextInt();
		int arr[]=new int[n1];
		//taking array input 
		for(int i=0;i<n1;i++){
		    arr[i]=sc.nextInt();
		}
		//displaying the input array 
		for(int i=0;i<n1;i++){
		    System.out.print(arr[i]+" ");
		}
		//insertion sorting algo
		for(int i=0;i<n1;i++){
		    int currval=arr[i];
		    int j=i-1;
		    while(j>=0 && arr[j]>=currval ){
		        arr[j+1]=arr[j];
		        j=j-1;
		    }
		  arr[j+1]=currval;
		    }
		    //displaying sorted array 
		    for(int i=0;i<n1;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
