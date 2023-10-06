import java.util.*; //importing the scanner class
public class Main
{
	public static void main(String[] args) {
	    Scanner read=new Scanner(System.in);
	    System.out.println("Enter the total number of elements in the array");
	    int n1=read.nextInt();
  int arr[]=new int[n1];
//taking input of the elements
  for(int i=0;i<n1;i++){
      arr[i]=read.nextInt();
  }
//displaying the input array
  for(int i=0;i<n1;i++){
      System.out.println(arr[i]+" ");
  }
 //bubble sorting in java
  int n=arr.length;
  for(int i=0;i<n-1;i++){ //run an outer loop
    for(int j=0;j<n-1;j++){ //run an inner loop
          if(arr[j]>arr[j+1]){
            // swapping if the element i th is greater than (i+1)th
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
          }
      }
  }
    // displaying the sorted array 
  for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
  }
	}
}
